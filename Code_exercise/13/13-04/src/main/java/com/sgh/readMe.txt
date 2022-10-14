SpringMVC的高级功能
	--异常处理
功能概述：
		在程序的开发过程中，不管是在持久层对数据库的操作，还是在业务层或控制层对数据库的操作,都会不可避免地遇到各种编译异常或运行异常需要处理。
	如果每个异常都单独进行处理,那么程序将出现大量冗余代码并且代码规范性较差，不易于后续代码的维护。如果将程序所有的异常单独抽取出来统一处理，
	这样既实现了异常信息的统一处理，又便于程序的维护,极大地降低了代码的冗余。
		Spring MVC可以通过3种方式实现异常的统一处理：
			第一种是使用Spring MVC提供的简单异常处理器SimpleMappingExceptionResolver实现异常统一处理；
			第二种是通过实现异常处理器接口HandlerExceptionResolver自定义异堂外理器,实现异常统一处理；
			第三种是使用@ExceptionHandler注解实现异常统一处理。

2.自定义异常处理resolveException()方法
		除了使用SimpleMappingExceptionResolver进行异常处理，还可以自定义异常处理器统一处理异常。
	通过实现HandlerExceptionResolver接口，重写异常处理方法resolveException()来定义自定义异常处理器。
	当Handler执行并且抛出异常时，自定义异常处理器会拦截异常并执行重写的resolveException()方法，
	该方法返回值是ModelAndView类型的对象，可以在ModelAndView对象中存储异常信息，并跳转到异常处理页面。
	
	
		