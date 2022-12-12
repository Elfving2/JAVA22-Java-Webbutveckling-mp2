package controller.uppgift2.model;

import java.io.Serializable;

public class Bean implements Serializable {
    private String username;
    private String password;

    public Bean () {
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
