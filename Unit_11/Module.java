package CIS2206.Unit_11;
import java.util.*;

// This class represents a module in a school, with a module ID and a list of enrolled students.
// The enrolled students are sorted in ascending order based on their ID.
public class Module {
    // The ID of this module.
    private  String    moduleID;
    // The list of students enrolled in this module.
    private Student[] class_list;
    // The number of students enrolled in this module.
    private int       enrolled;

    // Constructs a new Module with the given ID.
    public Module(String moduleID){
        this.moduleID   = moduleID;
        // Initialize the class list with an initial capacity of 5 students.
        this.class_list = new Student[5];
        this.enrolled   = 0;
    }

    // Returns the ID of this module.
    public String getModuleID(){
        return this.moduleID;
    }

    // Returns a string representation of this module, including its ID and a list of enrolled students.
    public String toString(){
        String output = "Module " + this.getModuleID() + "\n";
        output += " Students:\n";
        // Iterate through the list of enrolled students and add them to the output string.
        for(int i =0; i < enrolled; i++){
            output += "\t" + this.class_list[i] + "\n";
        }
        return output;
    }

    // Enrolls the given student in this module.
    public void enroll(Student s) {
        // Check if the student is already enrolled in this module.
        if (!Arrays.asList(class_list).contains(s)) {
            // Check if the class list is full.
            if (enrolled == class_list.length) {
                // If the class list is full, create a new class list with an additional 5 spaces.
                Student[] newClassList = Arrays.copyOf(class_list, class_list.length + 5);
                class_list = newClassList;
            }
            // Add the new student to the end of the class list.
            class_list[enrolled] = s;
            enrolled++;
            // Sort the class list using the Student class' compareTo() method.
            Arrays.sort(class_list, 0, enrolled);
        }
    }

    // Returns true if the given student is not enrolled in this module, false otherwise.
    public Boolean notContained(Student s){
        return true;
    }

    // Unenrolls the given student from this module.
    public void unroll(Student s) {
        // Check if the student is enrolled in this module.
        if (!notContained(s)) {
            System.out.println("Student not found to be unenrolled.");
        } else {
            // Find the index of the student in the class list.
            int index = 0;
            for (int i = 0; i < enrolled; i++) {
                if (Objects.equals(s.getStudentID(), class_list[i].getStudentID())) {
                    index = i;
                    break;
                }
            }
            // Shift all


            // Shift all subsequent elements one index to the left to fill the gap
            for (int i = index; i < enrolled - 1; i++) {
                class_list[i] = class_list[i + 1];
            }

            // Set the last element to null
            class_list[enrolled - 1] = null;
            enrolled--;
        }
    }


}
