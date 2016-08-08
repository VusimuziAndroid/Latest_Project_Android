package android.latest_project_android;

/**
 * Created by ABVN237 on 8/8/2016.
 */
public class NotificationsClass {
    int imgPropicture2;
    String line1;
    String line2;
    String time;
    String view;

    public NotificationsClass(int imgPropicture2,String line1,String line2,String time,String view){
        this.imgPropicture2=imgPropicture2;
        this.line1=line1;
        this.line2=line2;
        this.time=time;
        this.view=view;
    }
    public int getProfilePicture(){
        return this.imgPropicture2;
    }
    public String getTextLine1(){
        return this.line1;
    }
    public String getTextLine2(){
        return this.line2;
    }
    public String getTime(){
        return this.time;
    }
    public String getView(){
        return this.view;
    }
}
