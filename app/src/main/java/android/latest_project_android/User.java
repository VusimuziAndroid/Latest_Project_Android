package android.latest_project_android;

/**
 * Created by Vusi Ngwenya on 7/5/2016.
 */
public class User {
    String username;
    String name;
    String surname;
    String password;

    public User(String username, String name, String surname, String password) {
        this.username=username;
        this.name = name;
        this.surname = surname;
        this.password=password;
    }
    //The method for returning the username
    public String getUsername(){
        return this.username;
    }

    //The method for returning the name
    public String getName() {
        return this.name;
    }

    //The method for returning the surname
    public String getSurname() {
        return this.surname;
    }
    //The method for returning the password
    public String getPassword(){
        return this.password;
    }
}
