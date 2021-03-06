/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dict_19127369;

import java.io.*;
import java.util.*;


/**
 *
 * @author lemin
 */
public class FileProccess {
    public static void read(String path, SlangWordList list){
        list.clear();
        File file = new File(path);
        try {
             Scanner scan = new Scanner(file);
             while (scan.hasNextLine()) {
                try {
                    String line = scan.nextLine();
                    String[] lineSplit = line.split("`");
                    String key = lineSplit[0];
                    ArrayList<String> values = new ArrayList<>();
                    for(String item : lineSplit[1].split("\\|")){
                       values.add(item.trim());
                    }
                    list.addMap(key, values);
                } catch (Exception e) {
                }
               
            }
           
        } catch (Exception e) {
        }
    }
    
    public static ArrayList<String> readHistory(String path){
        ArrayList<String> data = new ArrayList<>();
        File file = new File(path);
        try {
             Scanner scan = new Scanner(file);
             while (scan.hasNextLine()) {
                String line = scan.nextLine();
                try {
                    String[] lineSplit = line.split("`");
                    //Object[] lineData = {lineSplit[0], lineSplit[1]};
                    data.add(lineSplit[0]);
                } catch (Exception e) {
                }
            }
           
        } catch (Exception e) {
        }
        //Object[][] result = new Object[data.size()][];
        return data;
    }
    
    public static void write(String path, SlangWordList list){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
                fw = new FileWriter(path);
                bw = new BufferedWriter(fw);
                Map<String, ArrayList<String>> newList = list.getList();
                String line = "";
                Set<String> ketSet = newList.keySet();
                for(String i : ketSet){
                    line = line + i + "`";
                    
                    ArrayList<String> values = new ArrayList<String>();
                    values = newList.get(i);
                    for(int j = 0; j < values.size(); j++){
                        if(j != values.size() - 1){
                            line = line + values.get(j) + "|";
                            }
                            else if (j == values.size() - 1){
                                line = line + values.get(j);
                            }
                    }
                    bw.write(line);
                    bw.newLine();
                    line = "";
                }
                bw.close();
        } catch (IOException e) {
                e.printStackTrace();
                
        }
    }
    
    public static void writeHistory(String path, String key, String values){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
                fw = new FileWriter(path, true);
                bw = new BufferedWriter(fw);
                String line = key + "`" + values;
                bw.write(line);
                bw.newLine();
                bw.close();
        } catch (IOException e) {
                e.printStackTrace();
          
        }
    }
}
