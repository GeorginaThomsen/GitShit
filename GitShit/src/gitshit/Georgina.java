/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitshit;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Cookie
 */
public class Georgina {
    
    
    public void freq(int[] arr) {
        Arrays.sort(arr);
//        System.out.println(arr);

        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<arr.length;i++){
            hm.put(arr[i], hm.get(arr[i]++));
            
        }
        System.out.println(hm);
    }
    public String awesomeGeorgina(String awesomness){
        return awesomness;
    }
}
