package com.example.homework2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button click;
    TextView result;
    EditText firstEdit;
    EditText secondEdit;
    EditText thirdEdit;
    String S;
    double one, two, third, equals;
    private static final String FIRST = "FIRST";
    private static final String SECOND = "SECOND";
    private static final String PLACE = "PLACE";
    private static final String RESULT = "RESULT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = findViewById(R.id.click);
        result = findViewById(R.id.result);
        firstEdit = findViewById(R.id.first);
        secondEdit = findViewById(R.id.second);
        thirdEdit = findViewById(R.id.third);
    }

    public void resultClick(View view) {
        String s1 = firstEdit.getText().toString();
        String s2 = secondEdit.getText().toString();
        String s3 = thirdEdit.getText().toString();
        one = Double.parseDouble(s1);
        two = Double.parseDouble(s2);
        third = Double.parseDouble(s3);
        equals=one+ two +third;

        S = Double.toString(equals);
        result.setText(S);

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            S = savedInstanceState.getString(RESULT);
            result.setText(S);
        }

        }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if(S != null){
            outState.putString(RESULT,S);
    }
}



}