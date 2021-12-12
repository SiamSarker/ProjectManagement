package pack1;

import pack1.pack2.Box;

public class BoxMain {
    public static void main(String[] args) {
        Box boxArray[] = new Box[3];
        boxArray[0] = new Box(2,3,4);
        boxArray[1] = new Box(5);
        boxArray[2] = new Box(6);

        for(Box arr : boxArray){
            arr.printDetails();
        }

        boxArray[1] = null;

        for(Box arr : boxArray){
            System.out.println("Volume :"+arr.getVolume());
        }

    }
}
