package com.myApp.biz.question;

import java.sql.Date;

//VO(Value Object)
public class QuestionVO {
	private int number;
	private String question;
	private String ex1;
	private String ex2;
	private String ex3;
	private String ex4;
	private String answer;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getEx1() {
		return ex1;
	}

	public void setEx1(String ex1) {
		this.ex1 = ex1;
	}

	public String getEx2() {
		return ex2;
	}

	public void setEx2(String ex2) {
		this.ex2 = ex2;
	}

	public String getEx3() {
		return ex3;
	}

	public void setEx3(String ex3) {
		this.ex3 = ex3;
	}

	public String getEx4() {
		return ex4;
	}

	public void setEx4(String ex4) {
		this.ex4 = ex4;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "BoardVO [number=" + number + ", question=" + question + ", ex1=" + ex1 + ", ex2=" + ex2 + ", ex3="
				+ ex3 + ", ex4=" + ex4 + "]";
	}
}