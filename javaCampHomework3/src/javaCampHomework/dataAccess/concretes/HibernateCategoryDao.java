package javaCampHomework.dataAccess.concretes;

import javaCampHomework.dataAccess.abstracts.ICategoryDao;
import javaCampHomework.entity.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile kategori eklendi : "+category.getName());
		
	}

}
