package com.chart.common.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.chart.common.bean.FileInfo;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.FileRenamePolicy;

public class FileUtils {
	
	public static void uploadFile(HttpServletRequest request){
		MultipartRequest mult = null;
		try {
			mult = new MultipartRequest(request, "D:\\",FileInfo.MAX_FILE_SIZE,FileInfo.FILE_ENCODING_UTF8,new MyFileRenamePolicy());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static class MyFileRenamePolicy implements FileRenamePolicy{

		@Override
		public File rename(File file) {
			if (createNewFile(file)) {
			      return file;
			    }
				String fileName = file.getName();
			    String ext = null;
			    int dot = fileName.lastIndexOf(".");
			    if (dot != -1) {
			      ext = fileName.substring(dot);  // includes "."
			    }
			    else {
			      ext = "";
			    }
			 while (!createNewFile(file)) {
				 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			      String newName = sdf.format(new Date()) + ext;
			      file = new File(file.getParent(), newName);
			    }
			return file;
		}}
	private static boolean createNewFile(File file){
		try {
			return file.createNewFile();
		} catch (IOException e) {
			return false;
		}
	}
}
