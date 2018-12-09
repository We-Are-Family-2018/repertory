package com.school.repertory.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.school.repertory.utils.AesCipher;

@Configuration
public class CommonConfig {
	
	@Bean
	public AesCipher aesCipher(@Value("${business.crypto.key}") String key, 
			@Value("${business.crypto.iv}") String iv) {
		
		AesCipher cipher = new AesCipher(key, iv);
		
		return cipher;
	}
}
