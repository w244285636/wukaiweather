package com.example.wukai.wukaiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wukai on 2017/5/26.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

    public Update update;

}
