package com.sar.intentproject;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMove = findViewById(R.id.kalkulator);

        Button btntentang = findViewById(R.id.tentang);
        Button Login = findViewById(R.id.login);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Perintah Intent Explicit pindah halaman ke activity_detail
                startActivity(new Intent(MainActivity.this, kalkulator.class));
                finish();

            }
        });
        btntentang.setOnClickListener(v -> {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/_htysam"));
            startActivity(intent);
        });

        Login.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,halaman.class));
        });
    }
}
