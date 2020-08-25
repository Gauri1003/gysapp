package za.co.programme.gauri.gysapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ServiceProvider extends AppCompatActivity {
    TextView sp;
    TextView tvser;
    TextView tvwe;
    EditText etno;
    EditText etser;
    EditText etspname;
    EditText etadd;
    EditText etwe;
    Button btngen;
    TextView yourid;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_provider);
        sp = findViewById(R.id.sp);
        tvser = findViewById(R.id.tvser);
        tvwe = findViewById(R.id.tvwe);
        etno = findViewById(R.id.etno);
        etser=findViewById(R.id.etser);
        etspname=findViewById(R.id.etspname);
        etadd=findViewById(R.id.etadd);
        etwe=findViewById(R.id.etwe);
        btngen=findViewById(R.id.btngen);
        button=findViewById(R.id.button);
        yourid=findViewById(R.id.yourid);
        yourid.setVisibility(View.GONE);
        btngen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String fullname = etspname.getText().toString().trim();
                String Contact = etno.getText().toString().trim();
                String Service = etser.getText().toString().trim();
                String generate = "Your Unique ID is :  " + fullname.substring(0, 2) + Contact.substring(0, 3) + Service.substring(0, 3);
                yourid.setText(generate);
                yourid.setVisibility(View.VISIBLE);

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etspname.getText().toString().isEmpty() || etno.getText().toString().isEmpty() ||
                        etadd.getText().toString().isEmpty() || etwe.getText().toString().isEmpty()) {
                    Toast.makeText(ServiceProvider.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    String fullname = etspname.getText().toString().trim();
                    String Contact = etno.getText().toString().trim();
                    String address = etadd.getText().toString().trim();
                    String EWorkex = etwe.getText().toString().trim();


                    Intent intent = new Intent(ServiceProvider.this,
                            za.co.programme.gauri.gysapplication.Spstatus.class);
                    intent.putExtra("username2", fullname);
                    intent.putExtra("Contact", Contact);
                    intent.putExtra("workex", EWorkex);
                    intent.putExtra("address", address);
                    startActivity(intent);
                }
            }
        });
    }
}


