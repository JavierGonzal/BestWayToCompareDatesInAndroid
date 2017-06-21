package com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.date;

import com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.BaseView;

import java.util.List;

/**
 * Created by javierg on 14/06/2017.
 */

public class DateContract {

    public interface View extends BaseView<Presenter> {
        void showList(List<String> list);
    }
    public interface Presenter {
        void getData();
        List<String> convertDate(List<String> listDate);

    }
}
