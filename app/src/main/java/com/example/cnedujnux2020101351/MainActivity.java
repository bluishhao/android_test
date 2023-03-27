package com.example.cnedujnux2020101351;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonCalculate=this.findViewById(R.id.button_calculate);
        EditText editTextScore=this.findViewById(R.id.edittext_frame_score);
        TextView textViewScore=this.findViewById(R.id.textview_score);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String scores=editTextScore.getText().toString();
                String []arrayScore=scores.split(",");
                BowlingGame game=new BowlingGame();
                for (int i=0;i<arrayScore.length;i++){
                    game.roll(Integer.parseInt(arrayScore[i]));
                }
                textViewScore.setText("Total score is"+game.score());
            }
        });
    }
}