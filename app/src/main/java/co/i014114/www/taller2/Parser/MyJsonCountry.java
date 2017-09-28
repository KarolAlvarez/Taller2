package co.i014114.www.taller2.Parser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import co.i014114.www.taller2.Models.MyCountry;

/**
 * Created by root on 27/09/17.
 */

public class MyJsonCountry {

    public static List<MyCountry> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<MyCountry> myCountryList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject item = jsonArray.getJSONObject(i);
            MyCountry country = new MyCountry();
            country.setName(item.getString("name"));
            country.setCapital(item.getString("capital"));
            country.setAlphacode(item.getString("alpha3Code"));
            country.setArea(item.getInt("area"));
            country.setNumeroHabitantes(item.getInt("population"));
            country.setPrefijoTelefonico(item.getString("callingCodes"));
            country.setDominioInternet(item.getString("topLevelDomain"));
            myCountryList.add(country);
        }
        return myCountryList;
    }


}
