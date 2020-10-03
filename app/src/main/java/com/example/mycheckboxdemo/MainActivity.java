package com.example.mycheckboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private CheckBox pc,gpu,motherboard;
private Button button;
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pc=findViewById(R.id.pcid);
        gpu=findViewById(R.id.gpuid);
        motherboard=findViewById(R.id.motherboardid);
        textView=findViewById(R.id.textviewid);
        button=findViewById(R.id.buttonid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder builder=new StringBuilder();
                if(pc.isChecked()){
                    String value=pc.getText().toString();
                    builder.append(value+" added to the list\n");
                }
                if(gpu.isChecked()){
                    String value=gpu.getText().toString();
                    builder.append(value+" added to the list\n");
                }
                if(motherboard.isChecked()){
                    String value=motherboard.getText().toString();
                    builder.append(value+" added to the list\n");
                }
                textView.setText(builder);
            }
        });
    }
}
