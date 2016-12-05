package com.example.seba_note.clashroyaleinfo.View;

import com.example.seba_note.clashroyaleinfo.Model.Card;

import java.util.List;

/**
 * Created by seba-note on 5/12/2016.
 */

public interface Iview {

    void onItemsNext(List<Card> cards);
    void onItemsError(Throwable throwable);
}
