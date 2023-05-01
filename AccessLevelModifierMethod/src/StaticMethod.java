// static - class methond
// no static - instance method
class Print {
    public String delimiter;
    public  void a() {
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }

    public  void b() {
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");

    }

    public static void c(String delimiter) {
        System.out.println(delimiter);
        System.out.println("C");
        System.out.println("C");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
//        구분자를 일일이 설정해줘야 한다. 귀찮다.
//        Print.a("-");
//        Print.b("*");

        // 클래스 Print의 새로운 인스턴스 t1,t2 생성
        Print t1 = new Print();
        t1.delimiter = "-";
        t1.a();
        t1.b();

        Print t2 = new Print();
        t2.delimiter = "*";
        t2.a();
        t2.b();

        Print.c("=");
    }


}


