package android.latest_project_android;

/**
 * Created by ABVN237 on 6/30/2016.
 */
public class Profile {
    int picture;
    String role;
    String relatedRole;
    String center;
    public Profile(String role,String relatedRole,int picture){
       // this.picture=picture;
        this.role=role;
        this.relatedRole=relatedRole;
        this.picture=picture;
     //   this.center=center;
    }
    //The method for returning the picture
  /*  public int getPicture(){
        return picture;
    }*/
    //The method for returning the position
    public String getRole()
    {
        return this.role;
    }
    //The method for returning the number of people with the same role
    public String getRelatedRole(){
        return this.relatedRole;
    }
    public String getCenter(){
        return this.center;
    }
    public int getPicture(){
        return this.picture;
    }
}
