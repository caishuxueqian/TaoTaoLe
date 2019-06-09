package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import orc.com.taotaole.R;


public class MyFragment4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4_layout, container, false);
        view.findViewById(R.id.fragment4_order).setOnClickListener(e -> {
            startActivity(new Intent(getActivity(), OrderActivity.class));

        });
//
        view.findViewById(R.id.fragment4_history).setOnClickListener(e -> startActivity(new Intent(getActivity(), HistoryActivity.class)));
        view.findViewById(R.id.fragment4_person).setOnClickListener(e -> startActivity(new Intent(getActivity(), UserActivity.class)));
        return view;


    }
}
