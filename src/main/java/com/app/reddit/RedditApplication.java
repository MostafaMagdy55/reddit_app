package com.app.reddit;

import com.app.reddit.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(SwaggerConfiguration.class)
@SpringBootApplication
public class RedditApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}

}
