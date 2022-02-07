package com.andre_gt.project.studyapp.translate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.andre_gt.project.studyapp.R;
import com.mannan.translateapi.Language;
import com.mannan.translateapi.TranslateAPI;

public class TranslateAcitivity extends AppCompatActivity {

    EditText inputText;
    Button btnTranslate, btnTrans1;
    TextView translatedTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate_acitivity);

        inputText = findViewById(R.id.inputTxt);
        btnTranslate = findViewById(R.id.btnTranslate);
        btnTrans1 = findViewById(R.id.btnTranslate1);
        translatedTxt = findViewById(R.id.translateTxt);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TranslateAPI translateAPI = new TranslateAPI(
                        Language.AUTO_DETECT,
                        Language.ENGLISH,
                        inputText.getText().toString()
                );
                translateAPI.setTranslateListener(new TranslateAPI.TranslateListener() {
                    @Override
                    public void onSuccess(String translatedText) {
                        translatedTxt.setText(translatedText);
                    }

                    @Override
                    public void onFailure(String ErrorText) {
                        Log.d("Error", ErrorText);
                    }
                });
            }
        });

        btnTrans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TranslateAPI translateAPI = new TranslateAPI(
                        Language.AUTO_DETECT,
                        Language.INDONESIAN,
                        inputText.getText().toString()
                );
                translateAPI.setTranslateListener(new TranslateAPI.TranslateListener() {
                    @Override
                    public void onSuccess(String translatedText) {
                        translatedTxt.setText(translatedText);
                    }

                    @Override
                    public void onFailure(String ErrorText) {
                        Log.d("Error", ErrorText);
                    }
                });
            }
        });
    }
}