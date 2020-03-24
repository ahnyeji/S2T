package com.example.stt_kiosk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DialogDrink extends Dialog {

    TextView drink_name;
    TextView drink_price;
    String name;
    String price;
    LinearLayout drink_menu;

    private Context context;
    DialogDrink m_oDialog;

    private DialogDrinkListener DialogDrinkListener;

    public DialogDrink(Context context) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        this.context = context;
    }
    interface DialogDrinkListener{
        void onApplyClicked(String name, String price);
//        void onNagativeClicked();
    }
    public void setDialogListener(DialogDrinkListener DialogDrinkListener){
        this.DialogDrinkListener = DialogDrinkListener;
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

        setContentView(R.layout.dialog_drink);

        m_oDialog = this;

        Button oBtn = (Button)this.findViewById(R.id.drink_apply);
        drink_menu = (LinearLayout)this.findViewById(R.id.drink_menu1);
        oBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onClickBtn(v);
            }
        });
        drink_menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                itemClicked(v);
            }
        });

    }
    public void itemClicked(View v){
        switch (v.getId()){
            case R.id.drink_menu1:
                drink_name = (TextView) findViewById(R.id.drink_name1);
                drink_price = (TextView) findViewById(R.id.drink_price1);
                name = drink_name.getText().toString();
                price = drink_price.getText().toString();
                break;

        }
    }
    public void onClickBtn(View _oView) {
        switch (_oView.getId()){
            case R.id.drink_apply:
                DialogDrinkListener.onApplyClicked(name, price);
                this.dismiss();
                break;
        }
//        this.dismiss();
    }

}