
public class User {

    private String login;
    private String password;
    private int age;

    public User(String login, String password, int age){
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
       this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Hello, " + this.login +
                "\nwe know your password " + this.password + "\n"
                + "your age is " + this.age;
    }
}
