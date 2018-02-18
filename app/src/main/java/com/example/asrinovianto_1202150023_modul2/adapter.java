package com.example.asrinovianto_1202150023_modul2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by RazerBlade on 18/02/2018.
 */

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nama,harga,id;
        private ImageView gambar;
        public ViewHolder(View itemView){
            super(itemView);
            id = (TextView)itemView.findViewById(R.id.id);
            nama = (TextView)itemView.findViewById(R.id.nama);
            harga = (TextView)itemView.findViewById(R.id.harga);
            gambar = (ImageView)itemView.findViewById(R.id.gambar);
        }
    }
    private ArrayList<model> dataList;
    public adapter(ArrayList<model>list){
        this.dataList = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_recyclereview, parent, false);
    return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
    holder.nama.setText(dataList.get(position).getNama());
    holder.id.setText(""+position);
    holder.harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in","ID")).format(dataList.get(position).getHarga()));
    holder.gambar.setImageResource(dataList.get(position).getGambar());
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String index = holder.id.getText().toString();
            Toast.makeText(v.getContext(),"Menu yang anda pilih "+dataList.get(Integer.parseInt(index)).getNama()+"",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(v.getContext().getApplicationContext(),MenuDetail.class);
            intent.putExtra("MenuId",index);
            v.getContext().startActivity(intent);
            Log.d("Isi Index",""+index);
        }
    });
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

}
