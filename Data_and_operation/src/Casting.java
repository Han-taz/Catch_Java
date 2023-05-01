public class Casting {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1;

//        c = 1.1;
        int d = (int) 1.1;
        double e = 1.1;

        System.out.println(d);
        System.out.println(e);

//        1 to string
        String f = Integer.toString(1);
        System.out.println("class이름은: "+f.getClass());
        System.out.println(f.getClass().getName());
        System.out.println("-------------------------");
        int g = 12345678;
        System.out.println(g);
        String str_g = Integer.toString(g);
        System.out.println(str_g.getClass());

    }
}


