package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xin on 2017/10/19.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
