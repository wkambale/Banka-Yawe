package must.ac.ug.csce.wesleykambale.BankaYawe;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import must.ac.ug.csce.wesleykambale.Adapter.TransactionAdapter;
import must.ac.ug.csce.wesleykambale.ModeClass.TransactionModelClass;
public class BankTransactionActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOne, tvSecond, tvThird;


    private ArrayList<TransactionModelClass> transactionModelClasses;
    private RecyclerView recyclerView;
    private TransactionAdapter mAdapter;

    private Integer image[] = {R.drawable.ic_money,R.drawable.ic_shopping_bag,R.drawable.ic_smartphone,R.drawable.ic_money,R.drawable.ic_shopping_bag,R.drawable.ic_smartphone,
            R.drawable.ic_money,R.drawable.ic_shopping_bag,R.drawable.ic_smartphone,};
    private String title[] = {"Cash Withdrawal","Grocery Store","Mobile Recharge","Cash Withdrawal","Grocery Store","Mobile Recharge",
            "Cash Withdrawal","Grocery Store","Mobile Recharge",};
    private String subtitle[] = {"$ 22.60","$ 12.00","$ 16.40","$ 22.60","$ 12.00","$ 16.40","$ 22.60","$ 12.00","$ 16.40",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_transaction);

        onBindView();
    }

    private void onBindView() {

        tvOne = findViewById(R.id.tVOne);
        tvSecond = findViewById(R.id.tvSecond);
        tvThird = findViewById(R.id.tvThird);

        tvOne.setOnClickListener(this);
        tvSecond.setOnClickListener(this);
        tvThird.setOnClickListener(this);

        recyclerView = (RecyclerView)findViewById(R.id.rvTransaction);

        transactionModelClasses = new ArrayList<>();

        for (int i = 0; i < title.length; i++) {
            TransactionModelClass listModelClass = new TransactionModelClass(image[i],title[i],subtitle[i]);

            transactionModelClasses.add(listModelClass);
        }
        mAdapter = new TransactionAdapter(BankTransactionActivity.this,transactionModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(BankTransactionActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.tVOne:

                tvOne.setBackgroundResource(R.drawable.blue_rect);
                tvSecond.setBackgroundResource(R.drawable.blue_light_rect1);
                tvThird.setBackgroundResource(R.drawable.blue_light_rect1);

                tvOne.setTextColor(getResources().getColor(R.color.white));
                tvSecond.setTextColor(getResources().getColor(R.color.blue));
                tvThird.setTextColor(getResources().getColor(R.color.blue));

                break;

            case R.id.tvSecond:

                tvOne.setBackgroundResource(R.drawable.blue_light_rect1);
                tvSecond.setBackgroundResource(R.drawable.blue_rect);
                tvThird.setBackgroundResource(R.drawable.blue_light_rect1);

                tvOne.setTextColor(getResources().getColor(R.color.blue));
                tvSecond.setTextColor(getResources().getColor(R.color.white));
                tvThird.setTextColor(getResources().getColor(R.color.blue));

                break;

            case R.id.tvThird:


                tvOne.setBackgroundResource(R.drawable.blue_light_rect1);
                tvSecond.setBackgroundResource(R.drawable.blue_light_rect1);
                tvThird.setBackgroundResource(R.drawable.blue_rect);

                tvOne.setTextColor(getResources().getColor(R.color.blue));
                tvSecond.setTextColor(getResources().getColor(R.color.blue));
                tvThird.setTextColor(getResources().getColor(R.color.white));

                break;


        }
    }
}
