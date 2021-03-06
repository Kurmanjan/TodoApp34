package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.todoapp.ui.slideshow.SlideshowFragment;

public class SizeActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton size_14, size_22, size_28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);

        radioGroup = findViewById(R.id.radioGroup1);
        size_14 = findViewById(R.id.size_14);
        size_22 = findViewById(R.id.size_22);
        size_28 = findViewById(R.id.size_28);
    }

    public void onRadioClick(View view) {
        Intent intent = new Intent();

        switch (view.getId()) {
            case R.id.size_14:
                intent.putExtra(SlideshowFragment.EXTRA_KEY_TEST, 14);
                break;
            case R.id.size_22:
                intent.putExtra(SlideshowFragment.EXTRA_KEY_TEST, 22);
                break;
            case R.id.size_28:
                intent.putExtra(SlideshowFragment.EXTRA_KEY_TEST, 28);
                break;
            default:
                break;
        }
        setResult(RESULT_OK, intent);
        finish();
    }
}


