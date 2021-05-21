package must.ac.ug.csce.wesleykambale.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import must.ac.ug.csce.wesleykambale.BankaYawe.BankActivity;
import must.ac.ug.csce.wesleykambale.BankaYawe.BankSpendsActivity;
import must.ac.ug.csce.wesleykambale.BankaYawe.BankStatusActivity;
import must.ac.ug.csce.wesleykambale.BankaYawe.BankTransactionActivity;
import must.ac.ug.csce.wesleykambale.BankaYawe.LoanApplyActivity;
import must.ac.ug.csce.wesleykambale.BankaYawe.PaymoneyActivity;
import must.ac.ug.csce.wesleykambale.BankaYawe.R;
import must.ac.ug.csce.wesleykambale.BankaYawe.RegistrationActivity;
import must.ac.ug.csce.wesleykambale.BankaYawe.SelectPaymentActivity;
import must.ac.ug.csce.wesleykambale.BankaYawe.SplashScreenActivity;
import must.ac.ug.csce.wesleykambale.ModeClass.ListModelClass;


public class BlueListAdapter extends RecyclerView.Adapter<BlueListAdapter.MyViewHolder> {
    Context context;


    private List<ListModelClass> moviesList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;



        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);

        }

    }


    public BlueListAdapter(Context context, List<ListModelClass> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder,final int position) {
        ListModelClass movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position==0){

                    Intent intent = new Intent(context, RegistrationActivity.class);
                    context.startActivity(intent);
                }else if (position==1){

                    Intent intent = new Intent(context, BankTransactionActivity.class);
                    context.startActivity(intent);
                }else if (position==2){

                    Intent intent = new Intent(context, BankActivity.class);
                    context.startActivity(intent);
                }else if (position==3){

                    Intent intent = new Intent(context, LoanApplyActivity.class);
                    context.startActivity(intent);
                }else if (position==4){

                    Intent intent = new Intent(context, SelectPaymentActivity.class);
                    context.startActivity(intent);
                }else if (position==5){

                    Intent intent = new Intent(context, BankStatusActivity.class);
                    context.startActivity(intent);
                }else if (position==6){

                    Intent intent = new Intent(context, BankSpendsActivity.class);
                    context.startActivity(intent);
                }else if (position==7){

                    Intent intent = new Intent(context, PaymoneyActivity.class);
                    context.startActivity(intent);
                }else if (position==8){

                    Intent intent = new Intent(context, SplashScreenActivity.class);
                    context.startActivity(intent);
                }

            }

        });

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }



}


