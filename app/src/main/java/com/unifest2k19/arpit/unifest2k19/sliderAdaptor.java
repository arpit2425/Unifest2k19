package com.unifest2k19.arpit.unifest2k19;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class sliderAdaptor extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public sliderAdaptor(Context context) {
        this.context = context;
    }
public int []img={
            R.drawable.eve_icon,
            R.drawable.eve_icon,
            R.drawable.eve_icon,
            R.drawable.eve_icon,
            R.drawable.eve_icon,
            R.drawable.eve_icon,
            R.drawable.eve_icon
};
    public String []name={
      "EVENTS","GALLERY","DEVELOPER","LOCATION","ABOUT","SPONSERS","REGISTER"
    };
    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==(RelativeLayout)o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.event,container,false);
        ImageView imageView=view.findViewById(R.id.imageView);
        Button n=view.findViewById(R.id.button);
        imageView.setImageResource(img[position]);
        n.setText(name[position]);
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
