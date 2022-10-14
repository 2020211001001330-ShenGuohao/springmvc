package com.sgh.controller;

import com.sgh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class FileController {
    /**
     * 单文件上传
     */
    @RequestMapping("fileload01")
    public String fileLoad01(MultipartFile files,
                             HttpServletRequest request) throws Exception {
        //设置上传的文件所存放的路径
        String path = request.getSession().getServletContext().getRealPath("/") + "files/";
        
        //判断上传的文件是否为空
        if (!files.isEmpty()) {
        	 //获取上传文件的名称
            String filename = files.getOriginalFilename();
            System.out.println("上传的文件名称为："+filename);
            //保存上传的文件
        	files.transferTo(new File(path));
        	
            request.setAttribute("msg", "(上传成功)");
            return "forward:fileload-01.jsp";
        }
        request.setAttribute("msg", "(上传失败)");
        return "forward:fileload-01.jsp";
    }
    /**
     * 多文件上传
     */
    @RequestMapping("fileload02")
    public String fileLoad02(MultipartFile[] files,
    		HttpServletRequest request) throws Exception {
    	//设置上传的文件所存放的路径
    	String path = request.getSession().getServletContext().getRealPath("/") + "files/";
    	
    	if (files != null && files.length > 0) {
            //循环获取上传的文件
            for (MultipartFile file : files) {
                //获取上传文件的名称
                String filename = file.getOriginalFilename();
                System.out.println("上传的文件名称为："+filename);
                // 文件保存的全路径
                String filePath = path + filename;
                // 保存上传的文件
                file.transferTo(new File(filePath));
            }
            request.setAttribute("msg", "(上传成功)");
            return "forward:fileload-02.jsp";
        }
    	request.setAttribute("msg", "(上传失败)");
        return "forward:fileload-02.jsp";
    }
    /**
     * 多文件上传
     */
    @RequestMapping("fileload03")
    public String fileLoad03(MultipartFile[] files,
    		HttpServletRequest request,User user) throws Exception {
    	//获取普通的表单输入项
    	String username = user.getUsername();
    	String password = user.getPassword();
    	System.out.println("用户名："+username+" 密码："+password);
    	
    	//设置上传的文件所存放的路径
    	String path = request.getSession().getServletContext().getRealPath("/") + "files/";
    	System.out.println("files: "+files.length+"  files:"+files);
    	if (files != null && files.length > 0) {
    		//循环获取上传的文件
    		for (MultipartFile file : files) {
    			if (!file.isEmpty()) {
    				//获取上传文件的名称
    				String filename = file.getOriginalFilename();
    				System.out.println("上传的文件名称为："+filename);
    				// 文件保存的全路径
    				String filePath = path + filename;
    				// 保存上传的文件
    				file.transferTo(new File(filePath));
				}
    		}
    		request.setAttribute("msg", "(上传成功)");
    		return "forward:fileload-03.jsp";
    	}
    	request.setAttribute("msg", "(上传失败)");
    	return "forward:fileload-03.jsp";
    }
    


}

