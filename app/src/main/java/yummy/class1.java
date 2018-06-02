package yummy;

import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by mahmoud on 6/1/2018.
 */

public class class1 {

    public  int yummy_method(int x , int y )
    {
        return  (x+y);
    }

    public  String  yummy_method2(int x )
    {
        if(x>20)
        {
            return  "mahmoud";
        }else{
            return  "Ahmed";
        }

    }

    public  void Write_to_shard_prefrance(String s)
    {
        SharedPreferences.Editor editor = getSharedPreferences("my_shard_prefrance", MODE_PRIVATE).edit();
        editor.putString("name", s);
        editor.apply();
        // Toast.makeText(this,"hi mahmoud ",Toast.LENGTH_LONG).show();
    }

    public  String read_to_shard_prefrance()
    {
        SharedPreferences prefs =  getSharedPreferences("my_shard_prefrance", MODE_PRIVATE);
        String restoredText = prefs.getString("name", null);
        return  restoredText;
        // Toast.makeText(this,"hi mahmoud ",Toast.LENGTH_LONG).show();
    }


}
