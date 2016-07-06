package example.com.recyclerviewlab;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.List;

/**
 * Created by joey on 7/5/16.
 */
public class CustomRecyclerViewAdapter2 extends RecyclerView.Adapter<CustomViewHolder2> {

    List<CustomObject2> customObjectList2;

    public CustomRecyclerViewAdapter2(List<CustomObject2> customObjectList2) {
        this.customObjectList2 = customObjectList2;
    }

    @Override
    public CustomViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom_view_2, parent, false);
        CustomViewHolder2 viewHolder2 = new CustomViewHolder2(parentView);
        return viewHolder2;
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder2 holder, int position) {
        final CustomObject2 customObject2 = customObjectList2.get(position);
        holder.custom_2_ImageView.setBackgroundColor(ContextCompat.getColor(holder.getContext(),customObject2.getCustom_2_color()));
        holder.custom_2_TextView1.setText(customObject2.custom_2_Title);
        holder.custom_2_TextView2.setText(customObject2.custom_2_Description);
        holder.custom_2_Checkbox.setChecked(customObject2.checkbox);

        holder.custom_2_Checkbox.setChecked(customObject2.isCheckbox());

        holder.custom_2_Checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = ((CheckBox) view).isChecked();
                customObject2.setCheckbox(checked);
            }
        });
        holder.custom_linear_layout_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = customObject2.isCheckbox();
                customObject2.setCheckbox(!checked);
                holder.custom_2_Checkbox.isChecked();
                Toast.makeText(view.getContext(), "Checked the checkbox!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return customObjectList2.size();
    }
}
