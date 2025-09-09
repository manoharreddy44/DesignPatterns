//The Builder Pattern separates the construction of a complex object from its representation, so that the same construction process can create different representations.




package CreationalDesignPatterns.Builder.BeforeBuilder;

class User {
    private String name;
    private int age;
    private String email;
    private String phone;
    private String address;

    public User(String name, int age, String email, String phone, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
}

