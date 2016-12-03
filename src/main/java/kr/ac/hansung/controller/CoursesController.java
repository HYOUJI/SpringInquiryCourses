package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Course;
import kr.ac.hansung.service.CoursesService;

@Controller
public class CoursesController {
	
	private CoursesService coursesService;

	@Autowired
	public void setCoursesService(CoursesService coursesService) {
		this.coursesService = coursesService;
	}
	
	/* 학기별 이수 학점 조회 */
	@RequestMapping("/semester")
	public String showCredit(Model model) {
		
		List<Course> coursesSemester = coursesService.getCurrentForSemester();
		
		model.addAttribute("coursesSemester", coursesSemester);
		
		return "semester";
	}
	
	@RequestMapping("/semesterdetail")
	public String showDetailCredit(Model model, Integer year, Integer semester) {
		
		List<Course> coursesSemesterDetail = coursesService.getCurrentForSemesterDetail(year, semester);
		
		model.addAttribute("year",year);
		model.addAttribute("semester",semester);
		model.addAttribute("coursesSemesterDetail", coursesSemesterDetail);
		
		return "semesterdetail";
	}
	
	/* 이수 구분 별 학점조회*/
	@RequestMapping("/classification")
	public String showCreditForClass(Model model) {

		List<Course> coursesClass = coursesService.getCurrentForClassification();
		
		model.addAttribute("coursesClass", coursesClass);
		
		return "classifycredit";
	}
	
	/* 수강신청 하기*/
	@RequestMapping("/docourses")
	public String doCourses(Model model) {
		
		return "docourses";
	}
	
	@RequestMapping("/registercourses")
	public String registerCourses(Model model, Course course, BindingResult result) {
		
		coursesService.insert(course);
		
		return "home";
	}
	
	/* 수강신청 조회 메뉴*/
	@RequestMapping("/menu")
	public String showMenu(Model model) {
		
		List<Course> registeredCourses = coursesService.getCurrentForRegistredCourses();
		
		model.addAttribute("registeredCourses", registeredCourses);
		
		return "menu";
	}
	
	
}
