package com.example.stt_kiosk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import me.relex.circleindicator.CircleIndicator;

// viewpager
//

public class MainActivity extends AppCompatActivity {

    FragmentPagerAdapter adapterViewPager;

    Button btn_plus;
    Button btn_minus;
    TextView cntnum;
    ViewPager vpPager;
    ViewPager vpPager1;
    ViewPager vpPager2;
    ViewPager vpPager3;
    ViewPager vpPager4;
    ViewPager vpPager5;
    ViewPager vpPager6;
    ImageButton back_btn;
    ImageButton next_btn;

    int cnt = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        adapterViewPager = new FragmentAdapter(getSupportFragmentManager());
//        vpPager.setAdapter(adapterViewPager);
        vpPager = (ViewPager) findViewById(R.id.vpPager1) ;
        vpPager1 = (ViewPager) findViewById(R.id.vpPager1);
        com.example.stt_kiosk.CustomAdapter adapter = new com.example.stt_kiosk.CustomAdapter(getLayoutInflater());
        vpPager1.setAdapter(adapter);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(vpPager1);

        vpPager2 = (ViewPager) findViewById(R.id.vpPager2);
        com.example.stt_kiosk.CustomAdapter2 adapter2 = new com.example.stt_kiosk.CustomAdapter2(getLayoutInflater());
        vpPager2.setAdapter(adapter);
        CircleIndicator indicator2 = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(vpPager2);

        vpPager3 = (ViewPager) findViewById(R.id.vpPager3);
        com.example.stt_kiosk.CustomAdapter3 adapter3 = new com.example.stt_kiosk.CustomAdapter3(getLayoutInflater());
        vpPager3.setAdapter(adapter);
        CircleIndicator indicator3 = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(vpPager3);

        vpPager4 = (ViewPager) findViewById(R.id.vpPager4);
        com.example.stt_kiosk.CustomAdapter4 adapter4 = new com.example.stt_kiosk.CustomAdapter4(getLayoutInflater());
        vpPager4.setAdapter(adapter);
        CircleIndicator indicator4 = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(vpPager4);

        vpPager5 = (ViewPager) findViewById(R.id.vpPager5);
        com.example.stt_kiosk.CustomAdapter5 adapter5 = new com.example.stt_kiosk.CustomAdapter5(getLayoutInflater());
        vpPager5.setAdapter(adapter);
        CircleIndicator indicator5 = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(vpPager5);

        vpPager6 = (ViewPager) findViewById(R.id.vpPager6);
        com.example.stt_kiosk.CustomAdapter6 adapter6 = new com.example.stt_kiosk.CustomAdapter6(getLayoutInflater());
        vpPager6.setAdapter(adapter);
        CircleIndicator indicator6 = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(vpPager6);

        this.InitializeView();

