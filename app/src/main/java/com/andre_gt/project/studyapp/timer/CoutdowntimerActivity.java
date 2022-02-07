package com.andre_gt.project.studyapp.timer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.andre_gt.project.studyapp.R;

public class CoutdowntimerActivity extends AppCompatActivity {

    private EditText timeEt;
    private Button startBtn;
    private boolean started;
    private ImageView loading;
    private CountDownTimer countDownTimer;
    private static final Handler HANDLER = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coutdowntimer);
        timeEt = findViewById(R.id.timeEt);
        startBtn = findViewById(R.id.startBtn);
        loading = findViewById(R.id.loading);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (started) {
                    started = false;
                    startBtn.setText(R.string.start);
                    timeEt.setCursorVisible(true);
                    loading.setVisibility(View.GONE);
                    countDownTimer.cancel();
                } else {
                    started = true;
                    startBtn.setText(R.string.stop);
                    timeEt.setCursorVisible(false);
                    loading.setVisibility(View.VISIBLE);

                    String rawTime = timeEt.getText().toString();
                    String[] tmp = rawTime.split(":");

                    long time = 60 * 1000;

                    try {
                        time = (Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1])) * 1000;
                    } catch (Exception e) {
                        timeEt.setText(R.string.default_time);
                    }

                    countDownTimer = new CountDownTimer(time, 100) {
                        @Override
                        public void onTick(long millisUntilFinished) {

                            long remainingSeconds = millisUntilFinished / 1000;
                            long min = remainingSeconds / 60;
                            long seconds = remainingSeconds % 60;

                            timeEt.setText(min + ":" + (seconds < 10 ? "0" + seconds : seconds));
                        }

                        @Override
                        public void onFinish() {

                            timeEt.setText(R.string.start_time);
                            startBtn.setText(R.string.start);

                            new AlertDialog.Builder(CoutdowntimerActivity.this).
                                    setTitle(R.string.app_name).
                                    setMessage(R.string.lets_eat).
                                    show();

                            HANDLER.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    timeEt.setText(R.string.default_time);
                                }
                            }, 1500);
                        }
                    };

                    countDownTimer.start();

                }
            }
        });
    }
}