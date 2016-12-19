package com.example.ripu.mydictionary;


import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import com.example.ripu.api.RetrieveEntry;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "word";
    AutoCompleteTextView toBeSearchedWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toBeSearchedWord = (AutoCompleteTextView) findViewById(R.id.searchBox);
    }

    public void searchWord(View view) {
        toBeSearchedWord = (AutoCompleteTextView) findViewById(R.id.searchBox);
        String extractText = toBeSearchedWord.getText().toString();
        Log.d(TAG, extractText);
        new CallbackTask().execute(APIConstants.uri+extractText);
    }

    //in android calling network requests on the main thread forbidden by default
    //create class to do async job
    private class CallbackTask extends AsyncTask<String, Integer, String> {

        @Override
        protected String doInBackground(String... params) {

            final String app_id = APIConstants.app_id;
            final String app_key = APIConstants.app_key;
            try {
                URL url = new URL(params[0]);
                HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
                urlConnection.setRequestProperty("Accept", "application/json");
                urlConnection.setRequestProperty("app_id", app_id);
                urlConnection.setRequestProperty("app_key", app_key);
                int responseCode = urlConnection.getResponseCode();
                if (responseCode != 200) {

                    String response = new ResponseManager().responseCodeFinder(responseCode);
                    Log.d(TAG, response);
                    return null;
                }

                // read the output from the server
                BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                StringBuilder stringBuilder = new StringBuilder();

                String line = null;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line + "\n");
                }

                return stringBuilder.toString();

            } catch (Exception e) {
                e.printStackTrace();
                return e.toString();
            }
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            Log.d(TAG,result);
            stringFromApiHandler(result);
        }
    }

    private void stringFromApiHandler(String stringFromApi) {
        JsonUtil util = new JsonUtil();
        Object obj =util.stringToJson(stringFromApi);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            RetrieveEntry retrieveEntry = objectMapper.readValue(obj.toString(),RetrieveEntry.class);
            System.out.println(retrieveEntry);
            String prettyStaff1 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(retrieveEntry);
            System.out.println(prettyStaff1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public void callApi(String toBeSearchedWord){
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


    }*/



}