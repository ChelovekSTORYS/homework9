package ru.netology.core.homework09.task1.i18n;

import ru.netology.core.homework09.task1.entity.Country;

public interface LocalizationService {

    String locale(Country country);
}