package xebia.ismail.e_learning.bcn;

import android.os.CountDownTimer;
import android.widget.ProgressBar;

/**
 * Created by Zulfa_K on 08-11-2017.
 */

public class BacaanModel {
    int barisBacaan;
    boolean isSelected;

    CountDownTimer cdt1, cdt2a, cdt2b;
    long milisecond;



    public BacaanModel(int brsbcn, boolean isSelected){
        barisBacaan = brsbcn;
        this.isSelected = isSelected;

        if(brsbcn==1){
            cdt1 = new CountDownTimer(1000,1000) {
                @Override
                public void onTick(long l) {

                }

                @Override
                public void onFinish() {

                }
            };
        }
        else if(brsbcn==2){
            cdt2a = new CountDownTimer(1000,1000) {
                @Override
                public void onTick(long l) {

                }

                @Override
                public void onFinish() {

                }
            };
            cdt2b = new CountDownTimer(1000,1000) {
                @Override
                public void onTick(long l) {

                }

                @Override
                public void onFinish() {

                }
            };
        }
    }

    public void playProgressbar1(final ProgressBar pb, long milisecond){
        pb.setProgress(0);
        long tick = milisecond/100;
        this.cdt1.cancel();
        this.cdt1 = new CountDownTimer(milisecond,tick) {
            int i=0;
            @Override
            public void onTick(long l) {
                i++;
                pb.setProgress(i);
            }

            @Override
            public void onFinish() {

            }
        };

        this.cdt1.start();
    }

    public void playProgressbar2(final ProgressBar pb1, long milisecond1, final ProgressBar pb2, final long milisecond2){
        pb1.setProgress(0);
        pb2.setProgress(0);
        long tick = milisecond1/100;
        this.cdt2a.cancel();
        this.cdt2b.cancel();
        this.cdt2a = new CountDownTimer(milisecond1,tick) {
            int i=0;
            @Override
            public void onTick(long l) {
                i++;
                pb1.setProgress(i);
            }

            @Override
            public void onFinish() {
                playProgressbar3(pb2, milisecond2);
            }
        };

        this.cdt2a.start();
    }

    public void playProgressbar3(final ProgressBar pb, long milisecond){
        long tick = milisecond/100;
        this.cdt2b.cancel();
        this.cdt2b = new CountDownTimer(milisecond,tick) {
            int i=0;
            @Override
            public void onTick(long l) {
                i++;
                pb.setProgress(i);
            }

            @Override
            public void onFinish() {

            }
        };

        this.cdt2b.start();
    }
}
