package com.my.domain;

import java.io.Serializable;

public class User implements Serializable {
	//Serializable��ֹ����
	//ID
	private int ID;
	//�û���
	private String NAME;
	//����
	private String PASS;

	//��������
	private String QUE;
	//�����
	private String ANS;
	//��������
	private String EMAIL ;
	//��ʵ����
	private String REALNAME;
	//�Ա�
	private String SEX;
	//���֤��
	private String IDEN;
	//�ֻ�
	private String TEL;
	//����
	private String AREA;
	//��ϸ��ַ
	private String ADDRESS;
	//��������
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
