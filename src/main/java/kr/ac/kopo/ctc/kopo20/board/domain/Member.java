package kr.ac.kopo.ctc.kopo20.board.domain;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	private String name;

	@Column
	private int age;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//eager - 메소드가 실행되면 모든 정보 가져오기
	//lazy - select 된 정보만 찾아서 가져와서 컬렉션 풀에 넣어놓고 정보 가져오는거 
	//cascade - db의 변화가 생길때 연관관계를 조사
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "member", fetch=FetchType.LAZY)
	private Collection<Phone> phones;
	
	public Member() {
		
	}

	public Collection<Phone> getPhones() {
		if (phones == null) {
			phones = new ArrayList<Phone>();
		}
		return phones;
	}

	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}

	public Member(String name) {
		this.name = name;
	}

	public void addPhone(Phone p) {
		Collection<Phone> phones = getPhones();
		p.setMember(this);
		phones.add(p);
	}

	@Override
	public String toString() {
		String result = "[" + id + "]" + name;
		for (Phone p : getPhones()) {
			result += "\n" + p.toString();
		}
		return result;
	}

}
