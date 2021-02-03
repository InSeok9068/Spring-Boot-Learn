package blog;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONObject;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Map;

public class RestTemplateMain {
	public static void main(String[] args) {
		getPost();
		postPost();
	}
	
	public static RestTemplate createRestTemplate() {
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(); 
		factory.setReadTimeout(5000);    // 읽기시간초과, ms 
		factory.setConnectTimeout(3000); // 연결시간초과, ms 
		HttpClient httpClient = HttpClientBuilder.create() 
								                 .setMaxConnTotal(100)  // connection pool 적용 
								                 .setMaxConnPerRoute(5) // connection pool 적용 
								                 .build(); 
		factory.setHttpClient(httpClient); // 동기실행에 사용될 HttpClient 세팅 
		return  new RestTemplate(factory);		
	}
	
	public static void getPost() {
		
		RestTemplate restTemplate = createRestTemplate();
		
		HttpEntity<?> httpEntity = new HttpEntity<>(null, null);
		
		String uri = "http://jsonplaceholder.typicode.com/comments";
		
		// Query Param 설정
		UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(uri)
				                     									.queryParam("postId", 1);
		
		ResponseEntity<List<Map<String,Object>>> responseEntity = restTemplate.exchange(uriComponentsBuilder.build().encode().toUri(), HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<Map<String,Object>>>() {});
		
		System.out.println(responseEntity.getBody());
	}
	
	public static void postPost(){
		
		RestTemplate restTemplate = createRestTemplate();
		
		// Http Header 설정
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		
		// Http Body 설정
		JSONObject bodyParam = new JSONObject();
		
		bodyParam.put("title",  "Rest");
		bodyParam.put("body",   "Teamplte");
		bodyParam.put("userId", 1);
		
		HttpEntity<?> httpEntity = new HttpEntity<>(bodyParam, header);
		
		String uri = "http://jsonplaceholder.typicode.com/posts";
		
		// Query Param 설정
		UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(uri);
		
		ResponseEntity<Map> responseEntity = restTemplate.exchange(uriComponentsBuilder.build().encode().toUri(), HttpMethod.POST, httpEntity, Map.class);
		
		System.out.println(responseEntity.getBody());
	}
}
