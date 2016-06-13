
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;

public class App 
{
    public static void main(String[] args) throws Exception
    {
        String adr ="http://ecivas.com/users.json";
        
        // 1. Parse Edilecek String'i Al
        String jsonString = Jsoup.connect(adr)
                .timeout(30000)
                .ignoreContentType(true)
                .get().text();
        
        // JSON Okumak Icin Bir Parser Instance'i Ac
        JSONParser parser = new JSONParser();
        
        // Json Arrayini Oku
        JSONArray usersArray = 
                (JSONArray) parser.parse(jsonString);
        
        System.out.println("Kişi sayısı : "+usersArray.size());
        
        // Arraydeki Her Bir Object Icin
        for (int i = 0; i< usersArray.size(); i++)
        {// Arrayin i. Elemanını JSONObject Olarak Al
            JSONObject user = (JSONObject) usersArray.get(i);
            // O An Bakılan JSON Object'ten un ve fn Key'lerine 
            // Karşılık Tutulan Değerleri String Olarak AL
            String un = user.get("un").toString();
            String fn = user.get("fn").toString();
            System.out.println(un+" - "+fn);
        }
        // http://pastie.org/10803219
        
        
    }
}
