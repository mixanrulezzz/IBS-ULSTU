package ru.ibs.ulstu.webapp.more.test;

import ru.ibs.ulstu.webapp.more.dao.ShipDAO;
import ru.ibs.ulstu.webapp.more.dao.ShipDAOImpl;
import ru.ibs.ulstu.webapp.more.entity.Ship;

import java.util.List;

/**
 * Created by Karpov Mikhail on 21.11.2016.
 */
public class ShipDAOTest {

    public static void main(String[] args){

        System.out.println("НАЧАЛО");

        // Обратите внимание, что вначале стоит интерфейс, а не класс
        ShipDAO dao = new ShipDAOImpl();

        try
        {
            for(Ship ship:dao.list())
            {
                System.out.println(ship);
            }

            System.out.println("list \t OK");
        }
        catch (Exception E) {
            System.out.println("list \t Error");
        }

        try
        {
            if(dao.getById(-1) != null)
            {
            System.out.println("getById \t\t OK");
            }
            else
            {
                throw new Exception();
            }
        }
        catch (Exception E) {
            System.out.println("getById \t\t Error");
        }

        try
        {
            if(dao.filterByMmsi("1").size() != 0)
            {
                System.out.println("filterByMmsi \t OK");
            }
            else
            {
                throw new Exception();
            }
        }
        catch (Exception E)
        {
            System.out.println("filterByMmsi \t Error");
        }

        try
        {
            if(dao.filterByName("100000").size() != 0)
            {
            System.out.println("filterByName \t OK");
            }
            else
            {
                throw new Exception();
            }
        }
        catch (Exception E)
        {
            System.out.println("filterByName \t Error");
        }

        System.out.println("КОНЕЦ");
    }

}
