package com.springbook.view;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "index";
		//수정을 했는 데도 안되는 404 에러가 나면은 데이터베이스 관련된 pom.xml와 root-conext.xml 다 추가
		//aop는 추가안됨. 결론은 문제가 발생을 해서 웹문제가 아닌 데도 불구하고 중단된 것 이다.
	}
	
}
