package kr.ac.hansung.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {

	private int year;			// �⵵
	private int semester;		// �б�
	private String code;		// �����ڵ�
	private String name;		// �����
	private String classify;	// ����
	private int credit;		// ����
		
	public Course() { 
		
	}
	
	public Course(int year, int semester, String code, String name, String classify, int credit) {
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.name = name;
		this.classify = classify;
		this.credit = credit;
	}
	
}
