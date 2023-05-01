import java.io.FileWriter;
import java.io.IOException;

public class OtherOOP {
    public static void main(String[] args) throws IOException {
        //class : System, Math, FileWriter
        //instance : f1, f2
        //class[Math]
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.9));
        System.out.println(Math.ceil(1.1));

        //class[FilWriter]
        // new FileWriter는 복제본 = 인스턴스
        FileWriter fw1 = new FileWriter("data.txt");
        fw1.write("hello");
        fw1.write("Java");
        fw1.close();

        FileWriter fw2 = new FileWriter("data2.txt");
        fw2.write("hello");
        fw2.write("\nJava");
        fw2.close();
    }
}