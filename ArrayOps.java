public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(findMissingInt(new int[]{1,0,3}));
        System.out.println(secondMaxValue(new int[] {6, 9, 4, 7, 3, 4}));
        System.out.println(containsTheSameElements(new int[] {1, 4, 1, 1, 2}, new int[] {2, 1, 4}));
        System.out.println(isSorted(new int[] {7, 5, 4, 3, -12}));
        System.out.println(isSorted(new int[] {1, -2, 3}));
        System.out.println(isSorted(new int[] {1,2,3}));
    }
    
    public static int findMissingInt (int [] array) {
        boolean inArray;

        for (int index = 0; index < array.length; index++) {
            inArray = false; 
           for (int p = 0; p < array.length; p++) {
            if (array[p] == index) {
                inArray = true;
            }
           }
            if (inArray == false) {
                return index;
                
            }

        }
        return array.length;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] >= max) {
                max = array[index];
            } 
        }
        int check = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == max) {
                check++;
            } 
        }
        if (check > 1) {
            return max;
        }
        int max2 = array[0];
        for (int i = 0; i < array.length; i++) {
             if (array[i] > max2 && array[i]!=max) {
                max2 = array[i];
             }   
            }    
              
             return max2;
        }
         

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean same = false;
        for (int i = 0; i < array1.length; i++) { 
            for (int j = 0; j < array2.length; j++) {
            if (array1[i] == array2 [j]) {
                same = true; 
            }
        } 
        if (same == false) { 
            return same; }
            same = false;
        }
    return true;
    } 

    public static boolean isSorted(int [] array) {
        boolean same = false;
        for (int i = 0; i < array.length - 1; i++) { 
            if (array[i] < array[i+1]) {
                same = true; 
            } else { 
            same = false;
            break;
        }
        if (same == true) {
            return same;
        }

    }
        for (int j = 0; j < array.length - 1; j++) { 
            if (array[j] > array[j+1]) {
                same = true; 
            } else { 
            same = false;
            break;
            }
        }
    return same; 
    }
}
