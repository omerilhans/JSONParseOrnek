
import java.util.HashMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class CustomJSONObject 
{
    public static void main(String[] args) throws Exception
    {
        
        HashMap<String, String> hm = new HashMap<>();
        hm.put("ad", "Emir");
        hm.put("soyad", "Civaş");
        
        JSONObject jo = new JSONObject(hm);
        jo.put("UNIQUE_ID", Math.random());
        
        String jsonStr = jo.toJSONString();
        System.out.println(jsonStr);
        
        
        JSONArray arr = new JSONArray();
        arr.add(jo);
        arr.add(jo);
        System.out.println(arr.toJSONString());
        
        
        
    }
}
