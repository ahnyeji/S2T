package com.example.stt_kiosk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class PopupActivity extends Activity {

    DialogDessert dialogDessert;
    DialogDrink dialogDrink;
    DialogDetail dialogDetail;

    TextView popupName;
    TextView popupPrice;
    ImageView popupImg;
    ArrayList<ListViewBtnItem> items;
    ListViewBtnAdapter list_adapter;
    Button detail_btn;
    Button dessert_change;
    Button drink_change;

    private TextView dessert_name;
    private TextView dessert_price;
    private TextView drink_name;
    private TextView drink_price;

    static int dessert_save;
    static int drink_save;

    static String des_name;
    static String des_price;
    static String dri_name;
    static String dri_price;

    TextView total_price;
    String total_str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.popup_activity);
        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        dessert_name = (TextView) findViewById(R.id.dessert_selected);
        dessert_price = (TextView) findViewById(R.id.dessert_price);
        drink_name = (TextView) findViewById(R.id.drink_selected);
        drink_price = (TextView) findViewById(R.id.drink_price);

        //UI 객체생성
        popupName = (TextView)findViewById(R.id.popup_name);
        popupPrice = (TextView)findViewById(R.id.popup_price);
        popupImg = findViewById(R.id.popup_img);
        //데이터 가져오기
        Intent intent = getIntent();
        byte[] arr = intent.getByteArrayExtra("image");
        Bitmap image = BitmapFactory.decodeByteArray(arr, 0, arr.length);
        popupImg.setImageBitmap(image);
        String name = intent.getStringExtra("name");
        String price = intent.getStringExtra("price");
        popupName.setText(name);
        popupPrice.setText(price);

        dessert_change = findViewById(R.id.dessert_change);
        drink_change = findViewById(R.id.drink_change);

        detail_btn = findViewById(R.id.detail_btn);

        dessert_save = R.id.dessert_menu1;

        total_price = findViewById(R.id.total_price);
        total_str = popupPrice.getText().toString();
        total_str = total_str.substring(0,total_str.length()-1);
        String price_str[] = total_str.split(",");
        total_str = "";
        for(int i=0; i < price_str.length; i++){
            total_str += price_str[i];
        }
//        total_price.setText(total_str);
        int total_int = Integer.parseInt(total_str);
        DecimalFormat formatter = new DecimalFormat("###,###");
        total_price.setText(formatter.format(total_int)+"원");
    }

    //취소 버튼 클릭
    public void mOnClose(View v){
        //데이터 전달하기
        Intent intent = new Intent();
        intent.putExtra("result", "Close Popup");
        setResult(RESULT_OK, intent);
        //액티비티(팝업) 닫기
        finish();
    }

    //확인 버튼 클릭
    public void mOnOK(View v){
        //데이터 전달하기
        Intent intent = new Intent();
        intent.putExtra("result", "OK Popup");
        setResult(RESULT_OK, intent);

        ListViewBtnItem item;
        item = new ListViewBtnItem();
        String Name_item = (String) popupName.getText().toString();
        String Price_item = (String) popupPrice.getText().toString();
        items = (ArrayList<ListViewBtnItem>) MainActivity.getList();
        item.setMenu(Name_item);
        item.setNumber("1");
        item.setPrice(Price_item);
        items.add(item);
        MainActivity.setList(items);
        list_adapter = MainActivity.getList_adapter();
        list_adapter.notifyDataSetChanged();
        MainActivity.setList_adapter(list_adapter);

        //액티비티(팝업) 닫기
        finish();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //바깥레이어 클릭시 안닫히게
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        //안드로이드 백버튼 막기
        return;
    }

    public void onChangeClicked(View v) {
        switch (v.getId()){
            case R.id.dessert_change :
                dialogDessert = new DialogDessert(this);
                dialogDessert.setDialogListener(new DialogDessert.DialogDessertListener() {
                    @Override
                    public void onApplyClicked(String name, String price, int save) {
                        dessert_name.setText(name);
                        dessert_price.setText("+"+price+"원");
                        dessert_save = save;
                    }
                });
                dialogDessert.setCancelable(false);
                dialogDessert.show();
                break;
            case R.id.drink_change :
                dialogDrink = new DialogDrink(this);
                dialogDrink.setDialogListener(new DialogDrink.DialogDrinkListener() {
                    @Override
                    public void onApplyClicked(String name, String price) {
                        drink_name.setText(name);
                        drink_price.setText(price);
                    }
                });
                dialogDrink.setCancelable(false);
                dialogDrink.show();
                break;
            case R.id.detail_btn :
                dialogDetail = new DialogDetail(this);
                dialogDetail.setCancelable(false);
                dialogDetail.show();
                break;
        }
    }

    public static int getDessertR() {
        return dessert_save;
    }

}
