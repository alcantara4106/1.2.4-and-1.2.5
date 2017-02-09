package com.example.alcantara94106.synthesizer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    private static final String TAG = SynthesizerActivity.class.getName();
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

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

    public void onChallenge1Click(View v){
        Log.i(TAG, "Challenge1 Clicked"); //plays E, F Sharp, G, A, B, C Sharp, D, E
        try{
            mpE.seekTo(0);
            mpE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpFS.seekTo(0);
            mpFS.start();
            delayPlaying(WHOLE_NOTE/2);
            mpG.seekTo(0);
            mpG.start();
            delayPlaying(WHOLE_NOTE/2);
            mpA.seekTo(0);
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
            mpB.seekTo(0);
            mpB.start();
            delayPlaying(WHOLE_NOTE/2);
            mpCS.seekTo(0);
            mpCS.start();
            delayPlaying(WHOLE_NOTE/2);
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE/2);
            mpE.seekTo(0);
            mpE.start();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void onChallenge3Click(View v){
        Log.i(TAG, "Challenge3 Clicked");//plays E, F Sharp, G, A, B, C Sharp, D, E
        MediaPlayer[] MediaPlayers;
        MediaPlayers = new MediaPlayer[]{mpE, mpFS, mpG, mpA, mpB, mpCS, mpD, mpE};
        for(MediaPlayer mpthing: MediaPlayers){
            try {
                mpthing.seekTo(0);
                mpthing.start();
                delayPlaying(WHOLE_NOTE/2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void onChallenge5Click(View v){
        Log.i(TAG, "Challenge5 Clicked");
        //plays A, A, High E, High E, High F Sharp, High F Sharp, High E, D, D, C Sharp, C Sharp, B, B, A
        try{
            mpA.seekTo(0);
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
            mpA.seekTo(0);
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighE.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighE.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighFS.seekTo(0);
            mpHighFS.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighFS.seekTo(0);
            mpHighFS.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighE.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE/2);
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE/2);
            mpCS.seekTo(0);
            mpCS.start();
            delayPlaying(WHOLE_NOTE/2);
            mpCS.seekTo(0);
            mpCS.start();
            delayPlaying(WHOLE_NOTE/2);
            mpB.seekTo(0);
            mpB.start();
            delayPlaying(WHOLE_NOTE/2);
            mpB.seekTo(0);
            mpB.start();
            delayPlaying(WHOLE_NOTE/2);
            mpA.seekTo(0);
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    public void onChallenge8Click(View v){
        Log.i(TAG, "Challenge8 Clicked");
        //plays A, A, High E, High E, High F Sharp, High F Sharp, High E, D, D, C Sharp, C Sharp, B, B, A
        MediaPlayer[] MediaPlayers;
        MediaPlayers = new MediaPlayer[]{
                mpA,
                mpA,
                mpHighE,
                mpHighE,
                mpHighFS,
                mpHighFS,
                mpHighE,
                mpD,
                mpD,
                mpCS,
                mpCS,
                mpB,
                mpB,
                mpA};
        int noteNum = 0;
        for(MediaPlayer mpthing: MediaPlayers){
            try {
                mpthing.seekTo(0);
                mpthing.start();
                if(noteNum < 6) {
                    delayPlaying(WHOLE_NOTE / 2); //quarter note
                }
                else if(noteNum == 6) {
                    delayPlaying(WHOLE_NOTE);
                }
                else {
                    delayPlaying(WHOLE_NOTE / 2);
                }
                noteNum += 1;
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void onChallenge9Click(View v){
        Log.i(TAG, "Challenge9 Clicked");
        //plays A, A, High E, High E, High F Sharp, High F Sharp, High E, D, D, C Sharp, C Sharp, B, B, A
        MediaPlayer[] MediaPlayers;
        MediaPlayers = new MediaPlayer[]{
                mpA,mpA,mpHighE,mpHighE,mpHighFS,mpHighFS,mpHighE,
                mpD,mpD,mpCS,mpCS,mpB,mpB,mpA, //part 1
                mpHighE,mpHighE,mpD,mpD,mpCS,mpCS,mpB, //part 2
                mpHighE,mpHighE,mpD,mpD,mpCS,mpCS,mpB, //part 3
                mpA,mpA,mpHighE,mpHighE,mpHighFS,mpHighFS,mpHighE,
                mpD,mpD,mpCS,mpCS,mpB,mpB,mpA //part 4
        };
        int noteNum = 0; //tracks where the song is, to put the pauses in the right places
        for(MediaPlayer mpthing: MediaPlayers){
            try {
                mpthing.seekTo(0);
                mpthing.start();
                switch(noteNum){
                    case 6: delayPlaying(WHOLE_NOTE);
                        break;
                    case 13: delayPlaying(WHOLE_NOTE);
                        break;
                    case 20: delayPlaying(WHOLE_NOTE);
                        break;
                    case 27: delayPlaying(WHOLE_NOTE);
                        break;
                    case 34: delayPlaying(WHOLE_NOTE);
                        break;
                    case 41: delayPlaying(WHOLE_NOTE);
                        break;
                    default: delayPlaying(WHOLE_NOTE/2);
                        break;
                }
            /*
                if(noteNum == 6) {
                    delayPlaying(WHOLE_NOTE); //quarter note
                }
                else if(noteNum == 13) {
                    delayPlaying(WHOLE_NOTE);
                }
                else if(noteNum == 20) {
                    delayPlaying(WHOLE_NOTE);
                }
                else {
                    delayPlaying(WHOLE_NOTE / 2);
                }*/
                noteNum += 1;
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void onPageSwitchButtonClick(View v){
        Log.i(TAG, "Somebody pressed PageSwitch, something's going to blow up");
        Intent intent = new Intent(this, PianoActivity.class);
        startActivity(intent);
    }

    public void onAButtonClick(View v){
        mpA.seekTo(0);
        Log.i(TAG, "Button A Clicked");
        mpA.start();
    }
    public void onBButtonClick(View v){
        mpB.seekTo(0);
        Log.i(TAG, "Button B Clicked");
        mpB.start();
    }
    public void onBBButtonClick(View v){
        mpBB.seekTo(0);
        Log.i(TAG, "Button BB Clicked");
        mpBB.start();
    }
    public void onCButtonClick(View v){
        mpC.seekTo(0);
        Log.i(TAG, "Button C Clicked");
        mpC.start();
    }
    public void onCSButtonClick(View v){
        mpCS.seekTo(0);
        Log.i(TAG, "Button CS Clicked");
        mpCS.start();
    }
    public void onDButtonClick(View v){
        mpD.seekTo(0);
        Log.i(TAG, "Button D Clicked");
        mpD.start();
    }
    public void onDSButtonClick(View v){
        mpDS.seekTo(0);
        Log.i(TAG, "Button DS Clicked");
        mpDS.start();
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
    public void onFSButtonClick(View v){
        mpFS.seekTo(0);
        Log.i(TAG, "Button FS Clicked");
        mpFS.start();
    }
    public void onGButtonClick(View v){
        mpG.seekTo(0);
        Log.i(TAG, "Button G Clicked");
        mpG.start();
    }
    public void onGSButtonClick(View v){
        mpGS.seekTo(0);
        Log.i(TAG, "Button GS Clicked");
        mpGS.start();
    }
    public void onHighEButtonClick(View v){
        mpHighE.seekTo(0);
        Log.i(TAG, "Button High E Clicked");
        mpHighE.start();
    }
    public void onHighFButtonClick(View v){
        mpHighF.seekTo(0);
        Log.i(TAG, "Button High F Clicked");
        mpHighF.start();
    }
    public void onHighFSButtonClick(View v){
        mpHighFS.seekTo(0);
        Log.i(TAG, "Button High FS Clicked");
        mpHighFS.start();
    }
    public void onHighGButtonClick(View v){
        mpHighG.seekTo(0);
        Log.i(TAG, "Button High G Clicked");
        mpHighG.start();
    }
}
