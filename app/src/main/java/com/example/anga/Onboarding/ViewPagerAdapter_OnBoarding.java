package com.example.anga.Onboarding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.anga.R;

public class ViewPagerAdapter_OnBoarding extends PagerAdapter {
    Context context;

    int[] images = {

            R.drawable.esports_gamer,
            R.drawable.esports_tournament,
            R.drawable.play_games,
            R.drawable.chat_onboarding

    };

    int[] headings = {

            R.string.heading_one,
            R.string.heading_two,
            R.string.heading_three,
            R.string.heading_fourth
    };

    int[] description = {

            R.string.desc_one,
            R.string.desc_two,
            R.string.desc_three,
            R.string.desc_fourth
    };

    public ViewPagerAdapter_OnBoarding(Context context) {

        this.context = context;
    }

    @Override
    public int getCount() {

        return  headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.onboarding_slider,container,false);

        ImageView slideTitleImage = view.findViewById(R.id.title_Image);
        TextView slideHeading = view.findViewById(R.id.text_title);
        TextView slideDescription = view.findViewById(R.id.text_description);

        slideTitleImage.setImageResource(images[position]);
        slideHeading.setText(headings[position]);
        slideDescription.setText(description[position]);

        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((LinearLayout)object);

    }
}