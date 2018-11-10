package masahiro.kubokawa.com.diseaseawareness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}

    public void process (View v){
        Intent i = null, chooser = null;
        if (v.getId() == R.id.diseases){

        }

        else if (v.getId() == R.id.symptoms){
            i = new Intent(this, SymptomsSearch.class);
            startActivity(i);
        }

        else if (v.getId() == R.id.about){
            i = new Intent(this, About.class);
            startActivity(i);
        }
    }
}