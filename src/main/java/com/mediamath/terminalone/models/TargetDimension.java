package com.mediamath.terminalone.models;

public class TargetDimension implements T1Entity {
	
	private static final String entityName = "TargetDimension";

	private String type;
	private String exclude;
	private String include;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExclude() {
		return exclude;
	}

	public void setExclude(String exclude) {
		this.exclude = exclude;
	}

	public String getInclude() {
		return include;
	}

	public void setInclude(String include) {
		this.include = include;
	}

	public String getEntityname() {
		return entityName;
	}

}