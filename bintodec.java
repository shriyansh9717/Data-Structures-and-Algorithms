public class bintodec {
    public static void bintodec( int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastNum = binNum%10;
            decNum = decNum + (lastNum * (int)Math.pow(2, pow));

            pow++;
            binNum= binNum/10;

        }
        System.out.print("binNum is" + myNum+ "convert to decNum is " + decNum );
        
        
    }

    public static void main(String[] args) {
        bintodec(101);
    }
}
