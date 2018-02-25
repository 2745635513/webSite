package com.my.domain;

import java.io.Serializable;

public class User implements Serializable {
	//Serializable防止乱序
	//ID
	private int ID;
	//用户名
	private String NAME;
	//密码
	private String PASS;

	//密码问题
	private String QUE;
	//问题答案
	private String ANS;
	//电子邮箱
	private String EMAIL ;
	//真实姓名
	private String REALNAME;
	//性别
	private String SEX;
	//身份证号
	private String IDEN;
	//手机
	private String TEL;
	//地区
	private String AREA;
	//详细地址
	private String ADDRESS;
	//邮政编码
	private String POST;
	
	public User (String name,String pass) {
		this.NAME = name;
		this.PASS = pass;
	}
	
	public User(String name,
			String pass,
			String que,
			String ans,
			String email,
			String realName,
			String sex,
			String iden,
			String tel,
			String area,
			String address,
			String post){
		this.NAME = name;
		this.PASS = pass;
		this.QUE = que;
		this.ANS = ans;
		this.EMAIL = email;
		this.REALNAME = realName;
		this.SEX = sex;
		this.IDEN = iden;
		this.TEL = tel;
		this.AREA = area;
		this.ADDRESS = address;
		this.POST = post;
		
	}



	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String name) {
		NAME = name;
	}
	public String getPASS() {
		return PASS;
	}
	public void setPASS(String pass) {
		PASS = pass;
	}
	public String getQUE() {
		return QUE;
	}
	public void setQUE(String que) {
		QUE = que;
	}
	public String getANS() {
		return ANS;
	}
	public void setANS(String ans) {
		ANS = ans;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String email) {
		EMAIL = email;
	}
	public String getREALNAME() {
		return REALNAME;
	}
	public void setREALNAME(String realname) {
		REALNAME = realname;
	}
	public String getSEX() {
		return SEX;
	}
	public void setSEX(String sex) {
		SEX = sex;
	}
	public String getIDEN() {
		return IDEN;
	}
	public void setIDEN(String iden) {
		IDEN = iden;
	}
	public String getTEL() {
		return TEL;
	}
	public void setTEL(String tel) {
		TEL = tel;
	}
	public String getAREA() {
		return AREA;
	}
	public void setAREA(String area) {
		AREA = area;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String address) {
		ADDRESS = address;
	}
	public String getPOST() {
		return POST;
	}
	public void setPOST(String post) {
		POST = post;
	}
	
	
}
