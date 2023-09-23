package com.example.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView  tv1;
    private Button btn1;
    private int posittion  = 0;
    private Integer position1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textView1);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(view -> {
            btn1.setText("Here we go ~");
            posittion++;
            position1++;
            String str = position1.toString();
            // Su khac biet giua hai thanh phan tren int va Integer la ban co the dung
            // Voi Integer ban co the dung cac ham co san nhu Substring hay ham toString()
            // Con int thi chi duoc su dung nhu binh thuong

            btn1.setText("You has clicked " + str +" times");


            // Neu ban chay code voi dung nhu posittion1++; thi ban se nhan duoc loi sau:
            // Ban co the bi crash khi ma chuong ttrinh dang thuc thi !

            // Vay banco the them vao mot LOG CAT de theo doi toan bo so code cua minh chay nhu the nao
            // Tu do de biet fix bug ra lam sao ????
            // Cac thanh phan ban co the tim kiem quan tam nhu
            // Ctrl + A roi
            // Ctrl Alt + L  Reformat Code


            // Yeu cau khi bam button thi mo ra man hinh moi co view 2
            Intent intent = new Intent(this, NewActivity2.class);
            startActivity(intent);
        });

    }
}