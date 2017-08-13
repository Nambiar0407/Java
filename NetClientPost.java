import org.apache.commons.codec.binary.Base64;
import java.io.IOException;
import static java.lang.System.out;
import java.net.URL;
import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.spi.MessageBodyWorkers;


public class NetClientPost {

	// http://localhost:8080/RESTfulExample/json/product/post
	public static void main(String[] args) {

	  try {

	  	Client client = Client.create();
	  	WebResource webResource = client.resource("https://hp-integration-orders.arubathena.com/master/v2/customers/rpl");
		//String url = "https://hp-integration-orders.arubathena.com/master/v2/customers/rpl";	

		String input = "{\"customer\":[{\"id\":\"800123\",\"status\":\"BLOCKED\"},{\"id\":\"800124\",\"status\":\"BLOCKED\"}]}";


		ClientResponse response = webResource.type("application/json").put(ClientResponse.class, input);
		System.out.println("Failed: HTTP error code : " + response.getStatus());
		String output1 = response.getEntity(String.class);
		System.out.println(output1);

		if (response.getStatus() !=201 ){
			throw new RuntimeException("Failed: HTTP error code : " + response.getStatus());
			//System.out.println(response.getEntity(String.class));
		}

		System.out.println("Output from server..... \n");
		String output = response.getEntity(String.class);
		System.out.println(output);

		} catch (Exception e){
			e.printStackTrace();
		}
	}
}

// 		String name = "glis";
// 		String password = "glis123";
// 		String authString = name + ":" + password;
// 		String authStringEnc = new encodeBase64().encode(authString.getBytes());
// 		System.out.println("Base64 encoded auth string: " + authStringEnc);
// 		Client restClient = Client.create();
// 		WebResource webResource = restClient.resource(url);
// 		ClientResponse resp = webResource.accept("application/json").header("Authorization", "Basic " + authStringEnc).get(ClientResponse.class);
// 		if(resp.getStatus() != 200){
//             System.err.println("Unable to connect to the server");
//         }
//         String output = resp.getEntity(String.class);
//         System.out.println("response: "+output);



// 		//HttpURLConnection conn = (HttpURLConnection) url.openConnection();
// 		//conn.setDoOutput(true);
// 		//conn.setRequestMethod("PUT");
// 		//conn.setRequestProperty("Content-Type", "application/json");

// 		//String input = "{\"qty\":100,\"name\":\"iPad 4\"}";

// 		// String input = "{\"customer\":[{\"id\":\"800123\",\"status\":\"BLOCKED\"},{\"id\":\"800124\",\"status\":\"BLOCKED\"}]}";

// 		// OutputStream os = conn.getOutputStream();
// 		// os.write(input.getBytes());
// 		// os.flush();

// 		// if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
// 		// 	throw new RuntimeException("Failed : HTTP error code : "
// 		// 		+ conn.getResponseCode());
// 		// }

// 		// BufferedReader br = new BufferedReader(new InputStreamReader(
// 		// 		(conn.getInputStream())));

// 		// String output;
// 		// System.out.println("Output from Server .... \n");
// 		// while ((output = br.readLine()) != null) {
// 		// 	System.out.println(output);
// 		// }

// 		// conn.disconnect();

// 	 //  } catch (MalformedURLException e) {

// 		// e.printStackTrace();

// 	 //  } catch (IOException e) {

// 		// e.printStackTrace();

// 	 // }

// 	}
// }