#Chapter 6 Array Labs

## 6.1 Tracking Sales

Open `Sales.java`. `Sales.java` contains a Java program that prompts for and reads in the sales for each of 5 
salespeople in a company. Sales are entered as integer values. It then prints out the id and amount of sales 
for each salesperson and the total number of sales. Study the code, then compile and run the program to see 
how it works. 

As you complete this lab you should be able to run the `main` method as well as `SalesTest.java` to test your program. 

Now modify the program as follows:
1.  a) Complete the `average` method to compute and return the average of `arr`.  Be sure to use the length instance 
variable and you may assume that the array is full. If the array does not have at least 1 element in it, throw an 
`IllegalStateException` 

    b) In the `main` method, use your average method to print the average sales

2.  a) Complete the `indexOfMax` method to compute and print the index of the maximum sales in `arr`. 

    b) In the `main` method, use your `indexOfMax` method to print the index of the best sales person and the sales 
    amount for that sales person. 
    
3.  a) Do the same thing for for an `indexOfMin` method.

    b) In the `main` method, use your `indexOfMin` method to print the index of the best sales person and the sales 
    amount for that sales person.
    
4. Instead of always reading in 5 sales amounts, at the beginning ask the user for the number of sales people and then 
create an array that is just the right size. The program can then proceed as before.

___
## 6.2 Shopping Cart

In this exercise you will complete a class that implements a shopping cart as an array of items. Opne the files 
`Item.java` and `ShoppingCart.java` and study the code to get an idea of how it works. The file `Item.java` contains the 
definition of a class named `Item` that models an item one would purchase at a store. An item has a name, price, and 
quantity (the quantity purchased). The file `ShoppingCart.java` implements the shopping cart as an array of `Item` 
objects.

Complete the `ShoppingCart` class by doing the following:

1.  a) Declare an instance variable `cart` to be an array of Items and instantiate cart in the constructor to be an array
    holding `capacity` Items. (Note: `capacity` is an instance variable initialized to 5)

    b) Fill in the code for the `addToCart` method. This method should add the item to the cart and update the 
    `totalPrice` instance variable (note this variable takes into account the quantity).
    
    c) Compile your class. (Note: No tester or driver class has been written yet. You are checking for syntax errors in
       your `ShoppingCart` class.)
       
2.  a) Write a program `ShopTest` that simulates shopping. The program should have a loop that continues as long as the 
    user wants to shop. Each time through the loop read in the name, price, and quantity of the item the user wants to add 
    to the cart. After adding an item to the cart, the cart contents should be printed. Be sure not to add more than 5 items 
    to your cart.

    b) Add a method `getTotalPrice` to the `ShoppingCart` class which returns the `totalPrice` of the cart. After the 
    loop print a "Please pay ..." message with the total price of the items in the cart.

3.  Use the following test data to test your program. Note the following example has 4 items (quantity of each items is 
    a different value): The total should be 20.10
    
Item | Quantity | Price
:----:|:---------:|------:
milk|2|3.56
donuts|12|0.47
bread|1|4.24
oranges|5|0.62


Sample Output

      Would you like to go shopping? (yes or no)
      yes
      What would you like to buy?
      milk
      How much does it cost?
      3.56
      How many do you want?
      2
      Would you like to get anything else? (yes or no)
      yes
      What would you like to buy?
      donuts
      How much does it cost?
      0.47
      How many do you want?
      12
      Would you like to get anything else? (yes or no)
      yes
      What would you like to buy?
      bread
      How much does it cost?
      4.24
      How many do you want?
      1
      Would you like to get anything else? (yes or no)
      yes
      What would you like to buy?
      oranges
      How much does it cost?
      0.62
      How many do you want?
      5
      Would you like to get anything else? (yes or no)
      no
      
      Shopping Cart
      Item                Price  Quantity    Total
      milk                 3.56         2      7.12
      donuts               0.47        12      5.64
      bread                4.24         1      4.24
      oranges              0.62         5      3.10
      
      Total Price: $20.10
    
    
    


___
## 6.3 Flexible Shopping Cart

In the previous exercise, your `ShoppingCart` was limited to 5 (capacity) items. Copy `ShoppingCart.java` into 
`ShoppingCart2.java`. In this exercise you will add a method to the `ShoppingCart2` class to increase the capacity.

Complete the `ShoppingCart2` class by doing the following:

1. Add a method `increaseSize`. This method will increase the size of `cart` by 3.
    * Create a temporary `cart` that is 3 items bigger than `cart`.
    * Write a `for` loop to loop through the `cart` array, adding the items to the temporary cart.
    * Write a statement to change the address of `cart` to the address of the temporary cart. Now `cart` is 3 items 
    bigger.
```java
    /**
    * Increases the size of the shopping cart by 3.
    */
    private void increaseSize()
    {
        
    }
```
    
2. Add logic to the `addToCart` method so that if the user adds an item to a full cart, the `increaseSize` method is 
called. The item is then added.

3. Test your changes. Try adding more than 5 items to your cart. Use the following test data:

