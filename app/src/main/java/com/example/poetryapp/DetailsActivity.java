package com.example.poetryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgPoetry;
    TextView txtName,txtDescription;
    Button btnPlay,btnPause;
    boolean isPlaying=false;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgPoetry=findViewById(R.id.img_poetry);
        txtName=findViewById(R.id.txt_name);
        txtDescription=findViewById(R.id.txt_description);

        btnPlay=findViewById(R.id.btn_play);
        btnPause=findViewById(R.id.btn_pause);

    //comments
//url

        String getPoetry=getIntent().getExtras().getString("poetry");
        if(getPoetry.equals("koi"))
        {
            imgPoetry.setImageResource(R.drawable.koi);
            txtName.setText("Koi Toh Ho");
            txtDescription.setText(R.string.poetry1);
            player= MediaPlayer.create(DetailsActivity.this, R.raw.audio1);
        }

      else  if(getPoetry.equals("don't"))
        {
            imgPoetry.setImageResource(R.drawable.dont);
            txtName.setText("Don't Give Up");
            txtDescription.setText(R.string.poetry2);
            player= MediaPlayer.create(DetailsActivity.this, R.raw.audio2);
        }
        else  if(getPoetry.equals("megh"))
        {
            imgPoetry.setImageResource(R.drawable.megh);
            txtName.setText("Megh Bollo");
            txtDescription.setText(R.string.poetry3);
            player= MediaPlayer.create(DetailsActivity.this, R.raw.audio3);
        }
        else  if(getPoetry.equals("broken"))
        {
            imgPoetry.setImageResource(R.drawable.broken);
            txtName.setText("Broken But Beautiful");
            txtDescription.setText(R.string.poetry4);
            player= MediaPlayer.create(DetailsActivity.this, R.raw.audio4);

        }










        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPlaying) {
                    player.start();
                    isPlaying=true;
                }
            }
        });



        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlaying) {
                    player.pause();
                    isPlaying=false;
                }
            }
        });




        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPlaying) {
                    player.start();
                    isPlaying=true;
                }
            }
        });



        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlaying) {
                    player.pause();
                    isPlaying=false;
                }
            }
        });





        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPlaying) {
                    player.start();
                    isPlaying=true;
                }
            }
        });



        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlaying) {
                    player.pause();
                    isPlaying=false;
                }
            }
        });


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPlaying) {
                    player.start();
                    isPlaying=true;
                }
            }
        });



        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlaying) {
                    player.pause();
                    isPlaying=false;
                }
            }
        });



    }
}


