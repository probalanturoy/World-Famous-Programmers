package com.example.antu.worldfamousprogrammers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView =(ImageView) findViewById(R.id.imageViewId);
        textView = (TextView) findViewById(R.id.textViewId);


        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            String personName = bundle.getString("name");
            showDetails(personName);

        }


    }


    void showDetails(String personName){

        if (personName.equals("dennis")){

            imageView.setImageResource(R.drawable.dennis);
            textView.setText(R.string.dennis_text);
        }
        if (personName.equals("bjarne")){

            imageView.setImageResource(R.drawable.bjarne);
            textView.setText(R.string.bjarne_text);
        }
        if (personName.equals("james")){

            imageView.setImageResource(R.drawable.james);
            textView.setText(R.string.james_text);
        }

        if (personName.equals("anders")){

            imageView.setImageResource(R.drawable.anders);
            textView.setText(R.string.anders_text);
        }
        if (personName.equals("tim")){

            imageView.setImageResource(R.drawable.tim);
            textView.setText(R.string.tim_text);
        }
        if (personName.equals("brain")){

            imageView.setImageResource(R.drawable.brain);
            textView.setText(R.string.brian_text);
        }
        if (personName.equals("ken")){

            imageView.setImageResource(R.drawable.ken);
            textView.setText(R.string.ken_text);
        }
        if (personName.equals("guido")){

            imageView.setImageResource(R.drawable.guido);
            textView.setText(R.string.guido_text);
        }
        if (personName.equals("donald")){

            imageView.setImageResource(R.drawable.donald);
            textView.setText(R.string.donald_text);
        }
    }
}