Item | Quantity | Price
:----:|:---------:|------:
milk|2|3.56
donuts|12|0.47
bread|1|4.24
oranges|5|0.62
butter|1|3.24
yogurt|6|0.82
pepsi|1|2.45
        
> Please pay $30.71

___
## 6.4 Shopping Cart Using the ArrayList Class

In this exercise you will modify `ShoppingCart` to use the `ArrayList` class. Create a new package and copy the file 
`Item.java` from the previous lab. The class named `Item` models an item one would purchase. An item has a name, price,
and quantity (thequantitypurchased). Copy `ShoppingCart.java` into `ShoppingCart3.java`. Copy `ShopTest.java` into 
`ShopTest3.java` and modify to use the `ShoppingCart3` class.

`ShopTest3.java` will behave exactly like `ShopTest2.java`. The difference is the `ShoppingCart3` class will store 
`Item` objects in an `ArrayList`, rather than an `Array`. Modify all of the methods to use the `ArrayList` syntax for 
adding and displaying items from the `Cart ArrayList`. Do not forget to import the `ArrayList` class at the top of your 
`ShoppingCart3` class.

Test your code with the following items:

Item | Quantity | Price
:----:|:---------:|------:
milk|2|3.56
donuts|12|0.47
bread|1|4.24
oranges|5|0.62
butter|1|3.24
yogurt|6|0.82
pepsi|1|2.45
        
> Please pay $30.71   

___
## 6.5 Card Game

Inspect the code in `Card.java` `DeckOfCards.java` and `DeckOfCardsTest.java`. `Cards.java` contains a Java program that 
contains two `String` variables – `face` and `suit` – to represent a specific Card. `DeckOfCards` contains an array of 
`Card` objects (52 cards in the deck). This class has two methods `shuffle()` which randomly mixes the deck of cards and 
`dealCard()` which returns the next `Card` to be dealt. The driver program `DeckOfCardsTest` shuffles the deck of cards 
and prints out each `Card` as it is dealt. Study the code, then compile and run the program to see how it works.

Choose one of the two following card games to implement (poker, blackjack). Deck of Cards and one of the games will 
count as one lab.

___
### Option 1 Five-Card-Poker

Card Game #1: Five-Card Poker
Write a program using the classes you have already created that deals two five-card poker hands, evaluates each hand and 
determines which is better. Add the remaining methods to the `DeckOfCard` class or play poker with the hands already 
defined in the Deck of Cards lab.

![Poker Hand Rankings](poker-hand-rankings.png)

Modify the program as follows:
1. Modify the program `DeckOfCardsTest` to deal a five card poker hand into a Card array named `hand`. Then modify class 
`DeckOfCards` to include methods that determine whether a hand contains (pass the `hand` array to the method) one of the 
following combinations of Cards:
    
    a. a pair
    
    b. two pairs

    c. three of a kind (e.g., three jacks)
    
    d. four of a kind (e.g., four aces)

    e. a straight (i.e., five cards of consecutive face values – can have different suits)

    f. a full house (i.e., two cards of one face value and three cards of another face value)

Hint 1: Add methods `getFace` and `getSuit` to class `Card`

Hint 2: Create a method in class `DeckOfCards` to total the hand (`totalHand`). Pass the hand array to the method and 
tally the number of each face in an integer array `numbers`. For example, if the hand contains 2 Queens, and 3 4’s, the 
`numbers` array will contain:

`numbers`

0  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10| 11| 12
---|---|---|---|---|---|---|---|---|---|---|---|---
0  |0  |0  | 0 | 3 | 0 | 0 | 0 | 0 | 0 | 0 | 2 | 0
 ___

### Option 2 Black-Jack
Write a program using the classes you have already created to play `Blackjack`. The basic premise of the game is that 
you want to have a hand value that is closer to 21 than that of the dealer, without going over 21.

In blackjack, the cards are valued as follows:
* An Ace can count as either 1 or 11.
* The cards from 2 through 9 are valued at their face value.
* The 10, Jack, Queen, and King are all valued at 10.
* The suits of the cards do not have any meaning in the game. The value of a hand is simply the sum of the point counts 
of each card in the hand. For example, a hand containing (5,7,9) has the value of 21. 
* The Ace can be counted as either 
1 or 11. It's assumed to always have the value that makes the best hand. 
* You may want to modify the Card class to contain an int variable value to hold the card’s point value. 
* Add a method getValue() to return the Card’s point value.

Here is how the game is played:

1. The dealer deals himself and the player two cards.
2. Print only one of the dealer’s cards. The other is face down. If the dealer has blackjack (21) the dealer wins.
3. Print the players two cards and the total value. If the player has blackjack (21), he wins.
4. Ask the player if he wants to “hit” or “stay”. If he chooses “hit”, deal another card and display the total value. 
Keep prompting the user until they select “stay” or their total goes over 21, which is a “bust”.
5. The dealer must continue to deal himself cards UNTIL the total is 17 or over. Once the total is 17 or over, he stops
dealing cards. Display the total value of the hand or “bust” if the hand is over 21.
6. Compare the values of the dealer and player’s hand and display the winner.
 
