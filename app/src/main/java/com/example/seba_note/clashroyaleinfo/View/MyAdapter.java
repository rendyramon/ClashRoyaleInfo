package com.example.seba_note.clashroyaleinfo.View;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.seba_note.clashroyaleinfo.Model.Card;
import com.example.seba_note.clashroyaleinfo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seba-note on 3/12/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder> {

    private List<Card> mCards ;
    private Context context;

    public MyAdapter(Context context) {
        this.context = context;
        mCards = new ArrayList<>();
    }

    public MyAdapter(List<Card> mCards, Context context) {
        this.mCards = mCards;
        this.context = context;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        holder.textView.setText(mCards.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mCards.size();
    }

    public void clear() {
        mCards.clear();
    }

    public void addAll (List<Card> cards){
        mCards.addAll(cards);
    }

    class myViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;


        public myViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textview);
        }
    }


}
