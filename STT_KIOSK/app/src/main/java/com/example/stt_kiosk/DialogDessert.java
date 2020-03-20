package com.example.stt_kiosk;

        import android.app.Dialog;
        import android.content.Context;
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
    LinearLayout dessert_menu;

    private Context context;
    DialogDessert m_oDialog;

    private DialogDessertListener dialogDessertListener;

    public DialogDessert(Context context) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        this.context = context;
    }
    interface DialogDessertListener{
        void onApplyClicked(String name, String price);
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
        dessert_menu = (LinearLayout)this.findViewById(R.id.dessert_menu1);
        oBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onClickBtn(v);
            }
        });
        dessert_menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                itemClicked(v);
            }
        });

    }
    public void itemClicked(View v){
        switch (v.getId()){
            case R.id.dessert_menu1:
                dessert_name = (TextView) findViewById(R.id.dessert_name1);
                dessert_price = (TextView) findViewById(R.id.dessert_price1);
                name = dessert_name.getText().toString();
                price = dessert_price.getText().toString();
                break;

        }
    }
    public void onClickBtn(View _oView) {
        switch (_oView.getId()){
            case R.id.dessert_apply:
                dialogDessertListener.onApplyClicked(name, price);
                this.dismiss();
                break;
        }
//        this.dismiss();
    }

}
