SpringMVC数据绑定和响应
	--页面跳转
		--返回值为void类型的页面跳转到默认页面
概述：		
	当Spring MVC方法的返回值为void类型，方法执行后会跳转到默认的页面。
默认页面的路径由方法映射路径和视图解析器中的前缀、后缀拼接成，拼接格式为“前缀+方法映射路径+后缀”。
如果Spring MVC的配置文件中没有配置视图解析器，则会报HTTP Status 500错误。