package com.miss.aplikasidialog2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.one_button_alert);
        button2 = (Button) findViewById(R.id.two_button_alert);
        button3 = (Button) findViewById(R.id.three_button_alert);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity
                        .this);
                builder.setTitle("Contoh Alert");
                builder.setMessage("Apakah Misbah Ganteng ");
                builder.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Log.e("info", "OK");
                            }
                        });
                builder.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        MainActivity.this);
                builder.setTitle("Contoh Alert");
                builder.setMessage("apakah misbah ganteng banget ");
                builder.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Log.e("info", "NO");
                            }
                        });
                builder.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Log.e("info", "YES");
                            }
                        });
                builder.show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        MainActivity.this);
                builder.setTitle("Contoh Alert");
                builder.setMessage("apakah misbah orang paling ganteng di dunia ");
                builder.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Log.e("info", "NO");
                            }
                        });
                builder.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Log.e("info", "YES");
                            }
                        });
                builder.setNeutralButton("BATAL",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Log.e("info", "BATAL");
                            }
                        });
                builder.show();
            }
        });
    }
    @Override public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present. getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
