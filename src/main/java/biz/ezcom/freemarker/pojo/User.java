package biz.ezcom.freemarker.pojo;

public class User {
    private int      id;
    private Username username;
    private String   password;

    public User() {}

    public User(int id, Username username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public final Username getUsername() {
        return this.username;
    }

    public final void setUsername(Username username) {
        this.username = username;
    }

    public final String getPassword() {
        return this.password;
    }

    public final void setPassword(String password) {
        this.password = password;
    }
}
