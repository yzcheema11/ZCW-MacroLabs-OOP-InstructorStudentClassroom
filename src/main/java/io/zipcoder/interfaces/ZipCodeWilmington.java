package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington extends People<Person>{

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    public static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {

        teacher.lecture(students.getStudentArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {

        Instructor instructor = instructors.findById(id);
        instructor.lecture(students.getStudentArray(), numberOfHours);

    }

    public static ZipCodeWilmington getInstance() {
        if(INSTANCE != null) {
            return INSTANCE;
        }else{
            return INSTANCE;
        }

    }

    public Person[] getStudentArray() {
        return new Person[0];
    }

//    public Map<Student, Double> getMap() {
//        Map<Student, Double> map = new HashMap<Student, Double>();
//        for (Student student : students.getStudentArray()) {
//            map.put(student, student.getTotalStudyTime());
//        }
//        return map;
//    }
}
