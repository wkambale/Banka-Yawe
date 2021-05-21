package must.ac.ug.csce.wesleykambale.BankaYawe;

import android.content.Context;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import must.ac.ug.csce.wesleykambale.Adapter.LoandAdapter;
import must.ac.ug.csce.wesleykambale.ModeClass.LoanModelClass;

public class LoanApplyActivity extends AppCompatActivity {

    private SeekBar mSeekBar;
    private TextView mTextView;
    private Context mContext;


    private ArrayList<LoanModelClass> loanModelClasses;
    private RecyclerView recyclerView;
    private LoandAdapter mAdapter;

    private String title[] = {"1 Y","2Ys","3Ys","4Ys","5Ys"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_apply);

        recyclerView = (RecyclerView)findViewById(R.id.rvLoan);

        loanModelClasses = new ArrayList<>();

        for (int i = 0; i < title.length; i++) {
            LoanModelClass listModelClass = new LoanModelClass(title[i]);

            loanModelClasses.add(listModelClass);
        }
        mAdapter = new LoandAdapter(LoanApplyActivity.this,loanModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(LoanApplyActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        mSeekBar = (SeekBar) findViewById(R.id.seekbar);
        mTextView = (TextView) findViewById(R.id.tv);

        // Set a SeekBar change listener
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // Display the current progress of SeekBar
                mTextView.setText(""+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
