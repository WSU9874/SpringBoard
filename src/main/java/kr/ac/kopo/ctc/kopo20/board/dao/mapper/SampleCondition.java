package kr.ac.kopo.ctc.kopo20.board.dao.mapper;

import java.io.Serializable;

public class SampleCondition implements Cloneable, Serializable{
	private static final long serialVersionUID = 1L;
	
	private String samplename;
	private String name;
	private String type;
	private int age;
	public String getSamplename() {
		return samplename;
	}
	public void setSamplename(String samplename) {
		this.samplename = samplename;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
