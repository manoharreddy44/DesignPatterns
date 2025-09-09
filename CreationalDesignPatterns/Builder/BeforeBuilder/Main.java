package CreationalDesignPatterns.Builder.BeforeBuilder;

public class Main {
  public static void main(String[] args) {
    User user = new User("John", 30, "john@example.com", "123-456-7890", "123 Main St");

    System.out.println("User created: " + user);
  }
}
    