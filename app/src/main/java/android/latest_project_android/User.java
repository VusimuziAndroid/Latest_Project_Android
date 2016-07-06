package android.latest_project_android;

/**
 * Created by Vusi Ngwenya on 7/5/2016.
 */
public class User {
    String username;
    String password;
    String confirmPassword;

    public User(String username,String password,String confirmPassword){
        this.username=username;
        this.password=password;
        this.confirmPassword=confirmPassword;
    }
    //The method for returning the username
    public String getUsername(){
        return this.username;
    }
    //The method for returning the password
    public String getPassword(){
        return this.password;
    }
    //The methos for returning the password
    public String getConfirmPassword(){
        return this.confirmPassword;
    }
}