        Button rec_btn = (Button) findViewById(R.id.rec_btn) ;
        rec_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(1) ;
            }
        });

        Button bg_btn = (Button) findViewById(R.id.bg_btn) ;
        bg_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(2) ;
            }
        });
        Button set_btn = (Button) findViewById(R.id.set_btn) ;
        set_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(3) ;
            }
        });

        Button des_btn = (Button) findViewById(R.id.des_btn) ;
        des_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(4) ;
            }
        });

        Button dri_btn = (Button) findViewById(R.id.dri_btn) ;
        dri_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(5) ;
            }
        });

        Button chi_btn = (Button) findViewById(R.id.chi_btn) ;
        chi_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(6) ;
            }
        });

        changeView(0) ;

        back_btn = (ImageButton) findViewById(R.id.back_btn);
        next_btn = (ImageButton) findViewById(R.id.next_btn);
        back_btn.setOnClickListener(myListener);
        next_btn.setOnClickListener(myListener);


    }

    private void changeView(int index) {

        // 자식(Children) 뷰들에 대한 참조 획득.
        ViewPager vpPager1 = (ViewPager) findViewById(R.id.vpPager1) ;
        ViewPager vpPager2 = (ViewPager) findViewById(R.id.vpPager2) ;
        ViewPager vpPager3 = (ViewPager) findViewById(R.id.vpPager3) ;
        ViewPager vpPager4 = (ViewPager) findViewById(R.id.vpPager4) ;
        ViewPager vpPager5 = (ViewPager) findViewById(R.id.vpPager5) ;
        ViewPager vpPager6 = (ViewPager) findViewById(R.id.vpPager6) ;

        // index에 따라 자식(Children) 뷰 들의 visibility 설정.
        switch (index) {
            case 1 :
                vpPager1.setVisibility(View.VISIBLE) ;
                vpPager2.setVisibility(View.INVISIBLE) ;
                vpPager3.setVisibility(View.INVISIBLE) ;
                vpPager4.setVisibility(View.INVISIBLE) ;
                vpPager5.setVisibility(View.INVISIBLE) ;
                vpPager6.setVisibility(View.INVISIBLE) ;
                vpPager = vpPager1;
                break ;
            case 2 :
                vpPager1.setVisibility(View.INVISIBLE) ;
                vpPager2.setVisibility(View.VISIBLE) ;
                vpPager3.setVisibility(View.INVISIBLE) ;
                vpPager4.setVisibility(View.INVISIBLE) ;
                vpPager5.setVisibility(View.INVISIBLE) ;
                vpPager6.setVisibility(View.INVISIBLE) ;
                vpPager = vpPager2;
                break ;
            case 3 :
                vpPager1.setVisibility(View.INVISIBLE) ;
                vpPager2.setVisibility(View.INVISIBLE) ;
                vpPager3.setVisibility(View.VISIBLE) ;
                vpPager4.setVisibility(View.INVISIBLE) ;
                vpPager5.setVisibility(View.INVISIBLE) ;
                vpPager6.setVisibility(View.INVISIBLE) ;
                vpPager = vpPager3;
                break ;
            case 4 :
                vpPager1.setVisibility(View.INVISIBLE) ;
                vpPager2.setVisibility(View.INVISIBLE) ;
                vpPager3.setVisibility(View.INVISIBLE) ;
                vpPager4.setVisibility(View.VISIBLE) ;
                vpPager5.setVisibility(View.INVISIBLE) ;
                vpPager6.setVisibility(View.INVISIBLE) ;
                vpPager = vpPager4;
                break;
            case 5 :
                vpPager1.setVisibility(View.INVISIBLE) ;
                vpPager2.setVisibility(View.INVISIBLE) ;
                vpPager3.setVisibility(View.INVISIBLE) ;
                vpPager4.setVisibility(View.INVISIBLE) ;
                vpPager5.setVisibility(View.VISIBLE) ;
                vpPager6.setVisibility(View.INVISIBLE) ;
                vpPager = vpPager5;
                break;
            case 6 :
                vpPager1.setVisibility(View.INVISIBLE) ;
                vpPager2.setVisibility(View.INVISIBLE) ;
                vpPager3.setVisibility(View.INVISIBLE) ;
                vpPager4.setVisibility(View.INVISIBLE) ;
                vpPager5.setVisibility(View.INVISIBLE) ;
                vpPager6.setVisibility(View.VISIBLE) ;
                vpPager = vpPager6;
                break;
        }

    }



    public void InitializeView()
    {
        btn_plus = (Button)findViewById(R.id.plus_btn);
        btn_minus = (Button)findViewById(R.id.minus_btn);
        cntnum = (TextView)findViewById(R.id.number);
    }

    public void MyOnClick(View view)
    {
        switch (view.getId()) {
            case R.id.plus_btn:
                cnt++;
                cntnum.setText(""+cnt);
                break;
            case R.id.minus_btn:
                if(cnt <= 1) break;
                cnt--;
                cntnum.setText(""+cnt);
                break;
        }
    }


    View.OnClickListener myListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            int position;

            switch (v.getId()){
                case R.id.back_btn:
                    position = vpPager.getCurrentItem();
                    vpPager.setCurrentItem(position-1,true);
                    break;
                case R.id.next_btn:
                    position = vpPager.getCurrentItem();
                    vpPager.setCurrentItem(position+1,true);
                    break;
            }
        }
    };



}

