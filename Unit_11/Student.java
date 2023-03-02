package CIS2206.Unit_11;

/**

 A student has a unique ID.
 */
public class Student implements Comparable<Student> {
    private String studentID;

    /**

     Construct a new Student with the given ID.
     @param studentID the unique ID of the student
     */
    public Student(String studentID){
        this.studentID = studentID;
    }
    /**

     @return the unique ID of the student
     */
    public String getStudentID(){
        return this.studentID;
    }
    /**

     @return a string representation of the student in the format "Student(STUDENT_ID)"
     */
    public String toString(){
        return "Student(" + this.studentID + ")";
    }
    @Override
/**
 * Compare this student to another student based on their ID.
 *
 * @param other the other student to compare to
 * @return a negative integer, zero, or a positive integer as this student's ID is less than, equal to, or greater than the other student's ID
 */
    public int compareTo(Student other) {
// Compare students based on their ID
        return this.studentID.compareTo(other.studentID);
    }
}