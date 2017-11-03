package xebia.ismail.e_learning.bacaan;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import id.zelory.benih.ui.adapter.BenihRecyclerAdapter;
import id.zelory.benih.ui.view.BenihRecyclerView;
import xebia.ismail.e_learning.R;

import static android.support.v7.appcompat.R.id.add;

/**
 * Created by Hendra Fang on 10/29/2017.
 */

public class BacaanFragment extends Fragment implements BacaanInterface {
    BacaanAdapter bacaanAdapter;
    private BenihRecyclerView rvAyat;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_bacaan, container, false);
        rvAyat = (BenihRecyclerView) v.findViewById(R.id.rvAyat);
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bacaanAdapter = new BacaanAdapter(getActivity(),this);
        rvAyat.setUpAsList();
        rvAyat.setAdapter(bacaanAdapter);
        List<Bacaan> bacaaan = new ArrayList<Bacaan>() {
            {
                add(new Bacaan(2, R.drawable.takbir3_1, 1, "ini arti", "audio", 0,true));
                add(new Bacaan(2, R.drawable.takbir3_1, 1, "ini arti", "audio", 1,true));
                add(new Bacaan(2, R.drawable.takbir3_1, 1, "ini arti", "audio", 2,true));
                add(new Bacaan(2, R.drawable.takbir3_1, 1, "ini arti", "audio", 3,true));
                //add(new Bacaan(1, R.drawable.salam2, 1, "ini arti", "audio", 2, true));
            }
        };
        bacaanAdapter.add(bacaaan);
        bacaanAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(String s) {
        Toast.makeText(getActivity(), s + "", Toast.LENGTH_SHORT).show();
    }
}
