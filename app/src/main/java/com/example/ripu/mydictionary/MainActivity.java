package com.example.ripu.mydictionary;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import com.example.ripu.api.RetrieveEntry;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "word";
    AutoCompleteTextView toBeSearchedWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toBeSearchedWord = (AutoCompleteTextView) findViewById(R.id.searchBox);


    }

    public void searchWord(View view){
        toBeSearchedWord = (AutoCompleteTextView)findViewById(R.id.searchBox);
        String extractText = toBeSearchedWord.getText().toString();
        Log.d(TAG,extractText);
        callApi(extractText);
    }

    public void callApi(String toBeSearchedWord){
        URLRetriever urlRetriever = new URLRetriever();
        JsonUtil util = new JsonUtil();
        String app_id = APIConstants.app_id;
        String app_key = APIConstants.app_key;
        String uri = APIConstants.uri;
        uri = uri+ toBeSearchedWord;
        Log.d(TAG,toBeSearchedWord);
        String stringFromUrlRetriever = urlRetriever.objectForWordRetriever(uri,app_id,app_key);
        Object obj = util.stringToJson(stringFromUrlRetriever);
        RetrieveEntry entry = (RetrieveEntry) util.objectToClass(obj);
        //Conversion to class part done.
        //TODO: 1.proper logging messages, error messages.
        //// TODO: 2.testing. 3. setting the searched word to the textbox in the ui.


    }


}
