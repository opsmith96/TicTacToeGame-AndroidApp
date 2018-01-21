package com.example.opsmith.tictactoe;

        import android.app.Activity;
        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

/**
 * Created by OPSMITH on 27.05.2017.
 */

public class Rules extends Activity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);
        addListenerbackBtn();
    }

    public void addListenerbackBtn() {

        final Context context = this;

        button = (Button) findViewById(R.id.buttonback);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);

            }

        });
    }
}