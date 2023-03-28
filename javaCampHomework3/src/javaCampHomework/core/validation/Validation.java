package javaCampHomework.core.validation;

import java.util.HashSet;
import java.util.Set;

public class Validation implements IValidation {

	private Set<String> courseNameSet=new HashSet<String>();
	private Set<String> categoryNameSet=new HashSet<String>();

//	public Validation(Set<String> courseNameSet, Set<String> categoryNameSet) {
//		this.courseNameSet = new HashSet<String>();
//		this.categoryNameSet = new HashSet<String>();
//	}

	@Override
	public boolean isCourseNameUnique(String courseName) {
		if (courseNameSet.contains(courseName)) {
			return false;
		} else {
			courseNameSet.add(courseName);
			return true;
		}
	}

	@Override
	public boolean coursePriceControl(double coursePrice) {
		if (coursePrice < 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean isCategoryNameUnique(String categoryName) {
		if (categoryNameSet.contains(categoryName)) {
			return false;
		} else {
			categoryNameSet.add(categoryName);
			return true;
		}
	}
}
