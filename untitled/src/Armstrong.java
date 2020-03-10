public class Armstrong {

    public static void main(String[] args) {

        int num = 1635;
        int num2 = num;
        int sum = 0;

        int length = (""+num).length();

        for (int i = 0; i < length ; i++) {
            int a = num2%10;
           num2 = num2/10;
            sum += Math.pow(a, length);
        }

        if(sum == num){
            System.out.println("It is armstrong");
        }else{
            System.out.println("It is not a armstrong");
        }
    }
}
