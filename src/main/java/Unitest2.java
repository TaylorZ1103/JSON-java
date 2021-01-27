import org.apache.commons.io.IOUtils;
import org.json.*;
import javax.json.*;
import java.io.*;
public class Unitest2 {
    public static void main(String[] args) throws IOException {
        Reader xmlSource = new FileReader("./book.xml");
        //public static JSONObject toJSONObject(Reader reader, JSONPointer path, JSONObject replacement)
        JSONObject replacement = new JSONObject();
        replacement.put("FirstName", "John");
//        JSONPointer jsonPointer = Json.createPointer("/catalog/book/0");
        JSONPointer pointer = JSONPointer.builder()
                .append("/catalog/book/0")
                .build();
        JSONObject res = XML.toJSONObject(xmlSource,  pointer, replacement);
        return;

    }
}
