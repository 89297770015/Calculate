public class Calculate {
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[2]);
        String operator = String.valueOf(args[1]);
        if(operator.equals("+"))
        System.out.println("answer is "+ (a+b));
        if(operator.equals("-"))
            System.out.println("answer is "+ (a-b));
        if(operator.equals("*"))
            System.out.println("answer is "+ (a*b));
//
        if(operator.equals("/")&&b!=0)
            System.out.println("answer is "+ (a/b));
        if(operator.equals("/")&&b==0)
            System.out.println("divide by zero is impossible");

    }
}
