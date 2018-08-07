# wordCounter

The application uses a map to hold the english word as a key and all the foreign words in a list as its values. 


When the user enters a word, the program always gets its English translated word and puts it in the map.


When the user tries to retrieve any word, it gets its English translation and finds the key. Based on this, it goes to the value, which is a list and if it finds the given word in this list, the program outputs the size of the list.


Example: User enters "flor"


The program first gets its English translation flower and puts it in the map as [flower, [flor]]


user enters "flower"


Map changes to [flower, [flor,flower]]

when the user wants to retrieve the word count for "flor", it outputs 2.



How to use:


Run the java application.


Press 1 to add word and 2 to retrieve the count


enter "exit" to exit from the program.
