package com.example.stt_kiosk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class DialogTopping extends Dialog {

    TextView num1 = null;
    TextView number1 = null;
    Button btn_up1 = null;
    Button btn_down1 = null;

    TextView num2 = null;
    TextView number2 = null;
    Button btn_up2 = null;
    Button btn_down2 = null;

    TextView num3 = null;
    TextView number3 = null;
    Button btn_up3 = null;
    Button btn_down3 = null;

    TextView num4 = null;
    TextView number4 = null;
    Button btn_up4 = null;
    Button btn_down4 = null;

    TextView total_plus = null;
    int total = 0;

    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;

    DialogTopping m_oDialog;
    public DialogTopping(Context context) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow.dimAmount = 0.5f;
        lpWindow.width = 580;
        lpWindow.height = 1000;
        getWindow().setAttributes(lpWindow);

        setContentView(R.layout.dialog_topping);

        m_oDialog = this;

        ImageButton oBtn = (ImageButton)this.findViewById(R.id.close_btn);
        oBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onClickBtn(v);
            }
        });

        setup();
    }
    public void onClickBtn(View _oView) {
        this.dismiss();
    }

    private void setup()
    {
        btn_up1 = (Button) findViewById(R.id.plus_bacon);
        btn_down1 = (Button) findViewById(R.id.minus_bacon);
        num1 = (TextView)findViewById(R.id.num_bacon);
        number1 = (TextView)findViewById(R.id.number_bacon);

        btn_up2 = (Button) findViewById(R.id.plus_tomato);
        btn_down2 = (Button) findViewById(R.id.minus_tomato);
        num2 = (TextView)findViewById(R.id.num_tomato);
        number2 = (TextView)findViewById(R.id.number_tomato);

        btn_up3 = (Button) findViewById(R.id.plus_cheese);
        btn_down3 = (Button) findViewById(R.id.minus_cheese);
        num3 = (TextView)findViewById(R.id.num_cheese);
        number3 = (TextView)findViewById(R.id.number_cheese);

        btn_up4 = (Button) findViewById(R.id.plus_beef);
        btn_down4 = (Button) findViewById(R.id.minus_beef);
        num4 = (TextView)findViewById(R.id.num_beef);
        number4 = (TextView)findViewById(R.id.number_beef);

        total_plus = (TextView)findViewById((R.id.plus_price));

        btn_up1.setOnClickListener(listener);
        btn_down1.setOnClickListener(listener);

        btn_up2.setOnClickListener(listener);
        btn_down2.setOnClickListener(listener);

        btn_up3.setOnClickListener(listener);
        btn_down3.setOnClickListener(listener);

        btn_up4.setOnClickListener(listener);
        btn_down4.setOnClickListener(listener);
    }
    View.OnClickListener listener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            int temp1 = Integer.parseInt(num1.getText().toString());
            int temp2 = Integer.parseInt(num2.getText().toString());
            int temp3 = Integer.parseInt(num3.getText().toString());
            int temp4 = Integer.parseInt(num4.getText().toString());
            switch (v.getId())
            {
                case R.id.plus_bacon :
                    count1++;
                    num1.setText(""+count1);
                    number1.setText(""+count1);
                    break;
                case R.id.minus_bacon :
                    if(temp1 > 0){
                        count1--;
                        num1.setText(""+count1);
                        number1.setText(""+count1);
                    }
                    break;
                case R.id.plus_tomato :
                    count2++;
                    num2.setText(""+count2);
                    number2.setText(""+count2);
                    break;
                case R.id.minus_tomato :
                    if(temp2 > 0){
                        count2--;
                        num2.setText(""+count2);
                        number2.setText(""+count2);
                    }
                    break;
                case R.id.plus_cheese :
                    count3++;
                    num3.setText(""+count3);
                    number3.setText(""+count3);
                    break;
                case R.id.minus_cheese :
                    if(temp3 > 0) {
                        count3--;
                        num3.setText("" + count3);
                        number3.setText("" + count3);
                    }
                    break;
                case R.id.plus_beef :
                    count4++;
                    num4.setText(""+count4);
                    number4.setText(""+count4);
                    break;
                case R.id.minus_beef :
                    if(temp4 > 0) {
                        count4--;
                        num4.setText("" + count4);
                        number4.setText("" + count4);
                    }
                    break;
            }
            temp1 = Integer.parseInt(num1.getText().toString());
            temp2 = Integer.parseInt(num2.getText().toString());
            temp3 = Integer.parseInt(num3.getText().toString());
            temp4 = Integer.parseInt(num4.getText().toString());
            total = temp1*500 + temp2*300 + temp3*300 + temp4*1200;
            DecimalFormat formatter = new DecimalFormat("###,###");
            total_plus.setText(formatter.format(total));
        }
    };
}

