package com.company;

public class Main {

    public  int a = 0;
    public  int b = 0;

    public static void main(String[] args)  {

        String [][] array = {{"5","7","3","17"},{"8","1","2","3"}, {"7","0","1","12"}, {"8","1","2","3"}};
        String [][] array0 = {{"5","7","7","3","17"},{"8","1","2","3"}, {"7","0","1","12"}, {"8","1","2","3"}};
        String [][] array1 = {{"5","7","3","17"},{"8","1","2","3"}, {"7","0","1л","12"}, {"8","1","2","3"}};

    try {
        System.out.println(arraySum(array1));
        }

    catch (MyArraySizeException e){
    System.out.println("Вне размера массива");
        }
    }

   public static int arraySum( String array[][])  {
        int sum = 0;
        int a = 0, b = 0;
        for (int i = 0; i < 4; i ++) {
            if (array[i].length != 4 || array.length != 4) {
                throw new MyArraySizeException();
            }
        }

            for (int i = 0; i < array.length; i++) {
                a = i;
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Неверный тип данных");
                            try {
                                throw new MyArrayDataException();
                            }
                            catch (MyArrayDataException ignored) {
                                System.out.println("Неверный тип данных в ячейке [" + a +"][" + (b + 1) + "]. Сумма без этого элемента:");
                            }
                            }
                    b = j;
                }
            }
       return sum;
    }
}
