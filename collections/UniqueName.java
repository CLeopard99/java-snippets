
package main.collections;
public class UniqueName {
	
    public static String firstUniqueName(String[] names) {
  
    	    for (int i = 0; i < names.length; i++) {
    	        boolean unique = true;
    	        
    	        for (int j = i + 1; j < names.length; j++) {
   
    	            if (names[j] == names[i]) {   	            	
    	                names[j] = names[names.length - 1];
    	                unique = false;
    	                break;
    	            }
    	        }
    	        
    	        if (unique) {
    	            return names[i];
    	        }
    	    }
    	    return null;
    	}

    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
    }

}