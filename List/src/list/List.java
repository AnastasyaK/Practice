/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 * Реализация интерфейся линейного списка
 * @author Анастасия
 * @version 1.0
 * @param <E> шаблонизатор
 * @see InterfaceList
 */
public class List <E> implements InterfaceList <E> 
{
    
    /**
     * Внутренний класс содержащий в себе элемент списка
     * и указатель на следующий элемент 
     * @param <E> шаблонизатор
     */
    class ListElement <E> 
    {
        /**     Данные любого типа   */
        E data;
        /**     Указатель на следующий элемент   */
        ListElement next;
    }
    /**     указатель на первый элемент     */
    private ListElement head;
    /**     указатель на хвост списка   */
    private ListElement tail;
 
    /**
     * Добавление элемента в начало списка 
     * a.addFront(5);
     * a.addFront("string");
     * Если список пуст указываем ссылки начала и конца на новый элемент
     * Иначе новый элемент становится первым, а указатель на первый элемент ссылается на новый
     * @param data данные любого типа
     * @see addFront
     */
    @Override
    public void addFront(E data)
    {
        ListElement Elem = new ListElement();  //создаём новый элемент
        Elem.data = data;  //инициализируем данные

        if(head == null)
        {
            head = Elem;
            tail = Elem;
        }
        else 
        {
            Elem.next = head;
            head = Elem;
        }
    }
 
    /**
     * Добавление элемента в конец списка
     * a.addBack(78);
     * a.addBack("This is string");
     * Если список пуст указываем ссылки начала и конца на новый элемент
     * Иначе новый элемент становится последним, а указатель на последний элемент ссылается на новый
     * @param data данные любого типа
     * @see addBack
     */
    @Override
    public void addBack(E data) 
    {
        ListElement Elem = new ListElement();  //создаём новый элемент
        Elem.data = data;  //инициализируем данные
        if (tail == null)
        {
            head = Elem;
            tail = Elem;
        } else {
            tail.next = Elem;
            tail = Elem;
        }
    }
 
    /**
     * Вывод всего списка на экран
     * a.printList();
     * Получает ссылку на первый элемент и пока он существует
     * печатает его данные и переключается на следующий
     */
    public void printList()
    {
        ListElement Elem = head; 
        while (Elem != null)
        {
            System.out.print(Elem.data + " ");
            Elem = Elem.next;
        }
    }
 
        /**
     * Проверка на пустой список
     * a.isEmpty();
     * @return true если список пуст
     * по умолчанию false
     */
    @Override
    public boolean isEmpty()
    {
        boolean n = false;
        if (head == null)
             n = true;        
        return n;
    }
    
    /**
     * Удаление элемента из списка
     * a.delElem(5);
     * a.delElem("This is string");
     * Если список пуст то ничего не делаем
     * Если список состоит из одного элемента и он искомый, 
     * то очищаем укащатели начал и конца и выходим
     * Если первый элемент - искомый, 
     * то переключаем указатель начала на второй элемент и выходим
     * Иначе ищем пока элемент существует и найденный удаляем
     * @param data данные любого типа
     * @see delElem
     */
    @Override
    public void delElem(E data)          //удаление элемента
    {
        if(head == null)
            return;
 
        if (head == tail && head.data == data) 
        {
            head = null;
            tail = null;
            return;
        }
 
        if (head.data == data) 
        {
            head = head.next;
            return;
        }
 
        ListElement Elem = head;
        while (Elem.next != null) 
        {
            if (Elem.next.data == data) 
            {
                if(tail == Elem.next)
                {
                    tail = Elem;
                }
                Elem.next = Elem.next.next;
                return;
            }
            Elem = Elem.next;
        }
    }
        /**
     * Очистка списка
     * delList();
     * Пока элементы существуют удаляем список
     * @see delList
     */
    @Override
    public void delList()
    {
        ListElement a = head; 
        ListElement t;
        while (a != null)
        {
            t = a;
            a = a.next;
            t = null;
        }
        head = null;
    }
}
