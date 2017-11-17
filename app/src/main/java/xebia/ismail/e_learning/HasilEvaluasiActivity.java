package xebia.ismail.e_learning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import xebia.ismail.e_learning.evaluasi.evaluasi;

/**
 * Created by Zulfa_K on 17-11-2017.
 */

public class HasilEvaluasiActivity extends AppCompatActivity {

    TextView textviewJumlahBenar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_06hasil_nilai);

        textviewJumlahBenar = (TextView) findViewById(R.id.textviewjumlahbenar);
        textviewJumlahBenar.setText(Integer.toString(evaluasi.jumlahbenar));
    }

}
