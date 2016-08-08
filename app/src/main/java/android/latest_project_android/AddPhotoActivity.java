package android.latest_project_android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AddPhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_photo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.circle);
       // Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap,100);
        ImageView circularImageView = (ImageView)findViewById(R.id.imgCircle);
    } //The method for populating the list view
   /* public void populateItemsList(){
        int proPicture=R.drawable.pro_picture;
        String name="Christine Perkins";
        String role="CEO of Solar Slash";
        String time="23 mins";
        String storyLine="Reallly excited to use the technological progress "+
                "happening in solar right now. Where do you guys"+
                "think the biggest impact will be?";
        int timelinePicture=R.drawable.timeline_pic1;
        String story="SolarCity to Make High Efficiency Panel";
        String sites="SolarCity to Make High Efficiency Panel";
        //  String sites="mytimes.com";
        String likes="mytimes.com";
        String likes2="29 Comments";
        String comments="12 Comments";
        String fullName="Jason Anderson";
        int proPic=R.drawable.profile_image;
        String allComments="I think this is the amazing leap for conwumer electricity cost";


    }*/
    //The class for the Array Adapter
  /*  private class MyListAdapterItems extends ArrayAdapter<Items> {
        int resource;
        ArrayList<Items> items1= new ArrayList<Items>();
        public MyListAdapterItems(Context context, int resource, List<Items> objects) {
            super(context, resource, objects);
            this.resource = resource;
            items1 = (ArrayList<Items>)objects;
        }
        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(resource,parent,false);
            }

            Items items =items1.get(position);*/

            //Setting values to the Controls on the inflater layout
            /*ImageView imgProfilePicture = (ImageView) itemView.findViewById(R.id.imgProfilePicture);
            Bitmap bitmap=null;
            Bitmap circle = Bitmap.createBitmap(bitmap.getWidth(),bitmap.getHeight(),Bitmap.Config.ARGB_8888);

            imgProfilePicture.setImageResource(items.getProfilePicture());*/
          /*  ImageView imgProfilePicture = (ImageView) itemView.findViewById(R.id.imgProfilePicture);
            imgProfilePicture.setImageResource(items.getProfilePicture());

            TextView tvName=(TextView) itemView.findViewById(R.id.tvName);
            tvName.setText(items.getName());

            TextView tvRole=(TextView) itemView.findViewById(R.id.tvRole);
            tvRole.setText(items.getRole());

            TextView tvTime=(TextView) itemView.findViewById(R.id.tvTime);
            tvTime.setText(items.getTime());

            TextView tvStory=(TextView) itemView.findViewById(R.id.tvStory);
            tvStory.setText(items.getStory());

            ImageView imgTimeLinePicture = (ImageView) itemView.findViewById(R.id.imgTimelinePic);
            imgTimeLinePicture.setImageResource(items.getTimeLinePic());

            TextView tvStoryLine=(TextView) itemView.findViewById(R.id.tvStoryLine);
            tvTime.setText(items.getStoryLine());

            TextView tvSite=(TextView) itemView.findViewById(R.id.tvSite);
            tvSite.setText(items.getSite());

            TextView tvLikes=(TextView) itemView.findViewById(R.id.tvLikes);
            tvLikes.setText(items.getLikes());

            TextView tvLikes2=(TextView) itemView.findViewById(R.id.tvLikes2);
            tvLikes2.setText(items.getLikes2());

            TextView tvComments=(TextView) itemView.findViewById(R.id.tvComments);
            tvComments.setText(items.getComments());

            ImageView imgLikes = (ImageView) itemView.findViewById(R.id.imgLikes);
            imgLikes.setImageResource(items.getImgLikes());

            ImageView imgComments = (ImageView) itemView.findViewById(R.id.imgComments);
            imgComments.setImageResource(items.getImgComments());

            ImageView imgShare = (ImageView) itemView.findViewById(R.id.imgShares);
            imgShare.setImageResource(items.getImgShare());

            ImageView proPicture = (ImageView) itemView.findViewById(R.id.imgProPicture);
            proPicture.setImageResource(items.getPicture());

            TextView tvFillName=(TextView) itemView.findViewById(R.id.tvFullName);
            tvFillName.setText(items.getFullName());

            TextView tvAllComments=(TextView) itemView.findViewById(R.id.tvPostComment);
            tvAllComments.setText(items.getAllComments());

            return itemView;
        }
    }*/
}
