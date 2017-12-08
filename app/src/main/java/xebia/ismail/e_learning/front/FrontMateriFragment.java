package xebia.ismail.e_learning.front;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import xebia.ismail.e_learning.FlipCurl.PageActivity;
import xebia.ismail.e_learning.MateriActivity;
import xebia.ismail.e_learning.R;

/**
 * Created by Hendra Fang on 11/17/2017.
 */

public class FrontMateriFragment extends Fragment {

    Button butIntro;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_materi, container, false);
        butIntro = (Button)v.findViewById(R.id.butFrontMateri);
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        butIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PageActivity.class);
                intent.putExtra("page",1);
                startActivity(intent);
            }
        });
    }
}
