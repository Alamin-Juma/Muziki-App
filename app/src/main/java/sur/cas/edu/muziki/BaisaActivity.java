package sur.cas.edu.muziki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BaisaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baisa);
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("Mr Blue", "Mapozi", R.drawable.baisa));
        music.add(new Music("Mr Blue", "Nilikataa", R.drawable.baisa));
        music.add(new Music("Mr Blue ft Berry Black", "Na Wewe tuh", R.drawable.baisa));
        music.add(new Music("Mr Blue ft Nandy", "Hazipo ft Nandy", R.drawable.baisa));
        music.add(new Music("Mr Blue ft Alikiba", "Usiniseme", R.drawable.baisa));
        music.add(new Music("Mr Blue", "Mbwa koko", R.drawable.baisa));
        music.add(new Music("Mr Blue ft Sumalee", "Tabasamu", R.drawable.baisa));
        music.add(new Music("Mr  ft Jux", "Hatufanani", R.drawable.baisa));
        music.add(new Music("Mr Blue ft Alikiba", "Mboga Saba", R.drawable.baisa));
        music.add(new Music("Mr Blue ft Konde Boi", "Inanimaliza", R.drawable.baisa));
        music.add(new Music("Mr Blue", "Hatutaki kesi", R.drawable.baisa));
        music.add(new Music("Mr Blue", "Maombi", R.drawable.baisa));
        music.add(new Music("Mr Blue", "Oh Baby", R.drawable.baisa));
        music.add(new Music("Mr Blue", "My love", R.drawable.baisa));
        music.add(new Music("Mr Blue", "Penzi la moyo", R.drawable.baisa));


        // Create an {@link MusicAdapter}, whose data source is a list of
        // {@link music}s. The adapter knows how to create list item views for each item
        // in the list.
        MusicAdpater musicAdpater = new MusicAdpater(this, R.layout.list_item, music);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(musicAdpater);
    }
}
