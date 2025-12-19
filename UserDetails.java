class Login {
    private String username;
    private String password;

        Login(String username, String password) {
        this.username = username;
        if (password.length() >= 8) {
            this.password = password;
            System.out.println("Password is created successfully.");
        } else {
            this.password = null; 
            System.out.println("Password should be at least 8 characters.");
        }
    }

    String getUsername() {
        return username;
    }

    String getPassword() {
        if (password != null) {
            return password;
        } else {
            return "No valid password set";
        }
    }
}

class UserDetails {
    public static void main(String[] args) {
        
        Login l = new Login("Sushmitha", "123456");

        System.out.println("Username is: " + l.getUsername());
        System.out.println("Password is: " + l.getPassword());

        
        Login l2 = new Login("Sushmitha", "12345678");

        System.out.println("Username is: " + l2.getUsername());
        System.out.println("Password is: " + l2.getPassword());
    }
}
