package kodlamaIoNLayeredApp.dataAccess;

import kodlamaIoNLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veri tabanına eklendi : ");
		
	}

}