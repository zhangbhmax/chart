package com.chart.common.bean;

public class FileInfo {
	public static final String FILE_ENCODING_UTF8 = "UTF-8";
	public static final int MAX_FILE_SIZE = 10*1024*1024;
	//文件名
	private String fileName;
	//文件路径
	private String path;
	//文件md5值
	private String md5;
	//文件上传路径
	private String savePath;
	
	public String getFileType(){
		return this.fileName.substring(this.fileName.lastIndexOf("."));
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getMd5() {
		return md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	
	
}
