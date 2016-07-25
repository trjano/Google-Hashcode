import java.util.ArrayList;

/**
 *  FIRST ATTEMPT OF THE CLASS - 23/07/2016-01:35
 *  LAST MODIFICATION OF THE CLASS - 23/07/2016-16:46 BY Jose Manuel
 *  Modification: none
 */

public class drone {

    private double positionX;
    private double positionY;
    private ArrayList<product> productList = new ArrayList<product>();

    public drone() {
        positionX = 0;
        positionY = 0;
    }

    public drone(double X, double Y){
        positionX = X;
        positionY = Y;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setNewProduct(product newProduct){
        productList.add(newProduct);
    }

    public void eraseProductList(){
        productList.clear();
    }


}