package com.example.anga.bottomnavigation.fragments_bottom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.anga.R;
import com.example.anga.databinding.FragmentBottomEsportsBinding;
import com.example.anga.esports_adapter.News_Esports;
import com.example.anga.esports_adapter.Ongoing_Tournaments;
import com.example.anga.esports_adapter.SectionPagerAdapter;
import com.example.anga.esports_adapter.Upcoming_Tournaments;
import com.google.android.material.tabs.TabLayout;


public class Bottom_Esports extends Fragment {

    ViewPager viewPager;
    TabLayout tabLayout;


    private FragmentBottomEsportsBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        binding = FragmentBottomEsportsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        viewPager = root.findViewById(R.id.viewpager);
        tabLayout = root.findViewById(R.id.tabLayout);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new Ongoing_Tournaments(), "Ongoing Tournaments");
        adapter.addFragment(new Upcoming_Tournaments(),"Upcoming Tournaments");
        adapter.addFragment(new News_Esports(),"News Esports");

        viewPager.setAdapter(adapter);
    }






    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
