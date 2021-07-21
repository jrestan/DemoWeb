package com.mitocode;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.mitocode.models.Usuarioweb;
import com.mitocode.repositories.IUsuariowebRepo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class DemoWebApplicationTests {

	@Autowired
	private IUsuariowebRepo repo;

	@Autowired
	BCryptPasswordEncoder encoder;
			
	@Test
	void crearUsuarioTest() {
		Usuarioweb us = new Usuarioweb();
		
		us.setId(2);
		us.setNombre("javier");
		us.setClave(encoder.encode("123456"));
		Usuarioweb usret = repo.save(us);

		assertTrue(usret.getClave().equals(us.getClave()));
	}

}
