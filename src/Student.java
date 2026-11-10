public class Student {
    private String name;
    private double gpa;

    Student(String name, double gpa){
        this.name =name;
        this.gpa = gpa;
    }
    public String toString(){
        return "Student name: " + name +" Gpa: " + gpa;
    }
}
