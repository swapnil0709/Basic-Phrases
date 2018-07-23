package com.example.swapnil.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer1;
    MediaPlayer mediaPlayer2;
    MediaPlayer mediaPlayer3;
    MediaPlayer mediaPlayer4;
    MediaPlayer mediaPlayer5;
    MediaPlayer mediaPlayer6;
    MediaPlayer mediaPlayer7;
    public void play(View view){

        Button counter=(Button) view;
        int clicked =Integer.parseInt(counter.getTag().toString());
        if (clicked==1){
            mediaPlayer.start();
        }else  if (clicked==2){
            mediaPlayer1.start();
        }else  if (clicked==3){
            mediaPlayer2.start();
        }else  if (clicked==4){
            mediaPlayer3.start();
        }else  if (clicked==5){
            mediaPlayer4.start();
        }else  if (clicked==6){
            mediaPlayer5.start();
        }else  if (clicked==7){
            mediaPlayer6.start();
        }else  if (clicked==8){
            mediaPlayer7.start();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=MediaPlayer.create(this,R.raw.doyouspeakenglish);
        mediaPlayer1=MediaPlayer.create(this,R.raw.goodevening);
        mediaPlayer2=MediaPlayer.create(this,R.raw.hello);
        mediaPlayer3=MediaPlayer.create(this,R.raw.howareyou);
        mediaPlayer4=MediaPlayer.create(this,R.raw.ilivein);
        mediaPlayer5=MediaPlayer.create(this,R.raw.mynameis);
        mediaPlayer6=MediaPlayer.create(this,R.raw.please);
        mediaPlayer7=MediaPlayer.create(this,R.raw.welcome);

    }
}
