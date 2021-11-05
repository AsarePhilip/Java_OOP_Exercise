package io.turntabl;

public class Client {
    private int ID;
    private String name;
    private ServiceLevel serviceLevel;

    public Client(int ID, String name, ServiceLevel serviceLevel) {
        this.ID = ID;
        this.name = name;
        this.serviceLevel = serviceLevel;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

}
