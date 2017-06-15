package com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.date;

import android.content.Context;

import com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.common.DateUtil;
import com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javierg on 14/06/2017.
 */

public class DatePresenter implements DateContract.Presenter {

    private Context mContext;
    private DateContract.View mView;

    public DatePresenter(DateContract.View mView, Context context) {
        this.mView = mView;
        this.mContext = context;
        mView.setPresenter(this);
    }

    @Override
    public void getData() {
        List<String> listDate = new ArrayList<>();

        listDate.add("2017-04-01 14:03:12");
        listDate.add("2017-05-01 14:03:12");
        listDate.add("2017-06-13 01:03:12");
        listDate.add("2017-06-13 22:03:12");
        listDate.add("2017-06-14 01:03:12");

        mView.showList(convertDate(listDate));
    }

    @Override
    public List<String> convertDate(List<String> listDate) {

        List<String> listResult = new ArrayList<>();
        for (int i = 0; i < listDate.size(); i++) {
            listResult.add(i, DateUtil.compare(listDate.get(i), mContext.getResources().getString(R.string.yesterday)));
        }

        return listResult;
    }
}
