package kr.ac.kopo.ctc.kopo20.board.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleRepositoryTest{
	
	@Autowired
	private SampleRepository sampleRepository;
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@Test
	public void findAll() { //행의 개수
		assertEquals(2, sampleRepository.count());
	}
	
	@Test
	public void equalTest() { //두 요소가 같으면 pass 다르면 unpass
		assertEquals("c", "c");
	}
	
	@Test
	@Disabled 	//ignore(junit4), disabled(jnunit5)  test를 실행하지 않음
	public void notEqualTest() {
		assertEquals("a", "b");
	}

}



