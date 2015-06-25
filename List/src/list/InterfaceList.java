/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 * Интерфейс реализующий линейный список
 * @author Анастасия
 * @version 1.0
 * @param <E> шаблонизатор
 */
public interface InterfaceList <E> 
{
    /**
     * Добавление элемента в начало списка 
     * a.addFront(5);
     * a.addFront("string");
     * @param data данные любого типа
     */
    void addFront(E data);
    /**
     * Добавление элемента в конец списка
     * a.addBack(78);
     * a.addBack("This is string");
     * @param data данные любого типа
     */
    void addBack(E data);
    /**
     * Проверка на пустой список
     * a.isEmpty();
     * @return true если список пуст
     */
    boolean isEmpty();
    /**
     * Удаление элемента из списка
     * a.delElem(5);
     * a.delElem("This is string");
     * @param data данные любого типа
     */
    void delElem(E data);
    /**
     * Очистка списка
     * a.delList();
     */
    void delList();
}
