public class gugudan3 {
    public static void main(String[] args) {
        // While문을 사용한 구구단 구현하기
        int num = 6;
        int num2 = 7;
        int i = 1;
        while (i < 10) {
            System.out.println(num+"x"+i+"="+num*i);
            System.out.println(num2+"x"+i+"="+num2*i);
            i++;
        }

        //for문을 사용한 구구단 구현하기
        for (int k=6;k<8;k++){
            for (int j=1;j<10;j++){
                System.out.println(k+"x"+j+"="+k*j);
            }
        }
    }
}
