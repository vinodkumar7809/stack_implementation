package com.example.stacj.stack_implementation.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.stacj.stack_implementation.entity.Partner;
import com.example.stacj.stack_implementation.service.PartnerService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = PartnerController.class)
@WithMockUser
public class PartnerControllerTest {
	
	@Autowired
	private MockMvc mocMvc;
	
	@MockBean
	private PartnerService partnerService;
	
	Partner mockPartner = new Partner(1,"vinod","javaDeveloper");
	
	String exampleJson = "{\"name\":\"vinod\",\"designation\":\"javaDeveloper\"}";
	@Test
	public void pushPartner() throws Exception {
		Partner mockPartner = new Partner(101,"vinod","javaDeveloper");
		Mockito.when(partnerService.push(Mockito.any(Partner.class))).thenReturn(mockPartner);
	    RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/push").accept(MediaType.APPLICATION_JSON)
	    		.content(exampleJson).contentType(MediaType.APPLICATION_JSON);
	    MvcResult result = mocMvc.perform(requestBuilder).andReturn();
	    MockHttpServletResponse response = result.getResponse();
	    assertEquals(HttpStatus.CREATED.value(), response.getStatus());
	}
	
	@Test
	public void popPartner() throws Exception {
		Mockito.when(partnerService.popOut()).thenReturn(mockPartner);
	    RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/pop").accept(MediaType.APPLICATION_JSON);
	    MvcResult result = mocMvc.perform(requestBuilder).andReturn();
	    System.out.println("Response Status returned :"+result.getResponse());
		String expected = "{id:1,name:vinod,designation:javaDeveloper}";
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}
	
	
}
