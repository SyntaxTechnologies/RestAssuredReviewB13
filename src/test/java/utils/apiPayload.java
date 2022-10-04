package utils;

import org.json.JSONObject;

public class apiPayload {
    public static String generateTokenBody(){
        JSONObject obj =new JSONObject();
        obj.put("email","Xmen@gmail.com");
        obj.put("password","JeanGrey");

        return obj.toString();

    }
}
