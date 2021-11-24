package com.example.demo.app.blog.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.InetSocketAddress;
import java.net.Proxy;

@Slf4j
@RestController
public class ProxyController {
    private static final String PROXY_SERVER_HOST = "localhost";
    private static final int PROXY_SERVER_PORT = 9000;

    @GetMapping(value = "/proxyTest")
    public void proxyTest() {
        /*
         * Proxy.Type.HTTP 프록시 서버
         * Proxy.Type.SOCKS 프록시 소켓 통신
         */
//        Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(PROXY_SERVER_HOST, PROXY_SERVER_PORT));
//        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
//        requestFactory.setProxy(proxy);
//
//        RestTemplate restTemplate = new RestTemplate(requestFactory);

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> responseEntity = restTemplate.getForEntity("https://httpbin.org/get", String.class);

        log.info("Proxy Test Reponse : {}", responseEntity.getBody());
    }
}
