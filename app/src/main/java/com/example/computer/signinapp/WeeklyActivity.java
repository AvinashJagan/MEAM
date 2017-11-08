package com.example.computer.signinapp;

<<<<<<< HEAD
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WeeklyActivity extends AppCompatActivity {

=======
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WeeklyActivity extends AppCompatActivity {
Button b1;
    EditText E1,E2;
>>>>>>> MEAM 3.3
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly);
<<<<<<< HEAD
=======
        b1 = (Button)findViewById(R.id.getweekly);
        E1=(EditText)findViewById(R.id.date1) ;
        E2=(EditText)findViewById(R.id.date2) ;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weekres=new Intent(getApplicationContext(),Weeklyres.class);
//             String date1 =E1.getText().toString().trim();
//                String date2 =E2.getText().toString().trim();
//               weekres.putExtra("weekdata",date1);
//               weekres.putExtra("weekdata",date2);
                startActivity(weekres);
            }
        });
>>>>>>> MEAM 3.3
    }
}
