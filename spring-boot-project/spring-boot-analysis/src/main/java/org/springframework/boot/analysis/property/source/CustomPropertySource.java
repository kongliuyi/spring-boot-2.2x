package org.springframework.boot.analysis.property.source;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

/**
 * @Description 自定义加载配置文件
 * @Author kongLiuYi
 * @Date 2020/2/6 0006 12:46
 */
@Slf4j
public class CustomPropertySource implements EnvironmentPostProcessor {
	private PropertySourceLoader loader = new YamlPropertySourceLoader();
	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
		log.info("自定义加载配置文件");
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		MutablePropertySources propertySources = environment.getPropertySources();
		Resource resource = resourceLoader.getResource("analysis.yml");
		try {
			loader.load("customYml",resource).forEach(propertySources::addFirst);
		} catch (IOException e) {
			log.error("",e);
		}

	}
}
