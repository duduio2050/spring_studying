import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String A = "안녕하세요";

        final int hour = 1;


        // 문자열의 기능
        String s = "i like you";

        // 문자열의 길이
        int length = s.length();
        System.out.println(length);

        // 문자열을 대문자로
        String upperCase = s.toUpperCase();
        System.out.println(upperCase);

        // 소문자로 변환
        String lowerCase = upperCase.toLowerCase();
        System.out.println(lowerCase);


        // 문자열 호함여부
        boolean contains = lowerCase.contains("i");
        boolean contains2 = lowerCase.contains("I");

        // 문자열을 찾을 때는 대소문자도 구분한다
        System.out.println(contains);
        System.out.println(contains2);

        // 문자열 포함 여부 및 위치 찾기
        int index = lowerCase.indexOf("e");
        int index2 = lowerCase.indexOf("I");

        // 없는 경우 -1, 있는 경우 0부터 시작하여 문자열의 위치를 찾음
        System.out.println(index);
        System.out.println(index2);


        // 문자열 포함 여부
        String B = "안녕하세요 오현택 입니다오.";
        int lastIndexOf = B.lastIndexOf("오");


        // 문자열의 위치를 찾지만 똑같은 문자가 있는 경우에는 마지막으로 찾은 문자열의 위치를 찾음
        System.out.println(lastIndexOf);



        // 문자열이 특정 문자로 시작하는지 확인
        String C = "하이하이 헬로우 싸인받자";
        boolean startsWith = C.startsWith("헬로우");

        // 문자열은 있지만 시작단어가 아니기 때문에 false
        System.out.println(startsWith);

        // 문자열이 특정 문자로 끝나는지 확인
        String D = "하이하이 헬로우 싸인받자123";
        boolean endsWith = D.endsWith("1234");

        // 무조건 마지막 단어가 똑같아야함
        System.out.println(endsWith);

        // 문자열 변환
        D = D.replace("하이하이", "뻑유뻑유");
        System.out.println(D);

        // 문자열 자르기
        String E = D.substring(3);

        // 뻑유뻑유 헬로우 싸인받자123
        // 이 문자열에서 3 부터 출력됨
        System.out.println(E);

        // 공백 제거
        E = E.trim();
        System.out.println(E);

        // 문자열 합치기
        E = E.concat(" 1123");
        System.out.println(E);


        // 문자열 비교

        // equals 사용
        String F = new String("F");
        String G = new String("F");

        System.out.println(F.equals(G));

        // 특수문자
        System.out.println("https:\\\\naver.com");

        // switch case 문
        String doble = "hello";
        switch(doble){
            case "hello":
                System.out.println("hello");
                break;
            case "hey":
                System.out.println("hey");
                break;
            default:
                System.out.println("fuck");
                break;
        }


        // do while 문
        int i = 0;
        do {

            if(i != 3){
                System.out.println(i);
            }
            i++;
        } while (i<6);

        // 배열
        int[] intArray = new int[]{0,1,2,3};
        String[] stringArray = new String[]{"a1","a2","a3"};

        for(String j:stringArray){
            System.out.println(j);
        }

        // 다차원 배열
        int[][] intArray1 = new int[][]{
                {16,26,36},
                {47,57,67}
        };

        for(int k = 0; k<intArray1.length; k++){
            System.out.println(k);
            for(int l = 0; l<intArray1[k].length; l++){
                System.out.println(intArray1[k][l]);
            }
        }

        String AS = "안녕";
        String AD = "헤헤헤";

        String ASAD = add(AS, AD);
        System.out.println(ASAD);

        System.out.println("--- 익명 함수 ---");

        Person person = new Person("오현택", 31){
            @Override
            public void setName(String name){
                System.out.println(name);
            }
        };

        person.setName("오현택");

        System.out.println("--- 람다식 ---");


        System.out.println("--- 람다식 인터페이스 ---");
        Colculate add = (x, y, z) -> x + y + z;
        int result = add.calculate(1, 2, 3);

        System.out.println("--- 스트림 ---");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n / 1)
                .forEach(System.out::println);


        try{
            throw new CustomExceptions("코드 확인해봄 ????");
        }catch(CustomExceptions e){
            System.out.println(e.getMessage());
        }


        System.out.println("--- 쓰레드 ---");
        System.out.println("--- Runnable ---");
        System.out.println("--- join ---");
        System.out.println("--- 다중 쓰레드 ---");
        System.out.println("--- 동기화 ---");

    }

    public static String add(String a, String b){
        return a + " " + b;
    }

}