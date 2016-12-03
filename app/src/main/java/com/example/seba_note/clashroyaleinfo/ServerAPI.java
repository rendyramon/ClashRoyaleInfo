package com.example.seba_note.clashroyaleinfo;

import com.example.seba_note.clashroyaleinfo.Model.Card;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;


public interface ServerAPI {

    public static final String ENDPOINT = "http://www.clashapi.xyz";


    @GET("/api/{id}")
    Observable<List<Card>> getCards(@Path("id")String id);
}
