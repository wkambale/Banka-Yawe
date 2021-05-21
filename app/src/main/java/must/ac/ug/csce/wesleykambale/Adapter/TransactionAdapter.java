package must.ac.ug.csce.wesleykambale.Adapter;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import must.ac.ug.csce.wesleykambale.BankaYawe.R;
import must.ac.ug.csce.wesleykambale.ModeClass.TransactionModelClass;


public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.MyViewHolder> {
    Context context;


    private List<TransactionModelClass> moviesList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView tvType,tvPrice;
        ImageView ivMain;



        public MyViewHolder(View view) {
            super(view);

            tvType = (TextView) view.findViewById(R.id.tvType);
            tvPrice = (TextView) view.findViewById(R.id.tvPrice);
            ivMain = (ImageView) view.findViewById(R.id.ivMain);

        }

    }


    public TransactionAdapter(Context context, List<TransactionModelClass> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_transaction_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder,final int position) {
        TransactionModelClass movie = moviesList.get(position);
        holder.tvType.setText(movie.getTvType());
        holder.tvPrice.setText(movie.getTvPrice());
        holder.ivMain.setImageResource(movie.getIvMain());




    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }



}


