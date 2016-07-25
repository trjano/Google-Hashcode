/**
 *  CREATION OF THE CLASS - 23/07/2016-15:48
 *  LAST MODIFICATION OF THE CLASS - 23/07/2016-15:48 BY Jose Manuel
 *  Modification: none
 */
public class product {

    private int type;
    private int quantity;

    public product(){
        type = 0;
        quantity = 0;
    }

    public product(int type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}

