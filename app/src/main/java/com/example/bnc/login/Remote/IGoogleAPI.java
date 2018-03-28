package com.example.bnc.login.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by BNC on 21-Mar-18.
 */

public interface IGoogleAPI {
    @GET
    Call<String> getPath(@Url String url);
}
