package javaCampHomework.dataAccess.concretes;

import javaCampHomework.dataAccess.abstracts.ICourseDao;
import javaCampHomework.entity.Course;

public class JdbcCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		
		System.out.println("JDBC ile veritabanina eklendi : "+course.getName());
		
	}

}
