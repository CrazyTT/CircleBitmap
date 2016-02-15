package com.chenliuliu.circlebitmap.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chenliuliu.circlebitmap.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Glide.with(this).load("http://www.qqya.com/qqyaimg/allimg/140420/10553U544-4.jpg").override(300, 300).into((ImageView) findViewById(R.id.img1));
        Glide.with(this).load("http://www.qqya.com/qqyaimg/allimg/140420/10553U544-4.jpg").override(300, 300).into((ImageView) findViewById(R.id.img2));
        Glide.with(this).load("http://www.qqya.com/qqyaimg/allimg/140420/10553U544-4.jpg").override(300, 300).into((ImageView) findViewById(R.id.img3));
    }

}
