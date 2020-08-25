package za.co.programme.gauri.gysapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class Mechanics extends AppCompatActivity {
    TextView tvmechs;
    Button btnmech1;
    Button btnmech2;
    Button btnmech3;
    Button btnmech4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanics);
        tvmechs=findViewById(R.id.tvmechs);
        btnmech1 =findViewById(R.id.btnmech1);
        btnmech2=findViewById(R.id.btnmech2);
        btnmech3=findViewById(R.id.btnmech3);
        btnmech4=findViewById(R.id.btnmech4);
        btnmech1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mechanics.this,
                        za.co.programme.gauri.gysapplication.Mechanic1.class);
                startActivity(intent);
            }
        });
        btnmech2.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(Mechanics.this,
                                                    za.co.programme.gauri.gysapplication.Mechanic1.class);
                                            startActivity(intent);
                                        }
                                    }

        );
        btnmech3.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(Mechanics.this,
                                                    za.co.programme.gauri.gysapplication.Mechanic1.class);
                                            startActivity(intent);
                                        }
                                    }

        );
        btnmech4.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(Mechanics.this,
                                                    za.co.programme.gauri.gysapplication.Mechanic1.class);
                                            startActivity(intent);
                                        }
                                    }

        );
    }
}