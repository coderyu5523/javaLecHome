package ex04;


public class Television {


    int channer ;
    int volume ;
    boolean onOff ;

    public Television (){

    }

    public Television(int channer, int volume, boolean onOff) {
        this.channer = channer;
        this.volume = volume;
        this.onOff = onOff;
    }

    public static void main(String[] args) {

        Television myTv = new Television();
        myTv.channer =7 ;
        myTv.volume = 10 ;
        myTv.onOff =true ;

        Television yourTv = new Television();
        yourTv.volume = 12;
        yourTv.channer = 9;
        yourTv.onOff =true;

        System.out.println("나의 텔레비전 채널은"+myTv.channer);

    }

}
