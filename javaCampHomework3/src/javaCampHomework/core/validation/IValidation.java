package javaCampHomework.core.validation;

public interface IValidation {
	
	boolean isCourseNameUnique(String courseName);
	boolean coursePriceControl(double coursePrice);
	
	boolean isCategoryNameUnique(String categoryName);
}
