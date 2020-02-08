package org.springframework.boot.analysis.context.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @Description
 * @Author kongLiuYi
 * @Date 2020/2/6 0006 21:55
 */
public class CustomFormFactoriesApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext>, Ordered {
	@Override
	public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
		System.out.println("该类从 classpath 下 META-INF/spring.factories  配置文件中配置的自定义容器初始化");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
