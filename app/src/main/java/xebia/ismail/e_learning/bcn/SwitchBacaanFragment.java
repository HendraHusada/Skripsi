package xebia.ismail.e_learning.bcn;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import xebia.ismail.e_learning.BacaanActivity;
import xebia.ismail.e_learning.R;

/**
 * Created by Zulfa_K on 15-11-2017.
 */

public class SwitchBacaanFragment extends Fragment {

    Button butCewek, butCowok;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_switch_bcn, container, false);
        butCewek = (Button) v.findViewById(R.id.butCewek);
        butCowok = (Button) v.findViewById(R.id.butCowok);
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        butCewek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Cewek", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), BacaanActivity.class));
            }
        });

        butCowok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Cowok", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), BacaanActivity.class));
            }
        });
    }
}