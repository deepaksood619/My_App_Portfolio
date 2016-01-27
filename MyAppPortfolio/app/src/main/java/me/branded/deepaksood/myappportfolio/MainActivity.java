package me.branded.deepaksood.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void spotifyStreamer(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my SpotifyStreamer App", Toast.LENGTH_SHORT).show();
    }
    
    public void scoresApp(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Scores App", Toast.LENGTH_SHORT).show();
    }
    
    public void libraryApp(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Library App", Toast.LENGTH_SHORT).show();
    }
    
    public void buildItBigger(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my BuildItBigger App", Toast.LENGTH_SHORT).show();
    }
    
    public void xyzReader(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my xyzReader App", Toast.LENGTH_SHORT).show();
    }
    
    public void capstone(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
    }
}
