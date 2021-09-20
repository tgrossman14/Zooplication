package com.zapp.zooplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void disable(View v){
        findViewById(R.id.button11).setEnabled(false);
        ((Button)findViewById(R.id.button11)).setText("New new disabled");
    /*
        View myView = findViewById(R.id.button11);
        myView.setEnabled(false);
        Button button = (Button) myView;
        button.setText("New Disabled");

        Button b = findViewById(R.id.button);
        TextView t = findViewById(R.id.button);
        t.setText("value");

        v.setEnabled(false);
        Button b = (Button) v;
        b.setText("Disabled");
        Log.d("success","button disabled");
    */
    }

    public void handleText(View v){
        EditText text = findViewById(R.id.source1);
        String input = text.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(input);
        Toast.makeText(this, "Hello " + input, Toast.LENGTH_LONG).show();
    }
}