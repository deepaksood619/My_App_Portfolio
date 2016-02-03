package me.branded.deepaksood.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void spotifyStreamer(View view) {
        if(toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(MainActivity.this, "This button will launch my SpotifyStreamer App", Toast.LENGTH_SHORT);
        toast.show();
    }
    
    public void scoresApp(View view) {
        if(toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(MainActivity.this, "This button will launch my Scores App", Toast.LENGTH_SHORT);
        toast.show();
    }
    
    public void libraryApp(View view) {
        if(toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(MainActivity.this, "This button will launch my Library App", Toast.LENGTH_SHORT);
        toast.show();
    }
    
    public void buildItBigger(View view) {
        if(toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(MainActivity.this, "This button will launch my BuildItBigger App", Toast.LENGTH_SHORT);
        toast.show();
    }
    
    public void xyzReader(View view) {
        if(toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(MainActivity.this, "This button will launch my xyzReader App", Toast.LENGTH_SHORT);
        toast.show();
    }
    
    public void capstone(View view) {
        if(toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(MainActivity.this, "This button will launch my Capstone App", Toast.LENGTH_SHORT);
        toast.show();
    }
}
