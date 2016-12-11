package com.example.ripu.mydictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by ripu on 12/11/2016.
 */

public class URLRetriever {

    public String objectForWordRetriever(String uri, String app_id, String app_key){
        StringBuilder sb = new StringBuilder();
        String line = null;


        try {
            URL url = new URL(uri);
            HttpURLConnection conn = null;
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("app_id",app_id);
            conn.setRequestProperty("app_key",app_key);
            if(conn.getResponseCode() != 200){
                String response = responseCodeFinder(conn.getResponseCode());
                System.out.println("URL : "+url);
                System.out.println("Response : "+response);
                return null;
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            System.out.println("Output from Server .... \n");
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }

            conn.disconnect();
        } catch (ProtocolException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();


    }
    public String responseCodeFinder(int responseCode){

        String response = null;
        switch(responseCode){
            case 400: response =  (ResponseConstants.Bad_Request);
                break;
            case 403 : response =  (ResponseConstants.Authentication_failed);
                break;
            case 404 : response =  (ResponseConstants.Not_Found);
                break;
            case 500 : response = (ResponseConstants.Internal_Server_Error);
                break;
            case 502 : response = (ResponseConstants.Bad_Gateway);
                break;
            case 503 : response = (ResponseConstants.Service_Unavailable);
                break;
            case 504 : response = (ResponseConstants.Gateway_timeout);

        }
        return response;

    }
}
