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

public class Mechanic1 extends AppCompatActivity {
    TextView MI;
    TextView MN;
    TextView WE;
    TextView AV;
    TextView tvcon;
    TextView YEAR;
    TextView WID;
    TextView UID;
    TextView PR;
    ImageView YES;
    ImageView NO;
    Button but2;
    TextView n;
    TextView l;
    TextView tvc;
    EditText en;
    EditText el;
    EditText enterno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanic1);
        MI=findViewById(R.id.MI);
        MN=findViewById(R.id.MN);
        WE=findViewById(R.id.WE);
        AV=findViewById(R.id.AV);
        YEAR=findViewById(R.id.YEAR);
        WID=findViewById(R.id.WID);
        UID=findViewById(R.id.UID);
        PR=findViewById(R.id.PR);
        YES=findViewById(R.id.YES);
        NO=findViewById(R.id.NO);
        tvcon=findViewById(R.id.tvcon);
        but2=findViewById(R.id.but2);
        n=findViewById(R.id.n);
        l=findViewById(R.id.l);
        tvc=findViewById(R.id.tvc);
        en=findViewById(R.id.en);
        el=findViewById(R.id.el);
        enterno=findViewById(R.id.enterno);

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (en.getText().toString().isEmpty()||el.getText().toString().isEmpty()||enterno.getText().toString().isEmpty()) {
                    Toast.makeText(Mechanic1.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    String cname = en.getText().toString().trim();
                    String location = el.getText().toString().trim();
                    String number=enterno.getText().toString().trim();
                    Intent intent = new Intent(Mechanic1.this,
                            za.co.programme.gauri.gysapplication.CustomerStatus.class);
                    intent.putExtra("cname", cname);
                    intent.putExtra("location", location);
                    intent.putExtra("Number", number);
                    startActivity(intent);

            }}
        });

        ;


    }}
