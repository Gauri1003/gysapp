package za.co.programme.gauri.gysapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CustomerStatus extends AppCompatActivity {
    TextView ty;
    TextView status;
    TextView tvstatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_status);
        ty = findViewById(R.id.ty);
        status = findViewById(R.id.status);
        tvstatus = findViewById(R.id.tvstatus);

    }}
