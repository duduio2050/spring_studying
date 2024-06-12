import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

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


        // 제너릭스

        System.out.println("--- 제너릭스 ---");
        String champ = "아칼리";
        int champCount = 106;
        double champDouble = 106.11;

        Generics.printValue(champ);
        Generics.printValue(champCount);
        Generics.printValue(champDouble);


        System.out.println("--- 제너릭스 클래스 ---");
        GenericsClass<String> GenericsClassString = new GenericsClass<>();
        GenericsClassString.data = "제이스";

        GenericsClass<Integer> GenericsClassInt = new GenericsClass<>();
        GenericsClassInt.data = 11;



        System.out.println("--- ArrayList ---");
        ArrayList<String> list = new ArrayList<>();
        // 데이터 추가
        list.add("아칼리");
        list.add("제이스");
        list.add("흐웨이");

        for(String i:list){
            System.out.println(i);
        }

        // 인텍스로 데이터 가져오기
        String listGet = list.get(0);
        System.out.println(listGet);

        // 인덱스 수정
        String setList = list.set(0, "모르가나");
        System.out.println(list.get(0));

        // 리스트 사이즈
        int getListSize = list.size();
        System.out.println(getListSize);

        // 리스트 포함 여부
        boolean containsList = list.contains("카타리나");
        System.out.println(containsList);

        // 리스트 삭제
        list.remove("카타리나");

        // 전체삭제
        list.clear();

        System.out.println("--- LinkedList ---");

        LinkedList<String> linkedList = new LinkedList<>();

        // 데이터 가져오기
        //linkedList.get(0);

        // 데이터 추가
        linkedList.add("헤카림");

        // 처음요소 가져오기 및 추가
        linkedList.getFirst();
        linkedList.addFirst("럭스");

        // 마지막요소 가져오기 및 추가
        linkedList.getLast();
        linkedList.addLast("피즈");

        // 삭제
        linkedList.clear();


        System.out.println("--- HashSet --- 중복을 허용하지 않는 데이터의 집합");
        HashSet<String> hashSet = new HashSet<>();

        // 데이터 추가
        hashSet.add("오현택");

        // 데이터 포함 여부
        hashSet.contains("오현택"); // TRUE

        // 데이터 크기
        hashSet.size(); // 1

        // 인덱스, value 값으로 삭제
        hashSet.remove(0); // {}
        hashSet.remove("오현택"); // {}

        // 전체 삭제
        hashSet.clear(); // {}

        System.out.println("--- HashMap --- <K, V> 키와 값을 가지고 있는 중복을 허용하지 않는 데이터의 집합, 순서 보장 X");

        HashMap<String, Integer> hashMap = new HashMap<>();

        // 데이터 추가
        hashMap.put("헤카림", 1);
        hashMap.put("아칼리", 3);

        // 데이터 사이즈
        hashMap.size();

        // 데이터 가져오기 // key
        hashMap.get("헤카림");

        // KEY 포함여부 // VALUE 로도 찾기 가능
        hashMap.containsKey("헤카림");
        hashMap.containsValue(3);

        // 삭제
        hashMap.remove("헤카림");

        // 전체삭제
        hashMap.clear();


    }

    public void setName(String name){
        this.c = name;
    }
}
