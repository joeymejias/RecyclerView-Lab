package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondaryActivity extends AppCompatActivity {

    RecyclerView mRecyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mRecyclerView2 = (RecyclerView) findViewById(R.id.recycler_view_2);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        mRecyclerView2.setLayoutManager(linearLayoutManager);

        List<CustomObject2> customObject2List = new ArrayList<>();

        customObject2List.add(new CustomObject2("Damn", "this was frustrating", R.color.black,false));
        customObject2List.add(new CustomObject2("Hopefully", "Google hires me", R.color.green,true));

        CustomRecyclerViewAdapter2 adapter2 = new CustomRecyclerViewAdapter2(customObject2List);
        mRecyclerView2.setAdapter(adapter2);
    }
}
