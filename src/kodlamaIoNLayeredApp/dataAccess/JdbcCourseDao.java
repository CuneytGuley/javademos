package kodlamaIoNLayeredApp.dataAccess;

import kodlamaIoNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veri tabanına eklendi : " + course.getCourseName());
		
	}

}
