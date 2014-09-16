package com.normal.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.normal.datetimepicker.R;

/**
 * Created by chenjinghao on 14/9/16 at 下午8:21.
 * Description:一个简单的Fragment
 */
public class PlaceholderFragment extends Fragment {
    //指定存储在Instance中的section_number的key
    private static final String ARG_SECTION_NUMBER = "section_number";

    //保存section_number到Instance中
    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        //创建一个TextView，并给TextView赋值
        TextView sectionLabel = (TextView) rootView.findViewById(R.id.section_label);
        sectionLabel.setText(getArguments().getInt(ARG_SECTION_NUMBER)+"");
        return rootView;
    }
}