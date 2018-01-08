package com.cyw.a2018010804baseadaptor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView lv1;
    String[] str={"a","b","c","d","e","f"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1=(ListView)findViewById(R.id.listView);
        Myadaptor adapter=new Myadaptor();
        lv1.setAdapter(adapter);
    }
    //BaseAdapter是一個抽象類別
    class Myadaptor extends BaseAdapter
    {

        @Override
        public int getCount() {
            return str.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }
//自建layout
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater inflater=LayoutInflater.from(MainActivity.this);
            View v=inflater.inflate(R.layout.myitem,null);
            TextView tv=v.findViewById(R.id.textView);
            tv.setText(str[i]);
            return v;
        }
/*用Android的layout
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView tv=new TextView();
            tv.setText(str[i]);
            return tv;
        }

*/
    }
}
