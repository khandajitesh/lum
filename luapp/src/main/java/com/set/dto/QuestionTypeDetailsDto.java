package com.set.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuestionTypeDetailsDto {
	private List<QuestionTypeDto> QuestionTypeList;
	private int count;
	@javax.persistence.Transient
	private String message;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<QuestionTypeDto> getQuestionTypeList() {
		return QuestionTypeList;
	}
	@JsonProperty("QuestionTypeList")
	public void setQuestionTypeList(List<QuestionTypeDto> questionTypeList) {
		QuestionTypeList = questionTypeList;
	}
}
