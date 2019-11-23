package by.epam.pronovich.training.lesson03.task2;

import by.epam.pronovich.training.lesson03.utill.UtillClass;

public class Task3 {

    public static void main(String[] args) {
        int value= UtillClass.inputNaturalValue();
        System.out.println(isSimpleNumber(value));
    }

    public static boolean isSimpleNumber(int value){
        boolean result=true;
        for (int i = 2; i <value ; i++) {
            if(value%i==0){
                result=false;
                break;
            }
        }
        return result;
    }
}
