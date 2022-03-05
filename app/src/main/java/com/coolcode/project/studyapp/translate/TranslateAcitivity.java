package com.coolcode.project.studyapp.translate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.coolcode.project.studyapp.R;
import com.mannan.translateapi.Language;
import com.mannan.translateapi.TranslateAPI;

public class TranslateAcitivity extends AppCompatActivity {

    EditText inputText;
    ImageView btnToEng, btnToIdn, btnToArab, btnToGer, btnToJpn;
    TextView translatedTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate_acitivity);

        inputText = findViewById(R.id.inputTxt);
        btnToEng = findViewById(R.id.btnTranslatetoEnglish);
        btnToIdn = findViewById(R.id.btnTranslatetoIndo);
        btnToArab = findViewById(R.id.btnTranslatetoArab);
        btnToGer = findViewById(R.id.btnTranslatetoGerman);
        btnToJpn = findViewById(R.id.btnTranslatetoJapan);
        translatedTxt = findViewById(R.id.translateTxt);

        btnToEng.setOnClickListener(new View.OnClickListener() {
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

        btnToIdn.setOnClickListener(new View.OnClickListener() {
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

        btnToArab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TranslateAPI translateAPI = new TranslateAPI(
                        Language.AUTO_DETECT,
                        Language.ARABIC,
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

        btnToGer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TranslateAPI translateAPI = new TranslateAPI(
                        Language.AUTO_DETECT,
                        Language.GERMAN,
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

        btnToJpn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TranslateAPI translateAPI = new TranslateAPI(
                        Language.AUTO_DETECT,
                        Language.JAPANESE,
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