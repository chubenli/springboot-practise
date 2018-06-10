package com.chibun.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Aspect//定义切面的注解
@Component//注入到Spring容器
public class WebLogAspect {
	private Logger logger = LoggerFactory.getLogger(WebLogAspect.class);
	//切入点
	@Pointcut("execution(public * com.chibun.controller..*.*(..))")
	public void webLog() {
		System.out.println("##########webLog###############");
	}

	@Before("webLog()")
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		// 接收到请求，记录请求内容
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		if(attributes!=null){
			HttpServletRequest request = attributes.getRequest();
			logger.info("#########################请求开始#############################");
			// 记录下请求内容
			logger.info("URL : " + request.getRequestURL().toString());
			logger.info("HTTP_METHOD : " + request.getMethod());
			logger.info("IP : " + request.getRemoteAddr());
			Enumeration<String> enu = request.getParameterNames();
			while (enu.hasMoreElements()) {
				String name = (String) enu.nextElement();
				logger.info("name:{},value:{}", name, request.getParameter(name));
			}
		}
	}
	@AfterReturning(returning = "ret", pointcut = "webLog()")
	public void doAfterReturning(Object ret) throws Throwable {
		// 处理完请求，返回内容
		logger.info("RESPONSE : " + ret);
		logger.info("#########################响应结束#############################");
	}
}
