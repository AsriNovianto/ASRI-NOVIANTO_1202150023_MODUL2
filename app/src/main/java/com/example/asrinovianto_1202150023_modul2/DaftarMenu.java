package com.example.asrinovianto_1202150023_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recycle;
    private adapter adaptermenu;

    public static ArrayList<model> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        menuList = menuisi();
        recycle = (RecyclerView)findViewById(R.id.recyclerView);
        adaptermenu = new adapter(menuList);
        recycle.setAdapter(adaptermenu);
        recycle.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<model> menuisi() {
        ArrayList<model> isi = new ArrayList<>();
        isi.add(new model("Sop Dada",15000,R.drawable.sop_dada_atas,"Sop Pak min dengan dada ayam yang dicincang"));
        isi.add(new model("Sop Kulit",13000,R.drawable.sop_kulit,"Sop Pak min dengan Kulit ayam"));
        isi.add(new model("sop Jeroan",12000,R.drawable.sop_jeroan,"Sop pak min dengan jeroan dan telur kuning ayam"));
        isi.add(new model("Sop Dada Atas",16000,R.drawable.sop_dada_atas,"Sop pak min dengan dada atas ayam yang cincang"));
        isi.add(new model("Sop Kepala,",1000,R.drawable.sop_kepala,"Sop pak min dengan dengan kepala ayam yang dipotong"));
        return  isi;
    }
}