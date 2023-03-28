package javaCampHomework.dataAccess.concretes;

import javaCampHomework.dataAccess.abstracts.IInstructorDao;
import javaCampHomework.entity.Instructor;

public class JdbcInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile egitmen eklendi : "+instructor.getName());
		
	}

}
