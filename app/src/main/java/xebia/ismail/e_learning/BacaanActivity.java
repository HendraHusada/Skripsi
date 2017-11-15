package xebia.ismail.e_learning;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import xebia.ismail.e_learning.bcn.BacaanTabFragment;
import xebia.ismail.e_learning.fragment.VolumeFragment;

/**
 * Created by Zulfa_K on 15-11-2017.
 */

public class BacaanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

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
            ab.setTitle("Bacaan Salat Jenazah");
            ab.setDisplayHomeAsUpEnabled(true);
        }

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new BacaanTabFragment()).commit();
        }
    }
}
