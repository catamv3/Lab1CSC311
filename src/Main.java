/**
 * this file is a driver class that demonstrates the instantiation and
 * usages of a Course object.
 */

public class Main { //open main class

    public static void main(String[] args) { //open main method

        //demonstrate course default constructor
        Course myCourse = new Course();

        //demonstrate getMethods()
        System.out.println(myCourse.getName());
        System.out.println(myCourse.getID());
        System.out.println(myCourse.getCode());

        //demonstrate setMethods()
        myCourse.setCode(999);
        myCourse.setID(310);
        myCourse.setName("program");

        //demonstrate overloaded constructor
        Course customCourse = new Course(311, "Advanced Programming", 9028);
        System.out.println(customCourse.getName());
        System.out.println(customCourse.getID());
        System.out.println(customCourse.getCode());
    }
}