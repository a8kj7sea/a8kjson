import me.a8kj.json.A8kjJson;
import me.a8kj.json.object.JsonObject;
import me.a8kj.json.object.JsonValue;
import me.a8kj.json.values.JsonNumber;

import java.io.File;
import java.util.Optional;

public class Example {

    public static void main(String[] args) {
        // Example JSON string for testing
        String response = "{\r\n" +
                "  \"status\": \"OK\",\r\n" +
                "  \"random_data\": {\r\n" +
                "    \"id\": 12345,\r\n" +
                "    \"name\": \"Example Name\",\r\n" +
                "    \"value\": 67.89,\r\n" +
                "    \"active\": true\r\n" +
                "  }\r\n" +
                "}";

        System.err.println(response);

        // Parsing JSON from the string
        Optional<JsonObject> responseObj = A8kjJson.parse(response);

        // Check if JSON parsing was successful
        if (responseObj.isPresent()) {
            JsonObject jsonObject = responseObj.get();
            // Extracting data from the parsed JSON object
            Optional<Object> status = Optional.ofNullable(jsonObject.get("status"));
            Optional<JsonObject> randomDataJson = Optional.ofNullable((JsonObject) jsonObject.get("random_data"));

            status.ifPresent(s -> System.out.println("Status: " + s));
            randomDataJson.ifPresent(data -> {
                Optional<JsonValue> id = Optional.ofNullable(data.get("id"));
                id.ifPresent(i -> System.out.println("ID: " + i.asString()));
            });
        } else {
            System.out.println("Failed to parse JSON");
        }

        File jsonFile = new File("test.json");

        // Writing a JSON object to a file (just for demonstration)
        if (responseObj.isPresent()) {
            A8kjJson.writeToFile(jsonFile, responseObj.get());
            System.out.println("JSON written to file: " + jsonFile.getAbsolutePath());
        }

        // Reading the JSON from the file
        Optional<JsonObject> fileJsonObj = A8kjJson.fromFile(jsonFile);
        if (fileJsonObj.isPresent()) {
            System.out.println("Read JSON from file: " + fileJsonObj.get().asString());
        } else {
            System.out.println("Failed to read JSON from file.");
        }
    }
}
