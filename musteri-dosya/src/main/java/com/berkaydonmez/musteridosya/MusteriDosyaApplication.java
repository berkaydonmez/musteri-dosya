package com.berkaydonmez.musteridosya;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MusteriDosyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusteriDosyaApplication.class, args);
	}

}
