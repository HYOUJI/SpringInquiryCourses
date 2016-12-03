package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.CourseDAO;
import kr.ac.hansung.model.Course;

@Service
public class CoursesService {

	private CourseDAO courseDao;
	
	@Autowired
	public void setCourseDao(CourseDAO courseDao) {
		this.courseDao = courseDao;
	}
	
	public List<Course> getCurrentForSemester() {
		
		return courseDao.getCreditForSemester();
	}
	
	public List<Course> getCurrentForSemesterDetail(int year, int semester) {
		
		List<Course> course = courseDao.getThisSemesterForCourses(year, semester);
		
		return course;
	}
		
	public List<Course> getCurrentForClassification() {
		int sum = 0;
		List<Course> course = courseDao.getCreditForClassification();
		for (Course c : course) {
			sum += c.getCredit();
		}
		Course creditsum = new Course();
		creditsum.setClassify("гу");
		creditsum.setCredit(sum);

		course.add(creditsum);
		return course;		
	}
	
	public List<Course> getCurrentForRegistredCourses() {
		
		return courseDao.getRegisterForCourses();
	}
	
	public void insert(Course course) {
		courseDao.insert(course);
	}

}
