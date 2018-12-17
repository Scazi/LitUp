package com.example.shado.litup;

import io.reactivex.Observable;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by Jorren on 3/12/2018.
 */

public interface LitUpDataService {
    @GET("user/settings/{id}")
    Observable<Settings>getSettings(@Path("id") int id);

    @PUT("user/settings/{id}")
    Observable<Settings>updateSettings(@Path("id") int id, @Body Settings settings);
}
