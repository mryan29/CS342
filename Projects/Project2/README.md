Meg Ryan, mryan47
CS432 Fall 18
Project Iteration I

SO... how to play my game.

Basically the map I used for inspiration is the Six Rooms portion of Mystic City. Following that map, the user can enter the 
following inputs:

i. QUIT or EXIT -  Quit the game.

ii. LOOK -  Redisplay the current place. I.e. return to step (a).

iii. GO XXX, where XXX is one of N, S, E, W, U, or D. - Check to see if the current
place has a ( unlocked ) Direction corresponding to the requested direction, and
if so, update the current place to the one arrived at by following the
corresponding Direction. Then return to step (a).

**Extra Stuff**
- My program accepts a handful of variations when it comes to the "GO" commands i.e. the first initial of the direction, or the full GO command in either all or no caps
- I used some extra setters and getters including: setCurrentPlace, dir
- Currently, my program doesn't actually exit the program when you go to where EXIT is listed on the Mystic City map. Instead it goes to an "Exit room" that you can't escape unless you manually exit the game by entering QUIT or EXIT. I'll fix this in later iterations but just a heads up
- I find my descriptions funny but am doing this while battling a brutal migraine so forgive me if they fall flat
- I also know that the formatting is pretty atrocious right now but I was trying to split it up so that you could clearly see outputs to each different command. Will clear that up in later iterations
- I tried to use a switch statement for handling the different input commands and I think it works fairly well. I'm pretty new to Java though so if you have better ideas I'm all ears.
