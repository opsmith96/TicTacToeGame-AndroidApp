package com.example.opsmith.tictactoe;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import static android.graphics.Color.BLACK;
        import static android.graphics.Color.BLUE;


public class Play extends AppCompatActivity{
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, buttonAgain;
    int turn;

    int X = 0;
    int O = 0;
    int tie = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);
        Bundle extras = getIntent().getExtras();
        final String str1 = extras.getString("playerx");
        final String str2 = extras.getString("playero");

        Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(500);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                final TextView XValue = (TextView) findViewById(R.id.Xview);
                                XValue.setText(Integer.toString(X));
                                final TextView OValue = (TextView) findViewById(R.id.Oview);
                                OValue.setText(Integer.toString(O));
                                final TextView tieValue = (TextView) findViewById(R.id.TIEview);
                                tieValue.setText(Integer.toString(tie));
                                if (turn == 1) {
                                    final TextView Xcolor = (TextView) findViewById(R.id.playerx);
                                    Xcolor.setTextColor(BLUE);
                                    Xcolor.setText(str1);
                                    final TextView Ocolor = (TextView) findViewById(R.id.playero);
                                    Ocolor.setTextColor(BLACK);
                                    Ocolor.setText(str2);

                                }
                                if (turn == 2) {
                                    final TextView Ocolor = (TextView) findViewById(R.id.playero);
                                    Ocolor.setTextColor(BLUE);

                                    final TextView Xcolor = (TextView) findViewById(R.id.playerx);
                                    Xcolor.setTextColor(BLACK);

                                }
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }

            }
        };

        t.start();

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        buttonAgain = (Button) findViewById(R.id.buttonAgain);
        turn=1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                    }
                }
                endGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                    }
                }
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                    }
                }
                endGame();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                    }
                }
                endGame();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                    }
                }
                endGame();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                    }
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                    }
                }
                endGame();

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                    }
                }
                endGame();

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                    }
                }
                endGame();

            }
        });
        buttonAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b9.getText().toString().equals("X") || b9.getText().toString().equals("O")) {
                    b9.setText("");
                }
                if(b8.getText().toString().equals("X") || b8.getText().toString().equals("O")) {
                    b8.setText("");
                }
                if(b7.getText().toString().equals("X") || b7.getText().toString().equals("O")) {
                    b7.setText("");
                }
                if(b6.getText().toString().equals("X") || b6.getText().toString().equals("O")) {
                    b6.setText("");
                }
                if(b5.getText().toString().equals("X") || b5.getText().toString().equals("O")) {
                    b5.setText("");
                }
                if(b4.getText().toString().equals("X") || b4.getText().toString().equals("O")) {
                    b4.setText("");
                }
                if(b3.getText().toString().equals("X") || b3.getText().toString().equals("O")) {
                    b3.setText("");
                }
                if(b2.getText().toString().equals("X") || b2.getText().toString().equals("O")) {
                    b2.setText("");
                }
                if(b1.getText().toString().equals("X") || b1.getText().toString().equals("O")) {
                    b1.setText("");
                }
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
            }
        });

    }

    public void endGame(){
        String a,b,c,d,e,f,g,h,i;
        boolean endGame = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if      (a.equals("X") && b.equals("X") && c.equals("X") ||
                a.equals("X") && e.equals("X") && i.equals("X") ||
                a.equals("X") && d.equals("X") && g.equals("X") ||
                b.equals("X") && e.equals("X") && h.equals("X") ||
                c.equals("X") && f.equals("X") && i.equals("X") ||
                d.equals("X") && e.equals("X") && f.equals("X") ||
                g.equals("X") && h.equals("X") && i.equals("X") ||
                c.equals("X") && e.equals("X") && g.equals("X") && !endGame==true){
            Toast.makeText(Play.this,"Winner is Player X!", Toast.LENGTH_LONG).show();
            endGame = true;
            X++;
        }
        if      (a.equals("O") && b.equals("O") && c.equals("O") ||
                a.equals("O") && e.equals("O") && i.equals("O") ||
                a.equals("O") && d.equals("O") && g.equals("O") ||
                b.equals("O") && e.equals("O") && h.equals("O") ||
                c.equals("O") && f.equals("O") && i.equals("O") ||
                d.equals("O") && e.equals("O") && f.equals("O") ||
                g.equals("O") && h.equals("O") && i.equals("O") ||
                c.equals("O") && e.equals("O") && g.equals("O") && !endGame==true){
            Toast.makeText(Play.this,"Winner is Player O!", Toast.LENGTH_LONG).show();
            endGame = true;
            O++;
        }

        if(!a.isEmpty() && !b.isEmpty() && !c.isEmpty() && !d.isEmpty() && !e.isEmpty() && !f.isEmpty() && !g.isEmpty() && !h.isEmpty() && !i.isEmpty() && !endGame==true){
            Toast.makeText(Play.this,"Its a tie!", Toast.LENGTH_LONG).show();
            endGame = true;
            tie++;
        }

        if (endGame) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }
}
