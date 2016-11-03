package com.example.administrator.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.print("我们的歌");
        Button debug = (Button) findViewById(R.id.button3);
        debug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"womwndege",Toast.LENGTH_LONG).show();
            }
        });


        System.out.println("希望你能爱我到天荒地老，我一点会");

        show();
    }

    private void show(){

    }
//    private void onClick(View view){
//        switch (view.getId()) {
//            case R.id.button3:
//                Toast.makeText(this,"womwndege",Toast.LENGTH_LONG).show();
//                break;
//        }
//    }

}
