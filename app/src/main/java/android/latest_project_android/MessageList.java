package android.latest_project_android;

/**
 * Created by ABVN237 on 8/7/2016.
 */
public class MessageList {
    int proPicture;
    String title;
    String message;

    public MessageList(int proPicture,String message,String title){
        this.proPicture=proPicture;
        this.message=message;
        this.title=title;
    }
    public int getProfilePicture(){
        return this.proPicture;
    }
    public String getTitle(){
        return this.title;
    }
    public String getMessage(){
        return this.message;
    }
}
