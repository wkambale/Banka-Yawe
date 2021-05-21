package must.ac.ug.csce.wesleykambale.BankaYawe;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout llOne, llSecond;
    TextView tvSelectedSim, tvSelectedNo, tvSelectedSimSecond, tvSelectedNoSecond;
    ImageView ivSelectedSim, ivSelectedSimSecond;
    Animation zoomIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        zoomIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom_in);

        onBindVew();
    }

    private void onBindVew() {

        llOne = findViewById(R.id.llOne);
        llSecond = findViewById(R.id.llSecond);
        tvSelectedSim = findViewById(R.id.tvSelectedSim);
        tvSelectedNo = findViewById(R.id.tvSelectedNo);
        tvSelectedSimSecond = findViewById(R.id.tvSelectedSimSecond);
        tvSelectedNoSecond = findViewById(R.id.tvSelectedNoSecond);
        ivSelectedSim = findViewById(R.id.ivSelectedSim);
        ivSelectedSimSecond = findViewById(R.id.ivSelectedSimSecond);

        llOne.setOnClickListener(this);
        llSecond.setOnClickListener(this);

        llOne.setBackgroundResource(R.drawable.blue_light_rect);
        llSecond.setBackgroundResource(R.drawable.white_light_rect);
        tvSelectedNo.setTextColor(getResources().getColor(R.color.dark_blue));
        tvSelectedSim.setTextColor(getResources().getColor(R.color.dark_blue));
        tvSelectedNoSecond.setTextColor(getResources().getColor(R.color.light_blue));
        tvSelectedSimSecond.setTextColor(getResources().getColor(R.color.light_blue));
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.llOne:

                llOne.setBackgroundResource(R.drawable.blue_light_rect);
                llSecond.setBackgroundResource(R.drawable.white_light_rect);
                ivSelectedSim.setImageResource(R.drawable.ic_big_sim);
                ivSelectedSimSecond.setImageResource(R.drawable.ic_small_sim);
                tvSelectedNo.setTextColor(getResources().getColor(R.color.dark_blue));
                tvSelectedSim.setTextColor(getResources().getColor(R.color.dark_blue));
                tvSelectedNoSecond.setTextColor(getResources().getColor(R.color.light_blue));
                tvSelectedSimSecond.setTextColor(getResources().getColor(R.color.light_blue));


                ivSelectedSim.startAnimation(zoomIn);
                tvSelectedNo.startAnimation(zoomIn);
                tvSelectedSim.startAnimation(zoomIn);
                ivSelectedSimSecond.clearAnimation();
                tvSelectedNoSecond.clearAnimation();
                tvSelectedSimSecond.clearAnimation();

                break;


            case R.id.llSecond:


                llOne.setBackgroundResource(R.drawable.white_light_rect);
                llSecond.setBackgroundResource(R.drawable.blue_light_rect);
                ivSelectedSim.setImageResource(R.drawable.ic_small_sim);
                ivSelectedSimSecond.setImageResource(R.drawable.ic_big_sim);
                tvSelectedNo.setTextColor(getResources().getColor(R.color.light_blue));
                tvSelectedSim.setTextColor(getResources().getColor(R.color.light_blue));
                tvSelectedNoSecond.setTextColor(getResources().getColor(R.color.dark_blue));
                tvSelectedSimSecond.setTextColor(getResources().getColor(R.color.dark_blue));

                ivSelectedSimSecond.startAnimation(zoomIn);
                tvSelectedNoSecond.startAnimation(zoomIn);
                tvSelectedSimSecond.startAnimation(zoomIn);
                ivSelectedSim.clearAnimation();
                tvSelectedNo.clearAnimation();
                tvSelectedSim.clearAnimation();

                break;

        }

    }
}
