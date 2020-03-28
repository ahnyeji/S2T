package com.example.stt_kiosk;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;



import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    public static String serverUrl = "http://192.168.0.7:8888/";

    FragmentPagerAdapter adapterViewPager;

    Button clicked_category;

    ListView listview;
    public static ListViewBtnAdapter list_adapter;
    public static ArrayList<ListViewBtnItem> items;
    static TextView total_price;

    boolean IsMicOn = false;

    ViewPager vpPager;

    ImageView mic_btn;
    ImageButton back_btn;
    ImageButton next_btn;

    CircleIndicator indicator;

    RecommandAdapter adapter;
    BurgerAdapter adapter2;
    SetAdapter adapter3;
    DessertAdapter adapter4;
    DrinkAdapter adapter5;
    ChickenAdapter adapter6;

    TextView name;
    TextView price;
    String exp;
    ImageView img;
    BitmapDrawable image;

    Intent intent;
    Bitmap sendBitmap;
    ByteArrayOutputStream stream;
    byte[] byteArray;

    int cnt = 1;
    String category_db;
    String name_db;
    String price_db;
    String image_db;
    String descript_db;
    String totalweight_db;
    String calorie_db;
    String protein_db;
    String sodium_db;
    String sugar_db;
    String saturatedfat_db;
    private static String TAG = "phptest_MainActivity";

    private static final String TAG_JSON="webnautes";
    private static final String TAG_CATEGORY = "category";
    private static final String TAG_NAME = "name";
    private static final String TAG_PRICE ="price";
    private static final String TAG_IMAGE ="image";
    private static final String TAG_DESCRIPT ="descript";
    private static final String TAG_TOTALWEIGHT = "totalweight";
    private static final String TAG_CALORIE = "calorie";
    private static final String TAG_PROTEIN = "protein";
    private static final String TAG_SODIUM = "sodium";
    private static final String TAG_SUGAR = "sugar";
    private static final String TAG_SATURATEDFAT = "saturatedfat";
    public static ArrayList<ArrayList<String>> DB_result_burger = null;
    public static ArrayList<ArrayList<String>> DB_result_chicken = null;
    public static ArrayList<ArrayList<String>> DB_result_dessert = null;
    public static ArrayList<ArrayList<String>> DB_result_drink = null;
    public static ArrayList<ArrayList<String>> DB_result_set = null;
    public static ArrayList<String> DB_item = null;

    TextView stt;
    ArrayList<HashMap<String, String>> mArrayList;
    String mJsonString;

    ArrayList<ImageView> firstPageImg = new ArrayList<>();
    ArrayList<TextView> firstPageName = new ArrayList<>();
    ArrayList<TextView> firstPagePrice = new ArrayList<>();
    private Context context;
    ArrayList<String> nutrient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        adapterViewPager = new FragmentAdapter(getSupportFragmentManager());
