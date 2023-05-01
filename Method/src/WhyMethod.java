import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
    public static void printTwoTimesA() {
        System.out.println("-");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");

    }

    public static void printTwoTimesB() {
        System.out.println("-");
        System.out.println("B");
        System.out.println("B");
        System.out.println("B");
    }

    public static void printTimesC() {
        System.out.println("-");
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        System.out.println("-");
        System.out.println("B");
        System.out.println("B");
        System.out.println("B");
    }

    public static void WriteTwoTimes(String text, String delimiter) { //파라미터
        System.out.println("======Start!!!=======");
        System.out.println(delimiter);
        System.out.println(text + delimiter);
        System.out.println(text);
        System.out.println(text);


    }

    public static String WritetwoTimes(String text, String delimiter){
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;

    }

    public static void TwoTimes(String text, String delimiter) { //파라미터
        System.out.println("======Start!!!=======");
        System.out.println(delimiter);
        System.out.println(text + delimiter);
        System.out.println(text);
        System.out.println(text);
    }
    public static void main(String[] args) throws IOException {
        //100000000
        printTwoTimesA();
        printTwoTimesB();
        printTimesC();


        TwoTimes("A", "*");//"A" argments
        TwoTimes("B", "!");
        TwoTimes("C", "&");


        WritetwoTimes("a","*");
        FileWriter fw = new FileWriter("out.txt");
        fw.write(WritetwoTimes("a","*"));
        fw.close();


        //Method(=Function)
    }



}