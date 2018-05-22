import java.util.Scanner;

public class FibonacciMain {
    public static void main ( String args[] ) throws Exception {
        Scanner scan = new Scanner( System.in );

        while ( true ) {
            int num = input(scan);
            
            Fibonacci fib_n = new Fibonacci(num);
            long result_n = fib_n.CalcFibonacci();
            String result_n_numbers =fib_n.FibonacciNumbersString();

            System.out.println("--");
            System.out.println(num + "番目のフィボナッチ数は" + result_n);
            System.out.println(num + "番目までのフィボナッチ数列:" + result_n_numbers);
            System.out.println("--");
        }


    }

    private static int input(Scanner scan) throws Exception {
        System.out.print( "入力してください : ");
        String val_scan = scan.nextLine();
        
        int num_scan = 0;
        
        switch ( val_scan ) {
            case "exit":
            case "quit":
                throw new Exception( "終了します." );
            default:
                try {
                    num_scan = Integer.parseInt( val_scan );
                } catch ( NumberFormatException ex ) {
                    throw new Exception( "70以下の自然数を入力してください. 終了します. ");
                }
        }
        
        if ( num_scan <= 0 || 70 < num_scan ) {
            //System.out.println( "70以下の自然数を入力してください. 終了します. ");
            //System.exit( 0 );
            throw new Exception( "70以下の自然数を入力してください. 終了します. ");
        }
        
        return num_scan;
    }
}