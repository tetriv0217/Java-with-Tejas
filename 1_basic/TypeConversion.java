class TypeConversion {
    public static void main(String[] args) {
        // int a = 12;
        // byte b = a;//this will not convert
        // byte b = (byte)a;//this will convert example of type casting

        int bigger = 257;
        int bigger2 = -257;
        byte k = (byte)bigger;
        byte k2 = (byte)bigger2;

        // since byte is of 8 bit and has a range of 256 integers
        // if it is bigger than the range of byte it does modulo 256;
        //257%256 = 1
        System.out.println(k);// answer is 1 
        System.out.println(k2);// answer is -1 

        // Promotion

        byte num1 = 10;
        byte num2 = 30;
        int res = num1*num2;
        System.out.println(res);

    }    
}
