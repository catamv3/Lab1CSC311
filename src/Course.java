/**
 * This file contains information for a Course object.
 */
public class Course {

    /*
    Below are the member variables for the Course class
     */
    private int ID;
    private String Name;
    private int Code;

    /**
     * Course Class default contructor
     */
    public Course(){
        ID = 444;
        Name = "Michael";
        Code = 4401;
    }

    /**
     * Course Class parameterized constructor
     * @param id the course id
     * @param n the course name
     * @param c the course code
     */
    public Course(int id, String n, int c){
        ID = id;
        Name = n;
        Code = c;
    }

    /**
     * get method for name member variable
     * @return course name
     */
    public String getName() {
        return Name;
    }

    /**
     * set method for name member variable
     * @param name course name
     */
    public void setName(String name) {Name = name;}

    /**
     * get method for ID member variable
     * @return course id
     */
    public int getID() {
        return ID;
    }

    /**
     * set method for course id member variable
     * @param ID course id
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * get method for course code member variable
     * @return course code
     */
    public int getCode() {
        return Code;
    }

    /**
     * set method for course code member variable
     * @param code course code
     */
    public void setCode(int code) {
        Code = code;
    }

}
