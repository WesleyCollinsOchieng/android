package com.example.healthomatic20;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class On_register extends Activity {
    private ViewPager viewPager;
    private LinearLayout linearLayout;
    private SliderAdapter sliderAdapter;
    private TextView[]mDots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_register);

        viewPager=(ViewPager)findViewById(R.id.view_pager);
        linearLayout=(LinearLayout)findViewById(R.id.dots_layout);
        sliderAdapter=new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);

    }
    public void addDotsIndicator(int position){
        mDots=new TextView[3];
        for (int i=0;i<mDots.length;i++){
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.Transparent));
            linearLayout.addView(mDots[i]);
        }if(mDots.length>0){
            mDots[position].setTextColor(getResources().getColor(R.color.whte));
        }
    }

    ViewPager.OnPageChangeListener viewlistener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
