package kr.ac.hansung.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {

	private int year;			// 년도
	private int semester;		// 학기
	private String code;		// 과목코드
	private String name;		// 과목명
	private String classify;	// 구분
	private int credit;		// 학점
		
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
