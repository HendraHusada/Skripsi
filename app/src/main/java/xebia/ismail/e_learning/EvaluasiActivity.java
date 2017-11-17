package xebia.ismail.e_learning;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import xebia.ismail.e_learning.evaluasi.evaluasi;

/**
 * Created by Zulfa_K on 17-11-2017.
 */

public class EvaluasiActivity extends AppCompatActivity {

    evaluasi eva;
    TextView textViewSoal;
    ImageView imageViewSoal;
    Button buttonA,buttonB,buttonC,buttonD;

    Drawable xa,xb,xc,xd;

    int nomorsoalyangtampil;
    int jmlbnr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_06evaluasi);

        eva = new evaluasi();
        init();

        nomorsoalyangtampil=0;
        tampilSoalKe(nomorsoalyangtampil);

    }
    private void tampilSoalKe(int nomorsoal) {
        nomorsoalyangtampil = nomorsoal;

        textViewSoal.setText(eva.getSoal(nomorsoal));
        if (nomorsoal==0){imageViewSoal.setImageResource((R.drawable.hukum));}
        else if (nomorsoal==1) {imageViewSoal.setImageResource((R.drawable.soal_takbir3cowok));}
        else if (nomorsoal==2) {imageViewSoal.setImageResource((R.drawable.ic_rukun));}
        else if (nomorsoal==3) {imageViewSoal.setImageResource((R.drawable.ic_about));}
        else {imageViewSoal.setImageResource(R.drawable.ic_evaluasi);}

        if (nomorsoal==1) {
            buttonA.setBackgroundResource(R.drawable.ic_about);
            buttonB.setBackgroundResource(R.drawable.jawaban_2b);
            buttonC.setBackgroundResource(R.drawable.ic_help);
            buttonD.setBackgroundResource(R.drawable.ic_menu_camera);

            buttonA.setText("");
            buttonB.setText("");
            buttonC.setText("");
            buttonD.setText("");
        }

        else {
            buttonA.setText(eva.getPilihanJawaban(nomorsoal, 0));
            buttonB.setText(eva.getPilihanJawaban(nomorsoal, 1));
            buttonC.setText(eva.getPilihanJawaban(nomorsoal, 2));
            buttonD.setText(eva.getPilihanJawaban(nomorsoal, 3));

            buttonA.setBackground(xa);
            buttonB.setBackground(xb);
            buttonC.setBackground(xc);
            buttonD.setBackground(xd);
        }
    }

    public void evaluasifinish() {
        Toast.makeText(getApplicationContext(), "jumlah benar anda =" + Integer.toString(eva.getJumlahBenar()), Toast.LENGTH_SHORT).show();

        Intent evafinish = new Intent(EvaluasiActivity.this, HasilEvaluasiActivity.class);
        startActivity(evafinish);
        finish();
    }

    private void init() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setTitle("Evaluasi");
            ab.setDisplayHomeAsUpEnabled(true);
        }

        textViewSoal = (TextView) findViewById(R.id.textviewsoal);
        imageViewSoal = (ImageView) findViewById(R.id.imageviewsoal);
        buttonA = (Button) findViewById(R.id.button_a);
        buttonB = (Button) findViewById(R.id.button_b);
        buttonC = (Button) findViewById(R.id.button_c);
        buttonD = (Button) findViewById(R.id.button_d);

        xa = buttonA.getBackground();
        xb = buttonB.getBackground();
        xc = buttonC.getBackground();
        xd = buttonD.getBackground();


        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pilihan="a";
                if (pilihan.equals(eva.getJawaban(nomorsoalyangtampil))){
                    Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_SHORT).show();
                    eva.setJumlahBenar(++jmlbnr);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_SHORT).show();
                }
                nomorsoalyangtampil++;
                if (nomorsoalyangtampil<eva.soal.length){
                    tampilSoalKe(nomorsoalyangtampil);
                }
                else{
                    evaluasifinish();
                }
            }
        });
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                String pilihan="b";
                if (pilihan.equals(eva.getJawaban(nomorsoalyangtampil))){
                    Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_SHORT).show();
                    eva.setJumlahBenar(++jmlbnr);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_SHORT).show();
                }
                nomorsoalyangtampil++;
                if (nomorsoalyangtampil<eva.soal.length){
                    tampilSoalKe(nomorsoalyangtampil);
                }
                else{
                    evaluasifinish();
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                String pilihan="c";
                if (pilihan.equals(eva.getJawaban(nomorsoalyangtampil))){
                    Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_SHORT).show();
                    eva.setJumlahBenar(++jmlbnr);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_SHORT).show();
                }
                nomorsoalyangtampil++;
                if (nomorsoalyangtampil<eva.soal.length){
                    tampilSoalKe(nomorsoalyangtampil);
                }
                else{
                    evaluasifinish();
                }
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pilihan="d";
                if (pilihan.equals(eva.getJawaban(nomorsoalyangtampil))){
                    Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_SHORT).show();
                    eva.setJumlahBenar(++jmlbnr);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_SHORT).show();
                }
                nomorsoalyangtampil++;
                if (nomorsoalyangtampil<eva.soal.length){
                    tampilSoalKe(nomorsoalyangtampil);
                }
                else{
                    evaluasifinish();
                }
            }
        });
    }

}
