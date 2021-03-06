package ru.job4j.chess.firuges.exceptions;
/**
 *  Создает исключение - фигура не найдена.
 *
 *  @author Sergey Malinkin (sloyz@ya.ru).
 *  @since 28.08.2019.
 *  @version 1.0
 */
public class FigureNotFoundException extends RuntimeException {
    public FigureNotFoundException(String msg) {
        super(msg);
    }
}