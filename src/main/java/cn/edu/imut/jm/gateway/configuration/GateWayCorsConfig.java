package cn.edu.imut.jm.gateway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


@Configuration
public class GateWayCorsConfig
{
	 private CorsConfiguration buildConfig() {  
	        CorsConfiguration corsConfiguration = new CorsConfiguration();  
	        corsConfiguration.setAllowCredentials(true);  
//	        corsConfiguration.addAllowedOrigin("http://localhost:8100"); // 1  
//
//	        corsConfiguration.addAllowedOrigin("http://127.0.0.1:8100"); // 1  
	        corsConfiguration.addAllowedOrigin("*");
	        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL); // 2  
	        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL); // 3  
//	        corsConfiguration.addAllowedMethod(HttpMethod.POST); // 3  
//	        corsConfiguration.addAllowedMethod(HttpMethod.OPTIONS); // 3  
//	        corsConfiguration.addAllowedMethod(HttpMethod.GET); 
	        return corsConfiguration;  
	    }  
	  
	    @Bean  
	    public CorsFilter corsFilter() {  
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
	        source.registerCorsConfiguration("/**", buildConfig()); // 4  
	        return new CorsFilter(source);  
	    }  
}
 