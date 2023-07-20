package kr.ac.kopo.ctc.kopo20.board.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.ac.kopo.ctc.kopo20.board.domain.Member;
import kr.ac.kopo.ctc.kopo20.board.domain.Phone;

@RunWith(SpringRunner.class)
@SpringBootTest

public class PhoneRepositoryTest {

   @Autowired
   private PhoneRepository phoneRepository;
   
      @Test
      //member Id만 설정해주고 Phone Id는 설정 안해줬기때문에 phone입장에서 새로운걸로 받아들여서 create되는거임
      public void create() {
        Phone phone = new Phone("010-4444-4444");
        Member member = new Member();
        member.setId(131);
        phone.setMember(member);
        phoneRepository.save(phone);
      }
      
   
      @Test
      public void read() {
         List<Phone> list = phoneRepository.findAll();
         for(Phone p : list) {
            System.out.println(p.toString());
         }
      }
      
      @Test
      public void update() { //member랑 phone의 id를 설정해 줬기때문에 update임
        Phone phone = new Phone("010-8888-8888");
        Member member = new Member();
        member.setId(131);
        phone.setId(39);
        phone.setMember(member);
        phoneRepository.save(phone);
      }
      
    
      @Test
      public void delete() {
    	 phoneRepository.deleteAll();
      }

}