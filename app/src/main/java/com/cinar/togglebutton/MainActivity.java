package com.cinar.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton yesNo;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yesNo  = findViewById(R.id.toggleButton);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        textView.setText("Fenerbahçe");

       yesNo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (yesNo.isChecked()){
                    imageView.setImageResource(R.drawable.fb);
                    textView.setText("Fenerbahçe");
                    Toast.makeText(MainActivity.this,"Başarılı işlem",Toast.LENGTH_LONG).show();
                }
                else {
                    imageView.setImageResource(R.drawable.tr);
                    textView.setText("Türkiye");
                    Toast.makeText(MainActivity.this,"Başarılı işlem",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}