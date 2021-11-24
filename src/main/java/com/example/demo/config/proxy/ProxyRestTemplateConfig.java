package com.example.demo.config.proxy;

import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.protocol.HttpContext;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/*
 * @Component 전역 빈으로 설정하여 사용도 가능하며
 * RestTemplate restTemplate = new RestTemplateBuilder(new ProxyRestTemplateConfig()).build(); 해당 코드를 통해서도 직접선언 가능
 */
public class ProxyRestTemplateConfig implements RestTemplateCustomizer {
    private static final String PROXY_SERVER_HOST = "localhost";
    private static final int PROXY_SERVER_PORT = 9000;
    private static final String EXCLUDE_URL = "http://localhost:4000";

    @Override
    public void customize(RestTemplate restTemplate) {
        HttpHost proxy = new HttpHost(PROXY_SERVER_HOST, PROXY_SERVER_PORT);
        HttpClient httpClient = HttpClientBuilder.create()
                .setRoutePlanner(new DefaultProxyRoutePlanner(proxy) {
                    @Override
                    public HttpHost determineProxy(HttpHost target, HttpRequest request, HttpContext context) throws HttpException {
                        // 특정 URL은 제외 처리
                        if (EXCLUDE_URL.equals(target.toURI())) {
                            return null;
                        }

                        return super.determineProxy(target, request, context);
                    }
                })
                .build();
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory(httpClient));
    }
}