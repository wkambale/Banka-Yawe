package must.ac.ug.csce.wesleykambale.BankaYawe;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PaymoneyActivity extends AppCompatActivity implements View.OnClickListener {

    TextView one, two, three, four, five, six, seven, eight, nine, zero, dot;
    ImageView nextarrow, ivDelet;
    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymoney);


        one = (TextView) findViewById(R.id.one);
        two = (TextView) findViewById(R.id.two);
        three = (TextView) findViewById(R.id.three);
        four = (TextView) findViewById(R.id.four);
        five = (TextView) findViewById(R.id.five);
        six = (TextView) findViewById(R.id.six);
        seven = (TextView) findViewById(R.id.seven);
        eight = (TextView) findViewById(R.id.eight);
        nine = (TextView) findViewById(R.id.nine);
        dot = (TextView) findViewById(R.id.dot);
        zero = (TextView) findViewById(R.id.zero);
        nextarrow = (ImageView) findViewById(R.id.nextarrow);
        ivDelet = (ImageView) findViewById(R.id.ivDelet);
        edittext = (EditText) findViewById(R.id.edittext);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        dot.setOnClickListener(this);
        zero.setOnClickListener(this);
        nextarrow.setOnClickListener(this);
        ivDelet.setOnClickListener(this);

        edittext.setShowSoftInputOnFocus(false);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.one:
                edittext.append("1");
                ivDelet.setVisibility(View.VISIBLE);


                break;
            case R.id.two:
                edittext.append("2");
                ivDelet.setVisibility(View.VISIBLE);

                break;
            case R.id.three:
                edittext.append("3");
                ivDelet.setVisibility(View.VISIBLE);

                break;
            case R.id.four:
                edittext.append("4");
                ivDelet.setVisibility(View.VISIBLE);
                break;
            case R.id.five:
                edittext.append("5");
                ivDelet.setVisibility(View.VISIBLE);
                break;
            case R.id.six:
                edittext.append("6");
                ivDelet.setVisibility(View.VISIBLE);
                break;
            case R.id.seven:
                edittext.append("7");
                ivDelet.setVisibility(View.VISIBLE);
                break;
            case R.id.eight:
                edittext.append("8");
                ivDelet.setVisibility(View.VISIBLE);
                break;
            case R.id.nine:
                edittext.append("9");
                ivDelet.setVisibility(View.VISIBLE);
                break;
            case R.id.zero:
                edittext.append("0");
                ivDelet.setVisibility(View.VISIBLE);
                break;
            case R.id.dot:
                edittext.append(".");
                ivDelet.setVisibility(View.VISIBLE);
                break;
            case R.id.nextarrow:
//                {
//                // delete one character
//                String passwordStr = edittext.getText().toString();
//                if (passwordStr.length() > 0) {
//                    String newPasswordStr = new StringBuilder(passwordStr)
//                            .deleteCharAt(passwordStr.length() - 1).toString();
//                    edittext.setText(newPasswordStr);
//                    edittext.setGravity(RIGHT);
//                }
//            }
                break;
            case R.id.ivDelet:

                if (edittext.getText().toString().length() > 1) {
                    String temp = edittext.getText().toString();

                    edittext.setText(temp.substring(0, temp.length() - 1));
                    edittext.setSelection(temp.length() - 1);
                } else {
                    edittext.getText().clear();
                    ivDelet.setVisibility(View.GONE);
                }
                break;

        }


    }
}
