package android.latest_project_android;

import android.graphics.pdf.PdfDocument;

/**
 * Created by Vusi Ngwenya on 7/5/2016.
 */
public class NewProfile {
    /*String name;
    String surname;
    String role;
    int yearInExperience;
    String highSchoolName;
    String tertiaryName;
    String volunteerWork;
    int profilePicture;*/
    int imgProPicture1;
    String text;
    String text2;
    int icon;

    public NewProfile(int imgProPicture1,String text,String text2,int icon){
       /* this.name=name;
        this.surname=surname;
        this.role=role;
        this.yearInExperience=yearsInExperience;
        this.highSchoolName=highSchoolName;
        this.tertiaryName=tertiaryName;
        this.volunteerWork=volunteerWork;*/
        this.imgProPicture1=imgProPicture1;
        this.text=text;
        this.text2=text;
        this.icon=icon;
    }
    public int getImgProPicture(){
        return this.imgProPicture1;
    }
    public String getText(){
        return this.text;
    }
    public String getText2(){return this.text2;}
    public int getIcon1(){
        return this.icon;
    }
    //Method for returning the name
  /*  public String getName(){
        return this.name;
    }*/
    //Method for returning the surname
   /* public String getSurname(){
        return this.surname;
    }*/
    //Method for returning the role
    /*public String getRole(){
        return this.role;
    }*/
    //Method for returning the year in experience
   /* public int getYearsInExperience(){
        return this.yearInExperience;
    }*
    //Method for returning the high school name
    /*public String getHighSchoolName(){
        return this.highSchoolName;
    }*/
    //Method for returning the tertiary name
    /*public String getVolunteerWork(){
        return this.volunteerWork;
    }*/
    //Method for returning the volunteer work
    /*public String getTertiaryName(){
        return this.tertiaryName;
    }*/
}
