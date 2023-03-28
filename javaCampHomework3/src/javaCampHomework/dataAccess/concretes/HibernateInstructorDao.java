package javaCampHomework.dataAccess.concretes;

import javaCampHomework.dataAccess.abstracts.IInstructorDao;
import javaCampHomework.entity.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile egitmen eklendi : "+instructor.getName());
		
	}

}
