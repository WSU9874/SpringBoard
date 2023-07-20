package kr.ac.kopo.ctc.kopo20.board.web;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SampleControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldReturnDefaultMessage() throws Exception{
		this.mockMvc.perform(get("/sample1")).andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("title")));
	}
	@Test
	public void shouldReturnDefaultMessage2() throws Exception{
		this.mockMvc.perform(get("/sample2")).andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("title")));
	}
	@Test
	public void shouldReturnDefaultMessage3() throws Exception{
		this.mockMvc.perform(get("/sample3")).andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("title")));
	}
	@Test
	public void shouldReturnDefaultMessage4() throws Exception{
		this.mockMvc.perform(get("/sample4")).andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("title")));
	}
	@Test
	public void shouldReturnDefaultMessage5() throws Exception{
		this.mockMvc.perform(get("/hello")).andDo(print())
		.andExpect(status().isOk());
		
	}
}
