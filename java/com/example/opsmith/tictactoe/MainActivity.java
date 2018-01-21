package com.example.opsmith.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerRlsBtn();
        addListenerPlyBtn();
    }

    public void addListenerRlsBtn() {

        final Context context = this;

        button = (Button) findViewById(R.id.rlsBtn);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Rules.class);
                startActivity(intent);

            }

        });

    }


    public void addListenerPlyBtn() {


        final Context context = this;

        button = (Button) findViewById(R.id.plyBtn);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                EditText et = (EditText) findViewById(R.id.editText4);
                EditText et2 = (EditText) findViewById(R.id.editText5);

                final String str1 = et.getText().toString();
                final String str2 = et2.getText().toString();

                Intent i = new Intent(MainActivity.this, Play.class);
                i.putExtra("playerx", str1);
                i.putExtra("playero", str2);
                startActivity(i);



            }

        });
    }
}


