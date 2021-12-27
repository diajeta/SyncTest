package ng.com.ahante.synctest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        recyclerView = findViewById(R.id.recylerView);
        name = findViewById(R.id.name);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitName(View view){

    }
}