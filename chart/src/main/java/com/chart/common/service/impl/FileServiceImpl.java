package com.chart.common.service.impl;

import javax.servlet.http.HttpServletRequest;

import com.chart.common.service.FileService;
import com.chart.common.utils.FileUtils;
public class FileServiceImpl implements FileService {

	@Override
	public void fileUpload(HttpServletRequest request) {
		FileUtils.uploadFile(request);
	}

}
