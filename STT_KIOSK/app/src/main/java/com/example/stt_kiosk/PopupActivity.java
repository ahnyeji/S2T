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
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PopupActivity extends Activity {

    TextView txtText;
    TextView textView;
    ImageView imageView;
    ArrayList<ListViewBtnItem> items;
    ListViewBtnAdapter list_adapter;
    TextView total_price;
    Button info_clicked = null;
    Button nutrient_btn;
    Button allergy_btn;
    Button origin_btn;
    Button side_btn;
    Button drink_btn;

    TableLayout opened = null;
    TableLayout nutrient_table;
    TableLayout allergy_table;
    TableLayout origin_table;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.popup_activity);
        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
//        int width = (int) (size.x * 0.9); //Display 사이즈의 90%
//        int height = (int) (size.y * 0.9);  //Display 사이즈의 90%

//        getWindow().getAttributes().width = width;
//        getWindow().getAttributes().height = height;


        //UI 객체생성
        txtText = (TextView)findViewById(R.id.txtText);
        textView = (TextView)findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        //데이터 가져오기
        Intent intent = getIntent();
        byte[] arr = intent.getByteArrayExtra("image");
        Bitmap image = BitmapFactory.decodeByteArray(arr, 0, arr.length);
        imageView.setImageBitmap(image);
        String name = intent.getStringExtra("name");
        String price = intent.getStringExtra("price");
        txtText.setText(name);
        textView.setText(price);

        nutrient_btn = findViewById(R.id.nutrient_btn);
        allergy_btn = findViewById(R.id.allergy_btn);
        origin_btn = findViewById(R.id.origin_btn);
        side_btn = findViewById(R.id.side_btn);
        drink_btn = findViewById(R.id.drink_btn);

        nutrient_table = findViewById(R.id.nutrient_table);
        allergy_table = findViewById(R.id.allergy_table);
        origin_table = findViewById(R.id.origin_table);

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
        String Menu_item = (String) txtText.getText().toString();
        String Price_item = (String) textView.getText().toString();
        items = (ArrayList<ListViewBtnItem>) MainActivity.getList();
        item.setMenu(Menu_item);
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

    public void onInfoClicked(View v) {
        if(opened != null) {
            opened.setVisibility(View.GONE);
            opened = null;
        }
        switch (v.getId()) {
            case R.id.nutrient_btn :
                if(info_clicked == nutrient_btn){
                    info_clicked = null;
                    break;
                }
                info_clicked = nutrient_btn;
                opened = nutrient_table;
                break;
            case R.id.allergy_btn :
                if(info_clicked == allergy_btn) {
                    info_clicked = null;
                    break;
                }
                info_clicked = allergy_btn;
                opened = allergy_table;
                break;
            case R.id.origin_btn :
                if(info_clicked == origin_btn) {
                    info_clicked = null;
                    break;
                }
                info_clicked = origin_btn;
                opened = origin_table;
                break;

        }
        if(opened != null){
            opened.setVisibility(View.VISIBLE);
        }
    }

    public void onChangeClicked(View v) {
        CustomDialog oDialog = new CustomDialog(this);
        oDialog.setCancelable(false);
        oDialog.show();

    }
}
