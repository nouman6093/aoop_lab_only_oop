public class AOOP extends Semester {
    private String topicName;

    AOOP(String name, int age, String studentId, String department, int semester, String topicName) {
        super(name, age, studentId, department, semester);
        this.topicName = topicName;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Department: " + getDepartment());
        System.out.println("Semester: " + getSemester());
        System.out.println("Topic Name: " + getTopicName());
    }

    public void display(String additionalInfo){
        display();
        System.out.println("Additional info");
    }
}