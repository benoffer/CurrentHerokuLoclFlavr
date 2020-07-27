package com.loclflavr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoclFlavrController {

	@RequestMapping("harry") 
		public String harry() {
		
		return ("harry.html");
		}
	
	
}
