package seminars.third.tdd;

public class User {

    public String name;
    public String password;
    public boolean isAdmin;
    public boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public boolean authenticate(String name, String password) {
        if (name.equals(this.name) && password.equals(this.password)) {
            isAuthenticate = true;
            return true;
        } else {
            isAuthenticate = false;
            return false;
        }
    }

    public void logOut() {
        this.isAuthenticate = false;
    }
}