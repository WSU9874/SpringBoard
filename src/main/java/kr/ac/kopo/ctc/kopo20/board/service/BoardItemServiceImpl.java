package kr.ac.kopo.ctc.kopo20.board.service;

import org.springframework.stereotype.Service;

@Service
public class BoardItemServiceImpl implements BoardItemService {
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("BoardItemServiceImple.test() 메소드 호출");
		
	}

	@Override
	public void testAopBefore() {
		// TODO Auto-generated method stub
		System.out.println("BoardItemServiceImple.testAopBefore() 메소드 호출");
	}

	@Override
	public void testAopAfter() {
		// TODO Auto-generated method stub
		System.out.println("BoardItemServiceImple.testAopAfter() 메소드 호출");
	}

	@Override
	public String testAopAfterReturning() {
		// TODO Auto-generated method stub
		System.out.println("BoardItemServiceImple. testAopAfterReturning() 메소드 호출");
		return "Success";
	}

	@Override
	public void testAopAfterThrowing() {
		// TODO Auto-generated method stub
		System.out.println("BoardItemServiceImple.testAopAfterThrowing() 메소드 호출");
		throw new RuntimeException("runtime exception 발생");
		
	}

	@Override
	public void testAopAround() {
		// TODO Auto-generated method stub
		System.out.println("BoardItemServiceImple.testAopAround() 메소드 호출");
	}

	@Override
	public void testPointcutBefore() {
		// TODO Auto-generated method stub
		System.out.println("BoardItemServiceImple.testPointcutBefore() 메소드 호출");
	}

	@Override
	public void testPointcutAfter() {
		// TODO Auto-generated method stub
		System.out.println("BoardItemServiceImple.testPointcutAfter() 메소드 호출");
	}

	@Override
	public String testPointcutAfterReturning() {
		// TODO Auto-generated method stub
		System.out.println("BoardItemServiceImple.testPointcutAfterReturning() 메소드 호출");
		return "Success";
	}

	@Override
	public void testPointcutAfterThrowing() {
		// TODO Auto-generated method stub
		System.out.println("BoardItemServiceImple.testPointcutAfterThrowing() 메소드 호출");
		throw new RuntimeException("runtime exception 발생");
	}

	@Override
	public void testPointcutAround() {
		// TODO Auto-generated method stub
		System.out.println("BoardItemServiceImple.testPointcutAround() 메소드 호출");
	}

}
