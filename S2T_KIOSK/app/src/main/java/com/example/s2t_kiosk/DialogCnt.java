package com.example.s2t_kiosk;

import android.app.Dialog;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DialogCnt extends Dialog {
    int width;
    int height;
    Context m_context;

    DialogCnt m_oDialog;
    public DialogCnt(Context context) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        m_context = context;
    }
    private DialogCntListener dialogCntListener;
    interface DialogCntListener{
        void onApplyClicked(int checked);
//        void onNagativeClicked();
    }
    public void setCntListener(DialogCntListener dialogCntListener){
        this.dialogCntListener = dialogCntListener;
    }
    int save_cnt = com.example.s2t_kiosk.ListViewBtnAdapter.getCnt();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        DisplayMetrics dm = m_context.getApplicationContext().getResources().getDisplayMetrics();
        width = (int) (dm.widthPixels * 0.6); // Display 사이즈의 90%
        height = (int) (dm.heightPixels * 0.25); // Display 사이즈의 90%
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow.dimAmount = 0.7f;
        lpWindow.width = width;
        lpWindow.height = height;
        getWindow().setAttributes(lpWindow);

//        DisplayMetrics dm = m_context.getApplicationContext().getResources().getDisplayMetrics();
//        width = (int) (dm.widthPixels * 0.7); // Display 사이즈의 90%
//        height = (int) (dm.heightPixels * 0.55); // Display 사이즈의 90%
//        getWindow().getAttributes().width = width;
//        getWindow().getAttributes().height = height;
//        getWindow().setBackgroundDrawableResource(R.drawable.white_radius);

        setContentView(R.layout.dialog_cnt);
        ImageView plus_btn = (ImageView) findViewById(R.id.plus_cnt);
        ImageView minus_btn = (ImageView) findViewById(R.id.minus_cnt);
        Button ok_cnt = (Button) findViewById(R.id.ok_cnt);
        Button cancle_cnt = (Button) findViewById(R.id.cancel_cnt);
        TextView cnt_menu = (TextView) findViewById(R.id.cnt_menu);
        TextView menu_cnt = (TextView) findViewById(R.id.menu_cnt);
        cnt_menu.setText(Integer.toString(save_cnt));
        m_oDialog = this;

//         button1 클릭 시 TextView(textView1)의 내용 변경.
        minus_btn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if(save_cnt > 1){
                    save_cnt -= 1;
                    cnt_menu.setText(Integer.toString(save_cnt));
                }
                else{

                }
            }
        });

        plus_btn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                save_cnt += 1;
                cnt_menu.setText(Integer.toString(save_cnt));

            }
        });

        ok_cnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onClickBtn(v);
            }
        });
        cancle_cnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onClickBtn(v);
            }
        });
    }
    public void onClickBtn(View _oView) {
        switch(_oView.getId()){
            case R.id.ok_cnt :
                dialogCntListener.onApplyClicked(save_cnt);
                this.dismiss();
                break;
            case R.id.cancel_cnt :
                this.dismiss();
        }
    }

}