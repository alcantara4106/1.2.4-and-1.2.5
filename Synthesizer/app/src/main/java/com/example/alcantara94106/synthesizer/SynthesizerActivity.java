package com.example.alcantara94106.synthesizer;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        super.onCreate(savedInstanceState);
    }
    public void onButton1Click(View thing){
        Log.i(TAG, "Button 1 Clicked");
    }
    public void onButton2Click(View thing){
        Log.i(TAG, "Button 2 Clicked");
    }
}
