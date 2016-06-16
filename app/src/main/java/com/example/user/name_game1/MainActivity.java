package com.example.user.name_game1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showName(View view) {
        TextView myName  = (TextView) findViewById(R.id.name);
        myName.setVisibility(View.VISIBLE);
    }

        public void showAnimal(View view) {
      ImageView myImage  = (ImageView)findViewById(R.id.animal);
myImage.setVisibility(View.VISIBLE);
    }

    public void showReset(View view) {

    TextView myName  = (TextView) findViewById(R.id.name);
    myName.setVisibility(View.INVISIBLE);
    ImageView myImage  = (ImageView) findViewById(R.id.animal);
    myImage.setVisibility(View.INVISIBLE);
    }
}
