package com.test.sample.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HelloControllerTest {

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}

	@Test
	public void GETでアクセスする() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello World"));
	}

	@Test
	public void POSTでアクセスする() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.post("/"))
		.andExpect(status().isMethodNotAllowed());
	}
}
