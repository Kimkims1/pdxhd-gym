package hub.brainee.pdxhdgym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button abtUs,allActivities,allPlans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        Utils.initTraining();
        //TODO: Create listeners over here

    }

    private void initViews() {

        abtUs = findViewById(R.id.btnAbtUs);
        allActivities = findViewById(R.id.btnActivities);
        allPlans = findViewById(R.id.btnPlan);
    }
}