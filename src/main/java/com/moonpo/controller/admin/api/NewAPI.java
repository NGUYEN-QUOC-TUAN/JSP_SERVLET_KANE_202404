package com.moonpo.controller.admin.api;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moonpo.model.NewsModel;
import com.moonpo.service.INewService;
import com.moonpo.util.HttpUtil;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/api-admin-new" })
public class NewAPI extends HttpServlet {
	@Inject
	private INewService newService;

	private static final long serialVersionUID = -1730478217921444539L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		NewsModel newsModel = HttpUtil.of(req.getReader()).toModel(NewsModel.class);
		newsModel = newService.save(newsModel);
		System.out.println(newsModel);
		mapper.writeValue(resp.getOutputStream(), newsModel);
	}
}
