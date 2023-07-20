package kr.ac.kopo.ctc.kopo20.board.service;

public interface SampleService {
	//aop
	String testNoAop();
	String testAop();
	
	//transactional
	String testNoTransactional();
	String testTransactional();

}
