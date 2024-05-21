package com.kis.demo.controller;

import java.util.HashMap;
import java.util.Map;



import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@RestController
public class kisDemoController {

	@GetMapping("/paySample")
	public ModelAndView kisdemo() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/paySample");
		
		return mv;   //"/paySample";
	}
	
	@GetMapping("/payResultSample")
	public ModelAndView kisresultdemo() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/payResultSample");
		
		return mv;   //"/paySample";
	}
	
	@PostMapping("/payResultSample")
	public ModelAndView kisresultdemopost() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/payResultSample");
		
		return mv;   //"/paySample";
	}
}
