package chapter10_multithreading.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 80997 on 2018/1/3.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherID;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updataTime;
    }
}
