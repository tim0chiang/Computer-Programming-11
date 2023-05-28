public class Main {
    public static void main(String args[]){
        /*For the following expressions write out using code step by step how the
        compiler will evaluate it
        Example:
        System.out.println(2 * 5 + 3);
        System.out.println(10 + 3);
        System.out.println(13);
        Only complete one computation per line of code
        The output for every line is always equal to the same number
        In example above the out put should be
        13
        13
        13
        */
        //Expression 1
        System.out.println((9 - 4)+ 10/2 - (4 - 8)/3);
        /* In this expression the terminal would print 11
        9 - 4 = 5
        10/2 = 5
        4 - 8 = -4/3 = -1 (since it is an integer so it does not allow decimal number)
        5 + 5 - (-1) = 11
        */

        //Expression 2
        System.out.println(23%4 + (18 - 3 / 2));
        /* The output would be 20
        23 % 4 = 3 (Remainder of 23/4)
        3/2 = 1 then 18 - 1 = 17
        3 + 17 = 20
        */

        //Expression 3
        System.out.println(((8 - 5) + Math.pow(3,4)/5));
        /*
        The output would be 19.2
        3^4 = 81/5 = 16.2(This number has decimal values because Math.pow returns a double variable)
        8 - 5 = 3
        16.2 + 3 = 19.2
        */

        //Expression 4
        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        /* 
        The output would be -3.0
        9 % 4 = 1 (remainder)
        2^3 = 8/8 = 1.0 (math function returns a double variable)
        sqrt 81 = 9.0/3 = 3.0
        1 - 8 = -7 + 1.0 = -6.0 + 3.0 = -3.0
        */

        //Expression 5
        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        /*
        14/2 = 7 + 3 = 10
        sin(45) = 0.8509035245341184 * 10 = 8.509035245341184 + 2 = 10.509035245341184
        sqrt 25 = 5^3 = 125
        10.509035245341184 - 125 = -114.490965
        The output would be -114.490965
         */
        System.out.println(Math.sin(45));
    }
}
