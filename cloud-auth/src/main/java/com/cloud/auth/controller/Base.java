package com.cloud.auth.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Description: 控制器基类
 * FileName: Base
 * Author:   ZhaoXiaoman
 * Date:     2019/2/18 17:04
 * History:
 * <author>          <time>          <version>          <desc>
 * Zhao Xiaoman      2019/2/18 17:04    1.0
 * 版权:   版权所有(C)2019
 * 公司:   东华云计算有限公司
 */
public class Base {
	
	@InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor dateEditor = new CustomDateEditor(format, true);
        binder.registerCustomEditor(Date.class, dateEditor);
    }
    
    public Object getAttribute(String attributeName) {
        return this.getRequest().getAttribute(attributeName);
    }

    public void setAttribute(String attributeName, Object object) {
        this.getRequest().setAttribute(attributeName, object);
    }

    public Object getSession(String attributeName) {
        return this.getRequest().getSession(true).getAttribute(attributeName);
    }

    public void setSession(String attributeName, Object object) {
        this.getRequest().getSession(true).setAttribute(attributeName, object);
    }
    
    public HttpServletRequest getRequest() {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        return ((ServletRequestAttributes) ra).getRequest();
    }
    
    public HttpServletResponse getResponse(){
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        return ((ServletRequestAttributes) ra).getResponse();
    }
    
    public HttpSession getSession() {
        return this.getRequest().getSession(true);
    }
    
    public String getParameter(String paraName) {
        return this.getRequest().getParameter(paraName);
    }
    
    /**
    * @Author ZhaoXiaoman
    * @Description 获取表单格式数据(或url拼接参数)
    * @Date 17:13 2019/2/18
    * @Param []
    * @Return java.util.Map<java.lang.String,java.lang.String[]>
    */
    public Map<String,String[]> getParameterMap(){
        return this.getRequest().getParameterMap();
    }
    
    public String getHeader(String headerName) {
        return this.getRequest().getHeader(headerName);
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Map getHeaderMap() {
        Enumeration headerNames = this.getRequest().getHeaderNames();
        Map headerMap = new HashMap<>();
        while(headerNames.hasMoreElements()){
            String headerName = (String) headerNames.nextElement();
            String headerValue = getRequest().getHeader(headerName);
            headerMap.put(headerName, headerValue);
        }
        return headerMap;
    }
    
    public String getIpAddress(){
        String ip =  this.getRequest().getRemoteAddr();
        return "0:0:0:0:0:0:0:1".equals(ip)?"127.0.0.1":ip;
    }
    
    /**
     * 获取服务器ip地址
     * @return
     */
    public String getServerIpAddress(){
        InetAddress address;
        String serverIpAddress = null;
        try {
            address = InetAddress.getLocalHost(); //获取的是本地的IP地址 //PC-20140317PXKX/192.168.0.121
            serverIpAddress = address.getHostAddress();//192.168.0.121
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return serverIpAddress;
    }
    
    /**
     * 允许跨域访问
     */
    public void allowCrossDomainAccess(){
        HttpServletResponse servletResponse = getResponse();
        servletResponse.setHeader("Access-Control-Allow-Origin", "*");
        servletResponse.setHeader("Access-Control-Allow-Methods", "POST,GET");
        servletResponse.setHeader("Access-Control-Allow-Headers:x-requested-with", "content-type");
    }
    
	/**
	 * 判断参数是否为空，为空则抛出异常
	 * @param parameter
	 * @param name
	 * @throws NullPointerException
	 */
	public void checkEmpty(String parameter,String name) throws NullPointerException
	{
		if (StringUtils.isEmpty(parameter)) {
			throw new NullPointerException("The "+ name +" is empty!");
		}
	}
}
