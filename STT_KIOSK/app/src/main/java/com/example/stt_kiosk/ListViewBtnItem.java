package com.example.stt_kiosk;

public class ListViewBtnItem {
    private String menu_list;
    private String number_list;
    private String price_list;

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
}
