package com.sbs.java.am;

public class Config {
	public static String getDBUrl() {
		return "jdbc:mysql://localhost:3306/am?serverTimezone=Asia/Seoul&useOldAliasMetadataBehavior=true&zeroDateTimeBehavior=convertToNull";
	}

	public static String getDBId() {
		return "sbsst";
	}

	public static String getDBPw() {
		return "sbs123414";
	}

	public static String getDbDriverClassName() {
		return "com.mysql.cj.jdbc.Driver";
	}
}
