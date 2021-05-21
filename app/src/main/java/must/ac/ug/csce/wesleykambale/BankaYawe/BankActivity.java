package must.ac.ug.csce.wesleykambale.BankaYawe;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

import must.ac.ug.csce.wesleykambale.Adapter.TransactionAdapter;
import must.ac.ug.csce.wesleykambale.ModeClass.TransactionModelClass;

public class BankActivity extends AppCompatActivity implements View.OnClickListener {


    private ArrayList<TransactionModelClass> transactionModelClasses;
    private RecyclerView recyclerView;
    private TransactionAdapter mAdapter;

    private Integer image[] = {R.drawable.ic_money,R.drawable.ic_shopping_bag,R.drawable.ic_smartphone,R.drawable.ic_money,R.drawable.ic_shopping_bag,R.drawable.ic_smartphone,
            R.drawable.ic_money,R.drawable.ic_shopping_bag,R.drawable.ic_smartphone,};
    private String title[] = {"Cash Withdrawal","Grocery Store","Mobile Recharge","Cash Withdrawal","Grocery Store","Mobile Recharge",
            "Cash Withdrawal","Grocery Store","Mobile Recharge",};
    private String subtitle[] = {"$ 22.60","$ 12.00","$ 16.40","$ 22.60","$ 12.00","$ 16.40","$ 22.60","$ 12.00","$ 16.40",};


    private DrawerLayout drawer;
    private NavigationView navigationView;
    ImageView imageView;


    LinearLayout llOne,llSecond,llThird,llFourth,llFifth,llSixth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_bank);


        llOne = findViewById(R.id.llOne);
        llSecond = findViewById(R.id.llSecond);
        llThird = findViewById(R.id.llThird);
        llFourth = findViewById(R.id.llFourth);
        llFifth = findViewById(R.id.llFifth);
        llSixth = findViewById(R.id.llSixth);

        llOne.setOnClickListener(this);
        llSecond.setOnClickListener(this);
        llThird.setOnClickListener(this);
        llFourth.setOnClickListener(this);
        llFifth.setOnClickListener(this);
        llSixth.setOnClickListener(this);



        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);


        imageView = findViewById(R.id.navigation_menu);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDrawer();
            }
        });

        recyclerView = (RecyclerView)findViewById(R.id.rvTransaction);

        transactionModelClasses = new ArrayList<>();

        for (int i = 0; i < title.length; i++) {
            TransactionModelClass listModelClass = new TransactionModelClass(image[i],title[i],subtitle[i]);

            transactionModelClasses.add(listModelClass);
        }
        mAdapter = new TransactionAdapter(BankActivity.this,transactionModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(BankActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }


    public void openDrawer() {
        if (drawer.isDrawerOpen(navigationView)) {
            drawer.closeDrawer(navigationView);
        } else {
            drawer.openDrawer(navigationView);
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.llOne:


                llOne.setBackgroundColor(Color.parseColor("#fafafa"));
                llSecond.setBackgroundColor(Color.parseColor("#ffffff"));
                llThird.setBackgroundColor(Color.parseColor("#ffffff"));
                llFourth.setBackgroundColor(Color.parseColor("#ffffff"));
                llFifth.setBackgroundColor(Color.parseColor("#ffffff"));
                llSixth.setBackgroundColor(Color.parseColor("#ffffff"));

                break;


            case R.id.llSecond:

                llOne.setBackgroundColor(Color.parseColor("#ffffff"));
                llSecond.setBackgroundColor(Color.parseColor("#fafafa"));
                llThird.setBackgroundColor(Color.parseColor("#ffffff"));
                llFourth.setBackgroundColor(Color.parseColor("#ffffff"));
                llFifth.setBackgroundColor(Color.parseColor("#ffffff"));
                llSixth.setBackgroundColor(Color.parseColor("#ffffff"));


                break;

            case R.id.llThird:


                llOne.setBackgroundColor(Color.parseColor("#ffffff"));
                llSecond.setBackgroundColor(Color.parseColor("#ffffff"));
                llThird.setBackgroundColor(Color.parseColor("#fafafa"));
                llFourth.setBackgroundColor(Color.parseColor("#ffffff"));
                llFifth.setBackgroundColor(Color.parseColor("#ffffff"));
                llSixth.setBackgroundColor(Color.parseColor("#ffffff"));


                break;


            case R.id.llFourth:

                llOne.setBackgroundColor(Color.parseColor("#ffffff"));
                llSecond.setBackgroundColor(Color.parseColor("#ffffff"));
                llThird.setBackgroundColor(Color.parseColor("#ffffff"));
                llFourth.setBackgroundColor(Color.parseColor("#fafafa"));
                llFifth.setBackgroundColor(Color.parseColor("#ffffff"));
                llSixth.setBackgroundColor(Color.parseColor("#ffffff"));


                break;


            case R.id.llFifth:


                llOne.setBackgroundColor(Color.parseColor("#ffffff"));
                llSecond.setBackgroundColor(Color.parseColor("#ffffff"));
                llThird.setBackgroundColor(Color.parseColor("#ffffff"));
                llFourth.setBackgroundColor(Color.parseColor("#ffffff"));
                llFifth.setBackgroundColor(Color.parseColor("#fafafa"));
                llSixth.setBackgroundColor(Color.parseColor("#ffffff"));

                break;


            case R.id.llSixth:


                llOne.setBackgroundColor(Color.parseColor("#ffffff"));
                llSecond.setBackgroundColor(Color.parseColor("#ffffff"));
                llThird.setBackgroundColor(Color.parseColor("#ffffff"));
                llFourth.setBackgroundColor(Color.parseColor("#ffffff"));
                llFifth.setBackgroundColor(Color.parseColor("#ffffff"));
                llSixth.setBackgroundColor(Color.parseColor("#fafafa"));

                break;
        }
    }
}
