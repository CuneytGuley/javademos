package kodlamaIoNLayeredApp.dataAccess;

import kodlamaIoNLayeredApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veri tabanına eklendi : ");
		
	}

}
