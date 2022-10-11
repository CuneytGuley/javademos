package kodlamaIoNLayeredApp;

import kodlamaIoNLayeredApp.business.CategoryManager;
import kodlamaIoNLayeredApp.business.CourseManager;
import kodlamaIoNLayeredApp.business.InstructorManager;
import kodlamaIoNLayeredApp.core.logging.DatabaseLogger;
import kodlamaIoNLayeredApp.core.logging.FileLogger;
import kodlamaIoNLayeredApp.core.logging.Logger;
import kodlamaIoNLayeredApp.core.logging.MailLogger;
import kodlamaIoNLayeredApp.dataAccess.HibernateCategoryDao;
import kodlamaIoNLayeredApp.dataAccess.HibernateCourseDao;
import kodlamaIoNLayeredApp.dataAccess.HibernateInstructorDao;
import kodlamaIoNLayeredApp.dataAccess.JdbcCategoryDao;
import kodlamaIoNLayeredApp.dataAccess.JdbcCourseDao;
import kodlamaIoNLayeredApp.dataAccess.JdbcInstructorDao;
import kodlamaIoNLayeredApp.entities.Category;
import kodlamaIoNLayeredApp.entities.Course;
import kodlamaIoNLayeredApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1,"Programlamaya Giriş Temel Kurs", 100);
		Instructor instructor1 = new Instructor(1, "Cüneyt", "Güley");
		Category category1 = new Category(1, "Programlama");
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);

		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		

	}
}
