package android.latest_project_android;

/**
 * Created by ABVN237 on 8/7/2016.
 */
public class MessageList {
    int proPicture;
    String message;

    public MessageList(int proPicture,String message){
        this.proPicture=proPicture;
        this.message=message;
    }
    public int getProfilePicture(){
        return this.proPicture;
    }
    public String getMessage(){
        return this.message;
    }
}
