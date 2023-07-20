package kr.ac.kopo.ctc.kopo20.board.dao;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.ctc.kopo20.board.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
	List<Member> findByNameAndAgeLessThan(String name, int age);

	Member findById(int id);

	@Query("select t from Member t where name=:name and age < :age")
	List<Member> findByNameAndAgeLessThanSQL(@Param("name") String name, @Param("age") int age);

	List<Member> findByNameAndAgeLessThanOrderByAgeDesc(String name, int age);

//	@Query("select m from Member m join fetch m.phones")
//	List<Member> findMemberWithFetchJoin();
//
//	@Query("select m from Member m join fetch m.phones where m.id=?1 ")
//	Member updateMemberWithFetchJoin(int id);
	
	@Override
	@EntityGraph(attributePaths = {"phones"})
	List<Member> findAll();
	
	

}
