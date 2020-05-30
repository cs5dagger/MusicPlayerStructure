package android.example.musicstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SongListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        final ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("you belong with me","Taylor Swift"));
        songs.add(new Songs("Dilbara","Sachet Tandon"));
        songs.add(new Songs("WOW","Tiesto"));
        songs.add(new Songs("Dus bahane","Vishal"));
        songs.add(new Songs("Senpai","Shiki-TMNS"));
        songs.add(new Songs("Humraah","Sachet Tandon"));
        songs.add(new Songs("Monster","Lumix"));
        songs.add(new Songs("Every Battle","Hallman"));
        songs.add(new Songs("Machi Nachi","Neeti Mohan"));
        songs.add(new Songs("Pentakill","Different haven"));
        songs.add(new Songs("Children of today","blasterjaxx"));
        songs.add(new Songs("Insomnia","King Arthur"));
        songs.add(new Songs("Uptown funk","MArk Robson"));
        songs.add(new Songs("BOOM","Tiesto"));
        songs.add(new Songs("Invisible","Zara Larsson"));
        songs.add(new Songs("Garden of madness","Dmitri vegas & like mike"));
        songs.add(new Songs("Rave","Steve Aoki"));
        songs.add(new Songs("Home","Martin Garrix"));

        SongAdapter adapter = new SongAdapter(this,songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),PlayerActivity.class);
                intent.putExtra("song", String.valueOf(songs.get(position).getDefaultSong()));
                intent.putExtra("singer", String.valueOf(songs.get(position).getDefaultSinger()));
                startActivity(intent);
            }
        });

    }
}
