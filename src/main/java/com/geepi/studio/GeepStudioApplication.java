package com.geepi.studio;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan({"com.geepi.studio.dao", "com.geepi.studio.mapper"})
public class GeepStudioApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GeepStudioApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GeepStudioApplication.class, args);
	}


}
