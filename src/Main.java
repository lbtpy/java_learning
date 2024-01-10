import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
               /* int foot;
        int inch;
        Scanner sg = new Scanner(System.in);
        foot =sg.nextInt();
        inch =sg.nextInt();
        System.out.println((foot+inch /12.0)*0.3048);  \

        */

        /*double a = 1.0;
        double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
        System.out.println(Math.abs(a-b) < 1e-6);

         */

       /* int balance = 0;
        while (true) {
            // 初始化
            Scanner in = new Scanner(System.in);
            //请投币
            System.out.print("请投币：");
            int amount = in.nextInt();
            balance = balance + amount;
            if (balance >= 10) {
                //打印车票
                System.out.println("...............");
                //找零
                System.out.println("找零：" + (balance - 10));
                balance = 0;
            }


        }
        */

        /*      while (true) {
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            int count = 0;
            while (number > 0) {
                number = number / 10;
                count = count + 1;
            }
            System.out.println(count);
        }

   */

        //猜数游戏
        /* Scanner in = new Scanner(System.in);
        int number = (int)(Math.random()*100+1); //1-100的整数
        int count = 0;
        int a;
        do
        {
            a = in.nextInt();
            count = count + 1;
            if ( a > number )
            {
                System.out.println("偏大");
            }
            else if ( a <number )
            {
                System.out.println("偏小");
            }
        }while ( a != number );
        {
            System.out.println("恭喜你猜对了");
        }
  */

        //算平均数
        /*    Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number;
        number = in.nextInt();
        while( number != -1)
        {
            sum = sum + number;
            count = count + 1;
            number = in.nextInt();
        }
        if ( count > 0 )
        {
            System.out.print("平均数="+(double)sum/count);
        }
    */

        //逆序输出数字
         /*    Scanner in = new Scanner(System.in);
        int number;
        number = in.nextInt();
        int digit;
        int result = 0;
        do {
            digit = number % 10;
            result = result * 10 + digit;
            number = number / 10;
        }while( number > 0 );
        {
            System.out.println(result);
        }
     */

        //建立数组，输出比平均数大的元素
        /*   Scanner in = new Scanner(System.in);
        int cnt = 0;
        double sum = 0;
        cnt = in.nextInt();
        if ( cnt > 0 )
        {
            int[] numbers = new int[cnt];
            for ( int i = 0; i < cnt; i++ )
            {
                numbers[i] = in.nextInt();
                sum += numbers[i];
            }
            System.out.println(sum);
            double average = sum / cnt;
            System.out.println(average);

            for ( int i = 0; i < cnt; i++)
            {
                if ( numbers[i] > average)
                {
                    System.out.println(numbers[i]);
                }
            }
        }
         */

        //数字出现次数
        /*    Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];
        int x;
        x = in.nextInt();
        while ( x != -1 )
        {
            if ( x >=0 && x <= 9 )
            {
                numbers[x]++;
            }
            x = in.nextInt();
        }
        for (int i=0; i< numbers.length; i++)
        {
            System.out.println(i+":"+numbers[i]);
        }

     */

        //数组中是否存在某数字
        /*  Scanner in= new Scanner(System.in);
        int x = in.nextInt();
        int loc = -1;
        int[] data = {3,5,2,7,8,9,11,24,10,35};
        for ( int i=0; i< data.length; i++)
        {
            if( x == data[i])
            {
                loc = i;
                break;
            }
        }
        if( loc > -1)
        {
            System.out.println(x+"是第"+(loc+1)+"个");
        }
        else
        {
            System.out.println(x+"不在其中");
        }

       */
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] data = {3,5,2,7,8,9,11,24,10,35};
        boolean found = false;
        for ( int k : data )
        {
            if( x == k )
            {
                found = true;
                break;
            }
        }
        if( found )
        {
            System.out.println(x+"在其中");
        }
        else
        {
            System.out.println(x+"不在其中");
        }
    }
}