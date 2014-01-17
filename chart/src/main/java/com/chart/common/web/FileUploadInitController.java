package com.chart.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/common")
public class FileUploadInitController {
	@RequestMapping("/fileUploadInit")
	public String fileUploadInit(){
		return "common/fileUpload";
	}
}
