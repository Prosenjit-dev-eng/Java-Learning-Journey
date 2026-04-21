/*
* 52.Design a Course class.
• Instance variables: courseName, enrolledStudents.
• Static variable: maxCapacity, the maximum number of students for any
course.
• Instance methods: enrollStudent(String studentName),
unenrollStudent(String studentName).
• Static method: setM
* */
public class Course {
    private String courseName;
    private static int maxCapacity = 100;
    private int enrollments;

    String[] enrolledStudents;
    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new String[maxCapacity];
        this.enrollments = 0;
    }
    static void setM(int maxCapacity){
        //if nonstatic use this. or use Class.
        Course.maxCapacity = maxCapacity;
    }
    void enrollStudent(String studentName){
        if(enrollments < maxCapacity){
            enrolledStudents[enrollments] = studentName;
            enrollments++;
        }
    }
    void unenrollStudent(String studentName){
        boolean fnd = false;
        for (int i = 0; i < maxCapacity; i++) {
            // We can't write in java
            /*
            * 2. String Comparison
In Java, you should never use == to compare the content of Strings.

== checks if the two variables point to the same memory address.

.equals() checks if the characters inside the strings are the same.

The Fix: Use enrolledStudents[i].equals(studentName).
* */
            if(enrolledStudents[i].equals(studentName)){
                enrolledStudents[i] = null;
                fnd = true;
                enrollments--;
                System.out.println("Student "+studentName+" unenrolled");
                break;
            }
        }
        if(!fnd) System.out.println("No student enrolled of this name: "+studentName);

    }
}
