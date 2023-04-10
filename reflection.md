Use this file to record your reflection on this assignment.

- Tell me about your class! What does it represent?
- What additional methods (if any) did you implement alongside those listed in the interface?
- What worked, what didn't, what advice would you give someone taking this course in the future?


We decided to make a replica version of Audrey 2 from the movie " Little Shop of Horrors" but named Audrey 3. In the original movie Adurey 2 can't fly or walk but our version (Audrey 3) can. Audrey first starts of with size 0 and you have to use the grow method until he grows to size 10 to be able to use other functions such as fly, walk, grab, examine, etc. We wanted to make sure Audrey could drop items but we also have to check to make sure he is holding an item to be able to do that. However, we didn't know how to check it if grab couldn't return anything.

We didn't add any addional methods, but we did add an accessor for the list of edible objects and making print statements for them because the list is private by default. This made Audrey III able to grab the list and print it out for the user to see as a list of items Audrey III can eat after being given something they cannot.

Making separate classes for attributes doesn't work well because linking them can be complicated and confuse the contract into thinking you aren't implementing the attributes when they're in a different class. Thinking about how one object interacts with the attributes and singling one option or parameter out as a testing ground for some of those attributes worked really well. In our case, we used "vegetable" to trigger the undo and shrink methods and kept that as one of many options that the user could input. Considering the way one input option could interact with the method it's within as well as those it interacts with is very helpful for this assignment.