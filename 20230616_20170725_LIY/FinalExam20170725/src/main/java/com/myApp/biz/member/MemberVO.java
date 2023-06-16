package com.myApp.biz.member;

//VO(Value Object)
public class MemberVO {
	private String id;
	private String passwd;
	private String name;
	private String kind;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setRole(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", passwd=" + passwd + ", name=" + name + ", kind=" + kind + "]";
	}
}