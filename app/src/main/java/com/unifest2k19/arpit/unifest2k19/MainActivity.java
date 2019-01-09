package com.unifest2k19.arpit.unifest2k19;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;

    TextView[]mdot;
    LinearLayout linearLayout;
    sliderAdaptor sliderAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.slider);
        linearLayout=findViewById(R.id.dots);
        sliderAdaptor=new sliderAdaptor(this);
        viewPager.setAdapter(sliderAdaptor);
        addDot(0);

    }
    public void addDot(int p)
    {
        mdot=new TextView[3];

        for(int i=0;i<mdot.length;i++)
        {
            mdot[i]=new TextView(this);
            mdot[i].setText(Html.fromHtml("&#8226"));
            mdot[i].setTextSize(35);
            mdot[i].setTextColor(getResources().getColor(R.color.colorwhite));
            linearLayout.addView(mdot[i]);
        }
        if (mdot.length>0)
        {
            mdot[p].setTextColor(getResources().getColor(R.color.colorgrey));
        }
        ViewPager.OnPageChangeListener viewlistener =new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }

            @Override
            public void onPageSelected(int i) {
                addDot(i);

            }
        };


    }
}
