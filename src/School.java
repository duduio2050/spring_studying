public class School {

    Grade grade;
    final String schoolName = "성동초등학교";;
    int age;

    School(int age, Grade grade){
        this.age = age;
        this.grade = grade;
    }

    public void introduce(){
        System.out.println("부모랍니다.");
    }

    public String getGrade(){
        return grade.toString();
    }
}
