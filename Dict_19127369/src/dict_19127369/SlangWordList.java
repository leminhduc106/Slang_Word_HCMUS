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
        return(list.get(slangword));
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
    
}
