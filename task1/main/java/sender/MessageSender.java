package ru.netology.core.homework09.task1.sender;

import java.util.Map;

public interface MessageSender {

    void send(Map<String, String> headers);
}