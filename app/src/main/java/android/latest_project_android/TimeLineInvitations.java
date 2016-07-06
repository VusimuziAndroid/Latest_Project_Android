package android.latest_project_android;

/**
 * Created by Vusi Ngwenya on 7/3/2016.
 */
public class TimeLineInvitations {
    int timeLinePicture;
    String name;
    String role;
    int imgIcon1;
    int imgIcon2;

    public TimeLineInvitations(int timeLinePicture,String name,String role,int imgIcon1,int imgIcon2){
        this.timeLinePicture=timeLinePicture;
        this.name=name;
        this.role=role;
        this.imgIcon1=imgIcon1;
        this.imgIcon2=imgIcon2;
    }
    public int getTimelinePicture(){
        return this.timeLinePicture;
    }
    public String getName(){
        return this.name;
    }
    public String getTimeLineRole(){return this.role;}
    public int getImageIcon1(){
        return this.imgIcon1;
    }
    public int getImageIcon2(){
        return this.imgIcon2;
    }

}
