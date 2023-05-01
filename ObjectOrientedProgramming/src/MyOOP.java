public class MyOOP {
    public static void printB(String delimiter) {
        System.out.println(delimiter);
        System.out.println('B');
        System.out.println('B');
    }

    public static void printA(String delimiter) {
        System.out.println(delimiter);
        System.out.println('A');
        System.out.println('A');
    }
    // 클래스에 변수를 지정하기
    public static String Delimiter = "=====";
    public static void AA(){
        System.out.println(Delimiter);
        System.out.println("AAAA");
        System.out.println("AAAA");
    }

    public static void BB(){
        System.out.println(Delimiter);
        System.out.println("BBBB");
        System.out.println("BBBB");
    }
    public static void main(String[] args) {
        //개무식한 방법
        printA("-------");
        printB("-------");
        printA("*********");
        printB("*********");

        //무식한 방법(변수를 지정)
        String delimiter = "----";
        printA(delimiter);
        printB(delimiter);

        String delimiter2 = "****";
        printA(delimiter2);
        printB(delimiter2);

        //클래스 자체에 Delimiter라는 변수를 지정
        AA();
        BB();
    }


}
