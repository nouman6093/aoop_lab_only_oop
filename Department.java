public class Department extends Student{
    private String department;

    Department(String name, int age, String studentId, String department){
        super(name, age, studentId);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Department: " + getDepartment());
    }
}