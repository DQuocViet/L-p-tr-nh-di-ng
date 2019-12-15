package com.ldkvinh.quizandroid.Activity;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.ldkvinh.quizandroid.R;

public class DangKiTaiKhoanActivity extends AppCompatActivity {
    private EditText edtTenDangNhap,edtEmail,edtMatKhau,edtXacNhanMatKhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki_tai_khoan);

        Radiation();

    }

    private void Radiation() {
        edtTenDangNhap = findViewById(R.id.edtTenDangNhap);
        edtEmail = findViewById(R.id.edtEmail);
        edtMatKhau = findViewById(R.id.edtMatKhau);
        edtXacNhanMatKhau = findViewById(R.id.edtXacNhanMatKhau);
    }



}
