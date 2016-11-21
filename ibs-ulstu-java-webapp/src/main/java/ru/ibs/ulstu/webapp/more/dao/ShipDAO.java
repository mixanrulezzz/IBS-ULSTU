package ru.ibs.ulstu.webapp.more.dao;

import ru.ibs.ulstu.webapp.more.entity.Ship;

import java.util.List;

/**
 * Created by Karpov Mikhail on 21.11.2016.
 */
public interface ShipDAO {

    public Ship getById(int id); //Получение корабля по его идентификатору
    public List<Ship> list(); //Получение полного списка кораблей

    //Получение отфильтрованных списков кораблей
    public List<Ship> filterByName(String name);
    public List<Ship> filterByMmsi(String mmsi);

}
