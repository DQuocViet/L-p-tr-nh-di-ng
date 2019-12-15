package com.ldkvinh.quizandroid.Activity;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ldkvinh.quizandroid.R;

public class MangHinhChinhActivity extends AppCompatActivity {
    private String sharedPrefFile = "com.ldkvinh.quizandroid.Activity";
    private SharedPreferences mPreferences;
    private TextView tvTenDangNhap;
    Button btn_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mang_hinh_chinh);
        mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);
    }

    private void Radiation() {
        tvTenDangNhap = findViewById(R.id.tvTenDangNhap);
    }

    public void XuLiQuanLiTaiKhoan(View view) {
        startActivity(new Intent(this,QuanLiTaiKhoanActivity.class));
    }

    public void XuLiTroChoiMoi(View view) {
        startActivity(new Intent(this,MangHinhTroChoiActivity.class));
    }

    public void XuLiLichSuChoi(View view) {

        startActivity(new Intent(this,LichSuCauHoiActivity.class));
    }

    public void XuLiBangXepHang(View view) {
        startActivity(new Intent(this,BangXepHangActivity.class));
    }

    public void XuLiMuaCreadit(View view) {
        startActivity(new Intent(this,MuaCreaditActivity.class));
    }

    public void XuLiHuongDan(View view) {
        startActivity(new Intent(this,HuongDanActivity.class));
    }
    public void XuLiDangXuat(View view)
    {
        SharedPreferences.Editor editor = mPreferences.edit();
        editor.clear();
        editor.apply();
        btn_out= findViewById(R.id.btnDangXuat);
        btn_out.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               final Dialog dialog=new Dialog(MangHinhChinhActivity.this);
               dialog.setContentView(R.layout.custom_dialog_log_out);
               dialog.setCancelable(false);
               Button btnout = dialog.findViewById(R.id.btn_dangxuat);
               Button btncontinue = dialog.findViewById(R.id.btn_tieptuc);
               btnout.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent = new Intent(MangHinhChinhActivity.this,DangNhapActivity.class);
                       startActivity(intent);
                   }
               });
               btncontinue.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       dialog.dismiss();
                   }
               });
               dialog.show();
           }
       });


    }


}
