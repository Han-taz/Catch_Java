public class EqualsApp {
    public static void main(String[] args) {

        String o1 = "java";
        String o2 = new String("java");
        System.out.println("== : "+o1==o2);
        System.out.println("equals : "+o1.equals(o2));

        String o3 = "java2";
        String o4 = "java2";
        System.out.println(o3 == o4);
        System.out.println(o3.equals(o4));

        int o5 = 1;
        int o6 = 1;
        System.out.println(o5==o6);


    }
}
//    원시 데이터 타입(primitive) 7가지
//        --> boolean, int, double, short, long, float, char
//
//        원시 데이터 타입이 아닌 것: String,. Array, Date, File, ...
//
//
//        기본적으로 원시 데이터 타입들은 같은 데이터라면 heap 안에서 같은 메모리 공간을 가리키게 된다.
//
//        int p1 = 1 ---> 같은 매모리 공간을 가리킴 (p1 == p2 는 true)
//        int p2 = 1
//
//        이렇게 되면 == 연사자를 사용하면 p1과 p2는 같다고 인식하게 됨.
//        p1 == p2 ---> true
//
//
//        하지만 String은 특혜를 받고있어서,
//        primitive가 아님에도 같은 데이터면 같은 메모리 공간을 가리킨다. (원시 데이터 타입처럼 동작한다)
//
//        String o3 = "java2" ---> 같은 메모리 공간을 가리킴 (o3 == o4 는 true)
//        String o4 = "java2"
//
//
//        그래도 쉽게말하면, 원시 데이터 타입은 == 사용하면 된다. equals를 가지고있지도 않다.(오류남)
//        원시 데이터 타입이 아닌 객체들에겐 equals를 사용하는게 편하다.
//
//        ################추가################
//
//        같은 데이터를 heap 안에서 다른 메모리 공간에 할당하고 싶으면 new 연산자를 사용하면 된다.
//
//        String ex1 = new String ("java") ---> 각각의 메모리 공간을 할당받음 (ex1 == ex2 는 false)
//        String ex2 = new String ("java")