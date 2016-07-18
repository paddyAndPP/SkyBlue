package com.musicalsky.entity;

import java.sql.Date;

/**
 * 字典实体类
 * 
 * @author 林文培
 * 
 */

public class SysDictionary {

	private Integer dictionaryID;
	private Date createTime;
	private Integer state;
	private String tableName;
	private String fieldName;
	private String fieldValue;
	private Integer fieldID;
	private Date dictionaryTime;

	public Integer getDictionaryID() {
		return dictionaryID;
	}

	public void setDictionaryID(Integer dictionaryID) {
		this.dictionaryID = dictionaryID;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public Integer getFieldID() {
		return fieldID;
	}

	public void setFieldID(Integer fieldID) {
		this.fieldID = fieldID;
	}

	public Date getDictionaryTime() {
		return dictionaryTime;
	}

	public void setDictionaryTime(Date dictionaryTime) {
		this.dictionaryTime = dictionaryTime;
	}

}
