package com.invitation.hp.lockatm;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by hp on 01/07/2016.
 */
public class theme extends Activity {

    String[] colorArray = {"Green","red","blue","pink","yellow","orange"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.theme_acvitity);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.color_view,  colorArray);

        ListView listView = (ListView) findViewById(R.id.color_list);
        
        listView.setAdapter(adapter);

    }

    protected void onPause() {
        super.onPause();

    }
    protected void onDestroy() {
        super.onDestroy();

    }
}
