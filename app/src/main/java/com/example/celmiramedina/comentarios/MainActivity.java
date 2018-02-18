package com.example.celmiramedina.comentarios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

       /* final RatingBar mRatingBar = (RatingBar) findViewById(R.id.ratingBarEstrellas);
        final TextView mRatingScale = (TextView) findViewById(R.id.mensajeEscala);
        final EditText mFeedback = (EditText) findViewById(R.id.espacioComentario);
        Button mSendFeedback = (Button) findViewById(R.id.btn_enviar);

        mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                mRatingScale.setText(String.valueOf(v));
                switch ((int) ratingBar.getRating()) {
                    case 1:
                        mRatingScale.setText("Muy mal organizador");
                        break;
                    case 2:
                        mRatingScale.setText("Mal organizador");
                        break;
                    case 3:
                        mRatingScale.setText("Buen organizador");
                        break;
                    case 4:
                        mRatingScale.setText("Muy buen organizador");
                        break;
                    case 5:
                        mRatingScale.setText("Excelente organizador");
                        break;
                    default:
                        mRatingScale.setText("");
                }
            }
        });


        mSendFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mFeedback.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor dejanos tus comentarios.", Toast.LENGTH_LONG).show();
                } else {
                    mFeedback.setText("");
                    mRatingBar.setRating(0);
                    Toast.makeText(MainActivity.this, "Gracias por tus comentarios.", Toast.LENGTH_SHORT).show();
                }
            }
        });*/

    }



}
