package com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.date;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.R;

import java.util.List;

/**
 * Created by javierg on 14/06/2017.
 */

public class DateAdapter extends RecyclerView.Adapter<DateAdapter.DataObjectHolder> {

    private List<String> mDataset;

    static class DataObjectHolder extends RecyclerView.ViewHolder {
        TextView mLabel;

        DataObjectHolder(View itemView) {
            super(itemView);
            mLabel = (TextView) itemView.findViewById(R.id.data_list_item_name);
        }


    }

    DateAdapter(List<String> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public DateAdapter.DataObjectHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.date_list_item, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DateAdapter.DataObjectHolder holder, int position) {
        holder.mLabel.setText(mDataset.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
