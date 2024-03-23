public class SetBit {
    public static void main(String[] args){
        int pos=1;
        int n=5;
        int bitMask =1<<pos;

        int newNumber=bitMask|n;
        System.out.println(newNumber);
    }
}
