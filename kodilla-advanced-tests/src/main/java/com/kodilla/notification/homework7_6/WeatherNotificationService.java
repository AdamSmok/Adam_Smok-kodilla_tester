package com.kodilla.notification.homework7_6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

    private Map<String, Set<Client>> locationSubscribers = new HashMap<>();

    public void addSubscriber(Client client, String location) {
        locationSubscribers.putIfAbsent(location, new HashSet<>());
        locationSubscribers.get(location).add(client);
    }

    public void removeSubscriberFromLocation(Client client, String location) {
        Set<Client> clients = locationSubscribers.get(location);
        if (clients != null) {
            clients.remove(client);
            if (clients.isEmpty()) {
                locationSubscribers.remove(location);
            }
        }
    }

    public void removeSubscriberFromAllLocations(Client client) {
        locationSubscribers.values().forEach(clients -> clients.remove(client));
        locationSubscribers.values().removeIf(Set::isEmpty);
    }

    public void sendNotificationToLocation(Notification notification, String location) {
        Set<Client> clients = locationSubscribers.get(location);
        if (clients != null) {
            clients.forEach(client -> client.receive(notification));
        }
    }

    public void sendNotificationToAll(Notification notification) {
        locationSubscribers.values().forEach(clients -> clients.forEach(client -> client.receive(notification)));
    }

    public void removeLocation(String location) {
        locationSubscribers.remove(location);
    }
}