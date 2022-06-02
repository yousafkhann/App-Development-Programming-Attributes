package com.depauw.attributetypes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.depauw.attributetypes.databinding.ActivityAttributeTypesBinding;

public class AttributeTypes extends AppCompatActivity {

    private ActivityAttributeTypesBinding binding;

    public void task1(){
        binding.ratingbarView4.setProgressTintList(ColorStateList.valueOf(getResources().getColor(R.color.metro_red)));
    }

    public void task2() {
        String s = binding.edittextView2.getText().toString();
        String[] splitS = s.split(" ");

        binding.toggleView7.setTextOff(splitS[0]);
        binding.toggleView7.setTextOn(splitS[1]);
    }

    public void task3(){
        binding.linearlayoutView6.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
    }

    public void task4(){
        binding.textviewView1.setAllCaps(true);
    }

    public void task5(){
        binding.seekbarView3.setThumb(getResources().getDrawable(R.drawable.tiger));
    }

    public void task6(){
        binding.edittextView2.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
    }

    public void task7(){
        int numPixels = (int) (250 * getResources().getDisplayMetrics().density);
        binding.checkboxView8.setHeight(numPixels);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAttributeTypesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
}