import java.util.Scanner;

public class FibonacciMain {
    public static void main ( String args[] ) throws Exception {
        Scanner scan = new Scanner( System.in );

        int num = input(scan);
            
        Fibonacci fib_n = new Fibonacci(num);
        long result_n = fib_n.CalcFibonacci();
        String result_n_numbers =fib_n.FibonacciNumbersString();

        System.out.println("--");
        System.out.println(num + "番目のフィボナッチ数は" + result_n);
        System.out.println(num + "番目までのフィボナッチ数列:" + result_n_numbers);
        System.out.println("--");
    }

    private static int input(Scanner scan) throws Exception {
        int num_scan = 0;

        while ( true ) {
            System.out.println( "フィボナッチ数列のN番目とN番目までのフィボナッチ数列を出力します." );
            System.out.print( "70以下の自然数を入力してください ('quit', 'exit' で終了) : " );
            String val_scan = scan.nextLine();
        
        
            switch ( val_scan ) {
                case "quit" :
                case "exit" :
                    System.exit(0);
                default :
                    try {
                        num_scan = Integer.parseInt( val_scan );
                    } catch ( NumberFormatException ex ) {
                        System.out.println( "不正な値です : " + ex);
                        System.out.println( "--" );
                        continue;
                    }
            }


            if ( num_scan < 0 || 70 < num_scan ) {
                System.out.println( "不正な値です :  " + num_scan );
                System.out.println( "--" );
                continue;
            } else {
                break;
            }
                    
        }

        return num_scan;
    }
}