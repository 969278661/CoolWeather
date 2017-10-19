package com.example.coolweather.gson;

import android.app.Activity;
import android.os.Bundle;

import com.example.coolweather.R;
import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
