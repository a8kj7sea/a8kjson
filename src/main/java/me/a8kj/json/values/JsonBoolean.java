package me.a8kj.json.values;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import me.a8kj.json.object.JsonValue;

@RequiredArgsConstructor
@Getter
public class JsonBoolean implements JsonValue {

    public static final JsonBoolean TRUE = new JsonBoolean(true);
    public static final JsonBoolean FALSE = new JsonBoolean(false);
    
    private final boolean value;

    @Override
    public @NonNull String asString() {
        return Boolean.toString(value);
    }

}
