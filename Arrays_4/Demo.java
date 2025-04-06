package Arrays_4;

public class Demo {

    public static void main(String[] args) {
        // static array
        // int nums[] = {1,2,3};
        // nums[0] = 100;
        // for(int i = 0;i<3;i++){
        //     System.out.println(nums[i]);
        // }

        //Dynamic array
        // int nums[] = new int[4];//All four values are 0
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);
        // }    
        // multi dimensional array
        // int table[][] = new int[3][4];
        // int num = 0;
        
        // for(int[] row:table){
        //     for(int y = 0;y<4;y++){
        //         // row[y] = num++;
        //         row[y] = (int)(Math.random()*100);
        //     }
        // }
        // for(int[] row:table){
        //     for(int number : row){
        //         System.out.print(number+" ");
        //     }
        //     System.out.println();
        // }
        
        // Jagged Arrays
        
        int table[][] = new int[3][];
        table[0] = new int[3]; 
        table[0] = new int[4]; 
        table[0] = new int[5];
        for(int[] row:table){
            for(int y = 0;y<row.length;y++){
                // row[y] = num++;
                row[y] = (int)(Math.random()*100);
            }
        }
        for(int[] row:table){
            for(int number : row){
                System.out.print(number+" ");
            }
            System.out.println();
        }
        
    }
}