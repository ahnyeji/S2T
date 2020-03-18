package com.example.stt_kiosk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewBtnAdapter extends ArrayAdapter {
    // 버튼 클릭 이벤트를 위한 Listener 인터페이스 정의.
    public interface ListBtnClickListener {
        void onListBtnClick(int position) ;
    }

    // 생성자로부터 전달된 resource id 값을 저장.
    int resourceId ;
    // 생성자로부터 전달된 ListBtnClickListener  저장.
    private ListBtnClickListener listBtnClickListener ;


    // ListViewBtnAdapter 생성자. 마지막에 ListBtnClickListener 추가.
    ListViewBtnAdapter(Context context, int resource, ArrayList<ListViewBtnItem> list, MainActivity clickListener) {
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
        final TextView number_list = (TextView) convertView.findViewById(R.id.number_list);
        final TextView price_list = (TextView) convertView.findViewById(R.id.price_list);

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        final ListViewBtnItem listViewItem = (ListViewBtnItem) getItem(position);

        // 아이템 내 각 위젯에 데이터 반영
        menu_list.setText(listViewItem.getMenu());
        number_list.setText(listViewItem.getNumber());
        price_list.setText(listViewItem.getPrice());

        // button1 클릭 시 TextView(textView1)의 내용 변경.
        Button minus_btn = (Button) convertView.findViewById(R.id.minus_btn);
        minus_btn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int temp = Integer.parseInt(number_list.getText().toString());
                if(temp > 1){
                    number_list.setText(Integer.toString(temp-1));
                }
                else{

                }
            }
        });

        // button2의 TAG에 position값 지정. Adapter를 click listener로 지정.
        Button plus_btn = (Button) convertView.findViewById(R.id.plus_btn);
        plus_btn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int temp = Integer.parseInt(number_list.getText().toString());
                number_list.setText(Integer.toString(temp+1));
            }
        });

        Button cancel_btn = (Button) convertView.findViewById(R.id.delete_btn);
        cancel_btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                ArrayList<ListViewBtnItem> items = MainActivity.getList();
                items.remove(position);
                MainActivity.setList(items);
                notifyDataSetChanged();
            }
        });

        return convertView;
    }
}