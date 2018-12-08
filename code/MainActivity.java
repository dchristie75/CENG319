package com.example.dave.popupmenu_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnShow);
        btn.setOnClickListener(new View.OnClickListener() {    //set a onclick listener on the button
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, v);  //create a popup menu object to instantiate the Popup constructor
                popupMenu.setOnMenuItemClickListener(MainActivity.this);  //set the onclick listener to to be initiated in the main activity
                popupMenu.inflate(R.menu.menu);  //use menuInflater to load the popup menu resource
                popupMenu.show();  //display the menu
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {             //this method is called when the button is clicked
        Toast.makeText(this, "You selected: " +     //Toast message to indicate which button is clicked
                item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()){                              //switch case for the individual menu items
            case R.id.features_item:
                return true;
            case R.id.customize_item:
                return true;
            case R.id.help_item:
                return true;
            case R.id.about_item:
                return true;
            case R.id.share_item:
                return true;
            case R.id.contact_item:
                return true;
            default:
                return false;
        }
    }
}
