package hub.brainee.pdxhdgym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import hub.brainee.pdxhdgym.adapters.TrainingAdapter;

public class AllTrainingsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TrainingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_trainings);

        recyclerView = findViewById(R.id.recyclerview);
        adapter = new TrainingAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

    }
}