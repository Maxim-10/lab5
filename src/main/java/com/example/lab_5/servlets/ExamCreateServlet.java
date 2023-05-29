package com.example.lab_5.servlets;

import com.opencsv.exceptions.CsvValidationException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Exam;
import services.ExamService;
import services.FileHandler;

import java.io.File;
import java.io.IOException;


@WebServlet(name = "examCreateServlet", value = "/examCreate")
public class ExamCreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("examCreate.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Exam exam = new Exam(req.getParameter("name"),
                req.getParameter("surname"),
                req.getParameter("middlename"),
                req.getParameter("discipline"),
                Integer.parseInt(req.getParameter("mark")));

        try {
            if (FileHandler.findFile(FileHandler.getFiles(), exam.getFullName() + ".csv") == null  ||
                    ExamService.checkUnsatisfactoryMark(
                            ExamService.findExam(
                                    FileHandler.getDataFromFile(
                                            FileHandler.findFile(
                                                    FileHandler.getFiles(), exam.getFullName() + ".csv")
                                    ), exam.getDiscipline())
            )) {
                System.out.println(1);
                FileHandler.saveToCSV(new String[]{
                        exam.getStudentName(),
                        exam.getStudentSurname(),
                        exam.getStudentMiddlename(),
                        exam.getDiscipline(),
                        Integer.toString(exam.getMark())
                }, exam.getFullName());
                resp.sendRedirect("success.jsp");
            } else {
                resp.sendRedirect("error.jsp");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
