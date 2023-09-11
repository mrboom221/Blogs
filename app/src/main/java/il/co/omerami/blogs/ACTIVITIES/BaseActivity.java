package il.co.omerami.blogs.ACTIVITIES;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import il.co.omerami.blogs.R;

abstract public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    protected abstract void initializeViews();
    protected abstract void setListeners();
}
