package javaCampHomework;

import javaCampHomework.business.ProductManager;
import javaCampHomework.core.logging.DatabaseLogger;
import javaCampHomework.core.logging.FileLogger;
import javaCampHomework.core.logging.ILogger;
import javaCampHomework.core.validation.IValidation;
import javaCampHomework.core.validation.Validation;
import javaCampHomework.dataAccess.abstracts.ICategoryDao;
import javaCampHomework.dataAccess.abstracts.ICourseDao;
import javaCampHomework.dataAccess.abstracts.IInstructorDao;
import javaCampHomework.dataAccess.concretes.JdbcCategoryDao;
import javaCampHomework.dataAccess.concretes.JdbcCourseDao;
import javaCampHomework.dataAccess.concretes.JdbcInstructorDao;
import javaCampHomework.entity.Category;
import javaCampHomework.entity.Course;

public class Main {

	public static void main(String[] args) throws Exception {

		ICourseDao courseDao = new JdbcCourseDao();
		ICategoryDao categoryDao = new JdbcCategoryDao();
		IInstructorDao instructorDao = new JdbcInstructorDao();
		IValidation validation = new Validation();
		ILogger[] loggers = { new DatabaseLogger(), new FileLogger() };

		ProductManager courseService = new ProductManager(courseDao,categoryDao,instructorDao,validation,loggers);

		Course course1 = new Course(1, "Java", 3.5);
		Course course2 = new Course(2, "Python", 4.5);
		courseService.addCourse(course2);
		courseService.addCourse(course1);
		
		//Course course3 = new Course(2, "Python", 4.5);
		//Course course4 = new Course(2, "C++", -4.5);
		//courseService.addCourse(course3);
		//courseService.addCourse(course4);
		
		Category category1 = new Category(1,"Yazilim");
		courseService.addCategory(category1);
		
		//Category category2 = new Category(2,"Yazilim");
		//courseService.addCategory(category2);
		
		
		
	}

}
