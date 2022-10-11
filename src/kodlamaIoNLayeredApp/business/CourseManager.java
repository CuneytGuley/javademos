package kodlamaIoNLayeredApp.business;

import kodlamaIoNLayeredApp.core.logging.Logger;
import kodlamaIoNLayeredApp.dataAccess.CourseDao;
import kodlamaIoNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() <= 0) {
			throw new Exception("Ürün fiyatı 0 dan küçük olamaz");
		}

		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.Log(course.getCourseName());
		}
	}
}
