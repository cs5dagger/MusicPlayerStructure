package android.example.musicstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {
    TextView singerName;
    TextView songName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        singerName = findViewById(R.id.singer_name);
        songName = findViewById(R.id.song_name);

        Intent intent = getIntent();
        String song = intent.getStringExtra("song");
        String singer = intent.getStringExtra("singer");

        songName.setText(song);
        singerName.setText(singer);
    }
}
