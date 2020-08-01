package sur.cas.edu.muziki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class KondeboiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kondeboi);
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("Harmonize", "Nimabie", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "fire west", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "Kwangwaru", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "atarudi", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "happy birthday", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "aiyola", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "matatizo", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "kainama", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "uno", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "Never give up", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "Suzana", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "kushoto kulia", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "wife", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "mama", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "nishapona", R.drawable.kondeboi));
        music.add(new Music("Harmonize", "hainistui", R.drawable.kondeboi));


        // Create an {@link MusicAdapter}, whose data source is a list of
        // {@link music}s. The adapter knows how to create list item views for each item
        // in the list.
        MusicAdpater musicAdpater = new MusicAdpater(this, R.layout.list_item, music);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(musicAdpater);
    }
}
