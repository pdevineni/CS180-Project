package theunderground.com.ucrmap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sara on 5/19/16.
 */
public class FoodTruckLocations extends Activity{
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;

    private ImageView iv1;
    private ImageView iv2;
    private ImageView iv3;
    private ImageView iv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_truck_locations_layout);

        tv1 = (TextView)this.findViewById(R.id.textView);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://vcsaweb.ucr.edu/foodtruck-location/Home/GoogleMap?truckName=moomoo";
                Intent i = new Intent(FoodTruckLocations.this, MenuDisplay.class);
                i.putExtra("Path", url);
                startActivity(i);
            }
        });

        tv2 = (TextView)this.findViewById(R.id.textView2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://vcsaweb.ucr.edu/foodtruck-location/Home/GoogleMap?truckName=CulinaryChameleon";
                Intent i = new Intent(FoodTruckLocations.this, MenuDisplay.class);
                i.putExtra("Path", url);
                startActivity(i);
            }
        });

        tv3 = (TextView)this.findViewById(R.id.textView3);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://vcsaweb.ucr.edu/foodtruck-location/Home/GoogleMap?truckName=tartan";
                Intent i = new Intent(FoodTruckLocations.this, MenuDisplay.class);
                i.putExtra("Path", url);
                startActivity(i);
            }
        });

        tv4 = (TextView)this.findViewById(R.id.textView4);
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://vcsaweb.ucr.edu/foodtruck-location/Home/GoogleMap?truckName=BearTracks";
                Intent i = new Intent(FoodTruckLocations.this, MenuDisplay.class);
                i.putExtra("Path", url);
                startActivity(i);
            }
        });
    }

}