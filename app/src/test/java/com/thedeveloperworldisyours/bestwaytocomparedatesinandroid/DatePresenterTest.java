package com.thedeveloperworldisyours.bestwaytocomparedatesinandroid;


import com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.date.DateContract;
import com.thedeveloperworldisyours.bestwaytocomparedatesinandroid.date.DatePresenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;

/**
 * Created by javierg on 21/06/2017.
 */
public class DatePresenterTest {

    @Mock
    DateContract.View mView;

    DateContract.Presenter mPresenter;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mPresenter = new DatePresenter(mView, "yesterday");
    }

    @Test
    public void dateYesterday() {

        List<String> listDate = new ArrayList<>();
        listDate.add("2017-04-01 14:03:12");

        mPresenter.convertDate(listDate);

        verify(mView).showList(listDate);
    }
}
