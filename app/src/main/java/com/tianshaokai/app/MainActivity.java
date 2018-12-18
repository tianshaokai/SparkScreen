package com.tianshaokai.app;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SparkView sparkView = new SparkView(this);
        setContentView(sparkView);
    }
    
}
