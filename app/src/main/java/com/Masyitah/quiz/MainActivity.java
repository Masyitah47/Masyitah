package com.Masyitah.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText Nilai_Tugas,Nilai_Quiz,Nilai_UTS,Nilai_UAS;
    Button Proses,Bersih;
    TextView hasil;
    Double Tugas,Quiz,UTS,UAS,nilaiAkhir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nilai_Tugas = findViewById(R.id.Nilai_Tugas);
        Nilai_Quiz = findViewById(R.id.Nilai_Quiz);
        Nilai_UTS = findViewById(R.id.Nilai_UTS);
        Nilai_UAS = findViewById(R.id.Nilai_UAS);
        Proses = findViewById(R.id.Proses);
        Bersih = findViewById(R.id.Bersih);
        hasil = findViewById(R.id.hasil);

        Proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Nilai_Tugas.getText().length()>0 && Nilai_Quiz.getText().length()>0 && Nilai_UTS.getText().length()>0 && Nilai_UAS.getText().length()>0){
                    Tugas = Double.parseDouble(Nilai_Tugas.getText().toString());
                    Quiz= Double.parseDouble(Nilai_Quiz.getText().toString());
                    UTS= Double.parseDouble(Nilai_UTS.getText().toString());
                    UAS= Double.parseDouble(Nilai_UAS.getText().toString());
                    nilaiAkhir= (Tugas*20/100) + (Quiz*20/100) + (UTS*30/100) + (UAS*30/100);
                    hasil.setText(Double.toString(nilaiAkhir));
                } else {
                    Toast.makeText(MainActivity.this, "Mohon Masukkan Nilai Anda", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}