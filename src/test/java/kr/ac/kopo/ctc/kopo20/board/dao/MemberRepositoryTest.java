package kr.ac.kopo.ctc.kopo20.board.dao;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.ac.kopo.ctc.kopo20.board.domain.Member;
import kr.ac.kopo.ctc.kopo20.board.domain.Phone;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MemberRepositoryTest {
   
	
	
   @Autowired
   private MemberRepository memberRepository;
   
   //Create
   @Test
   @Order(1)
   public void create() {     
      Member first = new Member("Kim");
      first.addPhone(new Phone("010-7854-2134"));
      first.addPhone(new Phone("010-5641-8975"));
      first.setAge(29);
      Member second = new Member("Lee");
      second.addPhone(new Phone("010-4567-1237"));
      second.setAge(56);
      Member third = new Member("Min");
      third.setAge(14);
      memberRepository.save(first);
      memberRepository.save(second);
      memberRepository.save(third);
   }
   
   
   //Read
   @Test
   @Order(2)
   public void readAll() {
      List<Member> list = memberRepository.findAll();
      for(Member m : list) {
         System.out.println(m.toString());
      }
   }
   
//   @Test
//   public void readAll() {
//      List<Member> list = memberRepository.findMemberWithFetchJoin();
//
//      System.out.println(list);
//    
//   }
   
   
   
   // UPDATE
   @Test
   @Order(3)
   public void update() {
      Member member = memberRepository.findById(129);
      member.setAge(31);
      member.setName("lee");
      memberRepository.save(member);
      System.out.println(member.toString());
   }
   
   // UPDATE
//   @Test
//   @Order(3)
//   public void updateLazy() {
//      Member member = memberRepository.findById(116);
//      member.setAge(31);
//      member.setName("lee");
//      memberRepository.save(member);
//   }
   
   
   //Delete
//   @Test
//   @Order(4)
//   public void deleteAll() {
//      memberRepository.deleteAll();
//   }
   

}
