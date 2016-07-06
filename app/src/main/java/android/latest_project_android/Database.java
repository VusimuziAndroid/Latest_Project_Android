package android.latest_project_android;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.nfc.Tag;
import android.util.Log;

/**
 * Created by Vusi Ngwenya on 7/4/2016.
 */
public class Database extends SQLiteOpenHelper {
    private static final String LOGCAT = null;
    private static final android.database.sqlite.SQLiteDatabase.CursorFactory MODE_PRIVATE = null;
    public static final String DATABASE_NAME= "LinkedInDB3.db";
    SQLiteDatabase db;
    //The constructor for the SQLite Helper (Datasource class)
    DatabaseValues databaseValues = new DatabaseValues();
    public Database(Context context) {
        super(context,DATABASE_NAME, null, 1);
        Log.d(LOGCAT, "Created");
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query;
        //The method for creating the new table on the database
        db.execSQL(" CREATE TABLE " + databaseValues.TABLE_NAME + "(Username TEXT PRIMARY KEY,Password TEXT,ConfirmPassword TEXT);");
        db.execSQL(" CREATE TABLE " + databaseValues.TABLE_NAME2 + "(Username TEXT PRIMARY KEY,Name TEXT,Surname TEXT,Role TEXT,YearsInExperience INTEGER,High_School_Name TEXT,Tertiary_Name TEXT,VolunteerWork TEXT,Profile_Picture INTEGER);");
        //  db.execSQL(" CREATE TABLE " + databaseValues.TABLE_NAME2 + "(Username TEXT PRIMARY KEY,Picture BLOB);");
        Log.e("DATABASE OPERATIONS", "Table created ...");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query;
        query = "DROP TABLE IF EXISTS Users";
        db.execSQL(query);
    }

    public void insertUsers(User user){

        Tag Tag=null;
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(databaseValues.COLUMN_NAME1,user.getUsername());
        values.put(databaseValues.COLUMN_NAME2,user.getPassword());
        values.put(databaseValues.COLUMN_NAME3,user.getConfirmPassword());
       /* Log.e(String.valueOf(Tag), user.getUsername());
        Log.e(String.valueOf(Tag), user.getPassword());
        Log.e(String.valueOf(Tag), user.getConfirmPassword());*/
        db.insert(databaseValues.TABLE_NAME, null, values);
        db.close();
    }
   /* public void insertMessage(Message message){
        Tag Tag=null;
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(databaseValues.STORY_COLUMN_NAME1, message.getUsername());
        values.put(databaseValues.STORY_COLUMN_NAME2, message.getMessage());
        values.put(databaseValues.STORY_COLUMN_NAME3, message.getMessageType());
        values.put(databaseValues.STORY_COLUMN_NAME4, message.getPicture());
        Log.e(String.valueOf(Tag), message.getUsername());
        Log.e(String.valueOf(Tag), message.getMessage());
        Log.e(String.valueOf(Tag), message.getMessageType());
        db.insert(databaseValues.TABLE_NAME, null, values);
        db.close();
    }
    public void getImage(){
        Cursor c = db.rawQuery("SELECT * FROM Stories",null);
        if(c.moveToNext()){
            byte[] image = c.getBlob(0);
            Bitmap bmp = BitmapFactory.decodeByteArray(image, 0, image.length);
        }
    }
    public void updateMessage(Message message){
        Tag Tag = null;
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(databaseValues.STORY_COLUMN_NAME2, message.getMessage());
        values.put(databaseValues.STORY_COLUMN_NAME3, message.getMessageType());
        values.put(databaseValues.STORY_COLUMN_NAME4, message.getPicture());
        db.update(databaseValues.TABLE_NAME3,values,"Username=?",new String[]{message.username});
    }
    public Cursor SignIn(){
        db = this.getReadableDatabase();
        Cursor cursor;
        String[] projections = {databaseValues.COLUMN_NAME1,databaseValues.COLUMN_NAME2,databaseValues.COLUMN_NAME3,databaseValues.COLUMN_NAME4,databaseValues.COLUMN_NAME5};
        cursor = db.query(databaseValues.TABLE_NAME,projections,null,null,null,null,null);
        return cursor;
    }*/
    private class DatabaseValues{
        private static final String TABLE_NAME = "Users";
        private static final String TABLE_NAME2 = "Profile";
        private static final String TABLE_NAME3 ="Picture";;
        private static final String COLUMN_NAME1="Username";
        private static final String COLUMN_NAME2="Password";
        private static final String COLUMN_NAME3="ConfirmPassword";
        private static final String STORY_COLUMN_NAME1="Username";
        private static final String STORY_COLUMN_NAME2="Message";
        private static final String STORY_COLUMN_NAME3="MessageType";
        private static final String STORY_COLUMN_NAME4="Picture";
    }

}
