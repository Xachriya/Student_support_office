# Student_support_office
its an application to enroll and unenroll students on different modules in a university basicallly it is an understanding and implementation of array list in java
Implemented classes Student, Module and StudentSupportOffice that provide the following functionality:
	Class Student:
	Stores student id
	Creates a human friendly representation of the class (i.e. toString())
	Allows a total ordering of students (i.e. students are Comparable)
	Class Module:
	Stores module id, a class list (an array of enrolled students with default capacity for 5 students), and the current size of the class list
	Allows students to be enrolled if a student is not already in the class list (while maintaining the class list in ascending order based on student id)
	Allows students to be unenrolled (the class list must not have gaps that “break” the sequence of enrolled students)
	Creates a human friendly representation of the class (i.e. toString(), improve print outs by ignoring empty elements within the class list)
	Class StudentSupportOffice:
	Creates three modules: "CIS2206", "CIS2360" and "CIS2205"
	Creates five students: "U0000001", "U0000002", "U0000003", "U0000004", "U0000005"
	Enrols/unenrolls students to modules as described below

Initially, students enrol to modules:
	Module "CIS2206" contains in its class list: 
	Student "U0000001"
	Student "U0000005"
	Module "CIS2360" contains in its class list:
	Student "U0000001"
	Student "U0000003"
	Student "U0000004"
	Module "CIS2205" contains in its class list:
	Student "U0000002"
	Student "U0000004"
	Student "U0000005"

Subsequently, students change modules (enrol and unenroll). Finally, modules contain the following students:
	Module "CIS2206" contains in its class list: 
	Student "U0000001"
	Student "U0000003"
	Student "U0000004"
	Module "CIS2360" contains in its class list:
	Student "U0000001"
	Student "U0000002"
	Student "U0000003"
	Student "U0000004"
	Student "U0000005"
	Module "CIS2205" contains in its class list:
	Student "U0000001"
	Student "U0000003"
	Student "U0000004"
	Report: Describing in my report which parts of Activity 1 have been successfully Implemented. 
                                          The basic purpose of using arrays and array lists is to store and organize data in an efficient and convenient way. Arrays are a common data structure used for storing and organizing collections of data of the same type. Because arrays use a fixed size and have a constant time complexity for accessing an element using its index, they are useful for cases where the size of the data is known beforehand and fast random access to elements is required. They are also useful for data that needs to be kept in a specific order, or when operations need to be performed on a continuous segment of memory. On the other hand, array lists are a dynamic version of arrays, which can grow or shrink as necessary. They are useful in situations where the size of the data is not known beforehand, or when the size of the data is expected to change frequently. They may have a slower performance for random access but offer the advantage of dynamic size. Arrays can also be used as pointers, allowing for increased flexibility in data manipulation.
    In term of usage they can  be used in combination with other data structures, such as linked lists, stacks, and queues to create more complex data structures better suited for specific use cases. Additionally, arrays can be multi-dimensional and can be used to store multiple types of data using structures and classes. They can also be used for caching values for faster data access and computation.

It is important to keep in mind that arrays and array lists have limitations. For example, arrays have a fixed size, which means they can't grow or shrink. This can lead to wasted memory if the array is too large or the need to manually resize the array if it's too small. Array lists, on the other hand, can grow or shrink as necessary, but they can be less efficient for accessing elements at a specific index. Choosing the right method depends on size and nature of the data, and the operations that will be performed on it. 
Implementation (class Student):
                                                       The class has a single private field called "studentID" which represents the unique ID of a student.
The class has four methods, the first of which is the constructor method. It is used to construct a new Student object and assigns the provided ID to the studentID field.
The next method is "getStudentID()" which returns the student's ID.
The third method is "toString()" which returns a string representation of the student in the format "Student(STUDENT_ID)"
Lastly, it implements the Comparable interface, in the compareTo method, which compares two student objects based on their ID. It compares two student objects and return a value indicating which one should come first in the natural order based on the studentID field. It uses String's compareTo() method to compare the ID of the two students. The method returns a negative integer if the ID of this student is less than the other student's ID, a positive integer if the ID of this student is greater than the other student's ID, and zero if the IDs are the same.
Overall, this class provides a way to create Student object, get the unique ID of student, display it in a specific format and compare two students based on their ID.
Implementation (class Module):
                                                       This class represents a module with a module ID and a list of enrolled students. The class has 4 fields, first one is a private variable "moduleID" that holds the unique ID of the module, second one is "class_list" that is a Student array to keep the enrolled students, third one is "enrolled" which keeps the number of students enrolled in that module.
The first one is the constructor method "public Module(String moduleID)" which constructs a new Module object and assigns the provided ID to the moduleID field, it also creates an array to store the enrolled students with an initial capacity of 5 students, and set the number of enrolled student to 0;
The method  "getModuleID()" which returns the module's ID.
The method  "toString()" which returns a string representation of the module in the format "Module (module_ID) Students:(list of students)"
The method  "enroll(Student s)" which enrolls the given student in the module and sorts the list of enrolled students based on their ID.
The method  "notContained(Student s)" which returns true if the student is not enrolled in this module, false otherwise.
The  method  "unroll(Student s)" which unenrolls the given student from this module by removing them from the class_list array and adjusting the enrolled count. the unroll method in this code includes logic to clear gaps after unenrolling a student. When unenrolling a student, the method first finds the index of the student in the class_list array. Then, it shifts all subsequent elements one index to the left to fill the gap created by removing the student. Finally, it sets the last element in the array to null to clear the gap and updates the enrolled count. This way the class_list array does not contain any gap and keeps track of enrolled students correctly.
Two other methods "getEnrolled()" and "getModule()" which return the number of enrolled students and the module id respectively.
Overall, this class provides a way to create a module object, add students to it, unenroll students and get the number of enrolled students and module ID. It uses the comparable interface implemented in the student class to sort the class_list array whenever a new student is added to the module.
Implementation (class StudentSupportOffice):
                                                                             The main method starts by initializing several Student objects with unique student IDs. It then creates three Module objects, representing different classes, and enrolls and unenrolls students from those modules as appropriate. Throughout the program, it prints out the list of students in each module as they change, so you can see the effect of the enrollment and unenrollment.
