package client;

import static org.junit.Assert.*;

import org.junit.Test;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CalculatecontrollerApi;
import io.swagger.client.model.Result;

public class CalculatecontrollerApiTest {
    @Test
    public void testGetUsingGET() throws ApiException {
        ApiClient client = new ApiClient();
        client.setBasePath("http://localhost:8080");
        CalculatecontrollerApi api = new CalculatecontrollerApi(client);
        Result result = api.getUsingGET(2, 1); // (1)
        System.out.println(result.getAdd());
        System.out.println(result.getSubtract());
        assertEquals(new Integer(3), result.getAdd());
        assertEquals(new Integer(1), result.getSubtract());
    }
}
