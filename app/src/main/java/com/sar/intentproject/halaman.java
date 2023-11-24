package com.sar.intentproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class halaman extends AppCompatActivity {
    private Button btkeluar,btProses;
    private Spinner kelas;
    private EditText koreksi;
    String[] menu = {"--Pilih--","Siang","Malam","Blended"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman);
        btkeluar = (Button) findViewById(R.id.cek);
        btProses = (Button) findViewById(R.id.proses);
        kelas = (Spinner) findViewById(R.id.label_spinner);
        btkeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
        btProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = kelas.getSelectedItemPosition();
                //koreksi.setText(kelas.getSelectedItem().toString());
                if(menu[index] == "Siang"){

                    Toast.makeText(getBaseContext(),"Anda Memilih Kelas"+kelas.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();

                } else if(menu[index] == "Malam"){

                    Toast.makeText(getBaseContext(),"Anda Memeilih Kelas Malam",Toast.LENGTH_SHORT).show();

                } else if(menu[index] == "Blended"){

                    Toast.makeText(getBaseContext(),"Anda Memilih Kelas Blended",Toast.LENGTH_SHORT).show();

                } else {

                    Toast.makeText(getBaseContext(),"Maaf, anda belum punya pilihan..!!",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
    private void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Keluar dari aplikasi?");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Klik Ya untuk keluar!")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        halaman.this.finish();
                    }
                })
                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // jika tombol ini diklik, akan menutup dialog
                        // dan tidak terjadi apa2
                        dialog.cancel();
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
}
