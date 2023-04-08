package com.springbook.biz.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class AfterReturningAdvice {
	public void afterLog(JoinPoint jp/* , Object returnObj */) {

		Date currentDate = new Date();
		String filename = "logTest.txt";

		String method = jp.getSignature().getName();

		/*
		 * if (returnObj instanceof UserVO) { UserVO user = (UserVO) returnObj;
		 * 
		 * if (user.getRole().equals("관리자")) { System.out.println(user.getName() +
		 * " 로그인(Admin)"); }
		 * 
		 * }
		 */

		try {
			File createfile = new File(filename);
			if (createfile.createNewFile()) {
				System.out.println("파일 생성 완료");
			} else {
				System.out.println("파일이 이미 있습니다.");
			}
		} catch (IOException e) {
			System.out.println("파일 생성 에러발생");
			e.printStackTrace();
		}

		try {
			FileWriter writerfile = new FileWriter(filename, true);
			writerfile.write("[" + currentDate + "] " + method + "의 메소드 실행으로 DB 변화가 있습니다.\n");
			writerfile.close();
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			System.out.println("파일 쓰기 에러발생");
			e.printStackTrace();
		}

		// System.out.println("[사후 처리] " + method + "() 메소드 리턴값 : " +
		// returnObj.toString());
		System.out.println("[" + currentDate + "] " + method + "의 메소드 실행으로 DB 변화가 있습니다.");

	}
}