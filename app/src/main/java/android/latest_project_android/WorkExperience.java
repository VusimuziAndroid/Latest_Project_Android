package android.latest_project_android;

/**
 * Created by Vusi Ngwenya on 7/12/2016.
 */
public class WorkExperience {
    String username;
    String jobTitle;
    String city;
    String jobs;
    String country;
    String places;
    String department;
    String postCode;
    public WorkExperience(String username,String jobTitle,String country,String pCode,String places,String postCode){
        this.username=username;
        this.jobTitle=jobTitle;
        this.country=country;
        this.places=jobs;
        this.postCode=postCode;
    }
    public String getUsername(){
        return this.username;
    }
    public String getJobTitle(){
        return this.jobTitle;
    }
    public String getCountry(){
        return this.country;
    }
    public String getPlaces(){
        return this.places;
    }
    public String getPostCode(){
        return this.postCode;
    }

}
