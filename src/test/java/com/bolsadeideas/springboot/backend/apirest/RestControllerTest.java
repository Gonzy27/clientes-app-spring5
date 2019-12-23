package com.bolsadeideas.springboot.backend.apirest;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IClienteDao;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.bolsadeideas.springboot.backend.apirest.controllers.ClienteRestController;
import com.bolsadeideas.springboot.backend.apirest.models.services.ClienteServiceImpl;
import com.bolsadeideas.springboot.backend.apirest.models.services.IClienteService;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


//@WebMvcTest(ClienteRestController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class RestControllerTest {

	private MockMvc mvc;

	@Autowired
	private ClienteRestController clienteController;

	//@Autowired
	//private IClienteService clienteService;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(clienteController).build();
	}


	@Test
	public void test() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/clientes")
				.contentType(MediaType.APPLICATION_JSON_UTF8))
			      .andDo(print()).andReturn();
			     // .andExpect(jsonPath("$[0]nombre", Matchers.is("dasds")));
	}

}
