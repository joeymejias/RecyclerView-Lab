package example.com.recyclerviewlab;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by joey on 7/5/16.
 */
public class CustomViewHolder1 extends RecyclerView.ViewHolder {

    public LinearLayout custom_linear_layout_1;
    public ImageView custom_1_ImageView;
    public TextView custom_1_TextView1;
    public TextView custom_1_TextView2;

    public CustomViewHolder1(View itemView) {
        super(itemView);

        custom_linear_layout_1 = (LinearLayout) itemView.findViewById(R.id.custom_linear_layout_1);
        custom_1_ImageView = (ImageView) itemView.findViewById(R.id.custom_1_image_view_1);
        custom_1_TextView1 = (TextView) itemView.findViewById(R.id.custom_1_text_view_1);
        custom_1_TextView2 = (TextView) itemView.findViewById(R.id.custom_1_text_view_2);

    }

    public Context getContext(){
        return custom_1_ImageView.getContext();
    }
}
