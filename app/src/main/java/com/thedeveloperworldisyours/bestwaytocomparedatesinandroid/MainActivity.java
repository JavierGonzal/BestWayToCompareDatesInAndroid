package com.thedeveloperworldisyours.bestwaytocomparedatesinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.data_activity_recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Divider decoration
        RecyclerView.ItemDecoration itemDecoration =
                new DividerVerticalItemDecoration(this);
        recyclerView.addItemDecoration(itemDecoration);

        DateAdapter adapter = new DateAdapter(getDataSet());
        recyclerView.setAdapter(adapter);

    }

    public List<String> getDataSet() {
        List<String> listDate = new ArrayList<>();

        listDate.add("2017-04-01 14:03:12");
        listDate.add("2017-05-01 14:03:12");
        listDate.add("2017-06-13 01:03:12");
        listDate.add("2017-06-13 22:03:12");
        listDate.add("2017-06-14 01:03:12");

        return convertDate(listDate);
    }

    public List<String> convertDate(List<String> listDate) {
        List<String> listResult = new ArrayList<>();
        for (int i = 0; i < listDate.size(); i++) {
            listResult.add(i, DateUtil.compare(listDate.get(i)));
        }

        return listResult;
    }
}
