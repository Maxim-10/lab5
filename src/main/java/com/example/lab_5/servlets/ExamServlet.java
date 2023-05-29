package com.example.lab_5.servlets;

import com.opencsv.exceptions.CsvValidationException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Exam;
import services.FileHandler;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "examServlet", value = "/Exam")
public class ExamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String filename = req.getParameter("file");
        ArrayList<Exam> exams;
        try {
            exams = FileHandler.getDataFromFile(FileHandler.findFile(FileHandler.getFiles(), filename));
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("exams", exams);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/Exam.jsp");
        dispatcher.forward(req, resp);
    }
}
