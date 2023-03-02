package CIS2206.Unit_11;


public class StudentSupportOffice {
    public static void main(String[] args) {

        // Initialize students
        Student s1 = new Student("U0000001");
        Student s2 = new Student("U0000002");
        Student s3 = new Student("U0000003");
        Student s4 = new Student("U0000004");
        Student s5 = new Student("U0000005");

        // Print out all students
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        // Initialize and enroll students in module cis2206
        Module cis2206 = new Module("CIS2206");
        System.out.println("\ninitially enrolled students in cis2206:");
        cis2206.enroll(s1);
        cis2206.enroll(s5);
        System.out.println(cis2206);

        // Unenroll a student and enroll new students in cis2206
        cis2206.unroll(s5);
        System.out.println(" Finally, cis2206 module contains the following students:");
        cis2206.enroll(s3);
        cis2206.enroll(s4);
        System.out.println(cis2206);

        // Initialize and enroll students in module CIS2360
        Module CIS2360 = new Module("CIS2360");
        System.out.println("\ninitially enrolled students in CIS2360:");
        CIS2360.enroll(s1);
        CIS2360.enroll(s3);
        CIS2360.enroll(s4);
        System.out.println(CIS2360);
        System.out.println(" Finally, CIS2360 module contains the following students:");
        CIS2360.enroll(s2);
        CIS2360.enroll(s5);
        System.out.println(CIS2360);

        // Initialize and enroll students in module CIS2205
        Module CIS2205 = new Module("CIS2205");
        System.out.println("\ninitially enrolled students in CIS2205:");
        CIS2205.enroll(s2);
        CIS2205.enroll(s4);
        CIS2205.enroll(s5);
        System.out.println(CIS2205);
        CIS2205.unroll(s2);
        CIS2205.unroll(s5);
        System.out.println(" Finally, CIS2205 module contains the following students:");
        CIS2205.enroll(s1);
        CIS2205.enroll(s3);
        System.out.println(CIS2205);
        System.out.println("\nFinal Modules After Changes\n");

        // Print out final list of students in each module
        System.out.println(cis2206);
        System.out.println(CIS2360);
        System.out.println(CIS2205);

    }

}
