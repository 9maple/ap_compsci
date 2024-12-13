/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5, 7, 9, 2, 8, 3, 8, 1}; //creates an array of size 8 and populate values
        
        for(int i = 0; i < arr.length; i++){ //make sure to change loop conditions when adjusting within array brackets
            System.out.println(arr [i]);
        }
        int dupeCheck = 8;
        for(int i = 0; i < arr.length; i++){
            if(dupeCheck == arr[i]){
                System.out.println("Duplicate found at index " + i);
            }
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println(i);
            }
        }
        
	}
}