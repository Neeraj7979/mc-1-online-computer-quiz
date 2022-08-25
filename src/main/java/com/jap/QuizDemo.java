package com.jap;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){
        String highsScore=null;
        try {

            for (int i = 0; i < scores.length; i++) {
                if (Integer.parseInt(scores[i])<Integer.parseInt(scores[i+1])){
                    i=i+1;
                    for (int j = 0; j < nameOfSchool.length; j++) {
                        highsScore=nameOfSchool[i];

                    }
                }

            }
        }
        catch (NumberFormatException e){
           return e.toString();
        }


        return highsScore;

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String name[]){
        String upperCase[] = new String[name.length];
        try {
            for (int i = 0; i < name.length; i++) {
                upperCase[i]=name[i].toUpperCase();

            }
        }
        catch (NullPointerException e){
            e.toString();
            System.out.println(e);
        }

        return upperCase;
    }
}






