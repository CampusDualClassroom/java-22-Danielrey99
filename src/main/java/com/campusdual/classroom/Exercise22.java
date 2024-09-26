package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> miLista = new ArrayList<>();
        miLista.add("GKFFD");
        miLista.add("TNANA");
        miLista.add("MPMSL");
        miLista.add("PSWME");
        miLista.add("LZMLF");
        miLista.add("JYEBV");
        miLista.add("YELNT");
        miLista.add("JSNKR");
        miLista.add("JFESF");
        miLista.add("TMJLL");

        return miLista;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println("Index: " + i + ", Element: " + customList.get(i));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> myList = createArrayList();
        printElementsAndIndex(myList);

        boolean add = addElementToList(myList, "TMJLL");
        System.out.println("Element added: " + add);
        printElementsAndIndex(myList);
    }


}
