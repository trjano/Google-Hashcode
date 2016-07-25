import java.util.ArrayList;

/**
 *  FIRST ATTEMPT OF THE CLASS - 23/07/2016-01:35
 *  LAST MODIFICATION OF THE CLASS - 24/07/2016-23:15 BY Jose Manuel
 *  Modification: Added some modules
 */


public class map {

    private long MAXIMUM_NUMBER_ROWS = 10000;
    private long MAXIMUM_NUMBER_COLUMNS = 10000;
    private long MAXIMUM_NUMBER_OF_DRONES = 1000;
    private long MAXIMUM_LOAD_OF_A_DRONE = 10000;
    private long DEADLINE_TURN = 1000;
    private long turn;

    private ArrayList<drone> listOfDronesWorking;
    private ArrayList<warehouse> listOfWarehouses;
    private long[][] mapOfTheCity;

    public map(){
        turn = 0;
        listOfDronesWorking = new ArrayList<drone>();
        listOfWarehouses = new ArrayList<warehouse>();
        mapOfTheCity = new long[(int) MAXIMUM_NUMBER_ROWS][(int) MAXIMUM_NUMBER_COLUMNS];
    }


    /**
     * Devuelve si sigue aún en un turno válido, es decir, que no pase el turno límite;
     */
    public boolean finishedExecution(){
        return (turn >= DEADLINE_TURN);
    }

    public boolean AllDronesTraveling(){
        return listOfDronesWorking.size()==MAXIMUM_NUMBER_OF_DRONES;
    }



}
