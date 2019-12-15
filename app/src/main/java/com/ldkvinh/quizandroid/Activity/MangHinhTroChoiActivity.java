package com.ldkvinh.quizandroid.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import com.ldkvinh.quizandroid.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MangHinhTroChoiActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String> {
    private Button btn_khkt,btn_vhxhtn,btn_lsdl,btn_tt;
    private  final ArrayList<LinhVuc> mListLinhVuc=new ArrayList<>();
    int id_linh_vuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mang_hinh_tro_choi);

        btn_khkt=findViewById(R.id.btnKHKT);
        btn_vhxhtn=findViewById(R.id.btnVH_XH_NT);
        btn_lsdl=findViewById(R.id.btnLS_DL);
        btn_tt=findViewById(R.id.btnTT);

    }

    public void XuLiHienThiLinhVuc(View view) {
        startActivity(new Intent(this,HienThiCauHoiActivity.class));
    }

    @NonNull
    @Override
    public Loader<String> onCreateLoader(int id, @Nullable Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(@NonNull Loader<String> loader, String data) {
    try{
        JSONObject jsonObject = new JSONObject(data);
        JSONArray jsonArray = jsonObject.getJSONArray("data");
        for(int i = 0; i< jsonArray.length(); i++){
            int id = jsonArray.getJSONObject(i).getInt("id");
            String tenLinhVuc = jsonArray.getJSONObject(i).getString("ten_linh_vuc");
            this.mListLinhVuc.add(new LinhVuc(id, tenLinhVuc));
        }

        btn_khkt.setText(mListLinhVuc.get(0).getTenLinhVuc());
        btn_vhxhtn.setText(mListLinhVuc.get(1).getTenLinhVuc());
        btn_lsdl.setText(mListLinhVuc.get(2).getTenLinhVuc());
        btn_tt.setText(mListLinhVuc.get(3).getTenLinhVuc());

    } catch (JSONException e) {
        e.printStackTrace();
    }
    }

    @Override
    public void onLoaderReset(@NonNull Loader<String> loader) {

    }
}
