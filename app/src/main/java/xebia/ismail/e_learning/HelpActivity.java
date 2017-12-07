package xebia.ismail.e_learning;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by Hendra Fang on 11/20/2017.
 */

public class HelpActivity extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntroFragment.newInstance("Fitur 1", "Dilengkapi dengan bacaan latin dan arti", R.drawable.icon_bacaan, Color.parseColor("#00caf7")));
        addSlide(AppIntroFragment.newInstance("Fitur 2", "Dilengkapi dengan murotal audio dan indikator pada bacaan", R.drawable.with_audio, Color.parseColor("#00caf7")));
        addSlide(AppIntroFragment.newInstance("Fitur 3", "Dilengkapi dengan video peragaan shalat", R.drawable.with_video, Color.parseColor("#00caf7")));

        // OPTIONAL METHODS
        // Override bar/separator color.
        setBarColor(Color.parseColor("#00caf7"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        // Hide Skip/Done button.
        showSkipButton(true);
        setProgressButtonEnabled(true);
        setFadeAnimation();
        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permission in Manifest.
    }
    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
        // Do something when users tap on Done button.
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}
