package com.example.alcantara94106.synthesizer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import java.util.ArrayList;
import java.util.List;

public class PianoActivity extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    private static final String TAG = PianoActivity.class.getName();
    private Button mAButton;
    private Button mBButton;
    private Button mBBButton;
    private Button mCButton;
    private Button mCSButton;
    private Button mDButton;
    private Button mDSButton;
    private Button mEButton;
    private Button mFButton;
    private Button mFSButton;
    private Button mGButton;
    private Button mGSButton;
    private Button mHighEButton;
    private Button mHighFButton;
    private Button mHighFSButton;
    private Button mHighGButton;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBB;
    private MediaPlayer mpC;
    private MediaPlayer mpCS;
    private MediaPlayer mpD;
    private MediaPlayer mpDS;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFS;
    private MediaPlayer mpG;
    private MediaPlayer mpGS;
    private MediaPlayer mpHighE;
    private MediaPlayer mpHighF;
    private MediaPlayer mpHighFS;
    private MediaPlayer mpHighG;

    private Button mChallenge1;
    private Button mChallenge3;

    ArrayList<MediaPlayer> pianoSequence = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);

        mEButton = (Button)findViewById(R.id.eButton);
        mFButton = (Button)findViewById(R.id.fButton);
        mChallenge1 = (Button)findViewById(R.id.challenge1Button);
        mChallenge3 = (Button)findViewById(R.id.challenge3Button);

        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBB = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCS = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDS = MediaPlayer.create(this, R.raw.scaleds);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFS = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGS = MediaPlayer.create(this, R.raw.scalegs);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHighF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHighFS = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHighG = MediaPlayer.create(this, R.raw.scalehighg);
    }

    private void delayPlaying(int delay) throws InterruptedException{
        try{
            Thread.sleep(delay);
        } catch(InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }

    public void onPageSwitchButtonClick(View v){
        Log.i(TAG, "Somebody pressed PageSwitch, something's going to blow up");
        Intent intent = new Intent(this, SynthesizerActivity.class);
        startActivity(intent);
    }

    public void clearSequence(View v){
        while(!pianoSequence.isEmpty()){
            pianoSequence.remove(0);
        }
        Log.i(TAG, "Cleared, you happy now?");
    }

    public void playSequence(View v){
        for(MediaPlayer mpthing: pianoSequence){
            mpthing.seekTo(0);
            mpthing.start();
            try {
                delayPlaying(WHOLE_NOTE/2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void onAButtonClick(View v){
        mpA.seekTo(0);
        Log.i(TAG, "Button A Clicked");
        mpA.start();
        pianoSequence.add(mpA);
        Log.i(TAG, "Added A");
    }
    public void onBButtonClick(View v){
        mpB.seekTo(0);
        Log.i(TAG, "Button B Clicked");
        mpB.start();
        pianoSequence.add(mpB);
        Log.i(TAG, "Added B");
    }
    public void onBBButtonClick(View v){
        mpBB.seekTo(0);
        Log.i(TAG, "Button BB Clicked");
        mpBB.start();
        pianoSequence.add(mpBB);
        Log.i(TAG, "Added BB");
    }
    public void onCButtonClick(View v){
        mpC.seekTo(0);
        Log.i(TAG, "Button C Clicked");
        mpC.start();
        pianoSequence.add(mpC);
        Log.i(TAG, "Added C");
    }
    public void onCSButtonClick(View v){
        mpCS.seekTo(0);
        Log.i(TAG, "Button CS Clicked");
        mpCS.start();
        pianoSequence.add(mpCS);
        Log.i(TAG, "Added CS");
    }
    public void onDButtonClick(View v){
        mpD.seekTo(0);
        Log.i(TAG, "Button D Clicked");
        mpD.start();
        pianoSequence.add(mpD);
        Log.i(TAG, "Added D");
    }
    public void onDSButtonClick(View v){
        mpDS.seekTo(0);
        Log.i(TAG, "Button DS Clicked");
        mpDS.start();
        pianoSequence.add(mpDS);
        Log.i(TAG, "Added DS");
    }
    public void onEButtonClick(View v){
        mpE.seekTo(0);
        Log.i(TAG, "Button E Clicked");
        mpE.start();
        pianoSequence.add(mpE);
        Log.i(TAG, "Added E");
    }
    public void onFButtonClick(View v){
        mpF.seekTo(0);
        Log.i(TAG, "Button F Clicked");
        mpF.start();
        pianoSequence.add(mpF);
        Log.i(TAG, "Added F");
    }
    public void onFSButtonClick(View v){
        mpFS.seekTo(0);
        Log.i(TAG, "Button FS Clicked");
        mpFS.start();
        pianoSequence.add(mpFS);
        Log.i(TAG, "Added FS");
    }
    public void onGButtonClick(View v){
        mpG.seekTo(0);
        Log.i(TAG, "Button G Clicked");
        mpG.start();
        pianoSequence.add(mpG);
        Log.i(TAG, "Added G");
    }
    public void onGSButtonClick(View v){
        mpGS.seekTo(0);
        Log.i(TAG, "Button GS Clicked");
        mpGS.start();
        pianoSequence.add(mpGS);
        Log.i(TAG, "Added GS");
    }
    public void onHighEButtonClick(View v){
        mpHighE.seekTo(0);
        Log.i(TAG, "Button High E Clicked");
        mpHighE.start();
        pianoSequence.add(mpHighE);
        Log.i(TAG, "Added HighE");
    }
    public void onHighFButtonClick(View v){
        mpHighF.seekTo(0);
        Log.i(TAG, "Button High F Clicked");
        mpHighF.start();
        pianoSequence.add(mpHighF);
        Log.i(TAG, "Added HighF");
    }
    public void onHighFSButtonClick(View v){
        mpHighFS.seekTo(0);
        Log.i(TAG, "Button High FS Clicked");
        mpHighFS.start();
        pianoSequence.add(mpHighFS);
        Log.i(TAG, "Added HighFS");
    }
    public void onHighGButtonClick(View v){
        mpHighG.seekTo(0);
        Log.i(TAG, "Button High G Clicked");
        mpHighG.start();
        pianoSequence.add(mpHighG);
        Log.i(TAG, "Added HighG");
    }
}
