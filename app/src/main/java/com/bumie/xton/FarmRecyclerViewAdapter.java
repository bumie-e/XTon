package com.bumie.xton;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumie.xton.placeholder.PlaceholderContent.PlaceholderItem;
import com.bumie.xton.databinding.FragmentFarmItemBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class FarmRecyclerViewAdapter extends RecyclerView.Adapter<FarmRecyclerViewAdapter.ViewHolder> {

    private final List<PlaceholderItem> mValues;

    public FarmRecyclerViewAdapter(List<PlaceholderItem> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentFarmItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).id);
        holder.mContentView.setText(mValues.get(position).content);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mIdView;
        public final TextView mContentView;
        public PlaceholderItem mItem;

        public ViewHolder(FragmentFarmItemBinding binding) {
            super(binding.getRoot());
            mIdView = binding.textView3;
            mContentView = binding.textView4;
        }

        @Override
        public String toString() {

            return super.toString() + "'"+ mContentView.toString() +"'";
        }
    }
}