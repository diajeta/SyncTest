package ng.com.ahante.synctest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    EditText name;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Contact> arrayList = new ArrayList<>();
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recylerView);
        name = findViewById(R.id.name);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerAdapter(arrayList);
        recyclerView.setAdapter(adapter);

    }

    public void submitName(View view){

    }
}