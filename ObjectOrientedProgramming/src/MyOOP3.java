public class MyOOP3 {
    //클래스를 불러오는 것이 아닌 인스턴스로 불러와서 사용하기
    //인스턴스 Print를 사용할 때 print.java(클래스)의 메서드에서 static을 없애면 인스턴스에서 사용이 가능하다.
    public static void main(String[] args) {
        Print p1 = new Print();
        p1.delimiter = "****";
        p1.A();
        p1.A();
        p1.B();
        p1.B();

        Print p2 = new Print();
        p2.delimiter = "====";
        p2.A();
        p2.A();
        p2.B();
        p2.B();

        p1.A();
        p2.A();

    }
}
