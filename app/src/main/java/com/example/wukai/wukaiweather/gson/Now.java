package com.example.wukai.wukaiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wukai on 2017/5/26.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }


}
