package com.example.ripu.mydictionary;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ripu on 12/11/2016.
 */

public class JsonUtil {


    private static final String TAG = "jsonLog";
    public Object stringToJson(String stringToJson) {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(stringToJson);
            Log.d(TAG,jsonObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.e(TAG, "Could not parse malformed JSON: \"" + jsonObject + "\"");
        }
        return jsonObject;
    }
}
