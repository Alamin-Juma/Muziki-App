package sur.cas.edu.muziki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the imageView that shows the numbers category
        ImageView sautisolImage = findViewById(R.id.sautisol);
        // Set a click listener on that View
        sautisolImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sautisolImage category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link SecondActivity}
                Intent intent = new Intent(MainActivity.this, SautisoActivity.class);
                startActivity(intent);
            }
        });

        // Find the imageView that shows the numbers category
        ImageView baisaImage = findViewById(R.id.baisa);
        // Set a click listener on that View
        baisaImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the baisaImage category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link SecondActivity}
                Intent intent = new Intent(MainActivity.this, BaisaActivity.class);
                startActivity(intent);
            }
        });

        // Find the imageView that shows the numbers category
        ImageView kondeImage = findViewById(R.id.kondeboi);
        // Set a click listener on that View
        kondeImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the kondeImage category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link SecondActivity}
                Intent intent = new Intent(MainActivity.this, KondeboiActivity.class);
                startActivity(intent);
            }
        });

        // Find the imageView that shows the numbers category
        ImageView bensolImage = findViewById(R.id.bensol);
        // Set a click listener on that View
        bensolImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the bensolImage category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link SecondActivity}
                Intent intent = new Intent(MainActivity.this, BensaolActivity.class);
                startActivity(intent);
            }
        });

    }
}
