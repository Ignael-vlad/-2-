import java.util.Scanner;

public class mainClass
{
    public static void main(String[] args) {

        logic log  = new logic();
        ArabeandRome Aar = new ArabeandRome();


        Scanner in = new Scanner(System.in);
        // input - Ввод
        String exp = in.nextLine();

        exp = exp.replaceAll("\\s+","");


        // устранил ошибку маленьких букв ))))
        exp = exp.toUpperCase();
        exp = log.pont(exp);

    }
}

