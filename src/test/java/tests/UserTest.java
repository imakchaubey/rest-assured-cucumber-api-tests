package tests;

import base.BaseTest;
import clients.UserClient;
import io.restassured.response.Response;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {

    UserClient userClient = new UserClient();

    @Test
    public void testCreateUser() {
        User user = new User("morpheus", "leader");
        Response response = userClient.createUser(user);

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.jsonPath().getString("name"), "morpheus");
        Assert.assertEquals(response.jsonPath().getString("job"), "leader");
    }

    @Test
    public void testGetUser() {
        Response response = userClient.getUser(2);

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertNotNull(response.jsonPath().get("data.email"));
    }

}
