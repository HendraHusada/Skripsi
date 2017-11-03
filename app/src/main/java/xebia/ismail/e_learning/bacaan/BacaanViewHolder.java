package xebia.ismail.e_learning.bacaan;

import android.media.Image;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import java.util.List;

import butterknife.Bind;
import id.zelory.benih.ui.adapter.BenihRecyclerAdapter;
import id.zelory.benih.ui.adapter.viewholder.BenihItemViewHolder;
import xebia.ismail.e_learning.R;

/**
 * Created by Hendra Fang on 11/2/2017.
 */

public class BacaanViewHolder extends BenihItemViewHolder<Bacaan> {
    private final ImageView ivAyat2;
    private final View itemViews;
    private final BacaanFragment bacaanFragment;
    private ImageView ivAyat1;
    private RelativeLayout layout1;
    private ProgressBar progressBar1;
    private RelativeLayout layout2;
    private ProgressBar progressBar2;
    private ProgressBar progressBar3;
    private Handler handler = new Handler();
    private int progressStatus1 = 0;
    private int progressStatus2 = 0;
    private int progressStatus3 = 0;


    public BacaanViewHolder(View itemView, BenihRecyclerAdapter.OnItemClickListener itemClickListener, BenihRecyclerAdapter.OnLongItemClickListener longItemClickListener, BacaanFragment bacaanFragment) {
        super(itemView, itemClickListener, longItemClickListener);
        this.bacaanFragment = bacaanFragment;
        this.itemViews = itemView;
        layout1 = (RelativeLayout) itemView.findViewById(R.id.layout1);
        progressBar1 = (ProgressBar) itemView.findViewById(R.id.progressBar1);
        layout2 = (RelativeLayout) itemView.findViewById(R.id.layout2);
        progressBar2 = (ProgressBar) itemView.findViewById(R.id.progressBar2);
        progressBar3 = (ProgressBar) itemView.findViewById(R.id.progressBar3);
        ivAyat1 = (ImageView) itemView.findViewById(R.id.ivAyat1);
        ivAyat2 = (ImageView) itemView.findViewById(R.id.ivAyat2);
    }

    @Override
    public void bind(final Bacaan bacaan) {
        progressBar1.setRotation(180);
        progressBar2.setRotation(180);
        progressBar3.setRotation(180);
        progressBar1.setScaleY(15f);
        progressBar2.setScaleY(10f);
        progressBar3.setScaleY(10f);

        if (bacaan.getStatus() == 1) {
            layout1.setVisibility(View.VISIBLE);
            layout2.setVisibility(View.GONE);
            layout1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    layout2.setVisibility(View.GONE);
                    layout1.setVisibility(View.GONE);
                    Log.e("Click on position ", Integer.toString(bacaan.getPos()));
                    for(int i=0;i<bacaanFragment.bacaanAdapter.getData().size();i++){
                        if(i==bacaan.getPos()){
                            bacaanFragment.bacaanAdapter.getData().get(i).setShowPB(true);
                        }
                        else{
                            bacaanFragment.bacaanAdapter.getData().get(i).setShowPB(false);
                        }
                    }
                    bacaanFragment.bacaanAdapter.notifyDataSetChanged();

                    playProgressBar1(bacaan.getWaktu());
                    bacaanFragment.onClick(bacaan.getAudio());
                }
            });
            ivAyat1.setBackgroundResource(bacaan.getGambar());
        } else if (bacaan.getStatus() == 2) {
            layout2.setVisibility(View.VISIBLE);
            layout1.setVisibility(View.GONE);
            layout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    layout2.setVisibility(View.GONE);
                    layout1.setVisibility(View.GONE);
                    Log.e("Click on position ", Integer.toString(bacaan.getPos()));
                    for(int i=0;i<bacaanFragment.bacaanAdapter.getData().size();i++){
                        if(i==bacaan.getPos()){
                            bacaanFragment.bacaanAdapter.getData().get(i).setShowPB(true);
                        }
                        else{
                            bacaanFragment.bacaanAdapter.getData().get(i).setShowPB(false);
                        }
                    }
                    bacaanFragment.bacaanAdapter.notifyDataSetChanged();

                    playProgressBar2(bacaan.getWaktu());
                    bacaanFragment.onClick(bacaan.getAudio());
                }
            });
            ivAyat2.setBackgroundResource(bacaan.getGambar());
        }

        if(bacaan.getShowPB()){
            Log.e("list ke " + Integer.toString(bacaan.getPos()), "true");
            progressBar1.setVisibility(View.VISIBLE);
        }
        else{
            Log.e("list ke " + Integer.toString(bacaan.getPos()), "false");
        }
    }

    private void playProgressBar1(final int waktu) {
        // Start long running operation in a background thread
        new Thread(new Runnable() {
            public void run() {
                while (progressStatus1 < 100) {
                    progressStatus1 += waktu;
                    // Update the progress bar and display the
                    //current value in the text view
                    handler.post(new Runnable() {
                        public void run() {
                            progressBar1.setProgress(progressStatus1);
                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private void playProgressBar2(final int waktu) {
        // Start long running operation in a background thread
        new Thread(new Runnable() {
            public void run() {
                while (progressStatus2 < 100) {
                    progressStatus2 += waktu;
                    // Update the progress bar and display the
                    //current value in the text view
                    handler.post(new Runnable() {
                        public void run() {
                            progressBar2.setProgress(progressStatus2);
                            if (progressStatus2 == 99) {
                                playProgressBar3(waktu);
                            }
                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private void playProgressBar3(final int waktu) {
        // Start long running operation in a background thread
        new Thread(new Runnable() {
            public void run() {
                while (progressStatus3 < 100) {
                    progressStatus3 += waktu;
                    // Update the progress bar and display the
                    //current value in the text view
                    handler.post(new Runnable() {
                        public void run() {
                            progressBar3.setProgress(progressStatus3);
                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
