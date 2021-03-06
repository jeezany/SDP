package sdp01.sdp.com.sdp01.util;

import android.content.Context;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Base64;

/**
 * Created by ibrahimaleidan on 11/03/2018.
 */

public class AuthInfo extends JSONObject {

    private static final String PREF_USER_NAME= "sdp01.sdp.com.sdp01.username";
    private static final String PREF_USER_EMAIL= "sdp01.sdp.com.sdp01.email";
    private static final String PREF_USER_PHONE= "sdp01.sdp.com.sdp01.phone";
    private static final String PREF_USER_DEVICE= "sdp01.sdp.com.sdp01.device";
    private static final String PREF_USER_ACCESSTOKEN= "sdp01.sdp.com.sdp01.access_token";
    private static final String PREF_USER_USERID= "sdp01.sdp.com.sdp01.user_id";
    private static final String PREF_USER_TYPE= "sdp01.sdp.com.sdp01.type";

    private static final String PREF_REQUEST_ID= "sdp01.sdp.com.sdp01.request_id";


    private AuthInfo(){

    }

    // Setters:
    public static void setUserID(String userID) {
        SaveSharedPreference.setString(PREF_USER_USERID, userID);
    }

    public static void setUserName(String userName) {
        SaveSharedPreference.setString(PREF_USER_NAME, userName);
    }

    public static void setUserEmail(String userEmail) {
        SaveSharedPreference.setString(PREF_USER_EMAIL, userEmail);
    }

    public static void setAccessToken(String accessToken) {
        SaveSharedPreference.setString(PREF_USER_ACCESSTOKEN, accessToken);
    }

    public static void setPhone(String phone) {
        SaveSharedPreference.setString(PREF_USER_PHONE, phone);
    }

    public static void setDevice(String device) {
        SaveSharedPreference.setString(PREF_USER_DEVICE, device);
    }

    public static void setUserType(String type) {
        SaveSharedPreference.setString(PREF_USER_TYPE, type);
    }

    public static void setRequestId(String request_id) {
        SaveSharedPreference.setString(PREF_REQUEST_ID, request_id);
    }

    // Getters:
    public static String getUserID() {
        return SaveSharedPreference.getString(PREF_USER_USERID);
    }

    public static String getUserName() {
        return SaveSharedPreference.getString(PREF_USER_NAME);
    }

    public static String getUserEmail() {
        return SaveSharedPreference.getString(PREF_USER_EMAIL);
    }

    public static String getAccessToken() {
        return SaveSharedPreference.getString(PREF_USER_ACCESSTOKEN);
    }

    public static String getPhone() {
        return SaveSharedPreference.getString(PREF_USER_PHONE);
    }

    public static String getDevice() {
        return SaveSharedPreference.getString(PREF_USER_DEVICE);
    }

    public static String getUserType() {
        return SaveSharedPreference.getString(PREF_USER_TYPE);
    }

    public static String getRequestId() {
        return SaveSharedPreference.getString(PREF_REQUEST_ID);
    }

    public static void clearToken() {
        setUserID(null);
        setUserName(null);
        setUserEmail(null);
        setAccessToken(null);
        setPhone(null);
        setUserType(null);
        setRequestId(null);
        setDevice(null);
    }

    public static boolean isLoggedIn(){
        String access_token = getAccessToken();
        return (access_token.length() != 0);
    }

}
