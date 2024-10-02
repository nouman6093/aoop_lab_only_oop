public class Semester extends Department{
    private int semester;

    Semester(String name, int age, String studentId, String department, int semester){
        super(name, age, studentId, department);
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Department: " + getDepartment());
        System.out.println("Semester: " + getSemester());
    }
}
