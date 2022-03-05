package com.coolcode.project.studyapp.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.coolcode.project.studyapp.R;

public class ActivityDetailTodo extends AppCompatActivity {

    TextView judul, tanggal, waktu, hapustodo;
    ImageButton kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_todo);

        judul = findViewById(R.id.juduldetail);
        tanggal = findViewById(R.id.tanggaldetail);
        waktu = findViewById(R.id.waktudetail);

        kembali = findViewById(R.id.backtotodoactivity);

        hapustodo = findViewById(R.id.hapus_todo);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetailTodo.this, TodoActivity.class);
                startActivity(intent);
                finish();
            }
        });

        hapustodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetailTodo.this, TodoActivity.class);
                startActivity(intent);
                finish();
            }
        });

        String judul1 = getIntent().getStringExtra("Judul");
        String tanggal1 = getIntent().getStringExtra("Tanggal");
        String waktu1 = getIntent().getStringExtra("Waktu");

        judul.setText(judul1);
        tanggal.setText(tanggal1);
        waktu.setText(waktu1);
    }

}