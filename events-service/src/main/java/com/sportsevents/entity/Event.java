package com.sportsevents.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@MappedSuperclass
public class Event extends PanacheEntity{
    private String name;
    private String type;
    private String status;
    private LocalDateTime scheduledDate;
    private int duration;
    private boolean outdoors;
    private LocalDateTime closedDate;
    private String facilitator;
    private String closedBy;
    private String location;
    private String winner;
    private String[] players;
    private int maxPlayers;

    public String getName() {
        return this.name;
    }

    public LocalDateTime getScheduledDate() {
        return this.scheduledDate;
    }

    public int getDuration() {
        return this.duration;
    }

    public boolean isOutdoors() {
        return this.outdoors;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setScheduledDate(LocalDateTime scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    protected void setDuration(int duration) {
        this.duration = duration;
    }

    protected void setOutdoors(boolean outdoors) {
        this.outdoors = outdoors;
    }


    public LocalDateTime getClosedDate() {
        return this.closedDate;
    }

    public void setClosedDate(LocalDateTime closedDate) {
        this.closedDate = closedDate;
    }

    public String getFacilitator() {
        return this.facilitator;
    }

    public void setFacilitator(String facilitator) {
        this.facilitator = facilitator;
    }

    public String getClosedBy() {
        return this.closedBy;
    }

    public void setClosedBy(String closedBy) {
        this.closedBy = closedBy;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWinner() {
        return this.winner;
    }

    public void setWinner(String location) {
        this.winner = winner;
    }

    public String[] getPlayers() {
        return this.players;
    }

    public void setPlayers(String[] players) {
        this.players = players;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxPlayers() {
        return this.maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            " type='" + getType() + "'" +
            ", scheduledDate='" + getScheduledDate() + "'" +
            ", duration='" + getDuration() + "'" +
            ", outdoors='" + isOutdoors() + "'" +
            ", maxPlayers='" + getMaxPlayers() + "'" +
            ", closedDate='" + getClosedDate() + "'" +
            ", facilitator='" + getFacilitator() + "'" +
            ", closedBy='" + getClosedBy() + "'" +
            ", location='" + getLocation() + "'" +
            ", winner='" + getLocation() + "'" +
            ", players='" + getPlayers() + "'" +
            "}";
    }

}
