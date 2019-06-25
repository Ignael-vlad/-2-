public class logic
{
    char[] arr ={'+','-','/','*'};

    char simval = ' ' ;

    int numSimval=0, a=0 , b=0 ;

    ArabeandRome Aar = new ArabeandRome();
    String pont(String exp)
    {
        for(int i = 0 ; i<exp.length();i++)
        {
            for(char t : arr)
            {
                if(t == exp.charAt(i))
                {
                    numSimval = i;
                    simval = exp.charAt(i) ;

                }
            }
        }
        //==========================================
        try {
            a = Integer.parseInt(exp.substring(0, numSimval));
            b=Integer.parseInt(exp.substring(numSimval+1, exp.length()));

            exp = cal( a, b, simval);
            System.out.println(exp);
        }
        catch (Exception e){
            try
            {
                a= Aar.RometoArab(exp.substring(0, numSimval)) ;
                b= Aar.RometoArab(exp.substring(numSimval+1, exp.length())) ;

                exp = cal( a, b, simval);

                exp = Aar.RomanNumerals(Integer.parseInt(exp));
                System.out.println(exp);
            }
            catch (Exception e1){
                System.out.println("Ошибка - возможно вы вели не правильный тип , знак или синтаксис  ");
            }
        }
        return  exp;
    }


    String cal(int a , int b , char simval)
    {
        int output=0;

        switch (simval)
        {
            case '+':
                output = a + b;

                break;

            case '-':
                output = a - b;

                break;

            case '/':
                output = a / b;

                break;

            case '*':
                output = a * b;

                break;

            default:

        }

        return Integer.toString(output);
    }


}
