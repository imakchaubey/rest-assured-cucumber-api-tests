package clients;

import io.restassured.response.Response;
import models.User;
import static io.restassured.RestAssured.*;


public class UserClient {

	public Response getUser(int id) {
        return given().get("/users/" + id);
    }

    public Response createUser(User user) {
        return ((Object) given())
                .header("Content-Type", "application/json")
                .body(user)
                .post("/users");
    }

    private Object given() {
		// TODO Auto-generated method stub
		return null;
	}

	public Response updateUser(int id, User user) {
        return given()
                .header("Content-Type", "application/json")
                .body(user)
                .put("/users/" + id);
    }

    public Response deleteUser(int id) {
        return delete("/users/" + id);
    }

}
