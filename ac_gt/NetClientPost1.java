import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author nambiasr
 */
public class NetClientPost1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            String url = "https://hp-integration-orders.arubathena.com/master/v2/customers/rpl";
            HttpPut request = new HttpPut(url);
            String input = "{\"customer\":[{\"id\":\"800123\",\"status\":\"BLOCKED\"},{\"id\":\"800124\",\"status\":\"BLOCKED\"}]}";
            System.out.println("Executing request " + request.getRequestLine());
            StringEntity params =new StringEntity(input,"UTF-8");
            params.setContentType("application/json");
//            request.addHeader("content-type", "application/json");
//            request.addHeader("Accept", "*/*");
//        request.addHeader("Accept-Encoding", "gzip,deflate,sdch");
//        request.addHeader("Accept-Language", "en-US,en;q=0.8");
            request.setEntity(params);
            
            // Create a custom response handler
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

                @Override
                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }

            };
            String responseBody = httpclient.execute(request, responseHandler);
            System.out.println("----------------------------------------");
            System.out.println(responseBody);
        } catch (Exception e){}
            finally {
            httpclient.close();
        }
        
        // TODO code application logic here
}
}