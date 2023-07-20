package kr.ac.kopo.ctc.kopo20.board.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.ctc.kopo20.board.domain.Member;
import kr.ac.kopo.ctc.kopo20.board.domain.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer> {
	Phone findById(int id);

}
