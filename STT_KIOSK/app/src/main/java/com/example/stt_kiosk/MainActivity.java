package com.example.stt_kiosk;

import android.content.Intent;
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

    ImageButton back_btn;
    ImageButton next_btn;

    CircleIndicator indicator;

    CustomAdapter adapter;
    CustomAdapter2 adapter2;
    CustomAdapter3 adapter3;
    CustomAdapter4 adapter4;
    CustomAdapter5 adapter5;
    CustomAdapter6 adapter6;

    TextView name;

    int cnt = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        adapterViewPager = new FragmentAdapter(getSupportFragmentManager());
//        vpPager.setAdapter(adapterViewPager);

        changeView(1);

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

        back_btn = (ImageButton) findViewById(R.id.back_btn);
        next_btn = (ImageButton) findViewById(R.id.next_btn);
        back_btn.setOnClickListener(myListener);
        next_btn.setOnClickListener(myListener);


    }

    private void changeView(int index) {

        // 자식(Children) 뷰들에 대한 참조 획득.
        vpPager = (ViewPager) findViewById(R.id.vpPager) ;
        indicator = (CircleIndicator) findViewById(R.id.indicator);
        // index에 따라 자식(Children) 뷰 들의 visibility 설정.
        switch (index) {
            case 1 :
                adapter = new CustomAdapter(getLayoutInflater());
                vpPager.setAdapter(adapter);
                indicator.setViewPager(vpPager);
                break ;
            case 2 :
                adapter2 = new CustomAdapter2(getLayoutInflater());
                vpPager.setAdapter(adapter2);
                indicator.setViewPager(vpPager);
                break ;
            case 3 :
                adapter3 = new CustomAdapter3(getLayoutInflater());
                vpPager.setAdapter(adapter3);
                indicator.setViewPager(vpPager);
                break ;
            case 4 :
                adapter4 = new CustomAdapter4(getLayoutInflater());
                vpPager.setAdapter(adapter4);
                indicator.setViewPager(vpPager);
                break;
            case 5 :
                adapter5 = new CustomAdapter5(getLayoutInflater());
                vpPager.setAdapter(adapter);
                indicator.setViewPager(vpPager);
                break;
            case 6 :
                adapter6 = new CustomAdapter6(getLayoutInflater());
                vpPager.setAdapter(adapter6);
                indicator.setViewPager(vpPager);
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


    public void MenuOnClick(View v)
    {
        switch (v.getId()){
            case R.id.menu_btn1:
                name = (TextView) findViewById(R.id.menu_name1);
                Intent intent1 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent1.putExtra("data", name.getText().toString());
                startActivityForResult(intent1, 1);
                break;
            case R.id.menu_btn2:
                name = (TextView) findViewById(R.id.menu_name2);
                Intent intent2 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent2.putExtra("data", name.getText().toString());
                startActivityForResult(intent2, 1);
                break;
            case R.id.menu_btn3:
                name = (TextView) findViewById(R.id.menu_name3);
                Intent intent3 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent3.putExtra("data", name.getText().toString());
                startActivityForResult(intent3, 1);
                break;
            case R.id.menu_btn4:
                name = (TextView) findViewById(R.id.menu_name4);
                Intent intent4 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent4.putExtra("data", name.getText().toString());
                startActivityForResult(intent4, 1);
                break;
            case R.id.menu_btn5:
                name = (TextView) findViewById(R.id.menu_name5);
                Intent intent5 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent5.putExtra("data", name.getText().toString());
                startActivityForResult(intent5, 1);
                break;
            case R.id.menu_btn6:
                name = (TextView) findViewById(R.id.menu_name6);
                Intent intent6 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent6.putExtra("data", name.getText().toString());
                startActivityForResult(intent6, 1);
                break;
            case R.id.menu_btn7:
                name = (TextView) findViewById(R.id.menu_name7);
                Intent intent7 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent7.putExtra("data", name.getText().toString());
                startActivityForResult(intent7, 1);
                break;
            case R.id.menu_btn8:
                name = (TextView) findViewById(R.id.menu_name8);
                Intent intent8 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent8.putExtra("data", name.getText().toString());
                startActivityForResult(intent8, 1);
                break;
            case R.id.menu_btn9:
                name = (TextView) findViewById(R.id.menu_name9);
                Intent intent9 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent9.putExtra("data", name.getText().toString());
                startActivityForResult(intent9, 1);
                break;
            case R.id.menu_btn11:
                name = (TextView) findViewById(R.id.menu_name11);
                Intent intent11 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent11.putExtra("data", name.getText().toString());
                startActivityForResult(intent11, 1);
                break;
            case R.id.menu_btn12:
                name = (TextView) findViewById(R.id.menu_name12);
                Intent intent12 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent12.putExtra("data", name.getText().toString());
                startActivityForResult(intent12, 1);
                break;
            case R.id.menu_btn13:
                name = (TextView) findViewById(R.id.menu_name13);
                Intent intent13 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent13.putExtra("data", name.getText().toString());
                startActivityForResult(intent13, 1);
                break;
            case R.id.menu_btn14:
                name = (TextView) findViewById(R.id.menu_name14);
                Intent intent14 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent14.putExtra("data", name.getText().toString());
                startActivityForResult(intent14, 1);
                break;
            case R.id.menu_btn15:
                name = (TextView) findViewById(R.id.menu_name15);
                Intent intent15 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent15.putExtra("data", name.getText().toString());
                startActivityForResult(intent15, 1);
                break;
            case R.id.menu_btn16:
                name = (TextView) findViewById(R.id.menu_name16);
                Intent intent16 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent16.putExtra("data", name.getText().toString());
                startActivityForResult(intent16, 1);
                break;
            case R.id.menu_btn17:
                name = (TextView) findViewById(R.id.menu_name17);
                Intent intent17 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent17.putExtra("data", name.getText().toString());
                startActivityForResult(intent17, 1);
                break;
            case R.id.menu_btn18:
                name = (TextView) findViewById(R.id.menu_name18);
                Intent intent18 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent18.putExtra("data", name.getText().toString());
                startActivityForResult(intent18, 1);
                break;
            case R.id.menu_btn19:
                name = (TextView) findViewById(R.id.menu_name19);
                Intent intent19 = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
                intent19.putExtra("data", name.getText().toString());
                startActivityForResult(intent19, 1);
                break;
        }
    }



}

