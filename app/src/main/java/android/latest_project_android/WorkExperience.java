package android.latest_project_android;

/**
 * Created by Vusi Ngwenya on 7/12/2016.
 */
public class WorkExperience {
    String username;
    String country;
    String city;
    String jobs;
    String department;
    String postCode;
    public WorkExperience(String username,String country,String city,String jobs,String department,String postCode){
        this.username=username;
        this.country=country;
        this.city=city;
        this.jobs=jobs;
        this.department=department;
        this.postCode=postCode;
    }
    public String getUsername(){
        return this.username;
    }
    public String getCountry(){
        return this.country;
    }
    public String getCity(){
        return this.city;
    }
    public String getJobs(){
        return this.jobs;
    }
    public String getDepartment(){
        return this.department;
    }
    public String getPostCode(){
        return this.postCode;
    }
}
