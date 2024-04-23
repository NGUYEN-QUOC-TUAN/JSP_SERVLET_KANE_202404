package com.moonpo.controller.web;

import java.io.IOException;
import java.util.List;

import com.moonpo.dao.ICategoryDAO;
import com.moonpo.model.CategoryModel;
import com.moonpo.model.NewsModel;
import com.moonpo.service.ICategoryService;
import com.moonpo.service.INewService;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 433100418668099412L;
	
	@Inject
	private ICategoryService categoryService;
	
	@Inject
	private INewService newService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<NewsModel> listNews = newService.findByCategoryId(1L);
		
		List<CategoryModel> listCategorys = categoryService.findAllCategory();
		req.setAttribute("listCategorys", listCategorys);
		req.getRequestDispatcher("/views/web/home.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
