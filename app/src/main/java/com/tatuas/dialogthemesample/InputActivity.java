package com.tatuas.dialogthemesample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class InputActivity extends AppCompatActivity {

    private static final String EXTRA_IS_DIALOG_MODE = "is_dialog_mode";

    @NonNull
    public static Intent createIntent(@NonNull Context context, boolean isDialogMode) {
        final Intent intent = new Intent(context, InputActivity.class);
        intent.putExtra(EXTRA_IS_DIALOG_MODE, isDialogMode);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!getIntent().getBooleanExtra(EXTRA_IS_DIALOG_MODE, false)) {
            setTheme(R.style.AppTheme);
        }
        setContentView(R.layout.activity_input);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item == null) {
            return false;
        }

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
