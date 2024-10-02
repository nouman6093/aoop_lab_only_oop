import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose course to enroll in: ");
        System.out.println("1) Web");
        System.out.println("2) AOOP");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your student ID: ");
            String studentId = sc.nextLine();
            System.out.print("Enter your department: ");
            String department = sc.nextLine();
            System.out.print("Enter your semester: ");
            int semester = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the topic name for Web: ");
            String topicName = sc.nextLine();

            Web webCourse = new Web(name, age, studentId, department, semester, topicName);
            webCourse.display();
        } else if (choice == 2) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your student ID: ");
            String studentId = sc.nextLine();
            System.out.print("Enter your department: ");
            String department = sc.nextLine();
            System.out.print("Enter your semester: ");
            int semester = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the topic name for AOOP: ");
            String topicName = sc.nextLine();

            AOOP aoopCourse = new AOOP(name, age, studentId, department, semester, topicName);
            aoopCourse.display();
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}