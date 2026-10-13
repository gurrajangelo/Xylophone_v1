package com.example.xylophone;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private final int NR_OF_SIMOULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int N_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f; //velocità con qui viene suonato l'audio

    private int mDoSoundId;
    private int mReSoundId;
    private int mMiSoundId;
    private int mFaSoundId;
    private int mSolSoundId;
    private int mLaSoundId;
    private int mSiSoundId;
    //private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void playDo(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note1_do);
        mediaPlayer.start();
    }

    public void playRe(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note2_re);
        mediaPlayer.start();
    }

    public void playMi(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note3_mi);
        mediaPlayer.start();
    }

    public void playFa(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note4_fa);
        mediaPlayer.start();
    }

    public void playSol(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note5_sol);
        mediaPlayer.start();
    }

    public void playLa(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note6_la);
        mediaPlayer.start();
    }

    public void playSi(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note7_si);
        mediaPlayer.start();
    }
}