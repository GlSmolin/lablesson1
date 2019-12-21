package ru.mirea.pozhidaev.lablesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Textview;
    Button btnOK;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        View.OnClickListener oclBtnOK = new View.OnClickListener(){
            public void onClick(View v){
                Textview.setText("Нажата кнопка ОК");
            }
        };

        View.OnClickListener oclBtnCancel = new View.OnClickListener(){
            public void onClick(View v){
                Textview.setText("Нажата кнопка Cancel");
            }
        };

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_buttons);

        Textview = findViewById(R.id.Textview);
        btnOK = findViewById(R.id.btnOK);
        btnCancel = findViewById(R.id.btnCancel);
        btnOK.setOnClickListener(oclBtnOK);
        btnCancel.setOnClickListener(oclBtnCancel);
    }
}
