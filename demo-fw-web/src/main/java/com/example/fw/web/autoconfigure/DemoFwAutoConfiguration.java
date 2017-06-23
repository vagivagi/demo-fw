package com.example.fw.web.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.fw.web.foo.FooController;

@Configuration
@EnableConfigurationProperties(DemoFwProperties.class)
public class DemoFwAutoConfiguration {
	@Bean
	@ConditionalOnProperty(value = "demo-fw.foo.enabled", matchIfMissing = true)
	public FooController fooController() {
		return new FooController();
	}
}
