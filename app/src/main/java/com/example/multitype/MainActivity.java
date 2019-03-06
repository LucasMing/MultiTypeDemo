package com.example.multitype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import me.drakeet.multitype.MultiTypeAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MultiTypeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.list);
        adapter = new MultiTypeAdapter();

        /*
        adapter.register(Data.class).to(
            new DataType1ViewBinder(),
            new DataType2ViewBinder()
        ).withLinker((position, data) ->
            data.type == Data.TYPE_2 ? 1 : 0
        );
        */

        adapter.register(Data.class).to(
                new DataType1ViewBinder(),
                new DataType2ViewBinder()
        ).withClassLinker((position, data) -> {
            if (data.type == Data.TYPE_2) {
                return DataType2ViewBinder.class;
            } else {
                return DataType1ViewBinder.class;
            }
        });

        List<Data> list = new ArrayList<>();
        for (int i = 0; i < 30; i = i + 2) {
            list.add(new Data("title: " + i, Data.TYPE_1));
            list.add(new Data("title: " + i + 1, Data.TYPE_2));
        }

        adapter.setItems(list);
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
    }


}
