package io.turntabl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Register {

    List<Client> clients;

    public Register(List<Client> clients) {
        this.clients = clients;
    }


    public List<String> getClientsNameByServiceLevel(ServiceLevel serviceLevel){
        return  clients.stream().filter(s-> s.getServiceLevel() == serviceLevel).map(Client::getName).collect(Collectors.toList());
    }

    public Optional<String> getClientName(int ID){
        return  clients.stream().filter(s-> s.getID() == ID).map(Client::getName).findFirst();
    }

    public Map<ServiceLevel, Integer> getServiceLevelCount(){
        Map<ServiceLevel, Integer> serviceLevelCount = new HashMap<>();
        Integer goldClientsCount = (int) clients.stream().filter(client -> client.getServiceLevel() == ServiceLevel.GOLD).count();
        Integer premiumClientsCount = (int) clients.stream().filter(client -> client.getServiceLevel() == ServiceLevel.PREMIUM).count();
        Integer platinumCount = (int) clients.stream().filter(client -> client.getServiceLevel() == ServiceLevel.PLATINUM).count();
        serviceLevelCount.put(ServiceLevel.GOLD, goldClientsCount);
        serviceLevelCount.put(ServiceLevel.PLATINUM, platinumCount);
        serviceLevelCount.put(ServiceLevel.PREMIUM, premiumClientsCount);
        return serviceLevelCount;
    }


    public List<Client> getClients() {
        return clients;
    }
}
