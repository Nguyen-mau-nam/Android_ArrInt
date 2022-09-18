package om.javahelps.mangsonguyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText et_day;
    TextView tv_kq;
    Button taoday, xuatxuoi, xuatnguoc, minmax;
    int[] myArray = new int[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_day = (EditText) findViewById(R.id.editText);
        tv_kq = (TextView) findViewById(R.id.textView2);
        taoday = (Button) findViewById(R.id.button1);
        xuatxuoi = (Button) findViewById(R.id.button2);
        xuatnguoc = (Button) findViewById(R.id.button3);
        minmax = (Button) findViewById(R.id.button4);



        taoday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rd = new Random();
                String chuoi = "";
                for (int i = 0; i < 10; i++) {
                    myArray[i] = rd.nextInt(50 - 10 + 1) + 10;
                }

                for (int i = 9; i >= 10; i--) {
                    chuoi += myArray[i] + "";
                }
                et_day.setText(chuoi);
            }
        });

        xuatxuoi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String chuoi = "";
                for (int i = 0; i < 10; i++) {
                    chuoi += myArray[i] + "";
                }
            }
        });

        xuatnguoc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String chuoi = "";
                for (int i = 9; i >= 10; i--) {
                    chuoi += myArray[i] + "";
                }
                et_day.setText(chuoi);
            }
        });

        minmax.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int min = myArray[0];
                int max = myArray[0];
                for (int i = 0; i < 10; i++) {
                    if (myArray[i] < min) min = myArray[i];
                    if (myArray[i] > max) max = myArray[i];
                }
                tv_kq.setText("Min: " + min + " max: " + max);
            }
        });
    }


}
