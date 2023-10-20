package utils;

import model.UserModel;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.naming.ConfigurationException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

public class Utils {
    public static void setEnvVar(String key, String value) throws ConfigurationException, org.apache.commons.configuration.ConfigurationException {
        PropertiesConfiguration config =new PropertiesConfiguration("./src/test/resources/config.properties");
        config.setProperty(key, value);
        config.save();
    }

    public static int generateRandomId(int min, int max){
        double randId = Math.random()*(max-min)+min;

        return (int) randId;
    }

    public static void saveUserInfo(UserModel model) throws IOException, ParseException, org.json.simple.parser.ParseException {
        String file ="./src/test/resources/users.json";
        JSONParser jsonParser =new JSONParser();
        JSONArray userArray = (JSONArray) jsonParser.parse(new FileReader(file));
        JSONObject userObj = new JSONObject();
        userObj.put("id",model.getId());
        userObj.put("name", model.getName());
        userObj.put("email", model.getEmail());
        userObj.put("password",model.getPassword());
        userObj.put("phone_number", model.getPhone_number());
        userObj.put("nid", model.getNid());
        userObj.put("role", model.getRole());

        userArray.add(userObj);

        FileWriter writer =new FileWriter(file);
        writer.write(userArray.toJSONString());
        writer.flush();
        writer.close();
    }

}