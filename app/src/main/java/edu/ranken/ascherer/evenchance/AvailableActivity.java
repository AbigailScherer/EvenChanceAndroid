package edu.ranken.ascherer.evenchance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AvailableActivity extends AppCompatActivity {

    Button buttonDogs2;
    Button buttonContact2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available);
        buttonContact2 = findViewById(R.id.buttonDogs2);
        buttonDogs2 = findViewById(R.id.buttonDogs2);


        buttonContact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"info@evenchance.org"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Resume");
            }
        });
    }
}
