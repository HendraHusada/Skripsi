package xebia.ismail.e_learning;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Zulfa_K on 17-11-2017.
 */

public class VideoActivity extends AppCompatActivity {

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

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
            ab.setTitle("Video");
            ab.setDisplayHomeAsUpEnabled(true);
        }

        video = (VideoView) findViewById(R.id.videoViewShalatJenazah);
        //
        MediaController controller = new MediaController(getApplicationContext());
        video.setMediaController(controller);
    }
}
