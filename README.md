Customer purchase books from a vending machine.

1. The vending machine dispenses books of the following genres: mystery, nonfiction, bestsellers, and children's
    - Each book has a title and price. 

2. A main menu must display presenting the following options:
    - "(B) Browse Book Collection"
    - "(P) Purchase"
    - "(E) Exit"

3. The inventory is stocked via an input file when the application starts. Each time the application runs, the inventory is restocked. The only time the inventory is stocked is when it is started.

4. When the customer selects "(B) Browse Book Collection", they're presented
   with a list of all books in the machine with its quantity remaining:
    - Each book has a slot identifier and a purchase price.
    - Each slot has enough room for 5 of that title.
    - Every product is initially stocked to the maximum amount.
    - A product that has run out must indicate that it is NO LONGER AVAILABLE.

5. When the customer selects "(P) Purchase", they are guided through the purchasing
   process menu:
- "(M) Feed Money"
- "(S) Select Item"
- "(F) Finish Transaction"
- Current Balance: $0.00

6. The purchase process flow is as follows:
   i. Selecting "(M) Feed Money" allows the customer to repeatedly feed money into the
       machine in valid, whole dollar amounts—for example, $1, $5, $10, or $20.
        - The "Current Balance" indicates how much money the customer
          has fed into the machine.
   ii. Selecting "(S) Select Item" allows the customer to select a book to
       purchase.
        - Show the list of items available and allow the customer to enter
          a slot identifier to select an item.
        - If the item (slot identifier) does not exist, the customer is informed and returned
          to the Purchase menu.
        - If a product is NO LONGER AVAILABLE, the customer is informed and returned to the
          Purchase menu.
        - If a valid item is selected, it is dispensed to the customer.
        - Dispensing a book prints the book title, author, cost, and the balance/money in machine
          remaining. Dispensing also returns a message:
            - All mystery books print "Nobody reads a mystery to get to the middle. They read it to get to the end."
            - All nonfiction books print "Nonfiction speaks to the head. Fiction speaks to the heart."
            - All bestseller books print "If you don’t like to read, you haven’t found the right book."
            - All children's books print "The more that you read, the more things you will know. The more that you learn, the more places you’ll go."
        - After the book is dispensed, the machine must update its balance
          accordingly and return the customer to the Purchase menu.
        
   iii. Selecting "(F) Finish Transaction" allows the customer to complete the
       transaction and receive any remaining change.
        - The customer's money is returned using nickels, dimes, quarters, and dollars (ones and fives)
          (using the smallest amount of coins possible).
        - The machine's current balance must be updated to $0 remaining.

7. After completing their purchase, the user is returned to the "Main" menu to
     continue using the Vending machine.

