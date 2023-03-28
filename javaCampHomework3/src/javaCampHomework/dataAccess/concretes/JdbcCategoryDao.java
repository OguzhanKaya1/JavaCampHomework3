package javaCampHomework.dataAccess.concretes;

import javaCampHomework.dataAccess.abstracts.ICategoryDao;
import javaCampHomework.entity.Category;

public class JdbcCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile kategori eklendi : "+category.getName());
		
	}

}
