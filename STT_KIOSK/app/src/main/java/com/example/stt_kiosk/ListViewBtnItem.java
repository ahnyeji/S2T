package com.example.stt_kiosk;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.stt_kiosk.PopupActivity.dessert_name;
import static com.example.stt_kiosk.PopupActivity.drink_name;
import static com.example.stt_kiosk.PopupActivity.topping_name;
import static com.example.stt_kiosk.PopupActivity.total_int;
import static com.example.stt_kiosk.PopupActivity.total_price;
import static com.example.stt_kiosk.PopupActivity.cat;

public class ListViewBtnItem {
    private String menu_list;
    private String number_list;
    private String price_list = total_price.getText().toString();
    private String dessert_list = dessert_name.getText().toString();
    private String drink_list = drink_name.getText().toString();
    private String topping_list = topping_name.getText().toString().replace("\n", " / ");
    public String cat_list = cat;
    public int real_price_list = total_int;

    public void setMenu(String text){
        menu_list = text;
    }

    public void setNumber(String text){
        number_list = text;
    }

    public void setPrice(String text){
        price_list = text;
    }



    public String getMenu(){
        return this.menu_list;
    }

    public String getNumber(){
        return this.number_list;
    }

    public String getPrice(){
        return this.price_list;
    }

    public String getDessert(){
        return this.dessert_list;
    }
    public String getDrink(){
        return this.drink_list;
    }
    public String getTopping() { return this.topping_list; }

    public void goneLayout(LinearLayout l){
        l.setVisibility(View.GONE);
    }
    public void visibleLayout(LinearLayout l){
        l.setVisibility(View.VISIBLE);
    }

    public void setOptionText(TextView t, String s){
        t.setText(s);
    }
}
