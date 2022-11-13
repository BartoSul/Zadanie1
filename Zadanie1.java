class Zadanie1{
    public static void main(String[] args){

        long ncount= 1;
        long fn0= 1;
        long fn1= 2;


        System.out.println(ncount + "th number=" + fn0);
        ncount++;

        System.out.println(ncount + "th number=" + fn1);
        ncount++;
        while(ncount < 50){

            fn0 = fn0 + fn1;
            System.out.println(ncount + "th number=" + fn0);
            ncount++;

            fn1 = fn0 + fn1;
            System.out.println(ncount + "th number=" + fn1);
            ncount++;

        }
    }
}
