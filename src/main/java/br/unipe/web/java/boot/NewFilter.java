package br.unipe.web.java.boot;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/secure/*") 
public class NewFilter implements Filter {
	
	    public void init(FilterConfig config){
	    	
	    } 
	    public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws IOException, ServletException{
	    	System.out.println("Passando pelo filtro");
	    
	    	fc.doFilter(req, res);
	    }
	    public void destroy(){
		}
	


}
