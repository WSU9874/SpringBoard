package kr.ac.kopo.ctc.kopo20.board.service;

public interface SampleCacheService {
	String testNoCache(Long id);
	String testCache(Long id);
	void testCacheClear(Long id);

}
