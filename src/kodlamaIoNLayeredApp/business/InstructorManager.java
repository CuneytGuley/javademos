package kodlamaIoNLayeredApp.business;

import kodlamaIoNLayeredApp.core.logging.Logger;
import kodlamaIoNLayeredApp.dataAccess.InstructorDao;
import kodlamaIoNLayeredApp.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {

		instructorDao.add(instructor);

		for (Logger logger : loggers) {
			logger.Log(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}
	
}
