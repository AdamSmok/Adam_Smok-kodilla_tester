package com.kodilla.notification.homework7_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherNotificationServiceTestSuite {

    WeatherNotificationService weatherService;
    Client client;
    Client secondClient;
    Client thirdClient;
    Notification notification;

    @BeforeEach
    public void setUp() {
        weatherService = new WeatherNotificationService();
        client = Mockito.mock(Client.class);
        secondClient = Mockito.mock(Client.class);
        thirdClient = Mockito.mock(Client.class);
        notification = Mockito.mock(Notification.class);
    }

    @Test
    public void testAddSubscriber() {
        // Given
        // WeatherNotificationService is initialized in setUp method

        // When
        weatherService.addSubscriber(client, "Location1");

        // Then
        weatherService.sendNotificationToLocation(notification, "Location1");
        // Verify that teh client receives the notification
        Mockito.verify(client).receive(notification);
    }

    @Test
    public void testRemoveSubscriberFromLocation() {
        // Given
        weatherService.addSubscriber(client, "Location1");

        // When
        weatherService.removeSubscriberFromLocation(client, "Location1");
        weatherService.sendNotificationToLocation(notification, "Location1");

        // Then
        // Verify that teh client does not receive the notification after being removed
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void testRemoveSubscriberFromAllLocations() {
        // Given
        weatherService.addSubscriber(client, "Location1");
        weatherService.addSubscriber(client, "Location2");

        // When
        weatherService.removeSubscriberFromAllLocations(client);
        weatherService.sendNotificationToLocation(notification, "Location1");
        weatherService.sendNotificationToLocation(notification, "Location2");

        // Then
        // Verify that teh client does not receive the notification from any location
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void testSendNotificationToLocation() {
        // Given
        weatherService.addSubscriber(client, "Location1");
        weatherService.addSubscriber(secondClient, "Location1");

        // When
        weatherService.sendNotificationToLocation(notification, "Location1");

        // Then
        // Verify that both clients receive the notification for the given location
        Mockito.verify(client).receive(notification);
        Mockito.verify(secondClient).receive(notification);
    }

    @Test
    public void testSendNotificationToAll() {
        // Given
        weatherService.addSubscriber(client, "Location1");
        weatherService.addSubscriber(secondClient, "Location2");
        weatherService.addSubscriber(thirdClient, "Location3");

        // When
        weatherService.sendNotificationToAll(notification);

        // Then
        // Verify that all clients receive the notification
        Mockito.verify(client).receive(notification);
        Mockito.verify(secondClient).receive(notification);
        Mockito.verify(thirdClient).receive(notification);
    }

    @Test
    public void testRemoveLocation() {
        // Given
        weatherService.addSubscriber(client, "Location1");

        // When
        weatherService.removeLocation("Location1");
        weatherService.sendNotificationToLocation(notification, "Location1");

        // Then
        // Verify that the client does not receive the notification after the location is removed
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void testSubscriberNotAddedMultipleTimesToSameLocation() {
        // Given
        // WeatherNotificationService is initialized in setUp method

        // When
        weatherService.addSubscriber(client, "Location1");
        weatherService.addSubscriber(client, "Location1");

        // Then
        weatherService.sendNotificationToLocation(notification, "Location1");
        // Verify that the client receives the notification only once
        Mockito.verify(client).receive(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }
}