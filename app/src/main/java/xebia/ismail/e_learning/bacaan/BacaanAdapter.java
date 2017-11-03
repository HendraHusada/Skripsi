package xebia.ismail.e_learning.bacaan;

import android.content.Context;
import android.view.ViewGroup;

import id.zelory.benih.ui.adapter.BenihRecyclerAdapter;
import xebia.ismail.e_learning.R;

/**
 * Created by Hendra Fang on 11/2/2017.
 */

public class BacaanAdapter extends BenihRecyclerAdapter<Bacaan, BacaanViewHolder> {
    public final BacaanFragment bacaanFragment;

    public BacaanAdapter(Context context, BacaanFragment bacaanFragment) {
        super(context);
        this.bacaanFragment = bacaanFragment;
    }

    @Override
    protected int getItemResourceLayout(int viewType) {
        return R.layout.item_bacaan_1;
    }

    @Override
    public BacaanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BacaanViewHolder(getView(parent, viewType), itemClickListener, longItemClickListener, bacaanFragment);
    }
}
