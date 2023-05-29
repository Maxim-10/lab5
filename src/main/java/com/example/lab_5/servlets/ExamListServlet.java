package com.example.lab_5.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "examListServlet", value = "/ExamList")
public class ExamListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> fileNames = FileHandler.getFileNames(FileHandler.getFiles());
        req.setAttribute("files", fileNames);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/examList.jsp");
        dispatcher.forward(req, resp);
    }
}
