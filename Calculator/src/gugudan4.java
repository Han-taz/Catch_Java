import java.util.Scanner;
public class gugudan4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = scn.nextInt();

        if ((1 < a) && (a< 10)) {
            for(int i=1;i<10;i++){
                System.out.println(a+"x"+i+"="+a*i);
            }
        }else{
            System.out.println("2~9 please");
        }

    }
}
