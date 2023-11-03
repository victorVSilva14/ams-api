package com.ams.amsapi.cors;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsFilter implements Filter {
	
	private String origemPermitida = "http://localhost:4200";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest requisicao = (HttpServletRequest) request;
		HttpServletResponse resposta = (HttpServletResponse) response;

		resposta.setHeader("Access-Control-Allow-Origin", this.origemPermitida);
		resposta.setHeader("Access-Control-Allow-Credentials", "true");

		String metodoDaRequisicao = requisicao.getMethod();
		String origemDaRequisicao = requisicao.getHeader("Origin");

		String metodoHttp = "OPTIONS";
		
		if (metodoHttp.equals(metodoDaRequisicao) && this.origemPermitida.equals(origemDaRequisicao)) {

			resposta.setHeader("Access-Control-Allow-Methods", "POST, GET, DELETE, PUT, OPTIONS");
			resposta.setHeader("Access-Control-Allow-Headers", "Authorization, Content-type, Accept");
			resposta.setHeader("Access-Control-Max-Age", "3600");

			resposta.setStatus(HttpServletResponse.SC_OK);
		} else {
			chain.doFilter(requisicao, resposta);
		}

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}


}
