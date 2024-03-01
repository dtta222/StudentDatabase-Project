package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        System.out.println("Hello world!\n");

        //ask for how many students to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        in.close();

        Student[] students = new Student[numOfStudents];

        //create n number of new students
        for(int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println("\n------------------------------------\n");
        }

        //print out students entered into system
        System.out.println("STUDENTS ENTERED IN SYSTEM");
        for(int i = 0; i < numOfStudents; i++){
            System.out.println("Student #" + i+1);
            System.out.println(students[i]);
        }

    }
}