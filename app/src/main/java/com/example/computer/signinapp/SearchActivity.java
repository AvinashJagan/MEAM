package com.example.computer.signinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
=======
import android.util.Log;
>>>>>>> MEAM 3.3
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    Button b1;
    EditText ed1;
<<<<<<< HEAD
    FirebaseAuth firebaseAuth;
    DatabaseReference databaseReference,childref;
    ArrayList<User_account> users;
=======

>>>>>>> MEAM 3.3
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
<<<<<<< HEAD
        b1 = (Button)findViewById(R.id.SearchEmp);
        ed1 = (EditText)findViewById(R.id.searchquery);
=======
        ed1 = (EditText)findViewById(R.id.searchquery);
        b1 = (Button)findViewById(R.id.SearchEmp);

>>>>>>> MEAM 3.3
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

<<<<<<< HEAD

=======
                Intent results = new Intent(getApplicationContext(), Searchresults.class);
                String query=ed1.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("query", query);
                results.putExtras(bundle);
                startActivity(results);
>>>>>>> MEAM 3.3

            }
        });
    }

}
