package com.example.bnc.login.Common;

import com.example.bnc.login.Remote.IGoogleAPI;
import com.example.bnc.login.Remote.RetrofitClient;

/**
 * Created by BNC on 21-Mar-18.
 */

public class Common {
    public static  final  String baseURL="http://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
