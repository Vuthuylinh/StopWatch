package DemThoiGian;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] number = new int[1000];
        Random random=new Random();
        for(int i=0;i<number.length; i++){
            number[i]= random.nextInt(10000);
        }

        StopWatch stopWatch= new StopWatch();
        stopWatch.start();
        for(int i=0; i<number.length-1; i++){
            for(int j=i+1; j<number.length; j++){
                if(number[i]>number[j]){
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }

        }
        for(int i=0; i<number.length;i++){
            System.out.print(number[i]+ "; ");
        }
        System.out.println();

        stopWatch.stop();

        long runTime=stopWatch.getElapsedTime();
        System.out.println("Thoi gian chay chuong trinh sap xep mang la: "+ runTime);

    }
}
