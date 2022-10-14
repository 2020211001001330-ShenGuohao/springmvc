package com.sgh.controller;

import com.sgh.pojo.User;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.net.URLEncoder;

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
    
    @ResponseBody
    @RequestMapping("getFilesName")
    public String[] getFilesName(HttpServletRequest request,
                               HttpServletResponse response) throws Exception {
    	String path = request.getSession().getServletContext().getRealPath("/") + "files/";

    	File file = new File(path);
    	String[] list = file.list();
        return list;
    }

    /**
     * 文件下载
     */
    @RequestMapping("/download")
    public ResponseEntity<byte[]> fileDownload(HttpServletRequest request,
                                               String filename) throws Exception {
        // 指定要下载的文件所在路径
        String path = request.getSession().getServletContext().getRealPath("/files/");
        // 创建该文件对象
        File file = new File(path + File.separator + filename);
        // 设置响应头
        HttpHeaders headers = new HttpHeaders();
        // 通知浏览器以下载的方式打开文件
        headers.setContentDispositionFormData("attachment", URLEncoder.encode(filename, "UTF-8"));
        // 定义以流的形式下载返回文件数据
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        // 使用Sring MVC框架的ResponseEntity对象封装返回下载数据
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.OK);
    }

    
    @RequestMapping("/helo")
    public ResponseEntity<String> customHeader() {
    	
    return new ResponseEntity<>("Hello !", HttpStatus.OK);
    }
    
}

