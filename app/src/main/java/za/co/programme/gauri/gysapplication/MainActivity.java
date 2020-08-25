package za.co.programme.gauri.gysapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        TextView tvwel;
        ImageView ivgys;
        TextView tvsp;
        EditText etus1;
        EditText etps1;
        EditText etus2;
        EditText etps2;
        TextView tvcus;
        Button btnlogin1;
        Button btnlogin2;
        Button create;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            tvwel = findViewById(R.id.tvwel);
            ivgys = findViewById(R.id.ivgys);
            tvsp = findViewById(R.id.tvsp);
            etus1 = findViewById(R.id.etus1);
            etps1 = findViewById(R.id.etps1);
            etus2 = findViewById(R.id.etus2);
            etps2 = findViewById(R.id.etps2);
            create=findViewById(R.id.create);
            tvcus = findViewById(R.id.tvcus);
            btnlogin1 = findViewById(R.id.btnlogin1);
            btnlogin2 = findViewById(R.id.btnlogin2);


            btnlogin2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (etus2.getText().toString().isEmpty() || etps2.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                    } else {
                        String username2 = etus2.getText().toString().trim();
                        String password2 = etps2.getText().toString().trim();
                        Intent intent = new Intent(MainActivity.this,
                                za.co.programme.gauri.gysapplication.LoginCus.class);
                        intent.putExtra("username2", username2);
                        intent.putExtra("password2", password2);
                        startActivity(intent);
                    }
                }
            });
            btnlogin1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (etus1.getText().toString().isEmpty() || etps1.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                    } else {
                        String username = etus1.getText().toString().trim();
                        String password = etps1.getText().toString().trim();
                        Intent intent = new Intent(MainActivity.this,
                                za.co.programme.gauri.gysapplication.LoginSP.class);
                        intent.putExtra("username", username);
                        intent.putExtra("password", password);
                        startActivity(intent);
                    }
                    ;


                }
            });
            create.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,
                            za.co.programme.gauri.gysapplication.ServiceProvider.class);
                    startActivity(intent);

                }
            });
        }}