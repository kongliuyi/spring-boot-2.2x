package org.springframework.boot.analysis.context.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @Description
 * @Author kongLiuYi
 * @Date 2020/2/6 0006 21:57
 */
public class CustomFormYmlApplicationContextInitializer 	implements ApplicationContextInitializer<ConfigurableApplicationContext>, Ordered {
	@Override
	public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
		System.out.println("【依靠 DelegatingApplicationContextInitializer】 该类从 application.yml 配置文件中配置的自定义容器初始化");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
