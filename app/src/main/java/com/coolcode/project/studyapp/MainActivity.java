package com.coolcode.project.studyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.coolcode.project.studyapp.note.activities.NoteActivity;
import com.coolcode.project.studyapp.timer.CoutdowntimerActivity;
import com.coolcode.project.studyapp.translate.TranslateAcitivity;

public class MainActivity extends AppCompatActivity {

    //Button btnTimer, btnTodo, btnNote;
    CardView cdTodo, cdTodo1, cdNotes, cdNotes1, cdTimer, cdTimer1, cdTools, cdTools1;
    ImageButton btnmode1, btnmode2;
    LinearLayout modelinier, modekotak;

//    private int designWidth = 375;
//    private int designHeight = 800 ;
//    private int dpWidth;
//    private int dpHeight;
//    private float dDensity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cdTodo = findViewById(R.id.cdTodo);
        cdNotes = findViewById(R.id.cdNote);
        cdTimer = findViewById(R.id.cdTimer);
        cdTools = findViewById(R.id.cdNone);

        cdTodo1 = findViewById(R.id.cdTodo_kotak);
        cdNotes1 = findViewById(R.id.cdNote_kotak);
        cdTimer1 = findViewById(R.id.cdTimer_kotak);
        cdTools1 = findViewById(R.id.cdNone_kotak);

        btnmode1 = findViewById(R.id.modesatu);
        btnmode2 = findViewById(R.id.modedua);

        modelinier = findViewById(R.id.mode_linier);
        modekotak = findViewById(R.id.mode_kotak);

//        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
//
//        dpHeight = (displayMetrics.heightPixels);
//        dpWidth = (displayMetrics.widthPixels);
//        dDensity = (displayMetrics.scaledDensity);

        btnmode1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                modelinier.setVisibility(View.VISIBLE);
                modekotak.setVisibility(View.GONE);
            }
        });

        btnmode2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                modekotak.setVisibility(View.VISIBLE);
                modelinier.setVisibility(View.GONE);
            }
        });

        cdTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CoutdowntimerActivity.class);
                startActivity(intent);
            }
        });

        cdTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.coolcode.project.studyapp.todo.TodoActivity.class);
                startActivity(intent);
            }
        });

        cdNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NoteActivity.class);
                startActivity(intent);
            }
        });

        cdTools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TranslateAcitivity.class);
                startActivity(intent);
            }
        });

        cdTimer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CoutdowntimerActivity.class);
                startActivity(intent);
            }
        });

        cdTodo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.coolcode.project.studyapp.todo.TodoActivity.class);
                startActivity(intent);
            }
        });

        cdNotes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NoteActivity.class);
                startActivity(intent);
            }
        });

        cdTools1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TranslateAcitivity.class);
                startActivity(intent);
            }
        });
    }
//
//    public int calcHeight(float value){
//        return (int) (dpHeight * (value/designHeight));
//    }
//
//    public int calcWidth(float value){
//        return (int) (dpWidth * (value/designWidth));
//    }
}