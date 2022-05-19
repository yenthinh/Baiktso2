package com.example.baiktso2_nguyenyenthinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView namam;
    EditText namduong;
    Button button;
    String can;
    String chi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        namduong=findViewById(R.id.namduong);
        namam=findViewById(R.id.namam);
        namduong.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                String dulieu=namduong.getText().toString();
                int nam= Integer.parseInt(dulieu);
                button.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        switch (nam % 10) {
                            case 0:
                                can="Canh";
                                break;
                            case 1:
                                can = "Tân";
                                break;
                            case 2:
                                can = "Nhâm";
                                break;
                            case 3:
                                can = "Quý";
                                break;
                            case 4:
                                can = "Giáp";
                                break;
                            case 5:
                                can = "Ất";
                                break;
                            case 6:
                                can = "Bính";
                                break;
                            case 7:
                                can = "Đinh";
                                break;
                            case 8:
                                can = "Mậu";
                                break;
                            case 9:
                                can = "Kỷ";
                                break;
                        }

                        // Xác định Chi
                        switch (nam % 12) {
                            case 0:
                                chi = "Thân";
                                break;
                            case 1:
                                chi = "Dậu";
                                break;
                            case 2:
                                chi = "Tuất";
                                break;
                            case 3:
                                chi = "Hợi";
                                break;
                            case 4:
                                chi = "Tý";
                                break;
                            case 5:
                                chi = "Sửu";
                                break;
                            case 6:
                                chi = "Dần";
                                break;
                            case 7:
                                chi = "Mẹo";
                                break;
                            case 8:
                                chi = "Thìn";
                                break;
                            case 9:
                                chi = "Tỵ";
                                break;
                            case 10:
                                chi = "Ngọ";
                                break;
                            case 11:
                                chi = "Mùi";
                                break;
                        }
                        namam.setText(can+" "+chi);

                    }
                });
                return false;
            }
        });
    }
}
