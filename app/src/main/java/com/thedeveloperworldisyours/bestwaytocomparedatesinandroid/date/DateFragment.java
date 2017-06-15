package com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.date;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.common.DividerVerticalItemDecoration;
import com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.R;

import java.util.List;

public class DateFragment extends Fragment implements DateContract.View{
    RecyclerView mRecyclerView;

    DateContract.Presenter mPresenter;
    public DateFragment() {
        // Required empty public constructor
    }

    public static DateFragment newInstance() {
        return new DateFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.date_fragmen, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.data_fragment_recycler_view);
        mPresenter.getData();
        return view;
    }



    @Override
    public void showList(List<String> list) {
        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //Divider decoration
        RecyclerView.ItemDecoration itemDecoration =
                new DividerVerticalItemDecoration(getActivity());
        mRecyclerView.addItemDecoration(itemDecoration);

        DateAdapter adapter = new DateAdapter(list);
        mRecyclerView.setAdapter(adapter);

    }

    @Override
    public void setPresenter(DateContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
