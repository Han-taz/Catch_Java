class Greeting{
    //public, protected, default,
    // private: 같은 클래스 내에서만 사용 가능
    public static void hi() {
        System.out.println("HI");
    }
}
public class AccessLevelModifierMethod {

    public static void main(String[] args) {
        Greeting.hi();

    }
}