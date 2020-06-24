package com.example.demo.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.ResultActions;

import com.example.demo.common.IntegrationTest;

public class empServiceImplTest extends IntegrationTest {
	private ResultActions requestGetEmp() throws Exception {
        return mvc.perform(get("/emp")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print());
    }
	
    @Test
    public void 사원조회() throws Exception {
        //given

        //when
        ResultActions resultActions = requestGetEmp();

        //then
        resultActions
                .andExpect(status().isOk());
        ;
    }
}
