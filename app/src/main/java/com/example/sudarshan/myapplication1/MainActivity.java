package com.example.sudarshan.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

     GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);


    }
    private void setSingleEvent(GridLayout mainGrid){
        //Loop all the child item of Main Grid

        for(int i=0; i<mainGrid.getChildCount();i++){

            CardView cardView = (CardView)mainGrid.getChildAt(i);//It returns the position of maingrids's child view and sets in the cardview
            final int finalI=i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    if(finalI == 0)//Open activity one
                    {
                        Intent intent = new Intent (MainActivity.this,ActivityOne.class);
                        startActivity(intent);
                    }
                    else  if(finalI == 1)//Open activity one
                    {
                        Intent intent = new Intent (MainActivity.this,ActivityTwo.class);
                        startActivity(intent);
                    }
                    else  if(finalI == 2)//Open activity one
                    {
                        Intent intent = new Intent (MainActivity.this,ActivityThree.class);
                        startActivity(intent);
                    }
                    else  if(finalI == 3)//Open activity one
                    {
                        Intent intent = new Intent (MainActivity.this,ActivityFour.class);
                        startActivity(intent);
                    }
                    else  if(finalI == 4)//Open activity one
                    {
                        Intent intent = new Intent (MainActivity.this,ActivityFive.class);
                        startActivity(intent);
                    }
                    else  if(finalI == 5)//Open activity one
                    {
                        Intent intent = new Intent (MainActivity.this,ActivitySix.class);
                        startActivity(intent);
                    }
                    else  if(finalI == 6)//Open activity one
                    {
                        Intent intent = new Intent (MainActivity.this,ActivitySeven.class);
                        startActivity(intent);
                    }
                    else  if(finalI == 7)//Open activity one
                    {
                        Intent intent = new Intent (MainActivity.this,ActivitySeven.class);
                        startActivity(intent);
                    }
                   

                }
            });
        }
    }
}
