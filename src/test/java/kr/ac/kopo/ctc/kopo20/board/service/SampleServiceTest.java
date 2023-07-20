package kr.ac.kopo.ctc.kopo20.board.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SampleServiceTest {
	@Autowired
	private SampleService sampleService;
	
	@Disabled
	@Test
	public void testNoTransactional() {
		assertThrows(RuntimeException.class, () -> {
			sampleService.testNoTransactional();
		});
	}
	
//	@Disabled
	@Test
	public void testTransactional() {
		assertThrows(RuntimeException.class, () -> {
			sampleService.testTransactional();
		});
	}

}
