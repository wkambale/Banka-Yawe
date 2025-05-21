package must.ac.ug.csce.wesleykambale.BankaYawe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import must.ac.ug.csce.wesleykambale.Adapter.BlueListAdapter;
import must.ac.ug.csce.wesleykambale.ModeClass.ListModelClass;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ListModelClass> listModelClasses;
    private RecyclerView recyclerView;
    private BlueListAdapter mAdapter;

    private String title[] = {"RegistrationActivity","BankTransactionActivity","LoanApplyActivity","SelectPaymentActivity",
    "BankStatusActivity","BankSpendsActivity","PayMoneyActivity","SplashScreenActivity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        listModelClasses = new ArrayList<>();

        for (int i = 0; i < title.length; i++) {
            ListModelClass listModelClass = new ListModelClass(title[i]);

            listModelClasses.add(listModelClass);
        }
        mAdapter = new BlueListAdapter(MainActivity.this,listModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
