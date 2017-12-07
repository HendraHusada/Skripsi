package xebia.ismail.e_learning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import xebia.ismail.e_learning.evaluasi.evaluasi;

/**
 * Created by Zulfa_K on 17-11-2017.
 */

public class HasilEvaluasiActivity extends AppCompatActivity {

    TextView textviewJumlahBenar;
    TextView textviewReward;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_06hasil_nilai);
        textviewReward = (TextView) findViewById(R.id.textviewReward);
        button = (Button) findViewById(R.id.button);
        textviewJumlahBenar = (TextView) findViewById(R.id.textviewjumlahbenar);
        int jumlahbenar = evaluasi.jumlahbenar * 2;
        String benere = String.valueOf(jumlahbenar);
        if (jumlahbenar >= 8) {
            textviewJumlahBenar.setText(benere);
            textviewReward.setText("PERFECT!");
        } else if (8 >= jumlahbenar && jumlahbenar >= 6) {
            textviewJumlahBenar.setText(benere);
            textviewReward.setText("WELL DONE!");
        } else {
            textviewJumlahBenar.setText(benere);
            textviewReward.setText("BELAJAR LEBIH GIAT LAGI!");
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HasilEvaluasiActivity.this, EvaluasiActivity.class));
                finish();
            }
        });
    }
}
