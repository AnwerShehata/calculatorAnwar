package com.example.fouad.calculatoranwar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton addition , subtraction ,divide ,but_call , but_facebook , but_shar , but_instagram;
        addition = findViewById(R.id.but_addition);
        subtraction = findViewById(R.id.but_subtraction);
        divide = findViewById(R.id.but_divide);
        but_call = findViewById(R.id.imageButton_call);
        but_facebook = findViewById(R.id.imageButton_facebook);
        but_shar = findViewById(R.id.imageButton_shar);
        but_instagram = findViewById(R.id.imageButton_instgram);

        final EditText number1 , number2;
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);

        final TextView result ;
        result = findViewById(R.id.result);


        // Definition of Button Addition (+) -----------------------------------------------------------
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nuA = number1.getText().toString();
                String nuB = number2.getText().toString();
                String nuC = String.valueOf(Double.parseDouble(nuA)* Double.parseDouble(nuB));
                String nuD = String.valueOf(Double.parseDouble(nuC) / (100));
                String nuF = String.valueOf(Double.parseDouble(nuD) + Double.parseDouble(nuA));
                result.setText(nuF);
            }
        });


        // Definition of Button Subtraction (-) -----------------------------------------------------------
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nuA = number1.getText().toString();
                String nuB = number2.getText().toString();
                String nuC = String.valueOf(Double.parseDouble(nuA)* Double.parseDouble(nuB));
                String nuD = String.valueOf(Double.parseDouble(nuC) / (100));
                String nuF = String.valueOf(Double.parseDouble(nuD) - Double.parseDouble(nuA));
                result.setText(nuF);
            }
        });


        // Definition of Button Divide (%) -----------------------------------------------------------
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nuA = number1.getText().toString();
                String nuB = number2.getText().toString();
                String nuC = String.valueOf(Double.parseDouble(nuA)* Double.parseDouble(nuB));
                String nuD = String.valueOf(Double.parseDouble(nuC) / (100));
                String nuF = String.valueOf(Double.parseDouble(nuD) % Double.parseDouble(nuA));
                result.setText(nuF);
            }
        });



        // Definition of Button Call  ---------------------------------------------------------------
        but_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_call = new Intent(Intent.ACTION_DIAL);
                intent_call.setData(Uri.parse("tel:95748995"));
                startActivity(intent_call);
            }
        });

        // Definition of Button FaceBook  ---------------------------------------------------------------
        but_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_face = new Intent(Intent.ACTION_VIEW);
                intent_face.setData(Uri.parse("https://www.facebook.com/profile.php?id=100006475464217"));
                startActivity(intent_face);
            }
        });


        // Definition of Button Instagram  ---------------------------------------------------------------
        but_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.behance.net/anwarshehata"));
                startActivity(intent);

            }
        });

        // Definition of Button sharing  ---------------------------------------------------------------
        but_shar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_shareText = new Intent(Intent.ACTION_SEND);
                intent_shareText.putExtra(Intent.EXTRA_TEXT,"لتحميل التطبيق اضغط علي الرابط هنا..https://www.youtube.com/watch?v=VGMiGm0WzGI");
                intent_shareText.setType("text/plain");
                startActivity(Intent.createChooser(intent_shareText,""));

            }
        });



    }
}
