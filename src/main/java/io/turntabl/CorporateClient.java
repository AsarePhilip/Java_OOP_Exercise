package io.turntabl;

public class CorporateClient extends  Client{

    private String accountManagerName;

    public CorporateClient(int ID, String name, ServiceLevel serviceLevel, String accountManager) {
        super(ID, name, serviceLevel);
        this.accountManagerName = accountManager;
    }

    @Override
    public String getName() {
        return this.accountManagerName;
    }
}
