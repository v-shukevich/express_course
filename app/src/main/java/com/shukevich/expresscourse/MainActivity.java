package com.shukevich.expresscourse;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private EditText mInputEditText;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button);
        mInputEditText = findViewById(R.id.editText);
        mInfoTextView = findViewById(R.id.textView);
    }
    final String TAG = "ExpressCourse";



    public void onClick(View view) {
        //String result = mInputEditText.getText().toString();
        //mInfoTextView.setText(result);
        //mInputEditText.setText("");


    }
}