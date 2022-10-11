
package com.example.myapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapp.MainActivity3;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity2 extends AppCompatActivity {
    TextInputLayout email, Password;
    TextView bt_button;
    public TextView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (TextView) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.myapp.MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}
