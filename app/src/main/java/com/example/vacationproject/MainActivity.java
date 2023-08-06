package com.example.vacationproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 熊亦恺
 */
public class MainActivity extends AppCompatActivity {
    //
    private List<Fragment> mFragments;
    private ViewPager viewPager;
    private TabLayout mTabLayout;
    private List<String> mtitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        mTabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);
        //得到碎片集合,将数据添加到集合中
        mFragments=new ArrayList<>();
        mFragments.add(new Fragment1());
        mFragments.add(new Fragment2());
        mFragments.add(new Fragment3());
        mtitle=new ArrayList<String>();
        mtitle.add("信息");
        mtitle.add("联系人");
        mtitle.add("我的");
        MyAdapter adapter=new MyAdapter(getSupportFragmentManager(),mFragments,mtitle);
        viewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(viewPager);
        //设置每个viewpager的事件
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {
                switch(position){
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    default:
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {}
        });
    }
}