package CreationalDesignPatterns.Builder.AfterBuilder;

class User {
    private String name;
    private int age;
    private String email;
    private String phone;
    private String address;

    // Private constructor
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Static nested Builder class
    public static class UserBuilder {
        private String name;
        private int age;
        private String email;
        private String phone;
        private String address;

        public UserBuilder(String name, int age) { // required fields
            this.name = name;
            this.age = age;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age +
               ", email='" + email + "', phone='" + phone +
               "', address='" + address + "'}";
    }
}

