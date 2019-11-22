package com.test.sample.form;

import javax.validation.constraints.NotBlank;

public class Form {

	  @NotBlank(message = "名前は必須項目です。")
	  private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}