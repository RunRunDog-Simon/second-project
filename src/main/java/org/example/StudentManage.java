package org.example;

public class StudentManage {
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

        int [] scoresSum = new int[5];
        int i = 0;
        while(i < 5) {
            scoresSum[i] = mathScores[i] + englishScores[i] + scienceScores[i];
            i++;
        }

        i = 0;
        while(i < 5){
                System.out.println(names[i] + "\t" + mathScores[i] + "\t" + englishScores[i] +
                        "\t" + scienceScores[i] + "\t" + scoresSum[i]);
            i++;
        }


        // 計算並顯示平均分
        System.out.println("\n各科平均分：");

        int j = 0;
        int p = 0;
        int mathSum = 0;
        int englishSum = 0;
        int scienceSum = 0;

        while(j <= 3){
            mathSum = mathSum + mathScores[j] + mathScores[j+1] - mathScores[p];
            englishSum = englishSum + englishScores[j] + englishScores[j+1] - englishScores[p];
            scienceSum = scienceSum + scienceScores[j] + scienceScores[j+1] - scienceScores[p];
            j++;
            p++;
        }

        double mathScoresAverage = 0;
        double englishScorcesAverage = 0;
        double scienceScorcesAverage = 0;

        mathScoresAverage = (mathSum + mathScores[0]) / 5;
        englishScorcesAverage= (englishSum + englishScores[0]) / 5;
        scienceScorcesAverage = (scienceSum + scienceScores[0]) / 5;

        System.out.println("數學平均成績為：" + mathScoresAverage + "分");
        System.out.println("英文平均成績為：" + englishScorcesAverage + "分");
        System.out.println("科學平均成績為：" + scienceScorcesAverage + "分");


        // 找出各科最高分的學生
        System.out.println("\n各科最高分：");

        int highestMathScorces = 0;
        int q = 0;
        while(q <= 4){
            if(highestMathScorces - mathScores[q] >= 0) {
                highestMathScorces = highestMathScorces;
            }else{
                highestMathScorces = mathScores[q];
            }
            q++;
        }
        System.out.println("數學科最高分為"+ highestMathScorces +"分");

        int highestEnglishScorces = 0;
        q = 0;
        while(q <= 4){
            if(highestEnglishScorces - englishScores[q] >= 0) {
                highestEnglishScorces = highestEnglishScorces;
            }else{
                highestEnglishScorces = englishScores[q];
            }
            q++;
        }
        System.out.println("英文科最高分為"+ highestEnglishScorces +"分");


        int highestScienceScorces = 0;
        q = 0;
        while(q <= 4){
            if(highestScienceScorces - scienceScores[q] >= 0) {
                highestScienceScorces = highestScienceScorces;
            }else{
                highestScienceScorces = scienceScores[q];
            }
            q++;
        }
        System.out.println("科學科最高分為"+ highestScienceScorces +"分");


        // 計算並顯示總分最高的學生
        System.out.println("\n總分排名：");

        int highestSum = 0;
        int g = 0;
        while(g <= 4){
            if(highestSum - scoresSum[g] >= 0) {
                highestSum = highestSum;
            }else{
                highestSum = scoresSum[g];
            }
            g++;
        }
        System.out.println("總分最高分為" + highestSum + "分");

        int secondSum = 0;
        g = 0;
        while(g <= 4){
            if (scoresSum[g] != highestSum){
                if(secondSum - scoresSum[g] >= 0 ) {
                    secondSum = secondSum;
                }else{
                    secondSum = scoresSum[g];
                }
            }
            g++;
        }
        System.out.println("第二高分為" + secondSum + "分");

        int thirdSum = 0;
        g = 0;
        while(g <= 4){
            if (scoresSum[g] != highestSum && scoresSum[g] != secondSum){
                if(thirdSum - scoresSum[g] >= 0) {
                    thirdSum = thirdSum;
                }else{
                    thirdSum = scoresSum[g];
                }

            }
            g++;
        }
        System.out.println("第三高分為" + thirdSum + "分");

        int forthSum = 0;
        g = 0;
        while(g <= 4){
            if(scoresSum[g] != highestSum && scoresSum[g] != secondSum && scoresSum[g] != thirdSum){
                if(forthSum - scoresSum[g] >= 0) {
                    forthSum = forthSum;
                }else{
                    forthSum = scoresSum[g];
                }
            }
            g++;
        }
        System.out.println("第四高分為" + forthSum + "分");

        int lastSum = 0;
        g = 0;
        while(g <= 4){
            if(scoresSum[g] != highestSum && scoresSum[g] != secondSum && scoresSum[g] != thirdSum && scoresSum[g] != forthSum){
                if(lastSum - scoresSum[g] >= 0) {
                    lastSum = lastSum;
                }else{
                    lastSum = scoresSum[g];
                }
            }
            g++;
        }
        System.out.println("最低分為" + lastSum + "分");
    }


    // 顯示所有學生的成績
    public static void displayAllGrades(String[] names, int[] mathScores,
                                        int[] englishScores, int[] scienceScores) {
        System.out.println("姓名\t數學\t英語\t科學\t總分");
        System.out.println("----------------------------------------");
    }
}