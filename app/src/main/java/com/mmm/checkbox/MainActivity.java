package com.mmm.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox movie,music,game,dance;

    Button btnsumbmit;

    TextView txthobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();

        btnsumbmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String h = "";

                if (movie.isChecked()){
                    h += "movie\n";
                }
                if (music.isChecked()){
                    h += "music\n";
                }
                if (game.isChecked()){
                    h += "game\n";
                }
                if (dance.isChecked()){
                    h += "dance\n";
                }

                txthobby.setText("hobby = "+h);

            }
        });


    }

    private void binding() {
        movie = findViewById(R.id.movie);
        music = findViewById(R.id.music);
        game = findViewById(R.id.game);
        dance = findViewById(R.id.dance);
        btnsumbmit = findViewById(R.id.btnsumbmit);
        txthobby = findViewById(R.id.txthobby);
    }
}