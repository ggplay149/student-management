package org.fastcampus.student_management.domain;

import java.util.List;

public class CourseList {

    public static final double weekendFee = 1.5;
    private final List<Course> courseList;

    public CourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void ChangeAllCourseFee(int fee){
        for(Course course : courseList){
            if(course.isSameDay(DayOfWeek.SATURDAY) ||course.isSameDay(DayOfWeek.SUNDAY)){
                course.changeFee((int)(fee*weekendFee));
            }
            course.changeFee(fee);
        }
    }
}
