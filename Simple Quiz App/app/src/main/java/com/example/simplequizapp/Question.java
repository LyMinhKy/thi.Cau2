package com.example.simplequizapp;

public class Question {
    public String questions [] = {
            "Lan có 5 viên kẹo, Lan cho bố 2 viên. Bố Lan tên là gì?",
            "Mỗi năm Hiếu sinh nhật một lần. Năm nay Hiếu 21 tuổi. Hỏi Hiếu có bao nhiêu ngày sinh?",
            "2 con vịt đi trước 2 con vịt, 2 con vịt đi sau 2 con vịt, 2 con vịt đi giữa 2 con vịt. Hỏi có mấy con vịt?"
    };
    public String choices [][] = {
            {"Tuấn", "Trung", "Hùng", "Dũng"},
            {"21", "1", "17", "18"},
            {"4", "8", "2", "6"}
    };
    public String correctAnswer [] =
    {
        "Dũng",
        "1",
        "4"
    };


    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
