package must.ac.ug.csce.wesleykambale.BankaYawe;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.infideap.stylishwidget.view.AProgressBar;

import java.util.ArrayList;

import must.ac.ug.csce.wesleykambale.Adapter.TransactionAdapter;
import must.ac.ug.csce.wesleykambale.ModeClass.TransactionModelClass;

public class BankSpendsActivity extends AppCompatActivity {


    private ArrayList<TransactionModelClass> transactionModelClasses;
    private RecyclerView recyclerView;
    private TransactionAdapter mAdapter;

    private Integer image[] = {R.drawable.ic_money,R.drawable.ic_shopping_bag,R.drawable.ic_smartphone,R.drawable.ic_money,R.drawable.ic_shopping_bag,R.drawable.ic_smartphone,
            R.drawable.ic_money,R.drawable.ic_shopping_bag,R.drawable.ic_smartphone,};
    private String title[] = {"Cash Withdrawal","Grocery Store","Mobile Recharge","Cash Withdrawal","Grocery Store","Mobile Recharge",
            "Cash Withdrawal","Grocery Store","Mobile Recharge",};
    private String subtitle[] = {""UGX 1,222.60","UGX 23,012.00","UGX 28,000.40","UGX 14,000","UGX 56,078","UGX 16,100.40","UGX 7,800","UGX 12,293.00","UGX 16,637.40",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_spends);

        AProgressBar iconMultiProgressBar =
                (AProgressBar) findViewById(R.id.progressBar_multi_icon);
        iconMultiProgressBar.setProgressValues(
                20, 80, 90, 100, 70,95);

        iconMultiProgressBar.setProgressColors(
                Color.parseColor("#4e388d"),
                Color.parseColor("#ff7c1c"),
                Color.parseColor("#26d6c9"),
                Color.parseColor("#78d000"),
                Color.parseColor("#ffe51c"),
                Color.parseColor("#ebe7f8"));
        recyclerView = (RecyclerView)findViewById(R.id.rvTransaction);



        transactionModelClasses = new ArrayList<>();

        for (int i = 0; i < title.length; i++) {
            TransactionModelClass listModelClass = new TransactionModelClass(image[i],title[i],subtitle[i]);

            transactionModelClasses.add(listModelClass);
        }
        mAdapter = new TransactionAdapter(BankSpendsActivity.this,transactionModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(BankSpendsActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


    }
}
