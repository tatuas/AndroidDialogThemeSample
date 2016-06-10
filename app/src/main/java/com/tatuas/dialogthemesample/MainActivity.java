package com.tatuas.dialogthemesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private Button launch;
    private CheckBox enableDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launch = (Button) findViewById(R.id.launch);
        enableDialog = (CheckBox) findViewById(R.id.enable_dialog);

        launch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(InputActivity.createIntent(MainActivity.this, enableDialog.isChecked()));
            }
        });
    }
}
