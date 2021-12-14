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
public class SlangWordList {
    private Map<String, ArrayList<String>> list;

    /**
     * Constructor
     */
    public SlangWordList() {
        list = new HashMap<String, ArrayList<String>>();
    }
    
    public void clear(){
        list.clear();
    }
    
    /**
     * set data list from an ArrayList of data
     * @param arr_data 
     */
    public void setData(ArrayList<String> arr_data) {
        if(arr_data==null)
            return;

        for(String cur:arr_data) {
            String[] word=cur.split("`");
            if(word==null)
                continue;
            String slang = word[0];
            String[] meaning = word[1].split("\\| ");
            ArrayList<String> means = new ArrayList<String>(Arrays.asList(meaning));
            list.put(slang, means);            
        }        
    }
    
    public void addMap(String key, ArrayList<String> values){
        list.put(key, values);
    }
        
    /**
     * Get all list slang word
     * @return list
     */
    public Map<String, ArrayList<String>> getList(){
        return list;
    }
    
    /**
     * Search meanings of a slang word
     * @param slangword
     * @return set of meaning of slangword
     */
    public ArrayList<String> searchBySlangWord(String slangword){
        try {
            ArrayList<String> result = list.get(slangword);
            return result;
        }catch(Exception e) {
            return null;
        } 
    }
    
    /**
     * Search a slang word by its meaning
     * @param definition
     * @return slang word if found definition
     */
    public String searchByDefinition(String definition){
        for(String key: list.keySet())
        {
            if(list.get(key).contains(definition)){
                return key;
            }
        }
        return null;
    }
    
    public ArrayList<String> getKeyList() {
        
        Set<String> dat = list.keySet();
        ArrayList<String> ret = new ArrayList<String>(dat);
        Collections.sort(ret);
        return ret;
    }

    public ArrayList<String> getMeanList() {
        ArrayList<String>ret=new ArrayList<>();
        for (ArrayList<String> mean:list.values()) {
            String temp;
            temp=mean.toString();
            ret.add(temp);
        }
        return ret;
    }
    
    public void addNewSlang(String key,String meaning,char mode) {
        ArrayList<String> means=new ArrayList<String>();
        String[] mean_arr=meaning.split(",");
        ArrayList<String> new_mean=new ArrayList<String>(Arrays.asList(mean_arr));
        means.addAll(new_mean);
        if(list.containsKey(key)==false) {
            list.put(key,means);
        }
        else {
            if (mode=='w') {
                ArrayList<String> mean_tmp=new ArrayList<String>();
                mean_tmp.addAll(new_mean);
                list.replace(key,mean_tmp);
            }
            else if(mode=='n') {
                means=list.get(key);
                means.addAll(new_mean);
                list.put(key,means);
            }
        }
    }
    
    public void deleteSlang(String key) {
        if(list.containsKey(key)==true) 
            list.remove(key);
    }

    public void editSlang(String key,ArrayList<String>means) {
        list.replace(key,means);
    }

    public Boolean isExisted(String key) {
        return list.containsKey(key);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        Set<String> ketSet = list.keySet();
        for(String i : ketSet){
            ArrayList<String> values = new ArrayList<>();
            values = list.get(i);
            sb.append(i + "`");
            System.out.print(i + "`");
            for (String value : values){
                sb.append(value + "|");
                System.out.print(value + "|");
            }
            System.out.println("");
            sb.append("\n");
        }
        return sb.toString();
    }
}
