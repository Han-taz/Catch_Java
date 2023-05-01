public class AuthApp3 {
    public static void main(String[] args) {
        String[] users = {"egoing","jinhyuck","youbin"};
        String inputID = args[0];


        boolean isLogined = false;
        for(int i=0; i<users.length; i++) {
            System.out.println(users[i]);
            String currentId = users[i];
            if(inputID.equals(currentId)) {
                System.out.println("Login");
                isLogined = true;
                break;

            }
        }
        System.out.println("HI");
        if(isLogined){
            System.out.println("Master!!!");
        } else{
            System.out.println("Who R U");
        }
    }
}
