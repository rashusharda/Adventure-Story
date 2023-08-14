import java.util.Scanner;

public class sourceCode {

    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in); //declaring a new scanner
            
            String response1; //declaring String variable response1 to store user's first decision
            String response2; //declaring String variable response2 to store user's second decision
            String response3; //declaring String variable response3 to store user's third decision
            String response4; //declaring String variable response4 to store user's fourth decision
            String response5; //declaring String variable response5 to store user's fivth decision
            String response6; //declaring String variable response6 to store user's sixth decision
                        
            System.out.println("Before you begin your adventure, please remember to enter your option as 'A' or 'B'"); //User instructions explains how to enter the choice
            System.out.println(" ");
            System.out.println("You're walking through the woods at night, and everything's pitch black except for the flashlight on your phone. You've been there before but never at nighttime."); //story plot

            System.out.println("As you continue walking, you get to a fork in the path and can't quite remember which way to go."); //story plot
            System.out.println("Do you wish to go right or left? (Option A/Option B)"); //first question user is asked
            response1 = keyedInput.nextLine(); //response to the above question is stored in response1
                if (response1.equals("A")||response1.equals("a")) //two options for response1 - if user answers A then the below code is followed
                {
                    System.out.println("As you contine walking down the path, you notice a stranded house. You enter the house and check the first floor. After seeing nothing useful, you decide to check the other floors."); //story plot
                    System.out.println("Do you wish to check the attic or the basement? (Option A/Option B)"); //second question  user is asked
                    response2 = keyedInput.nextLine(); //response to the above question is stored in response1
                        if (response2.equals("A") || response2.equals("a")) //two options for response2 - if user answers A then the below code is followed
                        {
                            System.out.println("As you look aroun d in the attic, you noticed a dusty chest. Do you wish to open it or go to the basement?"); //story plot and third question user is asked
                            response3 = keyedInput.nextLine(); //response to the above question is stored in response3
                                if (response3.equals("A") || response3.equals("a")) //two options for response3 - if user answers A then the below code is followed
                                {
                                    System.out.println("When you open the chest, you find a note inside. The note says - 'DO NOT LOOK IN THE DOLL'S EYES'. After taking the note out, you notice a old doll lying in the chest."); //story plot 
                                    System.out.println("Do you wish to look the doll in her eyes or leave it? (Option A/Option B)"); //fourth question user is asked
                                    response4 = keyedInput.nextLine(); //response to the above question is stored in response4
                                        if (response4.equals("A") || response4.equals("a"))
                                        {
                                            System.out.println("You decided to be courageous and look in the doll's eyes. As you stare into her big black eyes, your legs feel weird. You look down and see your feet and hands turning into a statue. "); //story plot
                                            System.out.println("You look back up and see the face of Bloody Mary is staring back at you. As she moves closer, you let out a defeaning scream. Suddenly, it all turns pitch black. As you become unconcious, you hear the loud laugh of Bloody Mary, ready to eat her dinner.");
                                            System.out.println("THE END..."); //story plot
                                        }
                                        else if (response4.equals("B") || response4.equals("b")) //two options for response4 - if user answers B then the below code is followed
                                        { 
                                            System.out.println("As you keep the doll down, you hear a loud scream. In panic, you turned around. But to your wildest fear, you see the face of Bloody Mary staring back at you."); //story plot
                                            System.out.println("As she moves closer, you let out a defeaning scream. Suddenly, it all turns pitch black. As you become unconcious, you hear the loud laugh of Bloody Mary, ready to eat her dinner."); //story plot
                                            System.out.println("THE END..."); //story plot
                                        }              
                                }
                                else if (response3.equals("B") || response3.equals("b")) //two options for response3 - if user answers B then the below code is followed
                                {
                                    System.out.println("As you head to the basement, you see a photo of a Victorian queen. Do you wish to walk by it or take a photo? (Option A/Option B)"); //fourth question user is asked
                                    response4 = keyedInput.nextLine(); //response the above question is stored as response 4
                                        if (response4.equals("A") || response4.equals("a")) //two options for response4 - if user answers A then the below code is followed
                                            {
                                                System.out.println("As you walk by the photo, you come across a Ouija Board. Do you wish to play or leave the board alone? (Option A/Option B"); //story plot
                                                response5 = keyedInput.nextLine(); //response to above question is stored as response5
                                                    if (response5.equals("A")||response5.equals("a")) //two options for response5 - if user answers A then the below code is followed
                                                    { 
                                                        System.out.println("After asking different questions through the Ouija board, you decide to ask 'Where are you?' The pointer moved to spell 'Behind you' In panic, you turned around. But to your wildest fear, you see the face of Bloody Mary staring back at you."); //story plot
                                                        System.out.println("As she moves closer, you let out a defeaning scream. Suddenly, it all turns pitch black. As you become unconcious, you hear the loud laugh of Bloody Mary, ready to eat her dinner."); //story plot
                                                        System.out.println("THE END..."); //story plot
                                                    }
                                                    else if (response5.equals("B")||response5.equals("b")) //two options for response5 - if user answers B then the below code is followed
                                                    {
                                                        System.out.println("As you moved pass the Ouija board, you hear a loud scream. In panic, you turned around. But to your wildest fear, you see the face of Bloody Mary staring back at you."); //story plot
                                                        System.out.println("As she moves closer, you let out a defeaning scream. Suddenly, it all turns pitch black. As you become unconcious, you hear the loud laugh of Bloody Mary, ready to eat her dinner."); //story plot
                                                        System.out.println("THE END..."); //story plot
                                                    }     
                                            }
                                        else if (response4.equals("B") || response4.equals("b")) //two options for response4 - if user answers B then the below code is followed
                                        {
                                            System.out.println("After taking the photo, you decide to look at it to make sure the lighting was good. Your eyes widen in shock as instead of the queen's face, you see the face of Bloody Mary staring at you."); //story plot
                                            System.out.println("Suddenly, Bloody Mary comes out of your phone. As she moves closer, you let out a defeaning scream. Suddenly, it all turns pitch black. As you become unconcious, you hear the loud laugh of Bloody Mary, ready to eat her dinner."); //story plot
                                            System.out.println("THE END..."); //story plot
                                        }
                                }    
                        }
                        else if (response2.equals("B") || response2.equals("b")) //two options for response2 - if user answers B then the below code is followed
                            System.out.println("As you head to the basement, you see a photo of a Victorian queen. Do you wish to walk by it or take a photo? (Option A/Option B)"); //story plot
                                    response3 = keyedInput.nextLine(); //response from the above question stored as response3
                                        if (response3.equals("A") || response3.equals("a")) //two options for response3 - if user answers A then the below code is followed
                                            {
                                                System.out.println("As you walk by the photo, you come across a Ouija Board. Do you wish to play or leave the board alone? (Option A/Option B"); //fourth question user is asked
                                                response4 = keyedInput.nextLine();//response from above question stored as response4
                                                    if (response4.equals("A")||response4.equals("a")) //two options for response4 - if user answers A then the below code is followed
                                                    {
                                                        System.out.println("After asking different questions through the Ouija board, you decide to ask 'Where are you?' The pointer moved to spell 'Behind you' In panic, you turned around. But to your wildest fear, you see the face of Bloody Mary staring back at you."); //story plot
                                                        System.out.println("As she moves closer, you let out a defeaning scream. Suddenly, it all turns pitch black. As you become unconcious, you hear the loud laugh of Bloody Mary, ready to eat her dinner."); //story plot
                                                        System.out.println("THE END..."); //story plot
                                                    }
                                                    else if (response4.equals("B")||response4.equals("b")) //two options for response4 - if user answers B then the below code is followed
                                                    {
                                                        System.out.println("As you moved pass the Ouija board, you hear a loud scream. In panic, you turned around. But to your wildest fear, you see the face of Bloody Mary staring back at you."); //story plot
                                                        System.out.println("As she moves closer, you let out a defeaning scream. Suddenly, it all turns pitch black. As you become unconcious, you hear the loud laugh of Bloody Mary, ready to eat her dinner."); //story plot
                                                        System.out.println("THE END..."); //story plot
                                                    }
                                            }
                                        else if (response3.equals("B") || response3.equals("b")) //two options for response3 - if user answers B then the below code is followed
                                        {
                                            System.out.println("After taking the photo, you decide to look at it to make sure the lighting was good. Your eyes widen in shock as instead of the queen's face, you see the face of Bloody Mary staring at you."); //story plot
                                            System.out.println("In panic, you think of running out of the house. Do you wish to continue exploring or leave the house? (Option A/Option B)"); //fourth question user is asked
                                            response4 = keyedInput.nextLine();   //response from above question is stored as response 4
                                                if (response4.equals("A")|| response4.equals("a")) //two options for response4 - if user answers A then the below code is followed
                                                {
                                                    System.out.println("You took a deep breath and continued exploring. You come across a dusty chest. "); //story plot
                                                    System.out.println("When you open the chest, you find a note inside. The note says - 'DO NOT LOOK IN THE DOLL'S EYES'. After taking the note out, you notice a old doll lying in the chest."); //story plot
                                                    System.out.println("Do you wish to look the doll in her eyes or leave it? (Option A/Option B)"); //fifth question user is asked
                                                    response5 = keyedInput.nextLine();
                                                        if (response5.equals("A") || response5.equals("a")) //two options for response5 - if user answers A then the below code is followed
                                                        {
                                                            System.out.println("You decided to be courageous and look in the doll's eyes. As you stare into her big black eyes, your legs feel weird. You look down and see your feet and hands turning into a statue. "); //story plo
                                                            System.out.println("You look back up and see the face of Bloody Mary is staring back at you. As she moves closer, you let out a defeaning scream. Suddenly, it all turns pitch black. As you become unconcious, you hear the loud laugh of Bloody Mary, ready to eat her dinner."); //story plot
                                                            System.out.println("THE END..."); //story plot
                                                        }
                                                        else if (response5.equals("B") || response5.equals("b")) //two options for response5 - if user answers B then the below code is followed
                                                            {
                                                            System.out.println("As you keep the doll down, you hear a loud scream. In panic, you turned around. But to your wildest fear, you see the face of Bloody Mary staring back at you."); //story plot
                                                            System.out.println("As she moves closer, you let out a defeaning scream. Suddenly, it all turns pitch black. As you become unconcious, you hear the loud laugh of Bloody Mary, ready to eat her dinner."); //story plot
                                                            System.out.println("THE END..."); //story plot 
                                                            }                  
                                                }                                                        
                                                else if (response4.equals("B")|| response4.equals("b")) //two options for response4 - if user answers B then the below code is followed
                                                {
                                                    System.out.println("As you walk out of the basement, you see that the door has been locked. You rush over to the door and bang on it, but it doesn't open."); //story plot
                                                    System.out.println("In panic, you turned around. But to your wildest fear, you see the face of Bloody Mary staring back at you."); //story plot
                                                    System.out.println("As she moves closer, you let out a defeaning scream. As you become unconcious, you hear the loud laugh of Bloody Mary, ready to eat her dinner."); //story plot 
                                                    System.out.println("THE END..."); //story plot
                                                }                  
                                                                        
                                        }
                }
                else if (response1.equals("B")||response1.equals("b")) //two options for response1 - if user answers B then the below code is followed
                {
                     System.out.println("As you contine walking down the path, you notice a pink cabin and a black cabin.");  //story plot
                     System.out.println("Do you want to go to the pink cabin or black cabin? (Option A/Option B)"); //second question user is asked
                     response2 = keyedInput.nextLine(); //response from above question is stored as response2
                        if (response2.equals("A") || response2.equals("a")) //two options for response2 - if user answers A then the below code is followed
                        {
                            System.out.println("After knocking on the door of the pink cabin, a old lady stepped out. After explaining your situation, she offers you."); //story plot
                            System.out.println("Do you accept tea or do you decline?"); //third question user is asked
                            response3 = keyedInput.nextLine(); //response from above question is stored as response3
                            if (response3.equals("A") || response3.equals("a")) //two options for response3 - if user answers A then the below code is followed
                                {
                                    System.out.println("As you started drinking, you felt your head getting heavy. Do you wish to stay or leave? (Option A/Option B)"); //fourth question user is asked
                                    response4 = keyedInput.nextLine(); //response from above question is stored as response4
                                    if (response4.equals("A")||response4.equals("a")) //two options for response4 - if user answers A then the below code is followed
                                    {
                                        System.out.println("As your vision turned black, you heard loud laughers. Trying your best to concentrate, you see the old woman transforming into Bloody Mary's face."); //story plot
                                        System.out.println("As your body went unconcious, there was nothing you could do except be Bloody Mary's newest target. THE END..."); //story plot
                                    }
                                    else if  (response4.equals("B")||response4.equals("b")) ////two options for response4 - if user answers B then the below code is followed
                                    {
                                        System.out.println("As you leave from the pink cabin, you felt your body turning unconcious. You tried your best to focus but dizziness overcame you. Your vision went pitch black"); //story plot
                                        System.out.println("After what felt like hours of paralysis, you finally woke up. Looking around, you see that you are back in the pink cabin. But instead of the old woman, you see Bloody Mary's face. ");
                                        System.out.println("Unfortunately for you, there was nothing you could do except be Bloody Mary's newest target. THE END..."); //story plot
                                    }
                                }
                            else if (response3.equals("B")||response3.equals("b")) //two options for response3 - if user answers B then the below code is followed
                            {
                                System.out.println("With the old woman angry about you decling her tea offer, there was nothing you could except leave the pink cabin and go to the black cabin."); //story plot
                                System.out.println("After knocking on the door of the black cabin, a grumpy man stepped out. He was hesitant to let you in, but after explaining your situation, he finally let you in."); //story plot
                                System.out.println("You were dehydrated after hours of wandering, do you ask the old man for water or no? (Option A/Option B) "); //fourth question user is asked
                                response4 = keyedInput.nextLine(); //response from above question is stored as response4
                                    if (response4.equals("A")||response4.equals("a")) //two options for response4 - if user answers A then the below code is followed
                                    {
                                        System.out.println("As the old man leaves to get water for you, he warns you to not look at the ceiling of the cabin. Do you look or no? (Option A/Option B)");  //fifth question user is asked
                                        response5 = keyedInput.nextLine(); //response from above question is stored as response5
                                            if (response5.equals("A")||response5.equals("a")) //two options for response5 - if user answers A then the below code is followed
                                            {
                                                System.out.println("You scream in shock as the entire ceiling is covered with bats. As you turn around to examine other odd things, the old man appeared in front of you."); //story plot
                                                System.out.println("Do you make a run for it or do you surrender? (Option A/Option B)"); //sixth question user is asked
                                                response6 = keyedInput.nextLine(); //response from above question is stored as response6
                                                    if (response6.equals("A")||response6.equals("a")) //two options for response6 - if user answers A then the below code is followed
                                                    {
                                                        System.out.println("You try to run out of the cabin. But, you are too late. You feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                                        System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                                + "THE END... "); //story plot
                                                    }
                                                    else if (response6.equals("B")||response6.equals("b")) //two options for response6 - if user answers B then the below code is followed
                                                        System.out.println("Immediately, after surrendering, you feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                                        System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                                + "THE END... "); //story plot
                                            }
                                            else if (response5.equals("B")||response5.equals("b")) //two options for response5 - if user answers B then the below code is followed
                                            {
                                                System.out.println("The old man comes back with a glass of water. But you scream in horror. Afterall, he now has fangs with some blood around his mouth."); //story plot
                                                System.out.println("Do you make a run for it or do you surrender? (Option A/Option B)"); //sixth question user is asked
                                                response6 = keyedInput.nextLine(); // response from above question is stored as response6
                                                    if (response6.equals("A")||response6.equals("a")) //two options for response6 - if user answers A then the below code is followed
                                                    {
                                                        System.out.println("You try to run out of the cabin. But, you are too late. You feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                                        System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                                + "THE END... "); //story plot
                                                    }
                                                    else if (response6.equals("B")||response6.equals("b")) //two options for response6 - if user answers B then the below code is followed
                                                        System.out.println("Immediately, after surrendering, you feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                                        System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                                + "THE END... "); //story plot
                                            }
                                    }
                                    else if (response4.equals("B")||response4.equals("b")) //two options for response4 - if user answers B then the below code is followed
                                    {
                                    System.out.println("As the old man searches for a map, he warns you to not look at the ceiling of the cabin. Do you look or no? (Option A/Option B)"); //fifth question user is asked
                                    response5 = keyedInput.nextLine(); //response from above question is stored as response5
                                        if (response5.equals("A") || response5.equals("a")) { //two options for response5 - if user answers A then the below code is followed
                                            System.out.println("You scream in shock as the entire ceiling is covered with bats. As you turn around to examine other odd things, the old man appeared in front of you."); //story plot
                                            System.out.println("Do you make a run for it or do you surrender? (Option A/Option B)"); //sixth question user is asked
                                            response6 = keyedInput.nextLine(); //response from above line is stored as response6
                                            if (response6.equals("A") || response6.equals("a")) { //two options for response6 - if user answers A then the below code is followe
                                                System.out.println("You try to run out of the cabin. But, you are too late. You feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                                System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                        + "THE END... "); //story plot 
                                            } else if (response6.equals("B") || response6.equals("b")) { ///two options for response6 - if user answers B then the below code is followe
                                                System.out.println("Immediately, after surrendering, you feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                            }
                                            System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? " 
                                                    + "THE END... "); //story plot

                                        } else if (response5.equals("B") || response5.equals("b")) { //two options for response5 - if user answers B then the below code is followe
                                            System.out.println("The old man comes back with a map. But you scream in horror. Afterall, he now has fangs with some blood around his mouth."); //story plot
                                            System.out.println("Do you make a run for it or do you surrender? (Option A/Option B)"); //sixth question user is asked
                                            response6 = keyedInput.nextLine(); //response from above line is stored as response6
                                            if (response6.equals("A") || response6.equals("a")) { //two options for response6 - if user answers A then the below code is followe
                                                System.out.println("You try to run out of the cabin. But, you are too late. You feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                                System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                        + "THE END... "); //story plot
                                            } else if (response6.equals("B") || response6.equals("b")) { //two options for response6 - if user answers B then the below code is followe
                                                System.out.println("Immediately, after surrendering, you feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                            }
                                            System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                    + "THE END... ");  //story plot
                                    }
                            }
                        }
                }
                        else if (response2.equals("B")||response2.equals("b")) //two options for response2 - if user answers B then the below code is followe
                        {
                        System.out.println("After knocking on the door of the black cabin, a grumpy man stepped out. He was hesitant to let you in, but after explaining your situation, he finally let you in."); //story plot
                            System.out.println("You were dehydrated after hours of wandering, do you ask the old man for water or no? (Option A/Option B) "); //third question user is asked
                            response3 = keyedInput.nextLine(); //response from above line is stored as response3
                                if (response3.equals("A")||response3.equals("a")) ///two options for response3 - if user answers A then the below code is followe
                                {
                                    System.out.println("As the old man leaves to get water for you, he warns you to not look at the ceiling of the cabin. Do you look or no? (Option A/Option B)");  //fourth question user is asked
                                    response4 = keyedInput.nextLine();//response from above line is stored as response4
                                        if (response4.equals("A")||response4.equals("a")) //two options for response4 - if user answers A then the below code is followe
                                        {
                                            System.out.println("You scream in shock as the entire ceiling is covered with bats. As you turn around to examine other odd things, the old man appeared in front of you."); //story plot
                                            System.out.println("Do you make a run for it or do you surrender? (Option A/Option B)"); //fifth question user is asked
                                            response5 = keyedInput.nextLine(); //response from above line saved as response5
                                                if (response5.equals("A")||response5.equals("a")) //two options for response5 - if user answers A then the below code is followe
                                                {
                                                    System.out.println("You try to run out of the cabin. But, you are too late. You feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                                    System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                            + "THE END... "); //story plot
                                                }
                                                else if (response5.equals("B")||response5.equals("b")) //two options for response5 - if user answers B then the below code is followe
                                                    System.out.println("Immediately, after surrendering, you feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                                    System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                            + "THE END... "); //story plot
                                        }
                                        else if (response4.equals("B")||response4.equals("b")) //two options for response4 - if user answers B then the below code is followe
                                        {
                                            System.out.println("The old man comes back with a glass of water. But you scream in horror. Afterall, he now has fangs with some blood around his mouth."); //story plot
                                            System.out.println("Do you make a run for it or do you surrender? (Option A/Option B)"); //fifth question user is asked
                                            response5 = keyedInput.nextLine(); //response from above line is stored as response5
                                                if (response5.equals("A")||response5.equals("a")) //two options for response5 - if user answers A then the below code is followe
                                                {
                                                    System.out.println("You try to run out of the cabin. But, you are too late. You feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                                    System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                            + "THE END... ");//story plot
                                                }
                                                else if (response5.equals("B")||response5.equals("b")) //two options for response5 - if user answers B then the below code is followe
                                                    System.out.println("Immediately, after surrendering, you feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                                    System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                            + "THE END... "); //story plot 
                                        }
                                }
                                else if (response3.equals("B")||response3.equals("b"))  ///two options for response3 - if user answers B then the below code is followe
                                {
                                System.out.println("As the old man searches for a map, he warns you to not look at the ceiling of the cabin. Do you look or no?"); //fourth question user is asked
                                response4 = keyedInput.nextLine(); //response from above line is stored as response4
                                    if (response4.equals("A") || response4.equals("a")) { //two options for response4 - if user answers A then the below code is followe
                                        System.out.println("You scream in shock as the entire ceiling is covered with bats. As you turn around to examine other odd things, the old man appeared in front of you."); //story plot
                                        System.out.println("Do you make a run for it or do you surrender? (Option A/Option B)"); //fifth question user is asked
                                        response5 = keyedInput.nextLine(); //response from above line is stored as response5
                                        if (response5.equals("A") || response5.equals("a")) { //two options for response5 - if user answers A then the below code is followe
                                            System.out.println("You try to run out of the cabin. But, you are too late. You feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                            System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                    + "THE END... "); //story plot
                                        } else if (response5.equals("B") || response5.equals("b")) { //two options for response5 - if user answers B then the below code is followe
                                            System.out.println("Immediately, after surrendering, you feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                            System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                + "THE END... "); //story plot
                                        }

                                    } else if (response4.equals("B") || response4.equals("b")){ //two options for response4 - if user answers B then the below code is followed
                                        System.out.println("The old man comes back with a map. But you scream in horror. Afterall, he now has fangs with some blood around his mouth."); //story plot
                                        System.out.println("Do you make a run for it or do you surrender? (Option A/Option B)"); //fifth question user is asked
                                        response5 = keyedInput.nextLine(); //response from above line is stored as response5
                                            if (response5.equals("A") || response5.equals("a")) { //two options for response5 - if user answers A then the below code is followe
                                                System.out.println("You try to run out of the cabin. But, you are too late. You feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                                System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                        + "THE END... "); //story plot
                                            } else if (response5.equals("B") || response5.equals("b")) { //two options for response5 - if user answers B then the below code is followe
                                                System.out.println("Immediately, after surrendering, you feel a sharp sting in your neck. As you look down, you see a bite mark there."); //story plot
                                            System.out.println("You feel fangs growning out and the desperate hunger for blood. Looking around, you see yourself surrounded by vampires. And there she is, your once human friend, now a vampire. Atleast, you found her, right? "
                                                    + "THE END... ");  //story plot

                                            keyedInput.close(); //closing the scanner
                                                    
                                            }
                                    }
                                }
                        }
                }
        }
}


