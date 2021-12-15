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
    
    /**
     * Get all the key of list
     * @return ArrayList<String> of key
     */
    public ArrayList<String> getKeyList() {
        
        Set<String> dat = list.keySet();
        ArrayList<String> ret = new ArrayList<String>(dat);
        Collections.sort(ret);
        return ret;
    }

    /**
     * Get all the meaning of list
     * @return ArrayList<String> of meaning
     */
    public ArrayList<String> getMeanList() {
        ArrayList<String>ret=new ArrayList<>();
        for (ArrayList<String> mean:list.values()) {
            String temp;
            temp=mean.toString();
            ret.add(temp);
        }
        return ret;
    }
    
    /**
     * Add new slang word
     * @param key (slang word)
     * @param meaning (the meaning of that slang word)
     * @param mode (overwrite, add new, duplicate)
     */
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
    
    /**
     * Delete a slang word
     * @param key 
     */
    public void deleteSlang(String key) {
        if(list.containsKey(key)==true) 
            list.remove(key);
    }

    /**
     * Edit a slang word
     * @param key
     * @param meaning
     * @return 1 if edit success, -1 if not.
     */
    public int editSlang(String key, String meaning) {
        try {
            ArrayList<String> means = new ArrayList<String>();
            String[] mean_arr=meaning.split(",");
            ArrayList<String> new_mean=new ArrayList<String>(Arrays.asList(mean_arr));
            means.addAll(new_mean);
            list.replace(key, means);
            return 1;
        }catch(Exception e) {
            return -1;
        }
    }

    /**
     * Check if a slang word is existed
     * @param key
     * @return true if existed
     */
    public Boolean isExisted(String key) {
        return list.containsKey(key);
    }
    
    public ArrayList<String> random(int n){
        ArrayList<String> result = new ArrayList<String>();
        while(result.size() < n){
            Object randomName = list.keySet().toArray()[new Random().nextInt(list.keySet().toArray().length)];
            String value = randomName.toString();
            if(!result.contains(value)){
                result.add(value);
            }
        }
        return result;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        Set<String> ketSet = list.keySet();
        for(String i : ketSet){
            ArrayList<String> values = new ArrayList<>();
            values = list.get(i);
            sb.append(i + ": ");
            for (String value : values){
                sb.append(value + "|");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
