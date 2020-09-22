		import java.io.IOException;
		import java.lang.InterruptedException;
		import java.net.URI;
		import java.net.http.HttpClient;
		import java.net.http.HttpRequest;
		import java.net.http.HttpResponse;

public class GetRequestSpecific {



	 public static void main(String[] args) throws IOException, InterruptedException{
			
			HttpClient client = HttpClient.newHttpClient();
			 HttpRequest request = (HttpRequest) HttpRequest.newBuilder().uri(URI.create("http://www.pingzone.ie/club-overview/contact"/*"http://webcode.me"*/)).headers("x-robots-tag", "x-xss-protection").GET().build();
			 HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			 System.out.println(response.body());
			 
			 
			 
	}//all rights to the author of code, this a general syntax and imports scheme for future learning reference

}
