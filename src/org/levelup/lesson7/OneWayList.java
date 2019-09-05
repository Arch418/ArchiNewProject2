package org.levelup.lesson7;
// одноноправленный-связанный список
// Элемент списка - совокупность значения(того что он хранить в масииве) и ссылки на следующий элмент
public class OneWayList extends AbstractStructure {

    private Element head;

    @Override
    public  void addLast (int value) {

        Element element = new Element(value);
        if (head == null) {
            head = element;
        } else {
            Element current = head;
            while (current.getNext() != null) {
                current = current.getNext(); // текущий переносится на следующий элемент
            }
            current.setNext(element); // установка связи у последнего к текущему
        }
    }
    public void addFirst (int value){ // добавления элемента в начало
        Element element = new Element(value);
        if (head == null){
            head = element;
        } else {
            element.setNext(head); // записать которая позволяет не перетиреть значения между собой
            element = head;
        }
        size++;
    }

}




