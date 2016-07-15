package android.latest_project_android;

/**
 * Created by Vusi Ngwenya on 7/14/2016.
 */
public class ViewProfile {
     int proPicture;
     String name;
     String surname;
     String role;
     String companyName;
     String jobArea;
     String country;
     public ViewProfile(int proPicture,String name,String surname,String role,String companyName,String jobArea,String country){
          this.proPicture=proPicture;
          this.name=name;
          this.surname=surname;
          this.role=role;
          this.companyName=companyName;
          this.jobArea=jobArea;
          this.country=country;
     }
     public int getProfilePicture(){
          return this.proPicture;
     }
     public String getName(){
          return this.name;
     }
     public String getSurname(){
          return this.surname;
     }
     public String getRole(){
          return this.role;
     }
     public String getCompanyName(){
          return this.companyName;
     }
     public String getJobArea(){
          return this.country;
     }
}
