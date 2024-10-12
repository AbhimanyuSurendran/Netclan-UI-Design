package abhimanyu.surendran.internship_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Personal(View view) {
        CardView personal = findViewById(R.id.Personal);
        personal.setOnClickListener(view1 -> startActivity(new Intent(MainActivity.this, MainActivity2.class)));
    }

    public void Business(View view) {
        CardView business = findViewById(R.id.Business);
        business.setOnClickListener(view1 -> startActivity(new Intent(MainActivity.this, MainActivity2.class)));
    }

    public void Merchant(View view) {
        CardView merchant = findViewById(R.id.Merchant);
        merchant.setOnClickListener(view1 -> startActivity(new Intent(MainActivity.this, MainActivity2.class)));
    }
}