package xebia.ismail.e_learning.bcn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import xebia.ismail.e_learning.R;

/**
 * Created by Zulfa_K on 14-11-2017.
 */

public class BacaanFragment extends Fragment {

    RecyclerView rvBacaan;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_bcn, container, false);
        rvBacaan = (RecyclerView) v.findViewById(R.id.recyclerViewBacaan);
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        rvBacaan.setLayoutManager(layoutManager);
        rvBacaan.setHasFixedSize(true);

        List<BacaanModel> bcn = new ArrayList<BacaanModel>();
        bcn.add(new BacaanModel(1, false, R.drawable.takbir3_1));
        bcn.add(new BacaanModel(1, false, R.drawable.takbir3_2));
        bcn.add(new BacaanModel(1, false, R.drawable.takbir3_3));
        bcn.add(new BacaanModel(1, false, R.drawable.takbir3_4));
        bcn.add(new BacaanModel(1, false, R.drawable.takbir3_5));
        bcn.add(new BacaanModel(1, false, R.drawable.takbir3_6));
        bcn.add(new BacaanModel(1, false, R.drawable.takbir3_7));



        final BacaanAdapter adapterBacaan = new BacaanAdapter(getContext());
        adapterBacaan.setListBacaan(bcn);
        adapterBacaan.setClickListener(new BacaanAdapter.ViewHolderClickListener() {
            @Override
            public void onViewHolderClick(View v, int position) {
                Toast.makeText(getContext(), Integer.toString(position), Toast.LENGTH_SHORT).show();
                for(int i=0; i<adapterBacaan.getListBacaan().size(); i++){
                    if(i==position){
                        adapterBacaan.getListBacaan().get(i).isSelected = true;
                    }
                    else{
                        adapterBacaan.getListBacaan().get(i).isSelected = false;
                    }
                }
                adapterBacaan.notifyDataSetChanged();
            }
        });

        rvBacaan.setAdapter(adapterBacaan);
    }
}
