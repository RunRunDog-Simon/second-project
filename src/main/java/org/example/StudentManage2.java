package org.example;

import static org.example.StudentManage.displayAllGrades;

public class StudentManage2 {
    public static void main(String[] args) {
        // 學生姓名數組
        String[] names = {"小明", "小華", "小芳", "小強", "小李"};



        // 各科成績數組
        int[] mathScores = {85, 76, 92, 63, 70};
        int[] englishScores = {92, 83, 78, 86, 72};
        int[] scienceScores = {76, 90, 88, 67, 95};

        // 顯示所有學生的成績
        System.out.println("所有學生成績單：");
        displayAllGrades(names, mathScores, englishScores, scienceScores);

        // 計算並顯示平均分
        System.out.println("\n各科平均分：");

        // 找出各科最高分的學生
        System.out.println("\n各科最高分：");

        // 計算並顯示總分最高的學生
        System.out.println("\n總分排名：");



}
}


