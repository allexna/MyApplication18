package com.example.myapplication18;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.widget.TextView;
import android.view.MenuItem;
import android.support.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        TextView textView=findViewById(R.id.textView);
        ImageView imageView=findViewById(R.id.imageView);
        button.setOnClickListener(viewClickListener);
        textView.setOnClickListener(viewClickListener);
        imageView.setOnClickListener(viewClickListener);
    }
    View.OnClickListener viewClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showPopupmenu(v);

        }
    };
    private void showPopupmenu(View view){
        PopupMenu popupMenu=new PopupMenu(this,view);
        popupMenu.inflate(R.menu.popupmenu);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu1:
                        Toast.makeText(getApplicationContext(), "вы выбрали меню 1", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu2:
                        Toast.makeText(getApplicationContext(), "вы выбрали меню 2", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu3:
                        Toast.makeText(getApplicationContext(), "вы выбрали меню 3", Toast.LENGTH_SHORT).show();
                        return true;
                    default: return false;
                }

            }
        });
    }
    //public void onClick(View view){

    //}
}
