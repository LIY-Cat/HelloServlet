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
		 * if (user.getRole().equals("������")) { System.out.println(user.getName() +
		 * " �α���(Admin)"); }
		 * 
		 * }
		 */

		try {
			File createfile = new File(filename);
			if (createfile.createNewFile()) {
				System.out.println("���� ���� �Ϸ�");
			} else {
				System.out.println("������ �̹� �ֽ��ϴ�.");
			}
		} catch (IOException e) {
			System.out.println("���� ���� �����߻�");
			e.printStackTrace();
		}

		try {
			FileWriter writerfile = new FileWriter(filename, true);
			writerfile.write("[" + currentDate + "] " + method + "�� �޼ҵ� �������� DB ��ȭ�� �ֽ��ϴ�.\n");
			writerfile.close();
			System.out.println("���� ���� �Ϸ�");
		} catch (IOException e) {
			System.out.println("���� ���� �����߻�");
			e.printStackTrace();
		}

		// System.out.println("[���� ó��] " + method + "() �޼ҵ� ���ϰ� : " +
		// returnObj.toString());
		System.out.println("[" + currentDate + "] " + method + "�� �޼ҵ� �������� DB ��ȭ�� �ֽ��ϴ�.");

	}
}