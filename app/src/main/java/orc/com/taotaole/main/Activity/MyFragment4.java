package orc.com.taotaole.main.Activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import orc.com.taotaole.R;


public class MyFragment4 extends Fragment {

    public MyFragment4() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4_layout,container,false);
        return view;
    }
}
