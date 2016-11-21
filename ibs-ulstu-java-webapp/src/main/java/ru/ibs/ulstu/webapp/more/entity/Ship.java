package ru.ibs.ulstu.webapp.more.entity;

/**
 * Created by Karpov Mikhail on 21.11.2016.
 */
public class Ship {
    private int id; //Идентификатор
    private String name; //Наименование
    private String nameLat; //Наименование лат
    private String callSign; //Позывной
    private String imo; //IMO
    private String mmsi; //MMSI

    private Boolean dangerCargo; //Судно с опасным грузом
    private Boolean highTargetFactor; //Судно имеет высокий целевой фактор
    private Boolean ssas; //Судно с сигналом SSAS

    private Integer rrr; //РРР
    private Integer rmrs; //РМРС
    private String flag; //Флаг

    private String lastLocationDate; //Дата позиции
    private String lastLocationSource; //Источник
    private String lastLocationCoordinates; //Координаты
    private String lastLocationSpeed; //Скорость
    private String lastLocationCource; //Курс

    public Ship(int id, String name, String nameLat, String callSign, String imo, String mmsi, Boolean dangerCargo,
                Boolean highTargetFactor, Boolean ssas, Integer rrr, Integer rmrs, String flag, String lastLocationDate,
                String lastLocationSource, String lastLocationCoordinates, String lastLocationSpeed,
                String lastLocationCource)
    {
        super(); // что будет, если этого не написать?
        this.id = id;
        this.name = name;
        this.nameLat = nameLat;
        this.callSign = callSign;
        this.imo = imo;
        this.mmsi = mmsi;

        this.dangerCargo = dangerCargo;
        this.highTargetFactor = highTargetFactor;
        this.ssas = ssas;

        this.rrr = rrr;
        this.rmrs = rmrs;
        this.flag = flag;

        this.lastLocationDate = lastLocationDate;
        this.lastLocationSource = lastLocationSource;
        this.lastLocationCoordinates = lastLocationCoordinates;
        this.lastLocationSpeed = lastLocationSpeed;
        this.lastLocationCource = lastLocationCource;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLat() {
        return nameLat;
    }

    public void setNameLat(String nameLat) {
        this.nameLat = nameLat;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign){
        this.callSign = callSign;
    }

    public String getImo(){
        return imo;
    }

    public void setImo(String imo){
        this.imo = imo;
    }

    public String getMmsi(){
        return mmsi;
    }

    public void setMmsi(String mmsi){
        this.mmsi = mmsi;
    }

    public Boolean getDangerCargo(){
        return dangerCargo;
    }

    public void setDangerCargo(Boolean dangerCargo){
        this.dangerCargo = dangerCargo;
    }

    public Boolean getHighTargetFactor(){
        return highTargetFactor;
    }

    public void setHighTargetFactor(Boolean highTargetFactor){
        this.highTargetFactor = highTargetFactor;
    }

    public Boolean getSsas(){
        return ssas;
    }

    public void setSsas(Boolean ssas){
        this.ssas = ssas;
    }

    public Integer getRrr(){
        return rrr;
    }

    public void setRrr(Integer rrr){
        this.rrr = rrr;
    }

    public Integer getRmrs(){
        return rmrs;
    }

    public void setRmrs(Integer rmrs){
        this.rmrs = rmrs;
    }

    public String getFlag(){
        return flag;
    }

    public void setFlag(String flag){
        this.flag = flag;
    }

    public String getLastLocationDate(){
        return lastLocationDate;
    }

    public void setLastLocationDate(String lastLocationDate) {
        this.lastLocationDate = lastLocationDate;
    }

    public String getLastLocationSource(){
        return lastLocationSource;
    }

    public void setLastLocationSource(String lastLocationSource){
        this.lastLocationSource = lastLocationSource;
    }

    public String getLastLocationCoordinates(){
        return lastLocationCoordinates;
    }

    public void setLastLocationCoordinates(String lastLocationCoordinates){
        this.lastLocationCoordinates = lastLocationCoordinates;
    }

    public String getLastLocationSpeed(){
        return lastLocationSpeed;
    }

    public void setLastLocationSpeed(String lastLocationSpeed){
        this.lastLocationSpeed = lastLocationSpeed;
    }

    public String getLastLocationCource(){
        return lastLocationCource;
    }

    public void setLastLocationCource(String lastLocationCource){
        this.lastLocationCource = lastLocationCource;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Судно ").append(id).append(" [id=").append(id).append(", name=").append(name).append(", nameLat=").append(nameLat)
                .append(", callSign=").append(callSign).append(", imo=").append(imo).append(", mmsi=").append(mmsi)
                .append(", dangerCargo=").append(dangerCargo).append(", highTargetFactor=").append(highTargetFactor)
                .append(", ssas=").append(ssas).append(", rrr=").append(rrr).append(", rmrs=").append(rmrs)
                .append(", flag=").append(flag).append(", lastLocationDate=").append(lastLocationDate)
                .append(", lastLocationSource=").append(lastLocationSource).append(", lastLocationCoordinates=")
                .append(lastLocationCoordinates).append(", lastLocationSpeed=").append(lastLocationSpeed)
                .append(", lastLocationCource=").append(lastLocationCource).append("]");
        return builder.toString();
    }

}
