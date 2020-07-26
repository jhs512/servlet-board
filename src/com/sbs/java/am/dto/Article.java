package com.sbs.java.am.dto;

import java.util.Map;

public class Article {
	public int id;
	public String regDate;
	public String title;
	public String body;
	public int memberId;

	public Article() {

	}

	public Article(Map<String, Object> row) {
		this.id = (int) row.get("id");
		this.regDate = (String) row.get("regDate");
		this.title = (String) row.get("title");
		this.body = (String) row.get("body");
		this.memberId = (int) row.get("memberId");
	}
}
