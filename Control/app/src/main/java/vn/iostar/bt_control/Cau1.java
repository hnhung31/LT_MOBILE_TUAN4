package vn.iostar.bt_control;
import java.util.Random;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
public class Cau1 extends AppCompatActivity {

    private ConstraintLayout mainLayout;
    private int[] backgrounds = {
            R.drawable.logo,
            R.drawable.pop_1,
            R.drawable.pop_2,
            R.drawable.pop_3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cau1);

        // Ánh xạ layout chính
        mainLayout = findViewById(R.id.mainLayout);

        // Thay đổi hình nền ngẫu nhiên
        changeBackground();
    }

    private void changeBackground() {
        // Chọn ngẫu nhiên một hình nền từ danh sách
        Random random = new Random();
        int randomIndex = random.nextInt(backgrounds.length);
        mainLayout.setBackgroundResource(backgrounds[randomIndex]);
    }
}