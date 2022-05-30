package ru.netology.core.homework09.task1.geo;

import ru.netology.core.homework09.task1.entity.Location;

public interface GeoService {

    Location byIp(String ip);

    Location byCoordinates(double latitude, double longitude);
}