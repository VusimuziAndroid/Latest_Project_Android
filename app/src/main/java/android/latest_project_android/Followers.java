package android.latest_project_android;

/**
 * Created by Vusi Ngwenya on 7/18/2016.
 */
public class Followers {
    String fFunction;
    String numOfFollowers;
    int logo;
    String logoTitle;
    String peopleLikes;
    public Followers(String fFunction,String numOfFollowers,int logo,String logoTitle,String peopleLikes){
        this.fFunction=fFunction;
        this.numOfFollowers=numOfFollowers;
        this.logo=logo;
        this.logoTitle=logoTitle;
        this.peopleLikes=peopleLikes;
    }
    public String getFFunction(){
        return this.fFunction;
    }
    public String getNumberOfFollowers(){
        return this.numOfFollowers;
    }
    public int getLogo(){
        return this.logo;
    }
    public String getLogoTitle(){
        return this.logoTitle;
    }
    public String getPeopleLikes(){
        return this.peopleLikes;
    }
}
