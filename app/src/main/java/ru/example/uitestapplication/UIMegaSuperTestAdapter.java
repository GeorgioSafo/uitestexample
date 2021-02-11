package ru.example.uitestapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author Gevork Safaryan on 05/12/2019
 */
class UIMegaSuperTestAdapter extends RecyclerView.Adapter<UIMegaSuperTestAdapter.MegaViewHolder> {


    @NonNull
    @Override
    public MegaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MegaViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.mega_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MegaViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public class MegaViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;

        public MegaViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.text_view_mega);
        }

        public void bind(int index) {
            mTextView.setText(String.valueOf(index));
        }
    }
}
