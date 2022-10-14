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

1.简答异常处理HandlerExceptionResolver接口
			
		如果希望对Spring MVC中所有异常进行统一处理，可以使用Spring MVC提供的异常处理器HandlerExceptionResolver接口。
	Spring MVC内部提供了HandlerExceptionResolver的实现类SimpleMappingExceptionResolver。它实现了简单的异常处理，
	通过该实现类可以将不同类型的异常映射到不同的页面，当发生异常的时候，实现类根据发生的异常类型跳转到指定的页面处理异常信息。实现类也可以为所有
	的异常指定一个默认的异常处理页面，当应用程序抛出的异常没有对应的映射页面，则使用默认页面处理异常信息。 
		