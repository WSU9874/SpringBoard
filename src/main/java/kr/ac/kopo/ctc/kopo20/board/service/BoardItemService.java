package kr.ac.kopo.ctc.kopo20.board.service;

public interface BoardItemService {
	void test();
	void testAopBefore();
	void testAopAfter();
	String testAopAfterReturning();
	void testAopAfterThrowing();
	void testAopAround();
	
	void testPointcutBefore();
	void testPointcutAfter();
	String testPointcutAfterReturning();
	void testPointcutAfterThrowing();
	void testPointcutAround();

	int add(int a, int b);

}
