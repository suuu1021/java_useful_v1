package _my_test3;

public class SpaceShip {

    private Engine innerEngine;

    public void addEngine(Engine engine){
        innerEngine = engine;
    }

    public void startSpaceShip(){
        if(innerEngine == null){
            System.out.println("엔진을 먼저 장착해주세요");
        } else{
            System.out.println("달나라로 출발합니다");
        }
    }

     public static class Engine {

         public static int ENGINE_COUNT = 0;
         private int serialNumber;

         public Engine(){
             ENGINE_COUNT++;
             this.serialNumber = ENGINE_COUNT;
         }

         public void start (){
             System.out.println("Engine" + serialNumber + "동작합니다");
         }
     }
}
