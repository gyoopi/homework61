

public class Main {
    public static void main(String[] args) {
        User user = new User("shamil", "123456", 26);
        System.out.println(ageCheck(user.getAge()) ? "pass" : "you are under 18");
        System.out.println(user);;
    }

    public static boolean ageCheck (int inpute){
        return inpute > 18 ;
    }
}
