package vn.iostar.bt_control;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class ImageView1 extends AppCompatActivity { // 🔹 Đổi tên class tránh trùng với android.widget.ImageView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview); // 🔹 Gán đúng file XML (đổi lại nếu cần)

        // Ánh xạ ImageView từ layout
        ImageView img1 = findViewById(R.id.imageView1);

        // Đặt hình ảnh cho ImageView
        img1.setImageResource(R.drawable.top_background1);
    }
}
