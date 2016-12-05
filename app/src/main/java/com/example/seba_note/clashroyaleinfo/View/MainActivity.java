package com.example.seba_note.clashroyaleinfo.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.seba_note.clashroyaleinfo.Model.Card;
import com.example.seba_note.clashroyaleinfo.Presenter.Ipresenter;
import com.example.seba_note.clashroyaleinfo.Presenter.MainPresenter;
import com.example.seba_note.clashroyaleinfo.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Iview {

    private MyAdapter adapter;

    private static Ipresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new MyAdapter(this);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        if (presenter == null)
            presenter = new MainPresenter();
        presenter.onTakeView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onTakeView(null);
        if (isFinishing())
            presenter = null;
    }

    @Override
    public void onItemsNext(List<Card> cards) {
        adapter.clear();
        adapter.addAll(cards);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemsError(Throwable throwable) {
        Toast.makeText(this, throwable.getMessage(), Toast.LENGTH_LONG).show();

    }
}
