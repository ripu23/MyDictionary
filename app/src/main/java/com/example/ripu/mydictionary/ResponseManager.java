package com.example.ripu.mydictionary;

/**
 * Created by ripu on 12/19/2016.
 */

public class ResponseManager {

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
