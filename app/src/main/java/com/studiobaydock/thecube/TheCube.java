package com.studiobaydock.thecube;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;

import com.studiobaydock.wireframecube.Cube;

public class TheCube extends Activity {
    private Cube cube;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_cube);
        cube = findViewById(R.id.cube);
        final Handler rot = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //cube.setRotationX(cube.getRotationX()+1);
                cube.setRotationY(cube.getRotationY()+.5f);
                //cube.setRotationZ(cube.getRotationZ()+1);
                rot.postDelayed(this, 10);
            }
        };
        rot.postDelayed(runnable, 10);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
}