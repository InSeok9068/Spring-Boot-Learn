package com.example.demo.common;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;

//* 통합 테스트의 Base 클래스입니다. Base 클래스를 통해서 테스트 전략을 통일성 있게 가져갈 수 있습니다.
//* 통합 테스트는 주로 컨트롤러 테스트를 주로 하며 요청부터 응답까지의 전체 플로우를 테스트합니다.
//* @ActiveProfiles(TestProfile.TEST) 설정으로 테스트에 profile을 지정합니다. 환경별로 properties 파일을 관리하듯이 test도 반드시 별도의 properties 파일로 관리하는 것이 바람직합니다.
//* 인터페이스나 enum 클래스를 통해서 profile을 관리합니다. 오타 실수를 줄일 수 있으며 전체적인 프로필이 몇 개 있는지 한 번에 확인할 수 있습니다.
//* @Transactional 트랜잭션 어노테이션을 추가하면 테스트코드의 데이터베이스 정보가 자동으로 Rollback 됩니다. 베이스 클래스에 이 속성을 추가 해야지 실수 없이 진행할 수 있습니다.
//* @Transactional을 추가하면 자연스럽게 데이터베이스 상태의존 적인 테스트를 자연스럽게 하지 않을 수 있게 됩니다.
//* 통합 테스트 시 필요한 기능들을 protected로 제공해줄 수 있습니다. API 테스트를 주로 하게 되니 ObjectMapper 등을 제공해줄 수 있습니다. 유틸성 메서드들도 protected로 제공해주면 중복 코드 및 테스트 코드의 편의성이 높아집니다.
//* 실제로 동작할 필요가 없으니 @Ignore 어노테이션을 추가합니다.

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@Transactional
@Ignore
//@ActiveProfiles(TestProfile.TEST)
public class IntegrationTest {
    @Autowired protected MockMvc mvc;
    @Autowired protected ObjectMapper objectMapper;
}