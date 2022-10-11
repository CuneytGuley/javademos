package kodlamaIoNLayeredApp.dataAccess;

import kodlamaIoNLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veri tabanına eklendi : " + category.getCategoryName());
		
	}

}
