package org.eclipse.paho.android.service.sample;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rs232 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rs232);

        ((Button) findViewById(R.id.SetingRs232)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //showFileChooser();
                //showDialog(openfileDialogId);
            }
        });

    }
}
