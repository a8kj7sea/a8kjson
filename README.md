# JSON Parsing and File Operations

This program demonstrates how to:

1. Parse a JSON string into a `JsonObject`.
2. Extract specific values from the parsed JSON object.
3. Write the parsed JSON to a file.
4. Read JSON data back from a file.

## Features:

- **Parsing JSON String**: The program parses a JSON string into a `JsonObject` using the `A8kjJson.parse()` method.
- **Extracting JSON Values**: After parsing, it extracts values such as the `status` and `id` fields.
- **Writing JSON to File**: It writes the parsed JSON data to a file (`test.json`).
- **Reading JSON from File**: The program demonstrates how to read JSON from the `test.json` file and output it.

## Example JSON Input:

```json
{
  "status": "OK",
  "random_data": {
    "id": 12345,
    "name": "Example Name",
    "value": 67.89,
    "active": true
  }
}
```

## Example Output:

```plaintext
Status: OK
ID: 12345
JSON written to file: /path/to/test.json
Read JSON from file: {"status":"OK","random_data":{"id":12345,"name":"Example Name","value":67.89,"active":true}}

### TODO

1. Improvements for JSON system
   - Enhance the current JSON system.

2. Add JSON file system
   - Implement a file-based JSON system.

3. Refactor JSON array logic
   - Refactor the logic that handles JSON arrays.

4. Test performance of the system
   - Conduct performance tests on the system.

5. Maybe POJO mapper and intro to mapper init
   - Consider adding a POJO mapper and introduction to initializing the mapper (not sure yet).
