package com.example.vinod.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Movies, Stock, Buid, Material, Go_ubiquitous, Capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Movies = (Button) findViewById(R.id.movie);
        Movies.setOnClickListener(this);
        Stock = (Button) findViewById(R.id.stock);
        Stock.setOnClickListener(this);
        Buid = (Button) findViewById(R.id.buid);
        Buid.setOnClickListener(this);
        Material = (Button) findViewById(R.id.material);
        Material.setOnClickListener(this);
        Go_ubiquitous = (Button) findViewById(R.id.go_ubiquitous);
        Go_ubiquitous.setOnClickListener(this);
        Capstone = (Button) findViewById(R.id.capstone);
        Capstone.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.movie:
                Toast.makeText(getBaseContext(), "This button launches my movies app", Toast.LENGTH_LONG).show();
                break;

            case R.id.stock:
                Toast.makeText(getBaseContext(), "This button launches stock hawk app", Toast.LENGTH_LONG).show();
                break;

            case R.id.buid:
                Toast.makeText(getBaseContext(), "This button launches build it bigger app", Toast.LENGTH_LONG).show();
                break;

            case R.id.material:
                Toast.makeText(getBaseContext(), "This button launches make your app material app", Toast.LENGTH_LONG).show();
                break;

            case R.id.go_ubiquitous:
                Toast.makeText(getBaseContext(), "This button launches go ubiquitous app", Toast.LENGTH_LONG).show();
                break;

            case R.id.capstone:

                Toast.makeText(getBaseContext(), "This button launches capstone app", Toast.LENGTH_LONG).show();
                break;


        }

    }
}
