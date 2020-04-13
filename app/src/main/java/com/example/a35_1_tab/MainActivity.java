package com.example.a35_1_tab;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.example.a35_1_tab.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private SectionPageAdapter sectionPageAdapter ;
    private  ViewPager viewPager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());

        viewPager =  findViewById(R.id.view_pager);
        setViewPage(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setViewPage(ViewPager viewPager){
        SectionPageAdapter adapter= new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabFragment(),"TAB 1");
        adapter.addFragment(new Tab2Fragment(),"TAB 2");
        adapter.addFragment(new Tab3Fragment(),"TAB 3");
        viewPager.setAdapter(adapter);

    }
}