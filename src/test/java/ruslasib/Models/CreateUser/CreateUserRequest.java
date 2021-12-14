package ruslasib.Models.CreateUser;

public class CreateUserRequest {

    public CreateUserRequest(String name1, String gender, String email, String status) {
        this.name = name1;
        this.gender = gender;
        this.email = email;
        this.status = status;
    }

    private String name;
    private String gender;
    private String email;
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
