package com.example.stt_kiosk;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.io.ByteArrayOutputStream;

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
    TextView price;
    ImageView img;

    Intent intent;
    Bitmap sendBitmap;
    ByteArrayOutputStream stream;
    byte[] byteArray;


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
        intent = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
        stream = new ByteArrayOutputStream();
        switch (v.getId()){
            case R.id.menu_btn1:
                name = (TextView) findViewById(R.id.menu_name1);
                price = (TextView) findViewById(R.id.menu_price1);
                img = findViewById(R.id.menu_img1);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn2:
                name = (TextView) findViewById(R.id.menu_name2);
                price = (TextView) findViewById(R.id.menu_price2);
                img = findViewById(R.id.menu_img2);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chickenburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn3:
                name = (TextView) findViewById(R.id.menu_name3);
                price = (TextView) findViewById(R.id.menu_price3);
                img = findViewById(R.id.menu_img3);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn4:
                name = (TextView) findViewById(R.id.menu_name4);
                price = (TextView) findViewById(R.id.menu_price4);
                img = findViewById(R.id.menu_img4);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn5:
                name = (TextView) findViewById(R.id.menu_name5);
                price = (TextView) findViewById(R.id.menu_price5);
                img = findViewById(R.id.menu_img5);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn6:
                name = (TextView) findViewById(R.id.menu_name6);
                price = (TextView) findViewById(R.id.menu_price6);
                img = findViewById(R.id.menu_img6);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn7:
                name = (TextView) findViewById(R.id.menu_name7);
                price = (TextView) findViewById(R.id.menu_price7);
                img = findViewById(R.id.menu_img7);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn8:
                name = (TextView) findViewById(R.id.menu_name8);
                price = (TextView) findViewById(R.id.menu_price8);
                img = findViewById(R.id.menu_img8);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn9:
                name = (TextView) findViewById(R.id.menu_name9);
                price = (TextView) findViewById(R.id.menu_price9);
                img = findViewById(R.id.menu_img9);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn11:
                name = (TextView) findViewById(R.id.menu_name11);
                price = (TextView) findViewById(R.id.menu_price11);
                img = findViewById(R.id.menu_img11);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn12:
                name = (TextView) findViewById(R.id.menu_name12);
                price = (TextView) findViewById(R.id.menu_price12);
                img = findViewById(R.id.menu_img12);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn13:
                name = (TextView) findViewById(R.id.menu_name13);
                price = (TextView) findViewById(R.id.menu_price13);
                img = findViewById(R.id.menu_img13);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn14:
                name = (TextView) findViewById(R.id.menu_name14);
                price = (TextView) findViewById(R.id.menu_price14);
                img = findViewById(R.id.menu_img14);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn15:
                name = (TextView) findViewById(R.id.menu_name15);
                price = (TextView) findViewById(R.id.menu_price15);
                img = findViewById(R.id.menu_img15);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn16:
                name = (TextView) findViewById(R.id.menu_name16);
                price = (TextView) findViewById(R.id.menu_price16);
                img = findViewById(R.id.menu_img16);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn17:
                name = (TextView) findViewById(R.id.menu_name17);
                price = (TextView) findViewById(R.id.menu_price17);
                img = findViewById(R.id.menu_img17);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn18:
                name = (TextView) findViewById(R.id.menu_name18);
                price = (TextView) findViewById(R.id.menu_price18);
                img = findViewById(R.id.menu_img18);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
            case R.id.menu_btn19:
                name = (TextView) findViewById(R.id.menu_name19);
                price = (TextView) findViewById(R.id.menu_price19);
                img = findViewById(R.id.menu_img19);
                sendBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.azburger);
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                break;
        }
        byteArray = stream.toByteArray();
        intent.putExtra("image", byteArray);
        intent.putExtra("name", name.getText().toString());
        intent.putExtra("price", price.getText().toString());
        startActivityForResult(intent, 1);
    }
}

