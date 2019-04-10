package com.example.tutorial4_options_menu;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         mToolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

    }// End of MainActivity onCreate

    @Override
    //create options menu by overriding onCreateOptionsMenu and inflating the menu file that we created earlier
    //method that create the items (from the my_menu) on the Toolbar
    public boolean onCreateOptionsMenu(Menu menu) {

        // next will be inflate the menu file (my_menu.xml) that have the search icon,
        // so that we can have access to the search menu item
        MenuInflater mMenuInflater= getMenuInflater();
        mMenuInflater.inflate(R.menu.my_menu, menu);

        return true;
    }

    @Override
    //method that define what to de when the item have been clicked by the user
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()== R.id.action_setting){

            Toast.makeText(MainActivity.this,
                            getString(R.string.Toast_setting_message),
                            Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId()== R.id.action_about_us){

            Toast.makeText(MainActivity.this,
                    "You have clicked on the About us action menu",
                    Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId()== R.id.Help){

            Toast.makeText(MainActivity.this,
                    "You have clicked on the Help action menu",
                    Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);


    }
}
