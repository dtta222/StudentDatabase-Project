package studentdatabaseapp;

import java.util.Scanner;


public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBal = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    private static int count = 0;
    Scanner in = new Scanner(System.in);

    //ask user to enter student's name and year
    public Student(){
        count++;

        System.out.println("\nSTUDENT #" + count);

        System.out.print("\nEnter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("  1 - Freshmen\n  2 - Sophomore\n  3 - Junior\n  4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextLine();

        setStudentID();
    }

    //generate an id
    private void setStudentID(){
        id++;
        //grade level + id
        this.studentID = gradeYear + id;
    }

    //enroll in courses
    public void enroll(){
        //get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBal = tuitionBal + costOfCourse;
            } else {
                break;
            }
        } while (1!= 0);
        //System.out.println("ENROLLED IN: " + courses);
    }

    //view balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBal);
    }

    //pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        int payment = in.nextInt();
        tuitionBal -= payment;
        if(payment > 0){
            System.out.println("Thank you for your payment of $" + payment);
            viewBalance();
        }
    }

    // show status
    public String toString(){
        return "------------------------------------" +
                "\nName: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBal +
                "\n------------------------------------\n";
    }
}
