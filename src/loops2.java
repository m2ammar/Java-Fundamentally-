public class loops2 {
    public static void main(String[] args) {
      /*  int a;
        a=1;
        while(a<=5){
            System.out.println(a);//or it can be as System.out.println(a++);
            a++;
        }*/
      /* int a=1;
       while(a<=50){
           System.out.println(a);
           a+=2;
       }*/
        /*
        char a='a';
        while(a<='z'){
            System.out.println(a++);
        }*/
        /*char a = 'a';
        while(a<='z'){
            if (!(a=='a' || a=='e' || a=='i' || a=='o' || a =='u'));
            System.out.println(a);
            a++;
        }*/
        char a = 'a';
        while (a <= 'z') {
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
                System.out.println(a);
            a++;
        }
    }
}
