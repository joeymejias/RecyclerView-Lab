package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView1 = (RecyclerView) findViewById(R.id.recycler_view_1);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        mRecyclerView1.setLayoutManager(linearLayoutManager);

        List<CustomObject1> customObject1List = new ArrayList<>();

        customObject1List.add(new CustomObject1("Bacon", "is delicious", R.color.black));
        customObject1List.add(new CustomObject1("Not Bacon", "is not delicious", R.color.green));

        CustomRecyclerViewAdapter1 adapter1 = new CustomRecyclerViewAdapter1(customObject1List);
        mRecyclerView1.setAdapter(adapter1);
    }
}
