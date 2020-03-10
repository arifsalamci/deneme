public class FIndBiggestNum {

    public static void main(String[] args) {
        FIndBiggestNum f = new FIndBiggestNum();
        System.out.println(f.withoutString("xxx", "xx"));
    }


    public String withoutString(String base, String remove) {




        for(int i = 0; i < base.length()-remove.length(); i++){
            String str = base.substring(i,i+remove.length());

            if(str.equalsIgnoreCase(remove)){
                base = base.replaceAll(str, "");
                base = base.replaceAll(str.toLowerCase(), "");
                base = base.replaceAll(str.toUpperCase(), "");
                break;





            }
        }

        return base;

    }

}
