package com.collections;

/**
   This class implements a hash set using separate chaining.
*/
class CustomHashSet<E>{
    
    
    private CustomHashMap<E, Object> hashMapCustom;
 
    public CustomHashSet(){
        hashMapCustom=new CustomHashMap<>();
    }
    
    /**
     * add objects in SetCustom.
     */
    public void add(E value){
           hashMapCustom.put(value, null);
    }
 
    /**
     * Method returns true if set contains the object.
     * @param key
     */
    public boolean contains(E obj){
           return hashMapCustom.contains(obj) !=null ? true :false;
    }
    
    /**
     * Method displays all objects in setCustom.
     * insertion order is not guaranteed, for maintaining insertion order refer LinkedHashSet.
     */
    public void display(){
       hashMapCustom.displaySet();
    }
   
    /**
     * Method removes object from setCustom.
     * @param obj
     */
    public boolean remove(E obj){
       return hashMapCustom.remove(obj);
    } 
   
}