package com.example.stt_kiosk;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    FragmentPagerAdapter adapterViewPager;

    Button clicked_category;

    ListView listview;
    public static ListViewBtnAdapter list_adapter;
    public static ArrayList<ListViewBtnItem> items;

    boolean IsMicOn = false;

    ViewPager vpPager;

    ImageView mic_btn;
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
    BitmapDrawable image;

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

        mic_btn = (ImageView) findViewById(R.id.mic_btn);
        Glide.with(this).load(R.raw.mic_off).into(mic_btn);

        final Button rec_btn = (Button) findViewById(R.id.rec_btn) ;
        clicked_category = rec_btn;
        rec_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_category.setBackgroundResource(R.drawable.radiustop);
                clicked_category.setTextColor(Color.parseColor("#ffffff"));
                rec_btn.setBackgroundResource(R.drawable.radiustopwhite);
                rec_btn.setTextColor(Color.parseColor("#272727"));
                clicked_category = rec_btn;
                changeView(1) ;
            }
        });

        final Button bg_btn = (Button) findViewById(R.id.bg_btn) ;
        bg_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_category.setBackgroundResource(R.drawable.radiustop);
                clicked_category.setTextColor(Color.parseColor("#ffffff"));
                bg_btn.setBackgroundResource(R.drawable.radiustopwhite);
                bg_btn.setTextColor(Color.parseColor("#272727"));
                clicked_category = bg_btn;
                changeView(2) ;
            }
        });
        final Button set_btn = (Button) findViewById(R.id.set_btn) ;
        set_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_category.setBackgroundResource(R.drawable.radiustop);
                clicked_category.setTextColor(Color.parseColor("#ffffff"));
                set_btn.setBackgroundResource(R.drawable.radiustopwhite);
                set_btn.setTextColor(Color.parseColor("#272727"));
                clicked_category = set_btn;
                changeView(3) ;
            }
        });

        final Button des_btn = (Button) findViewById(R.id.des_btn) ;
        des_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_category.setBackgroundResource(R.drawable.radiustop);
                clicked_category.setTextColor(Color.parseColor("#ffffff"));
                des_btn.setBackgroundResource(R.drawable.radiustopwhite);
                des_btn.setTextColor(Color.parseColor("#272727"));
                clicked_category = des_btn;
                changeView(4) ;
            }
        });

        final Button dri_btn = (Button) findViewById(R.id.dri_btn) ;
        dri_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_category.setBackgroundResource(R.drawable.radiustop);
                clicked_category.setTextColor(Color.parseColor("#ffffff"));
                dri_btn.setBackgroundResource(R.drawable.radiustopwhite);
                dri_btn.setTextColor(Color.parseColor("#272727"));
                clicked_category = dri_btn;
                changeView(5) ;
            }
        });

        final Button chi_btn = (Button) findViewById(R.id.chi_btn) ;
        chi_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_category.setBackgroundResource(R.drawable.radiustop);
                clicked_category.setTextColor(Color.parseColor("#ffffff"));
                chi_btn.setBackgroundResource(R.drawable.radiustopwhite);
                chi_btn.setTextColor(Color.parseColor("#272727"));
                clicked_category = chi_btn;
                changeView(6) ;
            }
        });

        back_btn = (ImageButton) findViewById(R.id.back_btn);
        next_btn = (ImageButton) findViewById(R.id.next_btn);
        back_btn.setOnClickListener(myListener);
        next_btn.setOnClickListener(myListener);

        items = new ArrayList<ListViewBtnItem>();
        list_adapter = new ListViewBtnAdapter(this, R.layout.listview, items, this);
        listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(list_adapter);
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
                break ;
            case 2 :
                adapter2 = new CustomAdapter2(getLayoutInflater());
                vpPager.setAdapter(adapter2);
                break ;
            case 3 :
                adapter3 = new CustomAdapter3(getLayoutInflater());
                vpPager.setAdapter(adapter3);
                break ;
            case 4 :
                adapter4 = new CustomAdapter4(getLayoutInflater());
                vpPager.setAdapter(adapter4);
                break;
            case 5 :
                adapter5 = new CustomAdapter5(getLayoutInflater());
                vpPager.setAdapter(adapter5);
                break;
            case 6 :
                adapter6 = new CustomAdapter6(getLayoutInflater());
                vpPager.setAdapter(adapter6);
                break;
        }
        indicator.setViewPager(vpPager);
    }

    View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int position;
            switch (v.getId()) {
                case R.id.back_btn:
                    position = vpPager.getCurrentItem();
                    vpPager.setCurrentItem(position - 1, true);
                    break;
                case R.id.next_btn:
                    position = vpPager.getCurrentItem();
                    vpPager.setCurrentItem(position + 1, true);
                    break;
            }
        }
    };

    public void MicOnClick(View v){
        if(IsMicOn == false){
            Glide.with(this).load(R.raw.mic_on).into(mic_btn);
            IsMicOn = true;
        }
        else{
            Glide.with(this).load(R.raw.mic_off).into(mic_btn);
            IsMicOn = false;
        }
    }


    public void MenuOnClick(View v)
    {
        intent = new Intent(this, com.example.stt_kiosk.PopupActivity.class);
        stream = new ByteArrayOutputStream();
        switch (v.getId()){
            case R.id.menu_btn1:
                name = (TextView) findViewById(R.id.menu_name1);
                price = (TextView) findViewById(R.id.menu_price1);
                img = (ImageView) findViewById(R.id.menu_img1);
                break;
            case R.id.menu_btn2:
                name = (TextView) findViewById(R.id.menu_name2);
                price = (TextView) findViewById(R.id.menu_price2);
                img = findViewById(R.id.menu_img2);
                break;
            case R.id.menu_btn3:
                name = (TextView) findViewById(R.id.menu_name3);
                price = (TextView) findViewById(R.id.menu_price3);
                img = findViewById(R.id.menu_img3);
                break;
            case R.id.menu_btn4:
                name = (TextView) findViewById(R.id.menu_name4);
                price = (TextView) findViewById(R.id.menu_price4);
                img = findViewById(R.id.menu_img4);
                break;
            case R.id.menu_btn5:
                name = (TextView) findViewById(R.id.menu_name5);
                price = (TextView) findViewById(R.id.menu_price5);
                img = findViewById(R.id.menu_img5);
                break;
            case R.id.menu_btn6:
                name = (TextView) findViewById(R.id.menu_name6);
                price = (TextView) findViewById(R.id.menu_price6);
                img = findViewById(R.id.menu_img6);
                break;
            case R.id.menu_btn7:
                name = (TextView) findViewById(R.id.menu_name7);
                price = (TextView) findViewById(R.id.menu_price7);
                img = findViewById(R.id.menu_img7);
                break;
            case R.id.menu_btn8:
                name = (TextView) findViewById(R.id.menu_name8);
                price = (TextView) findViewById(R.id.menu_price8);
                img = findViewById(R.id.menu_img8);
                break;
            case R.id.menu_btn9:
                name = (TextView) findViewById(R.id.menu_name9);
                price = (TextView) findViewById(R.id.menu_price9);
                img = findViewById(R.id.menu_img9);
                break;
            case R.id.menu_btn11:
                name = (TextView) findViewById(R.id.menu_name11);
                price = (TextView) findViewById(R.id.menu_price11);
                img = findViewById(R.id.menu_img11);
                break;
            case R.id.menu_btn12:
                name = (TextView) findViewById(R.id.menu_name12);
                price = (TextView) findViewById(R.id.menu_price12);
                img = findViewById(R.id.menu_img12);
                break;
            case R.id.menu_btn13:
                name = (TextView) findViewById(R.id.menu_name13);
                price = (TextView) findViewById(R.id.menu_price13);
                img = findViewById(R.id.menu_img13);
                break;
            case R.id.menu_btn14:
                name = (TextView) findViewById(R.id.menu_name14);
                price = (TextView) findViewById(R.id.menu_price14);
                img = findViewById(R.id.menu_img14);
                break;
            case R.id.menu_btn15:
                name = (TextView) findViewById(R.id.menu_name15);
                price = (TextView) findViewById(R.id.menu_price15);
                img = findViewById(R.id.menu_img15);
                break;
            case R.id.menu_btn16:
                name = (TextView) findViewById(R.id.menu_name16);
                price = (TextView) findViewById(R.id.menu_price16);
                img = findViewById(R.id.menu_img16);
                break;
            case R.id.menu_btn17:
                name = (TextView) findViewById(R.id.menu_name17);
                price = (TextView) findViewById(R.id.menu_price17);
                img = findViewById(R.id.menu_img17);
                break;
            case R.id.menu_btn18:
                name = (TextView) findViewById(R.id.menu_name18);
                price = (TextView) findViewById(R.id.menu_price18);
                img = findViewById(R.id.menu_img18);
                break;
            case R.id.menu_btn19:
                name = (TextView) findViewById(R.id.menu_name19);
                price = (TextView) findViewById(R.id.menu_price19);
                img = findViewById(R.id.menu_img19);
                break;
        }
        image = (BitmapDrawable) img.getDrawable();
        Bitmap bitmap = image.getBitmap();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        byteArray = stream.toByteArray();
        intent.putExtra("image", byteArray);
        intent.putExtra("name", name.getText().toString());
        intent.putExtra("price", price.getText().toString());
        startActivityForResult(intent, 1);
    }

    public static ArrayList<ListViewBtnItem> getList() {
        return items;
    }

    public static void setList(ArrayList<ListViewBtnItem> list) {
        items = list;
    }

    public static ListViewBtnAdapter getList_adapter() {
        return list_adapter;
    }

    public static void setList_adapter(ListViewBtnAdapter adapter){
        list_adapter = adapter;
    }
}

