package ruslasib.Models.CreateUser.CreateUserResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUserResponse {

    @JsonProperty("meta")
    private String meta;

    @JsonProperty("data")
    private Data data;

    @JsonProperty
    public String getMeta() {
        return meta;
    }

    @JsonProperty
    public void setMeta(String meta) {
        this.meta = meta;
    }

    @JsonProperty
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty
    public Data getData() {
        return data;
    }
}
