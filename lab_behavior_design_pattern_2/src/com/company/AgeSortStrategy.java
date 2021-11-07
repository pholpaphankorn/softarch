package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });
    }
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!

}
