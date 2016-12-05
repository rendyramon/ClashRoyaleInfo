package com.example.seba_note.clashroyaleinfo.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.seba_note.clashroyaleinfo.Model.Card;
import com.example.seba_note.clashroyaleinfo.Presenter.CardPresenter;
import com.example.seba_note.clashroyaleinfo.Presenter.Ipresenter;
import com.example.seba_note.clashroyaleinfo.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by seba-note on 5/12/2016.
 */

public class CardFragment extends Fragment implements Iview {

    @BindView(R.id.recycler)
    RecyclerView recycler;
    private MyAdapter adapter;
    private Ipresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.card_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new MyAdapter(getActivity());
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));

        if (presenter == null)
            presenter = new CardPresenter();
        presenter.onTakeView(this);

    }

    @Override
    public void onItemsNext(List<Card> cards) {
        adapter.clear();
        adapter.addAll(cards);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemsError(Throwable throwable) {
        Toast.makeText(getActivity(), throwable.getMessage(), Toast.LENGTH_LONG).show();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        super.onDestroy();
        presenter.onTakeView(null);
        if (getActivity().isFinishing())
            presenter = null;
    }
}
