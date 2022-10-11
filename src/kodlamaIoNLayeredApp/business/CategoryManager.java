package kodlamaIoNLayeredApp.business;

import kodlamaIoNLayeredApp.core.logging.Logger;
import kodlamaIoNLayeredApp.dataAccess.CategoryDao;
import kodlamaIoNLayeredApp.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) {
		

		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.Log(category.getCategoryName());
		}
	}
}
