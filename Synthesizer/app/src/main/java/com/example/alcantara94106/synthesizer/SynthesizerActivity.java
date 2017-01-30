package com.example.alcantara94106.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button mEButton;
    private Button mFButton;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        mEButton = (Button)findViewById(R.id.eButton);
        mFButton = (Button)findViewById(R.id.fButton);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
    }
    public void onEButtonClick(View v){
        mpE.seekTo(0);
        Log.i(TAG, "Button E Clicked");
        mpE.start();
    }
    public void onFButtonClick(View v){
        mpF.seekTo(0);
        Log.i(TAG, "Button F Clicked");
        mpF.start();
    }
}
