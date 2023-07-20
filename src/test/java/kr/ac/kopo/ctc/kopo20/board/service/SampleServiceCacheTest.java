package kr.ac.kopo.ctc.kopo20.board.service;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleServiceCacheTest {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleCacheServiceImpl.class);
	
	@Autowired
	private SampleCacheService sampleCacheService;
	
	private long startTime;
	private long endTime;
	
	@BeforeEach
	public void onBefore() {
		startTime = System.currentTimeMillis();
	}
	
	@AfterEach
	public void onAfter() {
		endTime = System.currentTimeMillis();
		logger.info("소요시간: {}ms", endTime - startTime);
	}
	
	@Test
	public void testNoCache() {
		sampleCacheService.testNoCache(1L);
	}
	
	@Test
	public void testCache1() {
		sampleCacheService.testCache(1L);
	}
	
	@Test
	public void testCache2() {
		sampleCacheService.testCache(1L);
	}
	
	@Test
	public void testCache3() {
		sampleCacheService.testCache(2L);
	}
	
	@Test
	public void testCache4() {
		sampleCacheService.testCache(1L);
	}
	
	@Test
	public void testCache5() {
		sampleCacheService.testCacheClear(1L);
		sampleCacheService.testCache(1L);
	}

}
