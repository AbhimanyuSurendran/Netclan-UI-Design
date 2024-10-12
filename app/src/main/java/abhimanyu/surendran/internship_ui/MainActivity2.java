package abhimanyu.surendran.internship_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        drawerLayout = findViewById(R.id.drawer_layout);
        ImageView imageView = findViewById(R.id.profile);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toggle the drawer when the ImageView is clicked
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });
    }


    public void personal(View view) {
        Button personal = findViewById(R.id.personal);
        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, PersonalFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // Name can be null
                        .commit();
            }
        });
    }

    public void business(View view) {
        Button business = findViewById(R.id.business);
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, BusinessFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // Name can be null
                        .commit();
            }
        });
    }

    public void merchant(View view) {
        Button merchant = findViewById(R.id.merchant);
        merchant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, MerchantFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // Name can be null
                        .commit();
            }
        });
    }

    public void C1(View view) {
        CardView C1 = findViewById(R.id.C1);
        C1.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C2(View view) {
        CardView C2 = findViewById(R.id.C2);
        C2.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C3(View view) {
        CardView C3 = findViewById(R.id.C3);
        C3.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C4(View view) {
        CardView C4 = findViewById(R.id.C4);
        C4.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C5(View view) {
        CardView C5 = findViewById(R.id.C5);
        C5.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C6(View view) {
        CardView C6 = findViewById(R.id.C6);
        C6.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C7(View view) {
        CardView C7 = findViewById(R.id.C7);
        C7.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C8(View view) {
        CardView C8 = findViewById(R.id.C8);
        C8.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C9(View view) {
        CardView C9 = findViewById(R.id.C9);
        C9.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C10(View view) {
        CardView C10 = findViewById(R.id.C10);
        C10.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C11(View view) {
        CardView C11 = findViewById(R.id.C11);
        C11.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C12(View view) {
        CardView C12 = findViewById(R.id.C12);
        C12.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C13(View view) {
        CardView C13 = findViewById(R.id.C13);
        C13.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C14(View view) {
        CardView C14 = findViewById(R.id.C14);
        C14.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C15(View view) {
        CardView C15 = findViewById(R.id.C15);
        C15.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C16(View view) {
        CardView C16 = findViewById(R.id.C16);
        C16.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C17(View view) {
        CardView C17 = findViewById(R.id.C17);
        C17.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C18(View view) {
        CardView C18 = findViewById(R.id.C18);
        C18.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C19(View view) {
        CardView C19 = findViewById(R.id.C19);
        C19.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C20(View view) {
        CardView C20 = findViewById(R.id.C20);
        C20.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C21(View view) {
        CardView C21 = findViewById(R.id.C21);
        C21.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C22(View view) {
        CardView C22 = findViewById(R.id.C22);
        C22.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C23(View view) {
        CardView C23 = findViewById(R.id.C23);
        C23.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C24(View view) {
        CardView C24 = findViewById(R.id.C24);
        C24.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C25(View view) {
        CardView C25 = findViewById(R.id.C25);
        C25.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C26(View view) {
        CardView C26 = findViewById(R.id.C26);
        C26.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C27(View view) {
        CardView C27 = findViewById(R.id.C27);
        C27.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C28(View view) {
        CardView C28 = findViewById(R.id.C28);
        C28.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C29(View view) {
        CardView C29 = findViewById(R.id.C29);
        C29.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
    public void C30(View view) {
        CardView C30 = findViewById(R.id.C30);
        C30.setOnClickListener(view1 -> startActivity(new Intent(MainActivity2.this, profile_page.class)));
    }
}
