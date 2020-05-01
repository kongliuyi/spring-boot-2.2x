package org.springframework.boot.analysis.context.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.GenericApplicationListener;
import org.springframework.core.ResolvableType;

/**
 * @Description 自定义监听器
 * @Author: kongLiuYi
 * @Date: 2020/2/27 22:27
 */
public class CustomApplicationListener implements GenericApplicationListener {
	@Override
	public boolean supportsEventType(ResolvableType resolvableType) {
		Class<?> type = resolvableType.getRawClass();
		if (type == null) {
			return false;
		}
		return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(type)
				|| ApplicationStartingEvent.class.isAssignableFrom(type)
				|| ApplicationStartedEvent.class.isAssignableFrom(type);
	}

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
			if (event instanceof ApplicationEnvironmentPreparedEvent) {
				System.out.println("自定义监听器 CustomApplicationListener 对 ApplicationEnvironmentPreparedEvent 事件感兴趣");
			}
			else if (event instanceof ApplicationStartingEvent) {
				System.out.println("自定义监听器 CustomApplicationListener 对 ApplicationStartingEvent 事件感兴趣");
			}
			else if (event instanceof ApplicationStartedEvent) {
				System.out.println("自定义监听器 CustomApplicationListener 对 ApplicationStartedEvent 事件感兴趣");
			}
	}
}
