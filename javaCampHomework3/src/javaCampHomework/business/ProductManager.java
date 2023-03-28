package javaCampHomework.business;

import javaCampHomework.core.logging.ILogger;
import javaCampHomework.core.validation.IValidation;
import javaCampHomework.dataAccess.abstracts.ICategoryDao;
import javaCampHomework.dataAccess.abstracts.ICourseDao;
import javaCampHomework.dataAccess.abstracts.IInstructorDao;
import javaCampHomework.entity.Category;
import javaCampHomework.entity.Course;
import javaCampHomework.entity.Instructor;

public class ProductManager {

	private ICourseDao courseDao;
	private ICategoryDao categoryDao;
	private IInstructorDao instructorDao;
	private IValidation validation;
	private ILogger[] loggers;

	public ProductManager(ICourseDao courseDao, ICategoryDao categoryDao, IInstructorDao instructorDao,
			IValidation validation, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.categoryDao = categoryDao;
		this.instructorDao = instructorDao;
		this.validation = validation;
		this.loggers = loggers;
	}

	public void addCourse(Course course) throws Exception {

		if (validation.isCourseNameUnique(course.getName()) && (course.getName() != null)) {
			if (validation.coursePriceControl(course.getPrice())) {
				courseDao.add(course);
				
				for(ILogger logger : loggers) {
					logger.log(course.getName());
				}
				
			} else {
				throw new Exception("Kurs fiyati sifirdan kücük olamaz");
			}

		} else {
			throw new Exception("Ayni Isimde Kurs Mevcut");
		}
	}

	public void addCategory(Category category) throws Exception {

		if (validation.isCategoryNameUnique(category.getName()) && (category.getName() != null)) {
			categoryDao.add(category);
			
			for(ILogger logger : loggers) {
				logger.log(category.getName());
			}
			
		} else {
			throw new Exception("Kategori ismi ayni olamaz");
			
		}
	}

	public void addInstructor(Instructor instructor) throws Exception {
		if (instructor.getName() != null) {
			instructorDao.add(instructor);
			
			for(ILogger logger : loggers) {
				logger.log(instructor.getName());
			}
			
		} else {
			throw new Exception("Egitmen ismi bos olamaz");
		}
	}
}
