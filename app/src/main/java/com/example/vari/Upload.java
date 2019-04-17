package com.example.vari;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Upload extends AppCompatActivity {

    private Button camera, music, message, video;
    private TextView selfie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload);

        camera = findViewById(R.id.CameraID);
        music = findViewById(R.id.MusicID);
        message = findViewById(R.id.FriendID);
        video = findViewById(R.id.VideoID);
        selfie = findViewById(R.id.selfieID);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(camera_intent);

            }
        });


        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appI = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
                startActivity(appI);

            }


        });

        music.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent musicI = new Intent(MediaStore.INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH);
                startActivity(musicI);
            }
        });


        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_APP_MESSAGING);
                startActivity(intent);
            }
        });
    }
}
