package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Course;

@Repository
public class CourseDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	/* 학기별 이수 학점 조회 */
	public List<Course> getCreditForSemester() {
		String stmt = "select year, semester, sum(credit) from courses where not year=2017 group by year,semester";
	
		List<Course> course = jdbcTemplateObject.query(stmt,new RowMapper<Course>(){
			@Override
			public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
				Course course=new Course();
				course.setYear(rs.getInt("year"));
				course.setSemester(rs.getInt("semester"));
				course.setCredit(rs.getInt("sum(credit)"));
				return course;
			}
		} );
		return course;
		
	}

	public List<Course> getThisSemesterForCourses(int year, int semester) {
		String stmt = "select * from courses where year=? and semester=? ";
		List<Course> course = jdbcTemplateObject.query(stmt, new Object[]{ year, semester }, new CourseMapper());	
		return course;
	}
	
	/* 이수 구분 별 학점조회 */
	public List<Course> getCreditForClassification() {
		String stmt = "select classify, sum(credit) from courses where not year=2017 group by classify";
		
		List<Course> course = jdbcTemplateObject.query(stmt,new RowMapper<Course>(){
			@Override
			public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
				Course courseC = new Course();
				courseC.setClassify(rs.getString("classify"));
				courseC.setCredit(rs.getInt("sum(credit)"));
				return courseC;
			}
		} );
		
		return course;		
	}

	/* 수강신청 */
	public boolean insert(Course course) {
		int year = 2017;
		int semester = 1;
		String code = course.getCode();
		String name = course.getName();
		String classify = course.getClassify();
		int credit = course.getCredit();

		String stmt = "insert into courses (year, semester, code, name, classify, credit) values (?, ?, ?, ?, ?, ?)";

		return (jdbcTemplateObject.update(stmt, new Object[] { year, semester, code, name, classify, credit }) == 1);
	}

	/* 수강신청 조회 */
	public List<Course> getRegisterForCourses() {
		String stmt = "select * from courses where year=2017";
		return jdbcTemplateObject.query(stmt, new CourseMapper());
	}

}
