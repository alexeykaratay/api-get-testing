
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class OceanDriversTest {
    String url = "http://api.oceandrivers.com/v1.0/getWebCams/";

    @DisplayName("Status Code Test")
    @Test
    public void testStatusCode() {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        try {
            HttpResponse httpresponse = httpclient.execute(httpget);
            Assertions.assertEquals(HttpStatus.SC_OK, httpresponse.getCode());
        } catch (IOException e) {
            System.out.println("Runtime Exception!!!");
        }
    }

    @DisplayName("Body Test")
    @Test
    public void testBody() throws IOException, ParseException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        String body = EntityUtils.toString(response.getEntity());
        Assertions.assertTrue(body.contains("\"name\": \"Cala Agulla\""));
    }
}
