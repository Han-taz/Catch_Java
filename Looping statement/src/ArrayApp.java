public class ArrayApp {
    public static void main(String[] args) {
        // egoing, jinhyuck, youbin
        String[] Users = new String[3];
        Users[0] = "egoing";
        Users[1] = "jinhyuck";
        Users[2] = "youbin";
        System.out.println(Users[1]);
        System.out.println(Users.length);

        int[] scores = {10,100,100};
        System.out.println(scores[1]);
        System.out.println(scores.length);

        String[] test = {"one","two","three"};
        System.out.println(test[2]);

        for (int i=0;i<3;i++) {
            System.out.println(Users[i]);
        }
        for (int j=0; j<Users.length;j++) {
            System.out.println("<li>"+Users[j]+"</li>");

        }

    }
}
