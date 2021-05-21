package must.ac.ug.csce.wesleykambale.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import must.ac.ug.csce.wesleykambale.ModeClass.LoanModelClass;
import must.ac.ug.csce.wesleykambale.BankaYawe.R;


public class LoandAdapter extends RecyclerView.Adapter<LoandAdapter.MyViewHolder> {
    Context context;


    private List<LoanModelClass> moviesList;
    int myPos = 0;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView tvTitle;
        LinearLayout llMain;



        public MyViewHolder(View view) {
            super(view);

            tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            llMain = (LinearLayout) view.findViewById(R.id.llMain);


        }

    }


    public LoandAdapter(Context context, List<LoanModelClass> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_loan_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        LoanModelClass movie = moviesList.get(position);
        holder.tvTitle.setText(movie.getTitle());


        if (myPos == position) {
            holder.llMain.setBackgroundResource(R.drawable.loan_blue_rect);
            holder.tvTitle.setTextColor(Color.parseColor("#ffffff"));
        } else {
            holder.llMain.setBackgroundResource(R.drawable.loan_blue_light_rect);
            holder.tvTitle.setTextColor(Color.parseColor("#4211d0"));
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPos = position;
                notifyDataSetChanged();
            }
        });


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


}


