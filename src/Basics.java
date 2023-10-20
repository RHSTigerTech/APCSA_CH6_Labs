public class Basics {
    public static void main(String[] args) {
        
        //Declare a list of 5 integers
        int[] nums;

        //At this point nums holds null
        System.out.println(nums);       // --> nums not initialized error
        //Comment out line 8 to continue

        //initialize nums to hold 23, 85, 19, and 13
        int[] players = {23, 85, 19, 13};
        System.out.println(players);


        // How is the Array printed?

        // Why is it printed that way?



        // Use .length    NOTE: no parenthesis in  .length for arrays it is a public instance variable in the Array class.
        // It is different than the method "String".length()
        System.out.println("The players list has "+ players.length + " elements.");

        // Use a Loop to print each player number in the Array:
        //Fix the for loop header so that it properly loops through the players Array without getting a bounds error
        for (int i = -1;  ; i += 1){
            System.out.println("Player at index " + i + " is #" + players[i]);
        }

        // Write a second loop to print the same list of players but backwards... last element -> first element

        
        

        // Assign nums a new integer Array with 5 elements
        

        // At this point the nums points to an array of 5  zeros (default value for integers)
        // the loop below is called a "FOR EACH" loop.
        // It executes once for every single element of the Array
        // It does not keep track of the position or index
        // for (int num : nums)
        //     System.out.println(num); 
            
        
       

        // Set each element of nums to a random number between 1 and 50
        // (Use a loop to do it)

        // Arrays of Objects
        // String[] names; // names currently holds null (it has not been initialized)

        // now initialize names to hold 3 different name objects


        // now instantiate each String element by individually assigning each poistion a name.
        // Donald, Daisy, Daffy


        // print the array of names 



        // Create a second array called moreNames
        // moreNames should have space for 10 Strings


        // Copy the 3 names from earlier to the new names array

        // Set the 4th name in moreNames to Scrooge

        


    }

}
