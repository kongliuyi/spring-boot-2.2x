package org.springframework.boot.analysis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description 以官方文档为主：https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/reference/html/spring-boot-features.html
 * @Author kongLiuYi
 * @Date 2020/2/3 0006 12:06
 */
@SpringBootApplication
@Slf4j
public class SpringBootAnalysisApplication  implements ApplicationRunner {
	@Value("${spring.name}")
	private String name;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAnalysisApplication.class, args);
    }

	@Override
	public void run(ApplicationArguments args)  {
		log.info("{}",name);
		System.out.println("name:"+name);
	}
}
