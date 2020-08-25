package za.co.programme.gauri.gysapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginCus extends AppCompatActivity {
   Button btnmech;
    Button btnplum;
    Button btncarp;
    Button btnclean;
    TextView tvSer;
    TextView tvplum;
    TextView tvmech;
    TextView tvclean;
    TextView tvcarp;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_cus);
        btnmech=findViewById(R.id.btnmech);
        btncarp=findViewById(R.id.btncarp);
        btnplum=findViewById(R.id.btnplum);
         btnclean=findViewById(R.id.btnclean);
        tvSer=findViewById(R.id.tvSer);
        tvplum=findViewById(R.id.tvplum);
         tvmech=findViewById(R.id.tvmechs);
         tvclean=findViewById(R.id.tvcalean);
         tvcarp=findViewById(R.id.tvcarp);
        btnmech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginCus.this,
                        za.co.programme.gauri.gysapplication.Mechanics.class);
                startActivity(intent);

    }
});
    }}
