package example.com.recyclerviewlab;

import android.graphics.Color;
import android.widget.CheckBox;

/**
 * Created by joey on 7/5/16.
 */
public class CustomObject2 {

    String custom_2_Title;
    String custom_2_Description;
    int custom_2_color;
    boolean checkbox;

    public CustomObject2() {
    }

    public CustomObject2(String custom_2_Title, String custom_2_Description, int custom_2_color, boolean checkbox) {
        this.custom_2_Title = custom_2_Title;
        this.custom_2_Description = custom_2_Description;
        this.custom_2_color = custom_2_color;
        this.checkbox = checkbox;
    }

    public String getCustom_2_Title() {
        return custom_2_Title;
    }

    public void setCustom_2_Title(String custom_2_Title) {
        this.custom_2_Title = custom_2_Title;
    }

    public String getCustom_2_Description() {
        return custom_2_Description;
    }

    public void setCustom_2_Description(String custom_2_Description) {
        this.custom_2_Description = custom_2_Description;
    }

    public int getCustom_2_color() {
        return custom_2_color;
    }

    public void setCustom_2_color(int custom_2_color) {
        this.custom_2_color = custom_2_color;
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }
}
