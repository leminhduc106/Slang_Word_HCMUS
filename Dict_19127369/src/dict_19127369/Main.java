/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dict_19127369;

import java.util.*;

/**
 *
 * @author lemin
 */
public class Main {
    public static void main(String[] args) {
        SlangWordList list = new SlangWordList();
        FileProccess.read("slang.txt", list);
//        ArrayList<String> values = list.searchBySlangWord("");
//        for (String value : values){
//            System.out.print(value + "|");
//        }
        System.out.println(list.searchByDefinition("Meaning"));
    }
}
