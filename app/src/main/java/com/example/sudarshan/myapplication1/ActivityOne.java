package com.example.sudarshan.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityOne extends AppCompatActivity {

    public static String name;
    EditText nameInput;
    Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        nameInput = (EditText) findViewById(R.id.nameInput);



        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                name = nameInput.getText().toString();

                showToast(name);
                Intent intent = new Intent (ActivityOne.this,ActivityOneO.class);
                intent.putExtra("theurl",nameInput.getText().toString());
                startActivity(intent);



            }
        });


    }


        private void showToast(String text){
            Toast.makeText(ActivityOne.this,text,Toast.LENGTH_SHORT).show();
        }
    }

