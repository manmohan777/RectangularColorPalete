package com.manmohan777.rectangularcolorpalette;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PaletteBar paletteBar = findViewById(R.id.color_palette);
        FrameLayout frameLayout = findViewById(R.id.testFrame);
        paletteBar.setColorChangingBorder(10);

        paletteBar.setPaletteBarListener(new PaletteBar.PaletteBarListener(){
            @Override
            public void onColorSelected(int color) {
                frameLayout.setBackgroundColor(color);
            }
        });
    }
}