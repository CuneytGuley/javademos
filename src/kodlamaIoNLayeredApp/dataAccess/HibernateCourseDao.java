package kodlamaIoNLayeredApp.dataAccess;

import kodlamaIoNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanına eklendi : ");
		
	}

}
