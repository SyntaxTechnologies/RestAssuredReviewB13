package BasicRestAssured;

import org.json.JSONObject;

public class jsonObject {

    public static String createEmployeePayload(){

        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "azeddine");
        obj.put("emp_lastname", "sterling");
        obj.put("emp_middle_name", "ms");
        obj.put("emp_gender", "M");
        obj.put("emp_birthday", "2012-09-14");
        obj.put("emp_status", "normal");
        obj.put("emp_job_title", "QA Engineer");
        return  obj.toString();
    }
}
