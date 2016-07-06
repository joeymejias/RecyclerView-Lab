package example.com.recyclerviewlab;

import android.graphics.Color;

/**
 * Created by joey on 7/5/16.
 */
public class CustomObject1 {


    String custom_1_Title;
    String custom_1_Description;
    int custom_1_color;

    public CustomObject1() {
    }

    public CustomObject1(String custom_1_Title, String custom_1_Description, int custom_1_color) {
        this.custom_1_Title = custom_1_Title;
        this.custom_1_Description = custom_1_Description;
        this.custom_1_color = custom_1_color;
    }

    public String getCustom_1_Title() {
        return custom_1_Title;
    }

    public void setCustom_1_Title(String custom_1_Title) {
        this.custom_1_Title = custom_1_Title;
    }

    public String getCustom_1_Description() {
        return custom_1_Description;
    }

    public void setCustom_1_Description(String custom_1_Description) {
        this.custom_1_Description = custom_1_Description;
    }

    public int getCustom_1_color() {
        return custom_1_color;
    }

    public void setCustom_1_color(int custom_1_color) {
        this.custom_1_color = custom_1_color;
    }
}
