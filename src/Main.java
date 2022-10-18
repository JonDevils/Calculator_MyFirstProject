import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        String [] end = new String [1];
        end[0] ="Нет";
        int[] Translate = new int[2];

        String operation= "-1";
        String firstValue = "-1";
        String secondValue= "-1";
        String exit;

        int[] numberOneR= new int [1];
        int []numberTwoR= new int [1];






        System.out.println("Введите выражение [1 + 2] или [I + II]");
Main main = new Main();

            firstValue = main.meaning(firstValue);
            operation = main.meaning(operation);
            secondValue = main.meaning(secondValue);






        main.comandOne(numberOneR,firstValue);
        main.comandOne(numberTwoR,secondValue);
        main.translate(Translate,firstValue);
        main.translate2(Translate,secondValue);
        main.check(operation,numberOneR,numberTwoR,firstValue,secondValue,end,Translate);
exit = end[0];
        if (numberOneR[0]==1 && numberTwoR[0]==1 ){calc(exit);}



    }
    Scanner scanner = new Scanner(System.in);


public static String calc(String input)
{

     if(input.equals("1")){System.out.println("Ответ:  I");input = "I";}
    else if(input.equals("2")){System.out.println("Ответ:  II");input = "II";}
    else if(input.equals("3")){System.out.println("Ответ:  III");input = "III";}
    else if(input.equals("4")){System.out.println("Ответ:  IV");input = "IV";}
    else if(input.equals("5")){System.out.println("Ответ:  V");input = "V";}
    else if(input.equals("6")){System.out.println("Ответ:  VI");input = "VI";}
    else if(input.equals("7")){System.out.println("Ответ:  VII");input = "VII";}
    else if(input.equals("8")){System.out.println("Ответ:  VIII");input = "VIII";}
    else if(input.equals("9")){System.out.println("Ответ:  IX");input = "IX";}
    else if(input.equals("10")){System.out.println("Ответ:  X");input = "X";}
    else if(input.equals("11")){System.out.println("Ответ:  XI");input = "XI";}
    else if(input.equals("12")){System.out.println("Ответ:  XII");input = "XII";}
    else if(input.equals("13")){System.out.println("Ответ:  XIII");input = "XIII";}
    else if(input.equals("14")){System.out.println("Ответ:  XIV");input = "XIV";}
    else if(input.equals("15")){System.out.println("Ответ:  XV");input = "XV";}
    else if(input.equals("16")){System.out.println("Ответ:  XVI");input = "XVI";}
    else if(input.equals("17")){System.out.println("Ответ:  XVII");input = "XVII";}
    else if(input.equals("18")){System.out.println("Ответ:  XVIII");input = "XVIII";}
    else if(input.equals("19")){System.out.println("Ответ:  XIX");input = "XIX";}
    else if(input.equals("20")){System.out.println("Ответ:  XX");input = "XX";}
    else if(input.equals("21")){System.out.println("Ответ:  XXI");input = "XXI";}
    else if(input.equals("22")){System.out.println("Ответ:  XXII");input = "XXII";}
    else if(input.equals("23")){System.out.println("Ответ:  XXIII");input = "XXIII";}
    else if(input.equals("24")){System.out.println("Ответ:  XXIV");input = "XXIV";}
    else if(input.equals("25")){System.out.println("Ответ:  XXV");input = "XXV";}
    else if(input.equals("26")){System.out.println("Ответ:  XXVI");input = "XXVI";}
    else if(input.equals("27")){System.out.println("Ответ:  XXVII");input = "XXVII";}
    else if(input.equals("28")){System.out.println("Ответ:  XXVIII");input = "XXVIII";}
    else if(input.equals("29")){System.out.println("Ответ:  XXIX");input = "XXIX";}
    else if(input.equals("30")){System.out.println("Ответ:  XXX");input = "XXX";}
    else if(input.equals("32")){System.out.println("Ответ:  XXXII");input = "XXXII";}
    else if(input.equals("35")){System.out.println("Ответ:  XXXV");input = "XXXV";}
    else if(input.equals("36")){System.out.println("Ответ:  XXXVI");input = "XXXVI";}
    else if(input.equals("40")){System.out.println("Ответ:  XL");input = "XL";}
    else if(input.equals("42")){System.out.println("Ответ:  XLII");input = "XLII";}
    else if(input.equals("45")){System.out.println("Ответ:  XLV");input = "XLV";}
    else if(input.equals("48")){System.out.println("Ответ:  XLVIII");input = "XLVIII";}
    else if(input.equals("49")){System.out.println("Ответ:  XLIX");input = "XLIX";}
    else if(input.equals("50")){System.out.println("Ответ:  L");input = "L";}
    else if(input.equals("54")){System.out.println("Ответ:  LIV");input = "LIV";}
    else if(input.equals("56")){System.out.println("Ответ:  LVI");input = "LVI";}
    else if(input.equals("60")){System.out.println("Ответ:  LX");input = "LX";}
    else if(input.equals("63")){System.out.println("Ответ:  LXIII");input = "LXIII";}
    else if(input.equals("70")){System.out.println("Ответ:  LXX");input = "LXX";}
    else if(input.equals("72")){System.out.println("Ответ:  LXXII");input = "LXXII";}
    else if(input.equals("80")){System.out.println("Ответ:  LXXX");input = "LXXX";}
    else if(input.equals("81")){System.out.println("Ответ:  LXXXI");input = "LXXXI";}
    else if(input.equals("90")){System.out.println("Ответ:  XC");input = "XC";}
    else if(input.equals("100")){System.out.println("Ответ:  C");input = "C";}
    else{System.out.println("Ошибка с присвоением Римского значения.");}



    return input;
}



    int translate (int translate[],String a )
{
    if (a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") || a.equals("VI") || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X")) {
        if (a.equals("I")) {
            translate[0] = 1;
        }
        else if (a.equals("II")) {
            translate[0] = 2;
        }
        else if (a.equals("III")) {
            translate[0] = 3;
        }
        else if (a.equals("IV")) {
            translate[0] = 4;
        }
        else if (a.equals("V")) {
            translate[1] = 5;
        }
        else if (a.equals("VI")) {
            translate[0] = 6;
        }
        else if (a.equals("VII")) {
            translate[0] = 7;
        }
        else if (a.equals("VIII")) {
            translate[0] = 8;
        }
        else if (a.equals("IX")) {
            translate[0] = 9;
        }
        else if (a.equals("X")) {
            translate[0] = 10;
        }

    }return translate[0];


}
    int translate2 (int translate[],String a )
    {
        if (a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") || a.equals("VI") || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X")) {
            if (a.equals("I")) {
                translate[1] = 1;
            }
            else if (a.equals("II")) {
                translate[1] = 2;
            }
            else if (a.equals("III")) {
                translate[1] = 3;
            }
            else if (a.equals("IV")) {
                translate[1] = 4;
            }
            else if (a.equals("V")) {
                translate[1] = 5;
            }
            else if (a.equals("VI")) {
                translate[1] = 6;
            }
            else if (a.equals("VII")) {
                translate[1] = 7;
            }
            else if (a.equals("VIII")) {
                translate[1] = 8;
            }
            else if (a.equals("IX")) {
                translate[1] = 9;
            }
            else if (a.equals("X")) {
                translate[1] = 10;
            }

        }return translate[1];
    }


    String meaning(String number)//присвоение значения.
    {
        try {
            number = scanner.next();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return number;
    }

    int comandOne(int numberOneR[], String a) {//Здесь проверка всех условий. + понять римские или арабске.


        if (a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") || a.equals("VI") || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X")) {

            return numberOneR[0]=1;
        } else if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("10")) {

            return numberOneR[0]=0;
        } else {
            System.out.println("Ошибка numberOne");
            System.exit(0);
        }

        return numberOneR[0]=-1;
    }//проверка на соответсвие 1 и 2 значения.
    int comandTwo(int numberTwoR[], String a) {//Здесь проверка всех условий. + понять римские или арабске.

        if (a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") || a.equals("VI") || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X")) {
            numberTwoR[0] = 1;
            return numberTwoR[0]=1;
        } else if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("10")) {

            return numberTwoR[0] = 0;
        } else {
            System.out.println("Ошибка numberTwo");
            System.exit(0);
        }

        return numberTwoR[0]=-1;
    }

    String check(String a,int numberOneR[],int numberTwoR[],String firstValue,String secondValue,String end[],int[]tr)
    {
        int summa;
        if (numberOneR[0]==0 && numberTwoR[0]==0 ) {

            int one=Integer.parseInt(firstValue);
            int two = Integer.parseInt(secondValue);

            switch (a) {
                case "+":
                        summa = one + two;

                    System.out.println("Ответ:"+summa);
                    break;
                case "-":
                        summa = one - two;
                    System.out.println("Ответ:"+summa);
                    break;
                case "*":
                        summa = one * two;
                    System.out.println("Ответ:"+summa);
                    break;
                case "/":
                        summa = one / two;
                    System.out.println("Ответ:"+summa);

                    break;
                default:
                    System.out.println("Ошибка Check:Арабские цифры");
                    System.exit(0);
            }

        }
       else if (numberOneR[0]==1 && numberTwoR[0]==1 )
        {
            switch (a) {
                case "+":
                    summa = tr[0] + tr[1];
                    end[0]=Integer.toString(summa);
                    break;
                case "-":
                    summa = tr[0] - tr[1];
                    end[0]=Integer.toString(summa);
                    break;
                case "*":
                    summa = tr[0] * tr[1];
                    end[0]=Integer.toString(summa);
                    break;
                case "/":
                    summa = tr[0] / tr[1];
                    end[0]=Integer.toString(summa);
                    break;
                default:
                    System.out.println("Ошибка Check:Римские цифры");
                    System.exit(0);
            }

        }
       else {System.out.println("Ошибка Check"); System.exit(0);}
        return a;
    }

}



