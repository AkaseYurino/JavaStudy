package bronze.purple.chapter2;

public class Sample2_2 {
    public static void main(String[] args){
        byte b = 10; short s = 20; int i = 30; //直接書いたらイント型として認識される
        long l = 40L; float f = 1.15F; //Fをつけるとフローと型として認識してくれる。何もつけないとダブル型になる。
        double d = 5.78;
        char c = 'A'; boolean o = true;

        System.out.println("byte　：" + b);
        System.out.println("short　：" + s);
        System.out.println("int　：" + i);
        System.out.println("long　：" + l);
        System.out.println("float　：" + f);
        System.out.println("double　：" + d);
        System.out.println("char　：" + c);
        System.out.println("boolean　：" + o);
    }
}
