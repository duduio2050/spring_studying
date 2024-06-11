// 클래스
public class Person {

    int a;
    String b;
    String c = "this is class";
    static String d = "this is classes";

    Person(String a, int b){
        this.b = a;
        this.a = b;
    }

    public static void main(String[] args){

        Person p = new Person("야임마", 123);
        p.a = 32;
        System.out.println(p.a);

        System.out.println(Person.d);


        Person p2 = new Person("뭐임마", 321);
        System.out.println(p2.c);
        p2.setName("그냥 넘어가라");
        System.out.println(p2.c);


        // 오버라이딩
        School school = new School(29, Grade.Teacher);
        Student student = new Student(30, "오현택");
        school.introduce();
        student.introduce();

        System.out.println(school.getGrade());
        System.out.println(student.getGrade());

        // 오버로딩

    }

    public void setName(String name){
        this.c = name;
    }
}
