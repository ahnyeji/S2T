package com.example.s2t_kiosk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class DialogDessert extends Dialog {
    int width;
    int height;

    TextView dessert_name;
    TextView dessert_price;
    String name;
    String price;

    int save_menu;
    int pre_menu;
    LinearLayout save_menu_layout;
    LinearLayout pre_menu_layout;

    int save_checked;
    int pre_checked;
    ImageView pre_menu_checked;
    ImageView save_menu_checked;

    private Context context;
    DialogDessert m_oDialog;

    private DialogDessertListener dialogDessertListener;

    public DialogDessert(Context context) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        this.context = context;
    }
    interface DialogDessertListener{
        void onApplyClicked(String name, String price, int save, int checked);
//        void onNagativeClicked();
    }
    public void setDialogListener(DialogDessertListener dialogDessertListener){
        this.dialogDessertListener = dialogDessertListener;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        DisplayMetrics dm = context.getApplicationContext().getResources().getDisplayMetrics();
        width = (int) (dm.widthPixels * 0.85); // Display 사이즈의 90%
        height = (int) (dm.heightPixels * 0.85); // Display 사이즈의 90%
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow.dimAmount = 0.7f;
        lpWindow.width = width;
        lpWindow.height = height;
        getWindow().setAttributes(lpWindow);

//        DisplayMetrics dm = context.getApplicationContext().getResources().getDisplayMetrics();
//        width = (int) (dm.widthPixels * 0.85); // Display 사이즈의 90%
//        height = (int) (dm.heightPixels * 0.85); // Display 사이즈의 90%
//        getWindow().getAttributes().width = width;
//        getWindow().getAttributes().height = height;

        setContentView(R.layout.dialog_dessert);

        m_oDialog = this;

        ArrayList<LinearLayout> dessert_menu = new ArrayList<>();
        for(int i=0; i<20; i++){
            int menuID = context.getResources().getIdentifier("dessert_menu" + i, "id", "com.example.s2t_kiosk");
            LinearLayout menuView = (LinearLayout) this.findViewById(menuID);
            menuView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) { itemClicked(v); }
            });
            dessert_menu.add(menuView);
        }

        Button oBtn = (Button)this.findViewById(R.id.dessert_apply);
        oBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onClickBtn(v);
            }
        });
        Button oBtn1 = (Button)this.findViewById(R.id.dessert_close_btn);
        oBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onClickClose(v);
            }
        });

        save_menu = com.example.s2t_kiosk.PopupActivity.getDessertR();
        save_checked = com.example.s2t_kiosk.PopupActivity.getDessertCheck();
        pre_menu = com.example.s2t_kiosk.PopupActivity.getDessertR();
        pre_checked = com.example.s2t_kiosk.PopupActivity.getDessertCheck();

        switch (save_menu){
            case R.id.dessert_menu0:
                selectDessertMenu(0);
                break;

            case R.id.dessert_menu1:
                selectDessertMenu(1);
                break;

            case R.id.dessert_menu2:
                selectDessertMenu(2);
                break;

            case R.id.dessert_menu3:
                selectDessertMenu(3);
                break;

            case R.id.dessert_menu4:
                selectDessertMenu(4);
                break;

            case R.id.dessert_menu5:
                selectDessertMenu(5);
                break;

            case R.id.dessert_menu6:
                selectDessertMenu(6);
                break;

            case R.id.dessert_menu7:
                selectDessertMenu(7);
                break;

            case R.id.dessert_menu8:
                selectDessertMenu(8);
                break;

            case R.id.dessert_menu9:
                selectDessertMenu(9);
                break;

            case R.id.dessert_menu10:
                selectDessertMenu(10);
                break;

            case R.id.dessert_menu11:
                selectDessertMenu(11);
                break;

            case R.id.dessert_menu12:
                selectDessertMenu(12);
                break;

            case R.id.dessert_menu13:
                selectDessertMenu(13);
                break;

            case R.id.dessert_menu14:
                selectDessertMenu(14);
                break;

            case R.id.dessert_menu15:
                selectDessertMenu(15);
                break;

            case R.id.dessert_menu16:
                selectDessertMenu(16);
                break;

            case R.id.dessert_menu17:
                selectDessertMenu(17);
                break;

            case R.id.dessert_menu18:
                selectDessertMenu(18);
                break;

            case R.id.dessert_menu19:
                selectDessertMenu(19);
                break;
        }
    }

    public void itemClicked(View v){
        switch (v.getId()){
            case R.id.dessert_menu0:
                selectDessertMenu(0);
                break;
            case R.id.dessert_menu1:
                selectDessertMenu(1);
                break;

            case R.id.dessert_menu2:
                selectDessertMenu(2);
                break;

            case R.id.dessert_menu3:
                selectDessertMenu(3);
                break;

            case R.id.dessert_menu4:
                selectDessertMenu(4);
                break;

            case R.id.dessert_menu5:
                selectDessertMenu(5);
                break;

            case R.id.dessert_menu6:
                selectDessertMenu(6);
                break;

            case R.id.dessert_menu7:
                selectDessertMenu(7);
                break;

            case R.id.dessert_menu8:
                selectDessertMenu(8);
                break;

            case R.id.dessert_menu9:
                selectDessertMenu(9);
                break;

            case R.id.dessert_menu10:
                selectDessertMenu(10);
                break;

            case R.id.dessert_menu11:
                selectDessertMenu(11);
                break;

            case R.id.dessert_menu12:
                selectDessertMenu(12);
                break;

            case R.id.dessert_menu13:
                selectDessertMenu(13);
                break;

            case R.id.dessert_menu14:
                selectDessertMenu(14);
                break;

            case R.id.dessert_menu15:
                selectDessertMenu(15);
                break;

            case R.id.dessert_menu16:
                selectDessertMenu(16);
                break;

            case R.id.dessert_menu17:
                selectDessertMenu(17);
                break;

            case R.id.dessert_menu18:
                selectDessertMenu(18);
                break;

            case R.id.dessert_menu19:
                selectDessertMenu(19);
                break;
        }
    }
    public void onClickBtn(View v) {
        switch (v.getId()) {
            case R.id.dessert_apply:
                dialogDessertListener.onApplyClicked(name, price, save_menu, save_checked);
                this.dismiss();
                break;
        }
    }

    public void onClickClose(View v) {
        switch (v.getId()) {
            case R.id.dessert_close_btn:
                this.dismiss();
        }
    }

    public void selectDessertMenu(int idx){
        int dname_id = context.getResources().getIdentifier("dessert_name"+idx, "id", "com.example.s2t_kiosk");
        int dprice_id = context.getResources().getIdentifier("dessert_price"+idx, "id", "com.example.s2t_kiosk");
        dessert_name = (TextView) findViewById(dname_id);
        dessert_price = (TextView) findViewById(dprice_id);
        name = dessert_name.getText().toString();
        price = dessert_price.getText().toString();
        save_menu = context.getResources().getIdentifier("dessert_menu"+idx, "id", "com.example.s2t_kiosk");
        save_menu_layout = (LinearLayout)findViewById(save_menu);
        pre_menu_layout = (LinearLayout)findViewById(pre_menu);
        save_checked = context.getResources().getIdentifier("dessert_check"+idx, "id", "com.example.s2t_kiosk");
        save_menu_checked = findViewById(save_checked);
        pre_menu_checked = findViewById(pre_checked);
        save_menu_checked.setVisibility(View.VISIBLE);
        if(pre_menu != save_menu){
            pre_menu_checked.setVisibility(View.INVISIBLE);
            pre_menu = save_menu;
            pre_checked = save_checked;
        }
    }
}
