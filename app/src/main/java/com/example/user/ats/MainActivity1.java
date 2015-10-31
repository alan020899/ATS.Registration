package com.example.user.ats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }
    public void openActmain2(View view) {

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);}

    public void openActmain3(View view) {

        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);}

    public void openActmain4(View view) {

        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);}
}
