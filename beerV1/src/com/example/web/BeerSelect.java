package com.example.web;

import com.example.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "BeerSelect")
public class BeerSelect extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    BeerExpert expert = new BeerExpert();

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String c = request.getParameter("color");

    ArrayList<String> brands = expert.getBrands(c);

    /*out.println("The recommend brands are: <br>");
    for (String b : brands) {
      out.println("<br> " + b);
    }*/
    request.setAttribute("styles", brands);
    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);

  }
}

