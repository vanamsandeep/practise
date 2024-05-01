public class Yoyo {

    public static void main(String[] args) {

        System.out.println(yoYo1("yo"));
    }
    public static int yoYo1(String s){

        if(s.isEmpty()){
            return 0;
        }
        if(s.startsWith("yo")){
            return 1+ yoYo1(s.substring(1));
        }
        else{
            return yoYo1(s.substring(1));
        }
    }
}
