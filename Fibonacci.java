class Fibonacci {
    private final long[] FibonacciNumbersList;

    public Fibonacci( int num ) {
        long[] list = new long[num];
        
        if ( num > 0 ) {
            list[0] = 0L;
        }
        if ( num > 1 ) {
            list[1] = 1L;
        }
        this.FibonacciNumbersList = list;
    }

    public long CalcFibonacci() {
        long[] N = this.FibonacciNumbersList;
        
        for ( int i = 2; i < N.length; i++ ) {
            N[i] = N[i-1] + N[i-2];
        }

        return N[N.length - 1];
    }

    public String FibonacciNumbersString() {
        StringBuffer sb = new StringBuffer();

        for (long f : this.FibonacciNumbersList) sb.append(f).append( " ");
        //this.FibonacciNumbersList.forEach ( f -> sb.append(f).append ( " " ));         
        return sb.toString();
    }
}