package vn.iostar.bt_control;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
public class Cau2 extends AppCompatActivity {

    private Switch switchTheme;
    private ConstraintLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cau2);

        // Ánh xạ các thành phần
        switchTheme = findViewById(R.id.switchTheme);
        mainLayout = findViewById(R.id.mainLayout);

        // Sự kiện khi bật/tắt Switch
        switchTheme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mainLayout.setBackgroundResource(R.drawable.top_background1);
                } else {
                    mainLayout.setBackgroundResource(R.drawable.top_background2);
                }
            }
        });
    }
}