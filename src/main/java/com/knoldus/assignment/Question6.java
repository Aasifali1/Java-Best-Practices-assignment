package com.knoldus.assignment;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Question-6:
 * In the below code snippet, there is a security concern.
 * Identify it and give reason.
 */

/** Answer:
 * There are many security issues:
 * You are comparing plain text password that's not safe,
 * use hashing algorithm instead.
 *
 */

class User{
    String username;
    String password;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
public class Question6 {
    public static void main(String[] args) {
        boolean check = authenticate(new User("myUser", "myPassword"));
        System.out.println(check);
    }
    private static boolean authenticate(User user) {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.log(Level.INFO,"authenticate user {}", user);
        return "User1".equals(user.getUsername()) &&  "checkPass".equals(user.getPassword());
    }
}
