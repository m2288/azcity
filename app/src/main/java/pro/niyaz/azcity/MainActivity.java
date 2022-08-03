package pro.niyaz.azcity;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv_head;
    TextView tv_city_info;
    Spinner spn_cities;
    ImageView cities_img;
    int[] cities_list = {
            R.drawable.baku_city,
            R.drawable.mingecevir_city,
            R.drawable.sumqayit_city,
            R.drawable.xacmaz_city,
            R.drawable.susa_city,
            R.drawable.kelbecer_city
    };

    @Override
    @SuppressWarnings("unchecked")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        tv_head = findViewById(R.id.tv_head);
        tv_city_info = findViewById(R.id.tv_city_info);
        spn_cities =  findViewById(R.id.spn_cities);
        cities_img = findViewById(R.id.cities_img);

        String[] choose = getResources().getStringArray(R.array.cities);
        String[] about_cities = getResources().getStringArray(R.array.about_cities);
        spn_cities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+choose[position], Toast.LENGTH_SHORT).show();
                /* switch (position){ *** Bu lazım olmadı.
                    case 0:
                        tv_city_info.setText(""+choose[position]);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }*/
                tv_city_info.setText(""+about_cities[position]);
                cities_img.setImageResource(cities_list[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}

