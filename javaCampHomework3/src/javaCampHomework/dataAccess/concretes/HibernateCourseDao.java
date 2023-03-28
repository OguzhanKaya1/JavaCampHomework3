package javaCampHomework.dataAccess.concretes;

import javaCampHomework.dataAccess.abstracts.ICourseDao;
import javaCampHomework.entity.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile kurs eklendi : "+course.getName());
		
	}

}
