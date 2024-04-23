package com.moonpo.model;

public class CommentModel extends AbstractModel {

	private String content;
	private Long userId;
	private Long newsId;

	public CommentModel() {
		super();
	}

	public CommentModel(String content, Long userId, Long newsId) {
		super();
		this.content = content;
		this.userId = userId;
		this.newsId = newsId;
	}

	public String getContent() { 
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getNewsId() {
		return newsId;
	}

	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}

}
