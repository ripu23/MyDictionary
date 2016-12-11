package com.example.ripu.mydictionary;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.example.ripu.api.RetrieveEntry;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "word";
    private EditText toBeSearchedWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void searchWord(){
        toBeSearchedWord = (EditText)findViewById(R.id.searchBox);
        Log.d(TAG,toBeSearchedWord.toString());
        callApi(toBeSearchedWord.toString());
    }

    public void callApi(String toBeSearchedWord){
        URLRetriever urlRetriever = new URLRetriever();
        JsonUtil util = new JsonUtil();
        String app_id = APIConstants.app_id;
        String app_key = APIConstants.app_key;
        String uri = APIConstants.uri;
        Log.d(TAG,toBeSearchedWord);
        String stringFromUrlRetriever = urlRetriever.objectForWordRetriever(uri,app_id,app_key);
        Object obj = util.stringToJson(stringFromUrlRetriever);
        RetrieveEntry entry = (RetrieveEntry) util.objectToClass(obj);

    }

}
