//Author Kresimir Tuk

import java.util.ArrayList;

// this is Super class from which should everybody inherit imagend constructor that is set with his
// set and get methods
public class Student implements Streamable {

    private String name;
    private int studentNumber;
    private String course;
    private int currentYear;
    boolean regStatus = true;
    static ArrayList<Integer> marks;

    int passGrade = 45;
    public Student(){

    }

    public Student(String customName, int customStudentNumber, String customCourse,
                   int customCurrentYear, boolean customRegStatus, ArrayList<Integer> customMarks) {
        this.name = customName;
        this.studentNumber = customStudentNumber;
        this.course = customCourse;
        this.currentYear = customCurrentYear;
        this.regStatus = customRegStatus;
        this.marks = customMarks;
    }

    //getters

    public String getName() {
        return this.name;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public String getCourse() {
        return this.course;
    }

    public int getCurrentYear() {
        return this.currentYear;
    }

    public boolean getRegStatus() {
        return this.regStatus;
    }

    public int getMarks(int i){ return this.marks.get(i); }



    //setters

    public void setName(String newName){this.name = newName;}

    public void setStudentNumber(int newStudentNumber) {this.studentNumber = newStudentNumber; }

    public void setCourse(String newCourse) {
        this.course = newCourse;
    }

    public void setCurrentYear(int newCurrentYear) {
        this.currentYear = newCurrentYear;
    }

    public void setRegStatus(boolean newRegStatus) {
        this.regStatus = newRegStatus;
    }

    public void setMarks(int newMarks){
        this.marks.add(newMarks);
    }

    public String assignGrade(){
        //this function assignes the grade as a character comapring to avreage grade in total
        int getGrade = calculateGradeAvreage(this.marks);

        if (getGrade > 80){
            return "A";
        }
        else if (getGrade < 80 && getGrade >= 70){
            return "B";
        }
        else if (getGrade < 70 && getGrade >= 60){
            return "C";
        }
        else if (getGrade < 60 && getGrade >= 50){
            return "D";
        }
        else if (getGrade < 50 && getGrade >= 40){
            return "E";
        }
        else {
            return "fail";
        }

    }

    /*public static void isPassed(Student student) {
        if (student.calculateGradeAvreage() < student.passGrade) {
            System.out.println(student.getName() + "fail the exam");
        } else {
            System.out.println(student.name + "pass the exam");
        }
    }*/

    public int calculateGradeAvreage(ArrayList<Integer> grades) {
        //this method will take array of integer or marks of student and return avreage mark
        int total = 0;

        for (int i = 0; i < 10; i++) {
            total += grades.get(i);
            }

        return total / 10;
    }




    public void displayValues() {
        System.out.println("Student name is: " + this.name);
        System.out.println("Student name is: " + this.studentNumber);
        System.out.println("Student name is: " + this.course);
        System.out.println("Student name is: " + this.currentYear);
        System.out.println("Student name is: " + regStatus);
    }




}

