package com.example.w_dialogfrgamanetdata;
//3.將Activity傳過來的Fragment取得參數
//4.重點自己寫一個方法讓exampleFragment.instance(1.傳遞的參數,2.傳遞的參數);

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExampleFragment extends Fragment {
    private TextView textView;
    private String text;
    private int number;

    //4.改成常數
    private static final String ARG_TEXT = "hank"; //參數1
    private static final String ARG_NUMBER = "number"; //參數2

    public ExampleFragment() {
    }

    //.//4.重點自己寫一個方法讓exampleFragment.instance(1.傳遞的參數,2.傳遞的參數); 取代MainActivity的老方法
    public static ExampleFragment instance(String text, int number) {
        ExampleFragment exampleFragment = new ExampleFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_TEXT, text);
        bundle.putInt(ARG_NUMBER, number);
        exampleFragment.setArguments(bundle);
        return exampleFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_example, container, false);
        textView = v.findViewById(R.id.txt_view_fragment);

        //3.將Activity傳過來的Fragment取得參數
        if (getArguments() != null) {
            text = getArguments().getString(ARG_TEXT);
            number = getArguments().getInt(ARG_NUMBER);
        }

        textView.setText(text + number);

        return v;

    }

}
