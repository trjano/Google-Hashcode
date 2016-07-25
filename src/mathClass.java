/**
 *  FIRST ATTEMPT OF THE CLASS - 23072016-0135
 *  LAST MODIFICATION OF THE CLASS - 23072016-0135 BY Jose Manuel
 *  Modification: none
 */

import static java.lang.Math.*;

public class mathClass {

    /**
     *
     *  Módulo para hallar la distancia entre dos puntos, por ejemplo entre un dron y un almacén
     *
     */
    public double distance(double positionXinitial,double positionYinitial, double positionXfinal, double positionYfinal){

        double solution = sqrt(pow(positionXfinal-positionXinitial,2)+ pow(positionYfinal-positionYinitial,2));
        return  solution;
    }

    /**
     *
     * Módulos para ver qué distancia se tienen que mover por turno en el eje X e Y, coincidentes con el seno y el coseno
     *
     */
     public double movePositionX(double positionXinitial,double positionYinitial, double positionXfinal, double positionYfinal){


        return ((positionXfinal-positionXinitial)/distance(positionXinitial,positionYinitial,positionXfinal,positionYfinal));
    }

    public double movePositionY(double positionXinitial,double positionYinitial, double positionXfinal, double positionYfinal){


        return ((positionYfinal-positionYinitial)/distance(positionXinitial,positionYinitial,positionXfinal,positionYfinal));
    }



}


