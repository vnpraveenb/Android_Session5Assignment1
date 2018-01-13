package com.praveen.session5assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btn);
        final TextView animText = (TextView)findViewById(R.id.animText);

        btn.setOnClickListener(new onClickListener(){

            public void onClick(View v){
                animText.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in));
            }
        });
    }
}
