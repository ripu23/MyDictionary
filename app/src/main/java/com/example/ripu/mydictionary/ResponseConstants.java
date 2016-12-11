package com.example.ripu.mydictionary;

/**
 * Created by ripu on 12/4/2016.
 */

public interface ResponseConstants {

    String Bad_Request = "The request was invalid or cannot be otherwise served";
    String Authentication_failed = "The request failed due to invalid credentials";
    String Not_Found = "No information available or the requested URL was not found on the server";
    String Internal_Server_Error = "Something is broken";
    String Bad_Gateway = "Oxford Dictionaries API is down or being upgraded";
    String Service_Unavailable = "The Oxford Dictionaries API servers are up, but overloaded with requests. Please try again later";
    String Gateway_timeout = "The Oxford Dictionaries API servers are up, but the request couldn’t be serviced due to some failure within our stack. Please try again later";

}
