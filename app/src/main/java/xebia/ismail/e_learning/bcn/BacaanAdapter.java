package xebia.ismail.e_learning.bcn;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import xebia.ismail.e_learning.R;

/**
 * Created by Zulfa_K on 08-11-2017.
 */

public class BacaanAdapter extends RecyclerView.Adapter<BacaanAdapter.BacaanViewHolder> {

    private ViewHolderClickListener mOnViewHolderClickListener;
    private List<BacaanModel> bacaan;
    private Context context;

    public List<BacaanModel> getListBacaan(){
        return this.bacaan;
    }

    public void setListBacaan(List<BacaanModel> bcn){
        bacaan = bcn;
    }

    public void setClickListener(ViewHolderClickListener viewHolderClickListener){
        mOnViewHolderClickListener = viewHolderClickListener;
    }

    public BacaanAdapter(Context context){
        this.context = context;
    }

    //viewholder
    public class BacaanViewHolder extends RecyclerView.ViewHolder{
        //ui component item
        RelativeLayout layout1Baris, layout2Baris;
        ProgressBar pb1, pb2a, pb2b;
        ImageView ivArab1, ivArab2;
        TextView tvLatin, tvArti;

        public BacaanViewHolder(View itemView) {
            super(itemView);
            //findviewbyid
            layout1Baris = (RelativeLayout) itemView.findViewById(R.id.layoutBacaan1Baris);
            pb1 = (ProgressBar) itemView.findViewById(R.id.pb1Baris);
            ivArab1 = (ImageView) itemView.findViewById(R.id.iv1Baris);

            layout2Baris = (RelativeLayout) itemView.findViewById(R.id.layoutBacaan2Baris);
            pb2a = (ProgressBar) itemView.findViewById(R.id.pb2a);
            pb2b = (ProgressBar) itemView.findViewById(R.id.pb2b);
            ivArab2 = (ImageView) itemView.findViewById(R.id.iv2Baris);

            tvLatin = (TextView) itemView.findViewById(R.id.textViewBacaanLatin);
            tvArti = (TextView) itemView.findViewById(R.id.textViewBacaanArti);
        }
    }
    public BacaanAdapter.BacaanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bacaan,parent,false);
        final BacaanViewHolder viewHolder = new BacaanViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOnViewHolderClickListener.onViewHolderClick(view, viewHolder.getAdapterPosition());
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BacaanAdapter.BacaanViewHolder holder, int position) {
        holder.pb1.setRotation(180);
        holder.pb2a.setRotation(180);
        holder.pb2b.setRotation(180);

        holder.pb1.setScaleY(30f);
        holder.pb2a.setScaleY(20f);
        holder.pb2b.setScaleY(20f);

        if(bacaan.get(position).barisBacaan == 1){
            holder.ivArab1.setImageResource(bacaan.get(position).imgId);

            holder.layout1Baris.setVisibility(View.VISIBLE);
            holder.layout2Baris.setVisibility(View.GONE);
            if(bacaan.get(position).isSelected){
                holder.pb1.setVisibility(View.VISIBLE);
                bacaan.get(position).playProgressbar1(holder.pb1,8000);
            }
            else{
                holder.pb1.setVisibility(View.GONE);
            }
        }
        else if(bacaan.get(position).barisBacaan == 2){
            holder.ivArab2.setImageResource(bacaan.get(position).imgId);

            holder.layout1Baris.setVisibility(View.GONE);
            holder.layout2Baris.setVisibility(View.VISIBLE);
            if(bacaan.get(position).isSelected){
                holder.pb2a.setVisibility(View.VISIBLE);
                holder.pb2b.setVisibility(View.VISIBLE);
                bacaan.get(position).playProgressbar2(holder.pb2a,5000,holder.pb2b,2000);
            }
            else{
                holder.pb2a.setVisibility(View.GONE);
                holder.pb2b.setVisibility(View.GONE);
            }
        }

        holder.tvArti.setText(bacaan.get(position).arti);
        holder.tvLatin.setText(bacaan.get(position).latin);
    }

    @Override
    public int getItemCount() {
        return bacaan.size();
    }

    public interface ViewHolderClickListener{
        void onViewHolderClick(View v, int position);
    }
}
