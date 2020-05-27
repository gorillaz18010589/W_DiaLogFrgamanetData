package com.example.w_dialogfrgamanetdata;
//https://www.youtube.com/watch?v=HZYYjY2NSKk
//1.將example頁面加入到Activity裡
//2.fragment傳遞參數(舊方法)
//3.到ExmapleFrgament將Activity傳過來的Fragment取得參數
//4.在ExmapleFragmnent重點自己寫一個方法讓exampleFragment.instance(1.傳遞的參數,2.傳遞的參數);
//5.使用新的ExampleFragment.instance方法直接傳遞參數

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //5.使用新的ExampleFragment.instance方法直接傳遞參數
        ExampleFragment exampleFragment = ExampleFragment.instance("Hello", 123);

        //2.fragment傳遞參數 (傳統方法)
//        Bundle bundle = new Bundle();
//        bundle.putString("hank","hankText");
//        bundle.putInt("number",123);
//        exampleFragment.setArguments(bundle);

        //1.將example頁面加入到Activity裡
        getSupportFragmentManager().beginTransaction().replace(R.id.container, exampleFragment).commit();

    }
}
