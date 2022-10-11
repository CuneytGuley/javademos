package kodlamaIoNLayeredApp.dataAccess;

import kodlamaIoNLayeredApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veri tabanına eklendi : " + instructor.getFirstName() + instructor.getLastName());
		
	}

}
