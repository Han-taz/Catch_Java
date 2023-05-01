public class gugudan1 {
    public static void main(String[] args) {
        int num2 = 2;
        int num3 = 3;
        int num9 = 9;
//        System.out.println(num2);

        for (int i=2;i<4;i++){
            System.out.println(i);
            for (int j=1;j<num9+1;j++){
                System.out.println(i+"*"+j+"="+String.format("%2d",i*j));
            }
        }

    }
}