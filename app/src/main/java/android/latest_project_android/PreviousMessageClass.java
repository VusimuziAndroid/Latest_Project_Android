package android.latest_project_android;

/**
 * Created by ABVN237 on 8/10/2016.
 */
public class PreviousMessageClass {
    int sharedPicture;
    String title;
    String message;

    public PreviousMessageClass(int sharedPicture,String title,String message){
        this.sharedPicture=sharedPicture;
        this.title=title;
        this.message=message;
    }
    public int getSharedPicture(){
        return this.sharedPicture;
    }
    public String getTitle(){
        return this.title;
    }
    public String getMessage(){
        return this.message;
    }
}
