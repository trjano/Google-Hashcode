/**
 *  CREATION OF THE CLASS - 23/07/2016-01:35
 *  LAST MODIFICATION OF THE CLASS - 23/07/2016-01:35 BY Jose Manuel
 *  Modification: none
 */

import java.util.ArrayList;

public class warehouse {

    private long MAXIMUM_NUMBER_OF_ITEMS = 10000;

    private double positionX;
    private double positionY;
    private ArrayList<product> productList = new ArrayList<product>();

    public warehouse(){

        positionX = 0;
        positionY = 0;

    }

    public warehouse(double X, double Y){
        positionX = X;
        positionY = Y;
    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public boolean gotThisItem(product productSearched){
        boolean found = false;
        if (productList.contains(productSearched)){
            found = true;
        }
        return found;
    }

    //Con este módulo insertamos los productos en la lista y los pondremos siempre en orden

    public void addProduct(product productToAdd){
        productList.add(productToAdd.getType(),productToAdd);
    }


}
