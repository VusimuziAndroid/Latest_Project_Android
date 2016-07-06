package android.latest_project_android;

/**
 * Created by Vusi Ngwenya on 7/1/2016.
 */
public class Items {
    int proPicture;
    String name;
    String role;
    String time;
    String story;
    int timelinePic;
    String storyLine;
    String site;
    String likes;
    String likes2;
    String comments;
    int imgLikes;
    int imgComments;
    int imgShare;
    int proPic;
    String fullName;
    String allComments;
    public Items(int proPicture,String name,String role,String time,String story,int timelinePic,String storyLine,String site,String likes,String likes2,String comments,int imgLikes,int imgComments,int imgShare,int proPic,String fullName,String allComments){
        this.proPicture=proPicture;
        this.name=name;
        this.role=role;
        this.time=time;
        this.story=story;
        this.timelinePic=timelinePic;
        this.storyLine=storyLine;
        this.site=site;
        this.likes=likes;
        this.likes2=likes2;
        this.comments=comments;
        this.imgLikes=imgLikes;
        this.imgComments=imgComments;
        this.imgShare=imgShare;
        this.proPic=proPic;
        this.fullName=fullName;
        this.allComments=allComments;
    }
    public int getProfilePicture(){
        return this.proPicture;
    }
    public String getName(){
        return this.name;
    }
    public String getRole(){
        return this.role;
    }
    public String getTime(){
        return this.time;
    }
    public String getStory(){
        return this.story;
    }
    public int getTimeLinePic(){
        return this.timelinePic;
    }
    public String getStoryLine(){
        return this.storyLine;
    }
    public String getSite(){
        return this.site;
    }
    public String getLikes(){
        return this.likes;
    }
    public String getLikes2(){
        return this.likes2;
    }
    public String getComments(){
        return this.comments;
    }
    public int getImgLikes(){return this.imgLikes;}
    public int getImgComments(){return this.imgComments;}
    public int getImgShare(){return this.imgShare;}
    public int getPicture(){return this.proPic;}
    public String getFullName(){return this.fullName;}
    public String getAllComments(){return this.allComments;}
}
