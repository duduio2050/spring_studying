public class Student extends School{

    String studentName;
    Student(int age, String studentName){
        super(age, Grade.student);
        this.studentName = studentName;
    }

    public void introduce(){
        System.out.println("학생입니다.");
    }

    public String getGrade(){
        return grade.toString();
    }
}
