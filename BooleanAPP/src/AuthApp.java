public class AuthApp {

    public static void main(String[] args) {

        String id = "kevin";
        String inputId = args[0];
        System.out.println(inputId);

        String pwd = "1111";
        String inputpwd = args[1];
        System.out.println(inputpwd);


        System.out.println("Hi.");

        //if(inputId == id) {
//        if (inputId.equals(id)){
//            if (inputpwd.equals(pwd)){
//                System.out.println("Master");
//            } else {
//                System.out.println("Wrong PASSWORD");
//            }
//        } else {
//            System.out.println("WHO R YOU");
//        }
        if (inputId.equals(id) && inputpwd.equals(pwd)) {
            System.out.println("Yes Master!");
        } else {
            System.out.println("Who Are You");
        }
    }
}