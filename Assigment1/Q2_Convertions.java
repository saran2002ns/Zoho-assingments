// 2. Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short


public class Q2_Convertions {
    public static void main(String[] args) {
        int n=500;

       //int to
        float f=n;System.out.println(f);
        double d=n;System.out.println(d);
        short s=(short)n;System.out.println(s);
        long l=n;System.out.println(l);
        byte b=(byte)n;System.out.println(b);

        //float to
        int n2=(int)f;System.out.println(n2);
        double d2=f;System.out.println(d2);
        short s2=(short)f;System.out.println(s2);
        long l2=(long)f;System.out.println(l2);
        byte b2=(byte)f;System.out.println(b2);
        
        //double to
        float f3=(float)d;System.out.println(f3);
        int n3=(int)d;System.out.println(n3);
        short s3=(short)d;System.out.println(s3);
        long l3=(long)d;System.out.println(l3);
        byte b3=(byte)d;System.out.println(b3);

        //short to
        float f4=s;System.out.println(f4);
        double d4=s;System.out.println(d4);
        int s4=s;System.out.println(s4);
        long l4=s;System.out.println(l4);
        byte b4=(byte)s;System.out.println(b4);

        //long to
        float f5=l;System.out.println(f5);
        double d5=l;System.out.println(d5);
        short s5=(short)l;System.out.println(s5);
        int l5=(int)l;System.out.println(l5);
        byte b5=(byte)l;System.out.println(b5);

        //byte to
        float f6=s;System.out.println(f6);
        double d6=s;System.out.println(d6);
        short s6=s;System.out.println(s6);
        long l6=s;System.out.println(l6);
        int b6=s;System.out.println(b6);
      
    }
}
