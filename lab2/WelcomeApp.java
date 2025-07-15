package lab2;

public class WelcomeApp {
    public static String welcomeMessage(String name) {
        return "Hello " + name + ", Welcome to Java World!";
    }
    public static void main(String[] args) {
        String name = "PRAVEEN";
        String message = welcomeMessage(name);
        System.out.println(message);
    }
}
