package com.openblocks.themrexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.security.AlgorithmParameterGenerator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // themr.init();
        // |- Initializes the ThemeManager.
        // themr.getCurrentTheme();
        // |- Returns theme JSON.
    }
}