package example.com.recyclerviewlab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by joey on 7/5/16.
 */
public class CustomViewHolder2 extends RecyclerView.ViewHolder {

    public RelativeLayout custom_linear_layout_2;
    public ImageView custom_2_ImageView;
    public TextView custom_2_TextView1;
    public TextView custom_2_TextView2;
    public CheckBox custom_2_Checkbox;

    public CustomViewHolder2(View itemView) {
        super(itemView);

        custom_linear_layout_2 = (RelativeLayout) itemView.findViewById(R.id.custom_linear_layout_2);
        custom_2_ImageView = (ImageView) itemView.findViewById(R.id.custom_2_image_view_1);
        custom_2_TextView1 = (TextView) itemView.findViewById(R.id.custom_2_text_view_1);
        custom_2_TextView2 = (TextView) itemView.findViewById(R.id.custom_2_text_view_2);
        custom_2_Checkbox = (CheckBox) itemView.findViewById(R.id.custom_2_checkbox);
    }

    public Context getContext(){
        return custom_2_ImageView.getContext();
    }
}
