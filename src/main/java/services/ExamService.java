package services;

import models.Exam;

import java.util.ArrayList;
import java.util.Arrays;

public class ExamService {

    public static Exam findExam(ArrayList<Exam> exams, String examName) {
        for (Exam exam : exams) {
            if (exam.getDiscipline().equals(examName)) {
                return exam;
            }
        }
        return null;
    }

    public static boolean checkUnsatisfactoryMark(Exam exam) {
        return exam == null || exam.getMark() == 2;
    }
}
