package ru.job4j.tracker.input;
import java.util.List;
/**
 * Интерфейс ввода. Выводит текст вопроса и возвращает ввод пользователя.
 * @author Sergey Malinkin (sloyz@ya.ru)
 * @version 3.0
 * @since 05.09.2019.
 */
public interface Input {
    String ask(String question);
    int ask(String question, List<Integer> range);
}
