package sur.cas.edu.muziki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SautisoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sautiso);

        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("Sauti Sol", "Suzana", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Range rover ", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Sura yako", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Rhumba ya Japan", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Midnight train", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Kuliko jana", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Unconditional Bae", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Melanin", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Nenda lote", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Extravaganza", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "Isabella", R.drawable.sautisol));
        music.add(new Music("Sauti Sol", "My everything", R.drawable.sautisol));


        // Create an {@link MusicAdapter}, whose data source is a list of
        // {@link music}s. The adapter knows how to create list item views for each item
        // in the list.
        MusicAdpater musicAdpater = new MusicAdpater(this, R.layout.list_item, music);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(musicAdpater);
    }
}
