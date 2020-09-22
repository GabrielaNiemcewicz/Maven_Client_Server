	import java.io.IOException;
	import java.lang.InterruptedException;
	import java.net.URI;
	import java.net.http.HttpClient;
	import java.net.http.HttpRequest;
	import java.net.http.HttpResponse;
class GetRequest{
 public static void main(String[] args) throws IOException, InterruptedException{
		
		HttpClient client = HttpClient.newHttpClient();
		 HttpRequest request = (HttpRequest) HttpRequest.newBuilder().uri(URI.create("https://sklep.akademiagornika.pl/"/*http://www.pingzone.ie/club-overview/contact"*//*"http://webcode.me"*/))
	                .build();
		 HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		 System.out.println(response.body());
		 
		 
		 
	}

}
