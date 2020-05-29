package org.creospan.com.profileservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private int id;
    private String clientName;
    private int clientZip;
    private boolean status;

    public void setId(int id) {
        this.id = id;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientZip(int clientZip) {
        this.clientZip = clientZip;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public int getClientZip() {
        return clientZip;
    }

    public boolean isStatus() {
        return status;
    }
}
