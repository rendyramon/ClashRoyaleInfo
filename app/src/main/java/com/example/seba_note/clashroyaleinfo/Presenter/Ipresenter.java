package com.example.seba_note.clashroyaleinfo.Presenter;

import com.example.seba_note.clashroyaleinfo.View.Iview;
import com.example.seba_note.clashroyaleinfo.View.MainActivity;

/**
 * Created by seba-note on 5/12/2016.
 */

public interface Ipresenter {

    void onTakeView (Iview mainActivity);
    void publish();

}