package com.ldkvinh.quizandroid.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ldkvinh.quizandroid.R;

public class QuenMatKhauActivity extends AppCompatActivity {
    private EditText edtTenDangNhap,edtEmail;
    private Button btnClose;
    private TextView tvHienThiPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quen_mat_khau);

        Radiation();

    }

    private void Radiation() {
        edtTenDangNhap = findViewById(R.id.edtTenDangNhap);
        edtEmail = findViewById(R.id.edtEmail);
    }


}
