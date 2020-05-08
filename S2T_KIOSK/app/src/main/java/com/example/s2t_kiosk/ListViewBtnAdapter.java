package com.example.s2t_kiosk;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ListViewBtnAdapter extends ArrayAdapter {
    DecimalFormat formatter = new DecimalFormat("###,###");
    // 버튼 클릭 이벤트를 위한 Listener 인터페이스 정의.
    public interface ListBtnClickListener {
        void onListBtnClick(int position) ;
    }

    // 생성자로부터 전달된 resource id 값을 저장.
    int resourceId ;
    // 생성자로부터 전달된 ListBtnClickListener  저장.
    private ListBtnClickListener listBtnClickListener ;
//    int total_int = 0;


    // ListViewBtnAdapter 생성자. 마지막에 ListBtnClickListener 추가.
    ListViewBtnAdapter(Context context, int resource, ArrayList<com.example.s2t_kiosk.ListViewBtnItem> list) {
        super(context, resource, list) ;

        // resource id 값 복사. (super로 전달된 resource를 참조할 방법이 없음.)
        this.resourceId = resource ;

    }

    // 새롭게 만든 Layout을 위한 View를 생성하는 코드
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final int pos = position ;
        final Context context = parent.getContext();

        // 생성자로부터 저장된 resourceId(listview_btn_item)에 해당하는 Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(this.resourceId/*R.layout.listview_btn_item*/, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)로부터 위젯에 대한 참조 획득
        final TextView menu_list = (TextView) convertView.findViewById(R.id.menu_list);
        final TextView menu_cnt = (TextView) convertView.findViewById(R.id.menu_cnt);
        final TextView price_list = (TextView) convertView.findViewById(R.id.price_list);
        final TextView menu_option = (TextView) convertView.findViewById(R.id.menu_option);

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        final com.example.s2t_kiosk.ListViewBtnItem listViewItem = (com.example.s2t_kiosk.ListViewBtnItem) getItem(position);

//        formatter.format(t_price)+"원"
        // 아이템 내 각 위젯에 데이터 반영
        ArrayList<com.example.s2t_kiosk.ListViewBtnItem> items = MainActivity.getList();
        listViewItem.setPrice(""+formatter.format(listViewItem.real_price_list)+"원");
        menu_list.setText(listViewItem.getMenu());
        menu_cnt.setText(listViewItem.getNumber());
        price_list.setText(listViewItem.getPrice());
        String dessert_str ;
        String drink_str ;
        String topping_str = "";


//        LinearLayout item_sub = (LinearLayout) convertView.findViewById(R.id.item_sub);
        if(items.get(position).cat_list.equals("세트")){
            dessert_str = "  _ " + items.get(position).getDessert();
            drink_str = ",  " + items.get(position).getDrink();
            if(!items.get(position).isEmptyTopping(items.get(position).getTopping())){
                int[] topping_list = items.get(position).getTopping();
                topping_str = ", ";
                for(int i=0;i<topping_list.length;i++){
                    if(items.get(position).getTopping()[i] != 0){
                        if(i == items.get(position).firstTopping(items.get(position).getTopping())) {
                            if (i == 0)
                                topping_str += "베이컨";
                            else if (i == 1)
                                topping_str += "토마토";
                            else if (i == 2)
                                topping_str += "엘치즈";
                            else
                                topping_str += "비프패티";
                        }
                        else {
                            if(i == 1)
                                topping_str += ", " + "토마토";
                            else if(i == 2)
                                topping_str += ", " + "엘치즈";
                            else
                                topping_str += ", " + "비프패티";
                        }
                    }
                }
            }
            items.get(position).setOptionText(menu_option, dessert_str + drink_str + topping_str);
//            items.get(position).visibleLayout(item_sub);
        }
        else if(items.get(position).cat_list.equals("버거")) {
            if (!items.get(position).isEmptyTopping(items.get(position).getTopping())) {
                int[] topping_list = items.get(position).getTopping();
                topping_str = "  _ ";
                for (int i = 0; i < topping_list.length; i++) {
                    if (items.get(position).getTopping()[i] != 0) {
                        if (i == items.get(position).firstTopping(items.get(position).getTopping())) {
                            if (i == 0)
                                topping_str += "베이컨" ;
                            else if (i == 1)
                                topping_str += "토마토" ;
                            else if (i == 2)
                                topping_str += "엘치즈" ;
                            else
                                topping_str += "비프패티" ;
                        } else {
                            if (i == 1)
                                topping_str += ", " + "토마토" ;
                            else if (i == 2)
                                topping_str += ", " + "엘치즈" ;
                            else
                                topping_str += ", " + "비프패티" ;
                        }
                    }
                }
                items.get(position).setOptionText(menu_option, topping_str);
//                items.get(position).visibleLayout(item_sub);
            }
            else{
                items.get(position).setOptionText(menu_option, "");
            }
        }
        else{
            items.get(position).setOptionText(menu_option, "");
        }
//            items.get(position).goneLayout(item_sub);

        // button1 클릭 시 TextView(textView1)의 내용 변경.
//        ImageView minus_btn = (ImageView) convertView.findViewById(R.id.minus_btn);
//        minus_btn.setOnClickListener(new Button.OnClickListener() {
//            public void onClick(View v) {
//                ArrayList<com.example.s2t_kiosk.ListViewBtnItem> items = MainActivity.getList();
//                int temp = Integer.parseInt(menu_cnt.getText().toString());
//                if(temp > 1){
//                    menu_cnt.setText(Integer.toString(temp-1));
//                    items.get(position).setNumber(Integer.toString(temp-1));
//                    notifyDataSetChanged();
//                }
//                else{
//
//                }
//            }
//        });
//
//        // button2의 TAG에 position값 지정. Adapter를 click listener로 지정.
//        ImageView plus_btn = (ImageView) convertView.findViewById(R.id.plus_btn);
//        plus_btn.setOnClickListener(new Button.OnClickListener() {
//            public void onClick(View v) {
//                ArrayList<com.example.s2t_kiosk.ListViewBtnItem> items = MainActivity.getList();
//                int temp = Integer.parseInt(menu_cnt.getText().toString());
//                menu_cnt.setText(Integer.toString(temp+1));
//                items.get(position).setNumber(Integer.toString(temp+1));
//                notifyDataSetChanged();
//
//            }
//        });

        ImageView delete_btn = (ImageView) convertView.findViewById(R.id.delete_btn);
        delete_btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                ArrayList<com.example.s2t_kiosk.ListViewBtnItem> items = MainActivity.getList();
                items.remove(position);
                MainActivity.setList(items);
                if(items.isEmpty()){
                    MainActivity.setTotalPrice(0);
                }
                notifyDataSetChanged();
            }
        });

        int total_int = 0;
        int total_cnt = 0;
        for(int i=0;i<items.size();i++){
            total_int += items.get(i).real_price_list * Integer.parseInt(items.get(i).getNumber());
            total_cnt += Integer.parseInt(items.get(i).getNumber());
        }

        MainActivity.setTotalPrice(total_int);
        MainActivity.setTotalCnt(total_cnt);

        return convertView;
    }
}