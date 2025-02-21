package vn.iostar.bt_control;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ImageButton1 extends AppCompatActivity { // 🔹 Đổi tên class tránh trùng với android.widget.ImageView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagebutton); // 🔹 Gán đúng file XML (đổi lại nếu cần)

        ImageView img1 = findViewById(R.id.imageView1);
        ImageButton img2 = findViewById(R.id.imageButton1);

        // Xử lý sự kiện khi nhấn ImageButton
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Đổi hình ảnh và kích thước
                img1.setImageResource(R.drawable.bottom_btn4);
                img1.getLayoutParams().width = 550;
                img1.getLayoutParams().height = 550;
                img1.requestLayout(); // Cập nhật lại layout
            }
        });
    }
}
