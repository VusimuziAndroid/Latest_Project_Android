package android.latest_project_android;

import java.sql.Blob;

/**
 * Created by Vusi Ngwenya on 7/12/2016.
 */
public class Picture {
    Blob blob;
    String username;
    public Picture(String username,Blob blob){
        this.username=username;
        this.blob=blob;
    }
    public String getUsername(){
        return this.username;
    }
    public Blob getPicture(){
        return this.blob;
    }
}
