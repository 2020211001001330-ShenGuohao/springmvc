SpringMVC的高级功能
	--拦截器

功能概述：
	在实际项目开发中，拦截器的使用是非常普遍的。例如购物网站中通过拦截器拦截未登陆的用户，禁止其提交订单，或者使用拦截器验证已登陆
用户的操作权限等，而Spring MVC也提供给了拦截器的功能。
 	拦截器（Interceptor）是一种动态拦截Controller方法调用的对象，它可以在指定的方法调用前或者调用后，执行预先设定的代码。
拦截器作用类似于Filter（过滤器），但是它们的技术归属和拦截内容不同。Filter采用Servlet技术，拦截器采用Spring MVC技术；
Filter会对所有的请求进行拦截，拦截器只针对Spring MVC的请求进行拦截。 

2.1、拦截器的执行流程单个拦截
	注意：
		preHandle
			调用时间：Controller方法处理之前
			执行顺序：链式Intercepter情况下，Intercepter按照声明的顺序一个接一个执行
			若返回false，则中断执行，注意：不会进入afterCompletion
		postHandle
			调用前提：preHandle返回true
			调用时间：Controller方法处理完之后，DispatcherServlet进行视图的渲染之前，也就是说在这个方法中你可以对ModelAndView进行操作
			执行顺序：链式Intercepter情况下，Intercepter按照声明的顺序倒着执行。
			备注：postHandle虽然post打头，但post、get方法都能处理
		afterCompletion
			调用前提：preHandle返回true
			调用时间：DispatcherServlet进行视图的渲染之后
			多用于清理资源
		