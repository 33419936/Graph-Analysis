package com.uniplore.graph.dsm.file;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping(value="/file")
public class FileUpload {

	@RequestMapping(value="/Upload",method=RequestMethod.POST)
	public void fileUpload(@RequestParam(value = "file",required = false) MultipartFile file,
			HttpServletResponse response, Model model){
		System.out.println("从客户端接收到文件"+file.getOriginalFilename());
	}
	
}