SpringMVC的高级功能
	--数据验证
	
功能概述：
	一般情况下我们会在前端页面实现数据的校验，但是大家需要注意的是前端校验会存在数据的不安全问题，因此一般情况下我们都会使用前端校验+后端校验的方式，这样的话既能够满足用户的体验度，同时也能保证数据的安全，下面来说一下在springmvc中如何进行后端数据校验。
    从Spring3版本开始，Spring MVC框架提供了JSR-303验证框架。JSR-303 是JAVA EE 6 中的一项子规范，叫做Bean Validation。随着技术进步，出现了Hibernate Validator专门进行数据校验的框架。该框架在JSR-303基础上行提供了更全面的校验支持注解，目前应用较为广泛 。
	JSR303是Java为Bean 数据合法性校验提供的标准，它已经包含在JavaEE6.0中。JSR 303 (Java Specification Requests意思是Java规范提案)通过在Bean属性上标注类似于@NotNull、@Max等标准的注解指定校验规则，并通过标准的验证接口对Bean进行验证。
	
实现数据验证的步骤：
			1.加入hibernate-validator依赖
			2一定要注意!!将新加入的jar包加入到WEB一INF/1ib中
			3.在需要验证的javaBean的属性上面中加入对应的验证注解
			4.在需要验证的处理方法的对应javaBean参数上面加上@Valid
		
3、引入外部文件中的错误提示	
