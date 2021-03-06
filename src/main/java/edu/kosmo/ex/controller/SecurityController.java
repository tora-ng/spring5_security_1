package edu.kosmo.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/security/*")
@Controller
public class SecurityController {
	
	@GetMapping("/all")
	public String all() {
		System.out.println("do all acess everybody");
		
		return "/security/all";
	}
	
	
	
	@GetMapping("/member")
	public String member() {
		System.out.println("logined member");
		
		return "/security/member";
	}
	
}

// context명+/security를 치고 들어오는 모든 것들은 아래 부분에서 처리하라는 의미