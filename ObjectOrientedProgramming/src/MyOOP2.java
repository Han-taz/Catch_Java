
public class MyOOP2 {
    public static void main(String[] args) {
        Print.delimiter="-------";
        Print.A();
        Print.B();

        Print.delimiter="****";
        Print.A();
        Print.B();
        // delimiter를 클래스에서 직접 불러오다보니까 일일이 불러줘야 한다.
        System.out.println("=======================");
        Print.delimiter="-------";
        Print.A();
        Print.delimiter="****";
        Print.B();
        Print.delimiter="-------";
        Print.A();
        Print.delimiter="****";
        Print.B();
    }
}