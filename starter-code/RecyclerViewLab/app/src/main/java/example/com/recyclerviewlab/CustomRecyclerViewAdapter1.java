package example.com.recyclerviewlab;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by joey on 7/5/16.
 */
public class CustomRecyclerViewAdapter1 extends RecyclerView.Adapter<CustomViewHolder1>{

    List<CustomObject1> customObjectList1;

    public CustomRecyclerViewAdapter1(List<CustomObject1> customObjectList1) {
        this.customObjectList1 = customObjectList1;
    }

    @Override
    public CustomViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom_view_1, parent, false);
        CustomViewHolder1 viewHolder1 = new CustomViewHolder1(parentView);
        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder1 holder, int position) {
        final CustomObject1 customObject1 = customObjectList1.get(position);
        holder.custom_1_ImageView.setBackgroundColor(ContextCompat.getColor(holder.getContext(),customObject1.getCustom_1_color()));
        holder.custom_1_TextView1.setText(customObject1.custom_1_Title);
        holder.custom_1_TextView2.setText(customObject1.custom_1_Description);

        holder.custom_linear_layout_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked row " + customObject1.custom_1_Title, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return customObjectList1.size();
    }
}
