package com.moonpo.model;

public class NewsModel extends AbstractModel{
	
	private String title;
	private String thumbNail;
	private String shortDescRiption;
	private String content;
	private Long categoryId;

	public NewsModel() {
		super();
	}

	public NewsModel(Long id, String title, String thumbNail, String shortDescRiption, String content, Long categoryId) {
		super();
		this.title = title;
		this.thumbNail = thumbNail;
		this.shortDescRiption = shortDescRiption;
		this.content = content;
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbNail() {
		return thumbNail;
	}

	public void setThumbNail(String thumbNail) {
		this.thumbNail = thumbNail;
	}

	public String getShortDescRiption() {
		return shortDescRiption;
	}

	public void setShortDescRiption(String shortDescRiption) {
		this.shortDescRiption = shortDescRiption;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

}
