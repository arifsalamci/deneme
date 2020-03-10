package utilities;

import java.util.HashMap;
import java.util.Map;

public class TempStorage {

    private static Map<String, String> map = new HashMap<>();

    public static void storeData(String key, String value){
        map.put(key, value);
    }

    public static String getData(String key){
        return map.get(key);
    }

    public static void clear(){
        map.clear();
    }
}
