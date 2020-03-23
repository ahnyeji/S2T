package com.example.stt_kiosk;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DialogDessert extends Dialog {

    TextView dessert_name;
    TextView dessert_price;
    String name;
    String price;
    LinearLayout dessert_menu1;
    LinearLayout dessert_menu2;

    int save_menu;
    int pre_menu;
    LinearLayout save_menu_layout;
    LinearLayout pre_menu_layout;

    private Context context;
    DialogDessert m_oDialog;

    private DialogDessertListener dialogDessertListener;

    public DialogDessert(Context context) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        this.context = context;
    }
    interface DialogDessertListener{
        void onApplyClicked(String name, String price, int save);
//        void onNagativeClicked();
    }
    public void setDialogListener(DialogDessertListener dialogDessertListener){
        this.dialogDessertListener = dialogDessertListener;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow.dimAmount = 0.5f;
        lpWindow.width = 700;
        lpWindow.height = 850;
        getWindow().setAttributes(lpWindow);

        setContentView(R.layout.dialog_dessert);

        m_oDialog = this;

        Button oBtn = (Button)this.findViewById(R.id.dessert_apply);
        dessert_menu1 = (LinearLayout)this.findViewById(R.id.dessert_menu1);
        oBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onClickBtn(v);
            }
        });
        dessert_menu1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                itemClicked(v);
            }
        });

        dessert_menu2 = (LinearLayout)this.findViewById(R.id.dessert_menu2);
        dessert_menu2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                itemClicked(v);
            }
        });

        save_menu = PopupActivity.getDessertR();
        pre_menu = PopupActivity.getDessertR();

        switch (save_menu){
            case R.id.dessert_menu1:
                selectDessertMenu1();
                break;

            case R.id.dessert_menu2:
                selectDessertMenu2();
                break;

            case R.id.dessert_menu3:
                selectDessertMenu3();
                break;

            case R.id.dessert_menu4:
                selectDessertMenu4();
                break;

        }


    }
    public void itemClicked(View v){
        switch (v.getId()){
            case R.id.dessert_menu1:
                selectDessertMenu1();
                break;

            case R.id.dessert_menu2:
                selectDessertMenu2();
                break;

            case R.id.dessert_menu3:
                selectDessertMenu3();
                break;

            case R.id.dessert_menu4:
                selectDessertMenu4();
                break;

        }
    }
    public void onClickBtn(View _oView) {
        switch (_oView.getId()){
            case R.id.dessert_apply:
                dialogDessertListener.onApplyClicked(name, price, save_menu);
                this.dismiss();
                break;
        }
//        this.dismiss();
    }

    public void selectDessertMenu1(){
        dessert_name = (TextView) findViewById(R.id.dessert_name1);
        dessert_price = (TextView) findViewById(R.id.dessert_price1);
        name = dessert_name.getText().toString();
        price = dessert_price.getText().toString();
        price = price.substring(1);
        save_menu = R.id.dessert_menu1;
        save_menu_layout = (LinearLayout)findViewById(save_menu);
        pre_menu_layout = (LinearLayout)findViewById(pre_menu);
        save_menu_layout.setBackgroundResource(R.drawable.select_border);
        if(pre_menu != save_menu){
            pre_menu_layout.setBackgroundColor(Color.argb(0,0,0,0));
            pre_menu = R.id.dessert_menu1;
        }
    }

    public void selectDessertMenu2(){
        dessert_name = (TextView) findViewById(R.id.dessert_name2);
        dessert_price = (TextView) findViewById(R.id.dessert_price2);
        name = dessert_name.getText().toString();
        price = dessert_price.getText().toString();
        price = price.substring(1);
        save_menu = R.id.dessert_menu2;
        save_menu_layout = (LinearLayout)findViewById(save_menu);
        pre_menu_layout = (LinearLayout)findViewById(pre_menu);
        save_menu_layout.setBackgroundResource(R.drawable.select_border);
        if(pre_menu != save_menu){
            pre_menu_layout.setBackgroundColor(Color.argb(0,0,0,0));
            pre_menu = R.id.dessert_menu2;
        }
    }

    public void selectDessertMenu3(){
        dessert_name = (TextView) findViewById(R.id.dessert_name3);
        dessert_price = (TextView) findViewById(R.id.dessert_price3);
        name = dessert_name.getText().toString();
        price = dessert_price.getText().toString();
        price = price.substring(1);
        save_menu = R.id.dessert_menu3;
        save_menu_layout = (LinearLayout)findViewById(save_menu);
        pre_menu_layout = (LinearLayout)findViewById(pre_menu);
        save_menu_layout.setBackgroundResource(R.drawable.select_border);
        if(pre_menu != save_menu){
            pre_menu_layout.setBackgroundColor(Color.argb(0,0,0,0));
            pre_menu = R.id.dessert_menu3;
        }
    }

    public void selectDessertMenu4(){
        dessert_name = (TextView) findViewById(R.id.dessert_name4);
        dessert_price = (TextView) findViewById(R.id.dessert_price4);
        name = dessert_name.getText().toString();
        price = dessert_price.getText().toString();
        price = price.substring(1);
        save_menu = R.id.dessert_menu4;
        save_menu_layout = (LinearLayout)findViewById(save_menu);
        pre_menu_layout = (LinearLayout)findViewById(pre_menu);
        save_menu_layout.setBackgroundResource(R.drawable.select_border);
        if(pre_menu != save_menu){
            pre_menu_layout.setBackgroundColor(Color.argb(0,0,0,0));
            pre_menu = R.id.dessert_menu4;
        }
    }

}
