package com.tutor.feel_better.swipetry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secndMain extends AppCompatActivity {

    Button my_btn,my_second_btn;
    boolean ha=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secnd_main);
        my_btn=findViewById(R.id.my_btn);
        my_second_btn=findViewById(R.id.my_second_btn);

        my_second_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inte = new Intent(getApplicationContext(),sampleActivity.class);
                startActivity(inte);
            }
        });



        my_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inte = new Intent(getApplicationContext(),CommonActivity.class);
                startActivity(inte);
                //finish();
            }
        });
    }
}
