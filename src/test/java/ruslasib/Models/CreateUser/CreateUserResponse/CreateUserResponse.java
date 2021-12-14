package ruslasib.Models.CreateUser.CreateUserResponse;

public class CreateUserResponse {

    private String meta;

    private Data data;

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }
}