//        vpPager.setAdapter(adapterViewPager);
        changeView(1);
        this.context = getApplicationContext();
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
        listview = (ListView) findViewById(R.id.list);
        list_adapter = new ListViewBtnAdapter(this, R.layout.listview, items, this);
        listview.setAdapter(list_adapter);
        total_price = (TextView) findViewById(R.id.total_price);

        mArrayList = new ArrayList<>();

        MainActivity.GetData task = new MainActivity.GetData();
        task.execute(serverUrl + "getjson.php");
        stt = findViewById(R.id.stt_window);
    }

    private void changeView(int index) {

        // 자식(Children) 뷰들에 대한 참조 획득.
        vpPager = (ViewPager) findViewById(R.id.vpPager) ;
        indicator = (CircleIndicator) findViewById(R.id.indicator);
        // index에 따라 자식(Children) 뷰 들의 visibility 설정.
        switch (index) {
            case 1 :
                adapter = new RecommandAdapter(getLayoutInflater());
                vpPager.setAdapter(adapter);
                break ;
            case 2 :
                adapter2 = new BurgerAdapter(getLayoutInflater(),this.context);
                vpPager.setAdapter(adapter2);
                break ;
            case 3 :
                adapter3 = new SetAdapter(getLayoutInflater(),this.context);
                vpPager.setAdapter(adapter3);
                break ;
            case 4 :
                adapter4 = new DessertAdapter(getLayoutInflater(),this.context);
                vpPager.setAdapter(adapter4);
                break;
            case 5 :
                adapter5 = new DrinkAdapter(getLayoutInflater(),this.context);
                vpPager.setAdapter(adapter5);
                break;
            case 6 :
                adapter6 = new ChickenAdapter(getLayoutInflater(),this.context);
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
        String cat = (String) clicked_category.getText();
        ArrayList<ArrayList<String>> db_cat = new ArrayList<>();
        if(cat.equals("버거")){
            db_cat = DB_result_burger;
        }
        else if(cat.equals("세트/팩")){
            db_cat = DB_result_set;
        }
        else if(cat.equals("디저트")){
            db_cat = DB_result_dessert;
        }
        else if(cat.equals("음료")){
            db_cat = DB_result_drink;
        }
        else if(cat.equals("치킨")){
            db_cat = DB_result_chicken;
        }

        switch (v.getId()){
            case R.id.menu_btn1:
                name = (TextView) findViewById(R.id.menu_name1);
                price = (TextView) findViewById(R.id.menu_price1);
                exp = db_cat.get(0).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(0).get(5));
                nutrient.add(db_cat.get(0).get(6));
                nutrient.add(db_cat.get(0).get(7));
                nutrient.add(db_cat.get(0).get(8));
                nutrient.add(db_cat.get(0).get(9));
                nutrient.add(db_cat.get(0).get(10));
                img = (ImageView) findViewById(R.id.menu_img1);
                break;
            case R.id.menu_btn2:
                name = (TextView) findViewById(R.id.menu_name2);
                price = (TextView) findViewById(R.id.menu_price2);
                exp = db_cat.get(1).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(1).get(5));
                nutrient.add(db_cat.get(1).get(6));
                nutrient.add(db_cat.get(1).get(7));
                nutrient.add(db_cat.get(1).get(8));
                nutrient.add(db_cat.get(1).get(9));
                nutrient.add(db_cat.get(1).get(10));
                img = findViewById(R.id.menu_img2);
                break;
            case R.id.menu_btn3:
                name = (TextView) findViewById(R.id.menu_name3);
                price = (TextView) findViewById(R.id.menu_price3);
                exp = db_cat.get(2).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(2).get(5));
                nutrient.add(db_cat.get(2).get(6));
                nutrient.add(db_cat.get(2).get(7));
                nutrient.add(db_cat.get(2).get(8));
                nutrient.add(db_cat.get(2).get(9));
                nutrient.add(db_cat.get(2).get(10));
                img = findViewById(R.id.menu_img3);
                break;
            case R.id.menu_btn4:
                name = (TextView) findViewById(R.id.menu_name4);
                price = (TextView) findViewById(R.id.menu_price4);
                exp = db_cat.get(3).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(3).get(5));
                nutrient.add(db_cat.get(3).get(6));
                nutrient.add(db_cat.get(3).get(7));
                nutrient.add(db_cat.get(3).get(8));
                nutrient.add(db_cat.get(3).get(9));
                nutrient.add(db_cat.get(3).get(10));
                img = findViewById(R.id.menu_img4);
                break;
            case R.id.menu_btn5:
                name = (TextView) findViewById(R.id.menu_name5);
                price = (TextView) findViewById(R.id.menu_price5);
                exp = db_cat.get(4).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(4).get(5));
                nutrient.add(db_cat.get(4).get(6));
                nutrient.add(db_cat.get(4).get(7));
                nutrient.add(db_cat.get(4).get(8));
                nutrient.add(db_cat.get(4).get(9));
                nutrient.add(db_cat.get(4).get(10));
                img = findViewById(R.id.menu_img5);
                break;
            case R.id.menu_btn6:
                name = (TextView) findViewById(R.id.menu_name6);
                price = (TextView) findViewById(R.id.menu_price6);
                exp = db_cat.get(5).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(5).get(5));
                nutrient.add(db_cat.get(5).get(6));
                nutrient.add(db_cat.get(5).get(7));
                nutrient.add(db_cat.get(5).get(8));
                nutrient.add(db_cat.get(5).get(9));
                nutrient.add(db_cat.get(5).get(10));
                img = findViewById(R.id.menu_img6);
                break;
            case R.id.menu_btn7:
                name = (TextView) findViewById(R.id.menu_name7);
                price = (TextView) findViewById(R.id.menu_price7);
                exp = db_cat.get(6).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(6).get(5));
                nutrient.add(db_cat.get(6).get(6));
                nutrient.add(db_cat.get(6).get(7));
                nutrient.add(db_cat.get(6).get(8));
                nutrient.add(db_cat.get(6).get(9));
                nutrient.add(db_cat.get(6).get(10));
                img = findViewById(R.id.menu_img7);
                break;
            case R.id.menu_btn8:
                name = (TextView) findViewById(R.id.menu_name8);
                price = (TextView) findViewById(R.id.menu_price8);
                exp = db_cat.get(7).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(7).get(5));
                nutrient.add(db_cat.get(7).get(6));
                nutrient.add(db_cat.get(7).get(7));
                nutrient.add(db_cat.get(7).get(8));
                nutrient.add(db_cat.get(7).get(9));
                nutrient.add(db_cat.get(7).get(10));
                img = findViewById(R.id.menu_img8);
                break;
            case R.id.menu_btn9:
                name = (TextView) findViewById(R.id.menu_name9);
                price = (TextView) findViewById(R.id.menu_price9);
                exp = db_cat.get(8).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(8).get(5));
                nutrient.add(db_cat.get(8).get(6));
                nutrient.add(db_cat.get(8).get(7));
                nutrient.add(db_cat.get(8).get(8));
                nutrient.add(db_cat.get(8).get(9));
                nutrient.add(db_cat.get(8).get(10));
                img = findViewById(R.id.menu_img9);
                break;
            case R.id.menu_btn11:
                name = (TextView) findViewById(R.id.menu_name11);
                price = (TextView) findViewById(R.id.menu_price11);
                exp = db_cat.get(9).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(9).get(5));
                nutrient.add(db_cat.get(9).get(6));
                nutrient.add(db_cat.get(9).get(7));
                nutrient.add(db_cat.get(9).get(8));
                nutrient.add(db_cat.get(9).get(9));
                nutrient.add(db_cat.get(9).get(10));
                img = findViewById(R.id.menu_img11);
                break;
            case R.id.menu_btn12:
                name = (TextView) findViewById(R.id.menu_name12);
                price = (TextView) findViewById(R.id.menu_price12);
                exp = db_cat.get(10).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(10).get(5));
                nutrient.add(db_cat.get(10).get(6));
                nutrient.add(db_cat.get(10).get(7));
                nutrient.add(db_cat.get(10).get(8));
                nutrient.add(db_cat.get(10).get(9));
                nutrient.add(db_cat.get(10).get(10));
                img = findViewById(R.id.menu_img12);
                break;
            case R.id.menu_btn13:
                name = (TextView) findViewById(R.id.menu_name13);
                price = (TextView) findViewById(R.id.menu_price13);
                exp = db_cat.get(11).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(11).get(5));
                nutrient.add(db_cat.get(11).get(6));
                nutrient.add(db_cat.get(11).get(7));
                nutrient.add(db_cat.get(11).get(8));
                nutrient.add(db_cat.get(11).get(9));
                nutrient.add(db_cat.get(11).get(10));
                img = findViewById(R.id.menu_img13);
                break;
            case R.id.menu_btn14:
                name = (TextView) findViewById(R.id.menu_name14);
                price = (TextView) findViewById(R.id.menu_price14);
                exp = db_cat.get(12).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(12).get(5));
                nutrient.add(db_cat.get(12).get(6));
                nutrient.add(db_cat.get(12).get(7));
                nutrient.add(db_cat.get(12).get(8));
                nutrient.add(db_cat.get(12).get(9));
                nutrient.add(db_cat.get(12).get(10));
                img = findViewById(R.id.menu_img14);
                break;
            case R.id.menu_btn15:
                name = (TextView) findViewById(R.id.menu_name15);
                price = (TextView) findViewById(R.id.menu_price15);
                exp = db_cat.get(13).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(13).get(5));
                nutrient.add(db_cat.get(13).get(6));
                nutrient.add(db_cat.get(13).get(7));
                nutrient.add(db_cat.get(13).get(8));
                nutrient.add(db_cat.get(13).get(9));
                nutrient.add(db_cat.get(13).get(10));
                img = findViewById(R.id.menu_img15);
                break;
            case R.id.menu_btn16:
                name = (TextView) findViewById(R.id.menu_name16);
                price = (TextView) findViewById(R.id.menu_price16);
                exp = db_cat.get(14).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(14).get(5));
                nutrient.add(db_cat.get(14).get(6));
                nutrient.add(db_cat.get(14).get(7));
                nutrient.add(db_cat.get(14).get(8));
                nutrient.add(db_cat.get(14).get(9));
                nutrient.add(db_cat.get(14).get(10));
                img = findViewById(R.id.menu_img16);
                break;
            case R.id.menu_btn17:
                name = (TextView) findViewById(R.id.menu_name17);
                price = (TextView) findViewById(R.id.menu_price17);
                exp = db_cat.get(15).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(15).get(5));
                nutrient.add(db_cat.get(15).get(6));
                nutrient.add(db_cat.get(15).get(7));
                nutrient.add(db_cat.get(15).get(8));
                nutrient.add(db_cat.get(15).get(9));
                nutrient.add(db_cat.get(15).get(10));
                img = findViewById(R.id.menu_img17);
                break;
            case R.id.menu_btn18:
                name = (TextView) findViewById(R.id.menu_name18);
                price = (TextView) findViewById(R.id.menu_price18);
                exp = db_cat.get(16).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(16).get(5));
                nutrient.add(db_cat.get(16).get(6));
                nutrient.add(db_cat.get(16).get(7));
                nutrient.add(db_cat.get(16).get(8));
                nutrient.add(db_cat.get(16).get(9));
                nutrient.add(db_cat.get(16).get(10));
                img = findViewById(R.id.menu_img18);
                break;
            case R.id.menu_btn19:
                name = (TextView) findViewById(R.id.menu_name19);
                price = (TextView) findViewById(R.id.menu_price19);
                exp = db_cat.get(17).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(17).get(5));
                nutrient.add(db_cat.get(17).get(6));
                nutrient.add(db_cat.get(17).get(7));
                nutrient.add(db_cat.get(17).get(8));
                nutrient.add(db_cat.get(17).get(9));
                nutrient.add(db_cat.get(17).get(10));
                img = findViewById(R.id.menu_img19);
                break;
            case R.id.menu_btn21:
                name = (TextView) findViewById(R.id.menu_name21);
                price = (TextView) findViewById(R.id.menu_price21);
                exp = db_cat.get(18).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(18).get(5));
                nutrient.add(db_cat.get(18).get(6));
                nutrient.add(db_cat.get(18).get(7));
                nutrient.add(db_cat.get(18).get(8));
                nutrient.add(db_cat.get(18).get(9));
                nutrient.add(db_cat.get(18).get(10));
                img = findViewById(R.id.menu_img21);
                break;
            case R.id.menu_btn22:
                name = (TextView) findViewById(R.id.menu_name22);
                price = (TextView) findViewById(R.id.menu_price22);
                exp = db_cat.get(19).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(19).get(5));
                nutrient.add(db_cat.get(19).get(6));
                nutrient.add(db_cat.get(19).get(7));
                nutrient.add(db_cat.get(19).get(8));
                nutrient.add(db_cat.get(19).get(9));
                nutrient.add(db_cat.get(19).get(10));
                img = findViewById(R.id.menu_img22);
                break;
            case R.id.menu_btn23:
                name = (TextView) findViewById(R.id.menu_name23);
                price = (TextView) findViewById(R.id.menu_price23);
                exp = db_cat.get(20).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(20).get(5));
                nutrient.add(db_cat.get(20).get(6));
                nutrient.add(db_cat.get(20).get(7));
                nutrient.add(db_cat.get(20).get(8));
                nutrient.add(db_cat.get(20).get(9));
                nutrient.add(db_cat.get(20).get(10));
                img = findViewById(R.id.menu_img23);
                break;
            case R.id.menu_btn24:
                name = (TextView) findViewById(R.id.menu_name24);
                price = (TextView) findViewById(R.id.menu_price24);
                exp = db_cat.get(21).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(21).get(5));
                nutrient.add(db_cat.get(21).get(6));
                nutrient.add(db_cat.get(21).get(7));
                nutrient.add(db_cat.get(21).get(8));
                nutrient.add(db_cat.get(21).get(9));
                nutrient.add(db_cat.get(21).get(10));
                img = findViewById(R.id.menu_img24);
                break;
            case R.id.menu_btn25:
                name = (TextView) findViewById(R.id.menu_name25);
                price = (TextView) findViewById(R.id.menu_price25);
                exp = db_cat.get(22).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(22).get(5));
                nutrient.add(db_cat.get(22).get(6));
                nutrient.add(db_cat.get(22).get(7));
                nutrient.add(db_cat.get(22).get(8));
                nutrient.add(db_cat.get(22).get(9));
                nutrient.add(db_cat.get(22).get(10));
                img = findViewById(R.id.menu_img25);
                break;
            case R.id.menu_btn26:
                name = (TextView) findViewById(R.id.menu_name26);
                price = (TextView) findViewById(R.id.menu_price26);
                exp = db_cat.get(23).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(23).get(5));
                nutrient.add(db_cat.get(23).get(6));
                nutrient.add(db_cat.get(23).get(7));
                nutrient.add(db_cat.get(23).get(8));
                nutrient.add(db_cat.get(23).get(9));
                nutrient.add(db_cat.get(23).get(10));
                img = findViewById(R.id.menu_img26);
                break;
            case R.id.menu_btn27:
                name = (TextView) findViewById(R.id.menu_name27);
                price = (TextView) findViewById(R.id.menu_price27);
                exp = db_cat.get(24).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(24).get(5));
                nutrient.add(db_cat.get(24).get(6));
                nutrient.add(db_cat.get(24).get(7));
                nutrient.add(db_cat.get(24).get(8));
                nutrient.add(db_cat.get(24).get(9));
                nutrient.add(db_cat.get(24).get(10));
                img = findViewById(R.id.menu_img27);
                break;
            case R.id.menu_btn28:
                name = (TextView) findViewById(R.id.menu_name28);
                price = (TextView) findViewById(R.id.menu_price28);
                exp = db_cat.get(25).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(25).get(5));
                nutrient.add(db_cat.get(25).get(6));
                nutrient.add(db_cat.get(25).get(7));
                nutrient.add(db_cat.get(25).get(8));
                nutrient.add(db_cat.get(25).get(9));
                nutrient.add(db_cat.get(25).get(10));
                img = findViewById(R.id.menu_img28);
                break;
            case R.id.menu_btn29:
                name = (TextView) findViewById(R.id.menu_name29);
                price = (TextView) findViewById(R.id.menu_price29);
                exp = db_cat.get(26).get(4);
                nutrient = new ArrayList<String>();
                nutrient.add(db_cat.get(26).get(5));
                nutrient.add(db_cat.get(26).get(6));
                nutrient.add(db_cat.get(26).get(7));
                nutrient.add(db_cat.get(26).get(8));
                nutrient.add(db_cat.get(26).get(9));
                nutrient.add(db_cat.get(26).get(10));
                img = findViewById(R.id.menu_img29);
                break;
        }
        image = (BitmapDrawable) img.getDrawable();
        Bitmap bitmap = image.getBitmap();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        byteArray = stream.toByteArray();
        intent.putExtra("image", byteArray);
        intent.putExtra("name", name.getText().toString());
        intent.putExtra("price", price.getText().toString());
        intent.putExtra("cat", cat);
        intent.putExtra("exp", exp);
        intent.putExtra("nutrient",nutrient);
        startActivityForResult(intent, 1);
    }

    public static void setTotalPrice(int total_int){
        DecimalFormat formatter = new DecimalFormat("###,###");
        total_price.setText(formatter.format(total_int)+"원");

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

    private class GetData extends AsyncTask<String, Void, String>{
        ProgressDialog progressDialog;
        String errorString = null;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog = ProgressDialog.show(MainActivity.this,
                    "Please Wait", null, true, true);
        }


        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            progressDialog.dismiss();
            Log.d(TAG, "response  - " + result);

            if (result == null){

                stt.setText(errorString);
            }
            else {
                mJsonString = result;
                showResult();
            }
        }


        @Override
        protected String doInBackground(String... params) {

            String serverURL = params[0];


            try {

                URL url = new URL(serverURL);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();


                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.connect();


                int responseStatusCode = httpURLConnection.getResponseCode();
                Log.d(TAG, "response code - " + responseStatusCode);

                InputStream inputStream;
                if(responseStatusCode == HttpURLConnection.HTTP_OK) {
                    inputStream = httpURLConnection.getInputStream();
                }
                else{
                    inputStream = httpURLConnection.getErrorStream();
                }


                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                StringBuilder sb = new StringBuilder();
                String line;

                while((line = bufferedReader.readLine()) != null){
                    sb.append(line);
                }


                bufferedReader.close();


                return sb.toString().trim();


            } catch (Exception e) {

                Log.d(TAG, "InsertData: Error ", e);
                errorString = e.toString();

                return null;
            }

        }
    }

    private void showResult(){
        try {
            JSONObject jsonObject = new JSONObject(mJsonString);
            JSONArray jsonArray = jsonObject.getJSONArray(TAG_JSON);
            DB_result_burger = new ArrayList<ArrayList<String>>();
            DB_result_set = new ArrayList<ArrayList<String>>();
            DB_result_drink = new ArrayList<ArrayList<String>>();
            DB_result_dessert = new ArrayList<ArrayList<String>>();
            DB_result_chicken = new ArrayList<ArrayList<String>>();


            for(int i=0;i<jsonArray.length();i++){

                JSONObject item = jsonArray.getJSONObject(i);

                category_db = item.getString(TAG_CATEGORY);
                name_db = item.getString(TAG_NAME);
                price_db = item.getString(TAG_PRICE);
                image_db = item.getString(TAG_IMAGE);
                descript_db = item.getString(TAG_DESCRIPT);
                totalweight_db = item.getString(TAG_TOTALWEIGHT);
                calorie_db = item.getString(TAG_CALORIE);
                protein_db = item.getString(TAG_PROTEIN);
                sodium_db = item.getString(TAG_SODIUM);
                sugar_db = item.getString(TAG_SUGAR);
                saturatedfat_db = item.getString(TAG_SATURATEDFAT);
                DB_item = new ArrayList<String>();
                DB_item.add(category_db);
                DB_item.add(name_db);
                DB_item.add(price_db);
                DB_item.add(image_db);
                DB_item.add(descript_db);
                DB_item.add(totalweight_db);
                DB_item.add(calorie_db);
                DB_item.add(protein_db);
                DB_item.add(sodium_db);
                DB_item.add(sugar_db);
                DB_item.add(saturatedfat_db);
                if(category_db.equals("세트")){
                    DB_result_set.add(DB_item);
                }
                else if(category_db.equals("버거")){
                    DB_result_burger.add(DB_item);
                }
                else if(category_db.equals("디저트")){
                    DB_result_dessert.add(DB_item);
                }
                else if(category_db.equals("음료")){
                    DB_result_drink.add(DB_item);
                }
                else if(category_db.equals("치킨")){
                    DB_result_chicken.add(DB_item);
                }
            }

//            for(int i=0 ; i<DB_result_burger.size() ; i++) {
//                Log.d(TAG, "DB_RESULT_BURGER :");
//
//                for (int j = 0; j < DB_item.size(); j++) {
//                    Log.d(TAG, "" + DB_result_burger.get(i).get(j));
//                }
//            }
//            for(int i=0 ; i<DB_result_chicken.size() ; i++) {
//                Log.d(TAG, "DB_RESULT_CHICKEN :");
//
//                for (int j = 0; j < DB_item.size(); j++) {
//                    Log.d(TAG, "" + DB_result_chicken.get(i).get(j));
//                }
//            }

        } catch (JSONException e) {

            Log.d(TAG, "showResult : ", e);
        }

    }

}