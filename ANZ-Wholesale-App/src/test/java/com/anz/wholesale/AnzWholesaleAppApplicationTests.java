package com.anz.wholesale;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.anz.wholesale.controller.AccountController;

@SpringBootTest
@WebMvcTest
@AutoConfigureMockMvc
class AnzWholesaleAppApplicationTests {

	@Test
	void contextLoads() {
	}
    
    @Autowired
    AccountController accountController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenUserControllerInjected_thenNotNull() throws Exception {
        assertThat(accountController).isNotNull();
    }

    @Test
    public void whenGetRequestToApi_thenCorrectResponse() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/accountList")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
    
    }
   
}
