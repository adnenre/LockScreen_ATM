package com.invitation.hp.lockatm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class lock extends Activity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lock_activity);


      }
    public void reload(View view) {

    }
    public void onPause(){
        super.onPause();
      //  Intent intent = new Intent(this, lock.class);
     // startActivity(intent);

    }



    public void onDestroy(){
        super.onDestroy();

    }

}

