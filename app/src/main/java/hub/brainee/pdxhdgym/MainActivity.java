package hub.brainee.pdxhdgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button abtUs, btnAllTrainings, allPlans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        Utils.initTraining();
        //TODO: Create listeners over here

        btnAllTrainings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllTrainingsActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initViews() {

        abtUs = findViewById(R.id.btnAbtUs);
        btnAllTrainings = findViewById(R.id.btnActivities);
        allPlans = findViewById(R.id.btnPlan);
    }
}