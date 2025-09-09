package CreationalDesignPatterns.Builder.AfterBuilder;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Alice", 25)
                            .email("alice@gmail.com")
                            .build();

        User user2 = new User.UserBuilder("Bob", 30)
                            .phone("12345")
                            .address("New York")
                            .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
