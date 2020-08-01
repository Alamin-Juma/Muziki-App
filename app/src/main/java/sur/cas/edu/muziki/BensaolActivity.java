package sur.cas.edu.muziki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BensaolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bensaol);
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("Bensol", "Niombee", R.drawable.bensol));
        music.add(new Music("Bensol", "Pedi", R.drawable.bensol));
        music.add(new Music("Bensol", "salama", R.drawable.bensol));
        music.add(new Music("Bensol", "forget you", R.drawable.bensol));
        music.add(new Music("Bensol", "sweet sens", R.drawable.bensol));
        music.add(new Music("Bensol", "favourite song", R.drawable.bensol));
        music.add(new Music("Bensol", "No kisses", R.drawable.bensol));
        music.add(new Music("Bensol", "Mungu Pekee", R.drawable.bensol));
        music.add(new Music("Bensol", "Ndom", R.drawable.bensol));
        music.add(new Music("Bensol", "Rhumba ya Japan", R.drawable.bensol));
        music.add(new Music("Bensol", "Extravaganza", R.drawable.bensol));
        music.add(new Music("Bensol", "ile kitu", R.drawable.bensol));
        music.add(new Music("Bensol", "Lucy", R.drawable.bensol));
        music.add(new Music("Bensol", "boyz", R.drawable.bensol));
        music.add(new Music("Bensol", "Kenya yetu", R.drawable.bensol));


        // Create an {@link MusicAdapter}, whose data source is a list of
        // {@link music}s. The adapter knows how to create list item views for each item
        // in the list.
        MusicAdpater musicAdpater = new MusicAdpater(this, R.layout.list_item, music);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(musicAdpater);
    }
}
