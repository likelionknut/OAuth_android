package com.example.sangdonpark.authcodeapp.client;

import com.example.sangdonpark.authcodeapp.client.interceptor.OAuth2ClientAuthenticationInterceptor;
import com.example.sangdonpark.authcodeapp.client.oauth2.OAuth2API;
import com.example.sangdonpark.authcodeapp.client.profile.UserProfileAPI;

public class ClientAPI {

    public static final String BASE_URL = "10.0.2.2:8080";

    public static UserProfileAPI userProfile() {
        RetrofitAPIFactory api = new RetrofitAPIFactory(BASE_URL, null);
        return api.getRetrofit().create(UserProfileAPI.class);
    }

    public static OAuth2API oauth2() {
        RetrofitAPIFactory api = new RetrofitAPIFactory(BASE_URL,
                new OAuth2ClientAuthenticationInterceptor());
        return api.getRetrofit().create(OAuth2API.class);
    }

}
