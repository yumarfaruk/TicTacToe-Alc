package com.example.android.tictactoe_alc;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void exit_click(View v)
    {
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

        dlgAlert.setMessage("Do you really want to exit");
        dlgAlert.setTitle("Exit");

        dlgAlert.setCancelable(true);
        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                });
        dlgAlert.create().show();
    }
    public void about_click(View view){
        Intent myIntent = new Intent(this,About.class);
        startActivity(myIntent);
    }
    public void normal_click(View v)
    {
        Intent myIntent = new Intent(MainActivity.this,GameActivity.class);
        startActivity(myIntent);
    }
    public void ultimate_click(View v)
    {
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

        dlgAlert.setMessage("Under construction");
        dlgAlert.setTitle("comming soon");

        dlgAlert.setCancelable(true);

        dlgAlert.create().show();
    }




}
