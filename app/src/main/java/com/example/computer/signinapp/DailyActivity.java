package com.example.computer.signinapp;

<<<<<<< HEAD
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.Viewport;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Random;

public class DailyActivity extends AppCompatActivity {
    private static final Random RANDOM = new Random();
    private LineGraphSeries<DataPoint> series;
    private int lastX = 0;

=======
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class DailyActivity extends AppCompatActivity {
    Button b1,b2;
    EditText E1;
>>>>>>> MEAM 3.3
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);
<<<<<<< HEAD
        GraphView graph = (GraphView) findViewById(R.id.graph);
        // data
        series = new LineGraphSeries<DataPoint>();
        graph.addSeries(series);
        // customize a little bit viewport
        Viewport viewport = graph.getViewport();
        viewport.setYAxisBoundsManual(true);
        viewport.setMinY(0);
        viewport.setMaxY(10);
        viewport.setScrollable(true);
    }
    @Override
    protected void onResume() {
        super.onResume();
        // we're going to simulate real time with thread that append data to the graph
        new Thread(new Runnable() {

            @Override
            public void run() {
                // we add 100 new entries
                for (int i = 0; i < 100; i++) {
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            addEntry();
                        }
                    });

                    // sleep to slow down the add of entries
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        // manage error ...
                    }
                }
            }
        }).start();
    }

    // add random data to graph
    private void addEntry() {
        // here, we choose to display max 10 points on the viewport and we scroll to end
        series.appendData(new DataPoint(lastX++, RANDOM.nextDouble() * 10d), true, 10);
    }
=======
        b1 = (Button)findViewById(R.id.today);
        b2=(Button)findViewById(R.id.get);
        E1=(EditText)findViewById(R.id.getdate) ;
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                Intent dailyres = new Intent(getApplicationContext(), DailyRes.class);
                startActivity(dailyres);

            }


        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getres=new Intent(getApplicationContext(),DailyRes.class);
                String getdate=E1.getText().toString().trim();

                getres.putExtra("getdate",getdate);
                startActivity(getres);
            }
        });
    }




>>>>>>> MEAM 3.3
}
