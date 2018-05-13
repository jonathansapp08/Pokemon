import java.util.Scanner;
import java.util.Random;

public class pokemon

{
   public static void main(String[] args)
   { 
    System.out.println("Hello and welcome to pokemon!");
    System.out.println("Please choose a starter:");
    System.out.print("1. Bulbasaur ");
    System.out.print("2. Squirtle ");
    System.out.println("3. Charmander ");


    Scanner choice = new Scanner(System.in);
    int num = choice.nextInt();
    System.out.println("");

    //computer's pokemon choice
    Random rand = new Random();
    int  random = rand.nextInt(3) + 1;

    
    String pick = "";
   
    
    Bulbasaur bulbasaur2 = new Bulbasaur();
    Squirtle squirtle2 = new Squirtle();
    Charmander charmander2 = new Charmander();

    switch(num)
    {
        case 1:

        Bulbasaur bulbasaur1 = new Bulbasaur();
        

        System.out.println("You chose Bulbasaur");
        System.out.println("\nBattle start!");
        

        if(random == 1)
            System.out.println("Your rival sends out Bulbasaur!");
            pick = "Bulbasaur";
            
        if(random == 2)
            System.out.println("Your rival sends out Squirtle!");
            pick = "Squirtle";
            
        if(random == 3)
            System.out.println("Your rival sends out Charmander!");
            pick = "Charmander";
          
        
            
            
        do
        {
            int  random2 = rand.nextInt(3) + 1;
            int  random3 = rand.nextInt(3) + 1;

            System.out.println("\nWhat will you do?");
            System.out.print("1. Attack ");
            System.out.println("2.Run");


            choice = new Scanner(System.in);
            num = choice.nextInt();

            while (num == 2){
                System.out.println("You can't run away from a battle!");
                System.out.println("\nWhat will you do?");
                num = choice.nextInt();

            }

            //user input switch
            switch(num)
            {
                case 1:
                    System.out.println("\nWhich attack?");
                    System.out.print("1. Tackle");
                    System.out.println(" 2. Bite");

                    choice = new Scanner(System.in);
                    int move = choice.nextInt();

                    switch(move)
                    {
                        case 1: 
                        System.out.println("\nBulbasaur used tackle");
                        System.out.println("You did " + random2 + " damage to the enemy's pick");

                            if(random == 1){
                                bulbasaur2.hp = bulbasaur2.hp - random2;
                                System.out.println("The enemy's pokemon now has " + bulbasaur2.hp + " hp");
                                if(bulbasaur2.hp <= 0)
                                break; 
                                else{
                                    System.out.println("\nThe enemy's pokemon used tackle.");
                                    System.out.println("You lost " + random3 + "hp");
                                    bulbasaur1.hp = bulbasaur1.hp - random3;
                        
                                    if(bulbasaur1.hp > 0 )
                                        System.out.println("You now have " + bulbasaur1.hp + " hp");  
                                }
                            }
                            else if(random == 2){
                                squirtle2.hp = squirtle2.hp - random2;
                                System.out.println("The enemy's pokemon now has " + squirtle2.hp + " hp\n");
                                if(squirtle2.hp <= 0)
                                break;
                                else{
                                    System.out.println("The enemy's pokemon used tackle.");
                                    System.out.println("You lost " + random3 + "hp");
                                    bulbasaur1.hp = bulbasaur1.hp - random3;
                        
                                    if(bulbasaur1.hp > 0 )
                                        System.out.println("You now have " + bulbasaur1.hp + " hp");  
                                }
                            }
                            else if(random == 3){
                                charmander2.hp = charmander2.hp - random2;
                                System.out.println("The enemy's pokemon now has " + charmander2.hp + " hp");
                                if(charmander2.hp <= 0)
                                break;
                                else{
                                    System.out.println("The enemy's pokemon used tackle.");
                                    System.out.println("You lost " + random3 + "hp");
                                    bulbasaur1.hp = bulbasaur1.hp - random3;
                        
                                    if(bulbasaur1.hp > 0 )
                                        System.out.println("You now have " + bulbasaur1.hp + " hp");  
                                }
                            }

                           

                        break;
                   

                        case 2:
                        System.out.println("Bulbasaur used bite");
                        System.out.println("You did " + random2 + " damage to the enemy's pick");

                            if(random == 1){
                                bulbasaur2.hp = bulbasaur2.hp - random2;
                                System.out.println("The enemy's pokemon now has " + bulbasaur2.hp + " hp");
                                if(bulbasaur2.hp <= 0)
                                break; 
                                else{
                                    System.out.println("The enemy's pokemon used tackle.");
                                    System.out.println("You lost " + random3 + "hp");
                                    bulbasaur1.hp = bulbasaur1.hp - random3;
                        
                                    if(bulbasaur1.hp > 0 )
                                        System.out.println("You now have " + bulbasaur1.hp + " hp");  
                                }
                            }
                            else if(random == 2){
                                squirtle2.hp = squirtle2.hp - random2;
                                System.out.println("The enemy's pokemon now has " + squirtle2.hp + " hp");
                                if(squirtle2.hp <= 0)
                                break;
                                else{
                                    System.out.println("The enemy's " + pick + " used tackle.");
                                    System.out.println("You lost " + random3 + "hp");
                                    bulbasaur1.hp = bulbasaur1.hp - random3;
                        
                                    if(bulbasaur1.hp > 0 )
                                        System.out.println("You now have " + bulbasaur1.hp + " hp");  
                                }
                            }
                            else if(random == 3){
                                charmander2.hp = charmander2.hp - random2;
                                System.out.println("The enemy's pokemon now has " + charmander2.hp + " hp");
                                if(charmander2.hp <= 0)
                                break;
                                else{
                                    System.out.println("The enemy's pokemon used tackle.");
                                    System.out.println("You lost " + random3 + "hp");
                                    bulbasaur1.hp = bulbasaur1.hp - random3;
                        
                                    if(bulbasaur1.hp > 0 )
                                        System.out.println("You now have " + bulbasaur1.hp + " hp");  
                                }
                            }
                            break;
                        





                        
                    }

                

            }
            
        
           


            if(bulbasaur2.hp <= 0)
                break; 
            if(squirtle2.hp <= 0)
                break; 
            if(charmander2.hp <= 0)
                break; 
                
        }
        while(bulbasaur1.hp > 0 || bulbasaur2.hp < 0 || squirtle2.hp < 0 || charmander2.hp < 0);   

        if(bulbasaur1.hp <= 0){
        System.out.println("Bulbasaur no longer can battle");
        System.out.println("Better luck next time!");
        }
        else
        System.out.println("Congrats you won!");

        break;








































        case 2:
          
            Squirtle squirtle1 = new Squirtle();
            
    
            System.out.println("You chose Squirtle");
            System.out.println("\nBattle start!");
            
    
            if(random == 1)
                System.out.println("Your rival sends out Bulbasaur!");
                pick = "Bulbasaur";
                //Bulbasaur bulbasaur2 = new Bulbasaur();
            if(random == 2)
                System.out.println("Your rival sends out Squirtle!");
                pick = "Squirtle";
                //Squirtle squirtle2 = new Squirtle();
            if(random == 3)
                System.out.println("Your rival sends out Charmander!");
                pick = "Charmander";
                //Charmander charmander2 = new Charmander();
            
                
                
            do
            {
                int  random2 = rand.nextInt(3) + 1;
                int  random3 = rand.nextInt(3) + 1;
    
                System.out.println("\nWhat will you do?");
                System.out.print("1. Attack ");
                System.out.println("2.Run");
    
    
                choice = new Scanner(System.in);
                num = choice.nextInt();
    
                while (num == 2){
                    System.out.println("You can't run away from a battle!");
                    System.out.println("\nWhat will you do?");
                    num = choice.nextInt();
    
                }
    
                //user input switch
                switch(num)
                {
                    case 1:
                        System.out.println("\nWhich attack?");
                        System.out.print("1. Tackle");
                        System.out.println(" 2. Bite");
    
                        choice = new Scanner(System.in);
                        int move = choice.nextInt();
    
                        switch(move)
                        {
                            case 1: 
                            System.out.println("\nSquirtle used tackle");
                            System.out.println("You did " + random2 + " damage to the enemy's pick");
    
                                if(random == 1){
                                    bulbasaur2.hp = bulbasaur2.hp - random2;
                                    System.out.println("The enemy's pokemon now has " + bulbasaur2.hp + " hp\n");
                                    if(bulbasaur2.hp <= 0)
                                    break; 
                                    else{
                                        System.out.println("\nThe enemy's pokemon used tackle.");
                                        System.out.println("You lost " + random3 + "hp");
                                        squirtle1.hp = squirtle1.hp - random3;
                            
                                        if(squirtle1.hp > 0 )
                                            System.out.println("You now have " + squirtle1.hp + " hp");  
                                    }
                                }
                                else if(random == 2){
                                    squirtle2.hp = squirtle2.hp - random2;
                                    System.out.println("The enemy's pokemon now has " + squirtle2.hp + " hp\n");
                                    if(squirtle2.hp <= 0)
                                    break;
                                    else{
                                        System.out.println("The enemy's pokemon used tackle.");
                                        System.out.println("You lost " + random3 + "hp");
                                        squirtle1.hp = squirtle1.hp - random3;
                            
                                        if(squirtle1.hp > 0 )
                                            System.out.println("You now have " + squirtle1.hp + " hp");  
                                    }
                                }
                                else if(random == 3){
                                    charmander2.hp = charmander2.hp - random2;
                                    System.out.println("The enemy's pokemon now has " + charmander2.hp + " hp\n");
                                    if(charmander2.hp <= 0)
                                    break;
                                    else{
                                        System.out.println("The enemy's pokemon used tackle.");
                                        System.out.println("You lost " + random3 + "hp");
                                        squirtle1.hp = squirtle1.hp - random3;
                            
                                        if(squirtle1.hp > 0 )
                                            System.out.println("You now have " + squirtle1.hp + " hp");  
                                    }
                                }
    
                                
    
                            break;
                        
    
                            case 2:
                            System.out.println("Squirtle used bite");
                            System.out.println("You did " + random2 + " damage to the enemy's pick");
    
                                if(random == 1){
                                    bulbasaur2.hp = bulbasaur2.hp - random2;
                                    System.out.println("The enemy's pokemon now has " + bulbasaur2.hp + " hp\n");
                                    if(bulbasaur2.hp <= 0)
                                    break; 
                                    else{
                                        System.out.println("The enemy's pokemon used tackle.");
                                        System.out.println("You lost " + random3 + "hp");
                                        squirtle1.hp = squirtle1.hp - random3;
                            
                                        if(squirtle1.hp > 0 )
                                            System.out.println("You now have " + squirtle1.hp + " hp");  
                                    }
                                }
                                else if(random == 2){
                                    squirtle2.hp = squirtle2.hp - random2;
                                    System.out.println("The enemy's pokemon now has " + squirtle2.hp + " hp\n");
                                    if(squirtle2.hp <= 0)
                                    break;
                                    else{
                                        System.out.println("The enemy's " + pick + " used tackle.");
                                        System.out.println("You lost " + random3 + "hp");
                                        squirtle1.hp = squirtle1.hp - random3;
                            
                                        if(squirtle1.hp > 0 )
                                            System.out.println("You now have " + squirtle1.hp + " hp");  
                                    }
                                }
                                else if(random == 3){
                                    charmander2.hp = charmander2.hp - random2;
                                    System.out.println("The enemy's pokemon now has " + charmander2.hp + " hp\n");
                                    if(charmander2.hp <= 0)
                                    break;
                                    else{
                                        System.out.println("The enemy's pokemon used tackle.");
                                        System.out.println("You lost " + random3 + "hp");
                                        squirtle1.hp = squirtle1.hp - random3;
                            
                                        if(squirtle1.hp > 0 )
                                            System.out.println("You now have " + squirtle1.hp + " hp");  
                                    }
                                }
                                break;
                            
    
    
    
    
    
                            
                        }
    
                    
    
                }
                
            
                
    
    
                if(bulbasaur2.hp <= 0)
                    break; 
                if(squirtle2.hp <= 0)
                    break; 
                if(charmander2.hp <= 0)
                    break; 
                    
            }
            while(squirtle1.hp > 0 || bulbasaur2.hp < 0 || squirtle2.hp < 0 || charmander2.hp < 0);   
    
            if(squirtle1.hp <= 0){
            System.out.println("\nSquirtle no longer can battle");
            System.out.println("Better luck next time!");
            }
            else
            System.out.println("Congrats you won!");
            break;


























































































        case 3:
        
            Charmander charmander1 = new Charmander();
            

            System.out.println("You chose Charmander");
            System.out.println("\nBattle start!");
            

            if(random == 1)
                System.out.println("Your rival sends out Bulbasaur!");
                pick = "Bulbasaur";
                //Bulbasaur bulbasaur2 = new Bulbasaur();
            if(random == 2)
                System.out.println("Your rival sends out Squirtle!");
                pick = "Squirtle";
                //Squirtle squirtle2 = new Squirtle();
            if(random == 3)
                System.out.println("Your rival sends out Charmander!");
                pick = "Charmander";
                //Charmander charmander2 = new Charmander();
            
                
                
            do
            {
                int  random2 = rand.nextInt(3) + 1;
                int  random3 = rand.nextInt(3) + 1;

                System.out.println("\nWhat will you do?");
                System.out.print("1. Attack ");
                System.out.println("2.Run");


                choice = new Scanner(System.in);
                num = choice.nextInt();

                while (num == 2){
                    System.out.println("You can't run away from a battle!");
                    System.out.println("\nWhat will you do?");
                    num = choice.nextInt();

                }

                //user input switch
                switch(num)
                {
                    case 1:
                        System.out.println("\nWhich attack?");
                        System.out.print("1. Tackle");
                        System.out.println(" 2. Bite");

                        choice = new Scanner(System.in);
                        int move = choice.nextInt();

                        switch(move)
                        {
                            case 1: 
                            System.out.println("\nCharmander used tackle");
                            System.out.println("You did " + random2 + " damage to the enemy's pick");

                                if(random == 1){
                                    bulbasaur2.hp = bulbasaur2.hp - random2;
                                    System.out.println("The enemy's pokemon now has " + bulbasaur2.hp + " hp\n");
                                    if(bulbasaur2.hp <= 0)
                                    break; 
                                    else{
                                        System.out.println("\nThe enemy's pokemon used tackle.");
                                        System.out.println("You lost " + random3 + "hp");
                                        charmander1.hp = charmander1.hp - random3;
                            
                                        if(charmander1.hp > 0 )
                                            System.out.println("You now have " + charmander1.hp + " hp");  
                                    }
                                }
                                else if(random == 2){
                                    squirtle2.hp = squirtle2.hp - random2;
                                    System.out.println("The enemy's pokemon now has " + squirtle2.hp + " hp\n");
                                    if(squirtle2.hp <= 0)
                                    break;
                                    else{
                                        System.out.println("The enemy's pokemon used tackle.");
                                        System.out.println("You lost " + random3 + "hp");
                                        charmander1.hp = charmander1.hp - random3;
                            
                                        if(charmander1.hp > 0 )
                                            System.out.println("You now have " + charmander1.hp + " hp");  
                                    }
                                }
                                else if(random == 3){
                                    charmander2.hp = charmander2.hp - random2;
                                    System.out.println("The enemy's pokemon now has " + charmander2.hp + " hp\n");
                                    if(charmander2.hp <= 0)
                                    break;
                                    else{
                                        System.out.println("The enemy's pokemon used tackle.");
                                        System.out.println("You lost " + random3 + "hp");
                                        charmander1.hp = charmander1.hp - random3;
                            
                                        if(charmander1.hp > 0 )
                                            System.out.println("You now have " + charmander1.hp + " hp");  
                                    }
                                }

                                

                            break;
                        

                            case 2:
                            System.out.println("Charmander used bite");
                            System.out.println("You did " + random2 + " damage to the enemy's pick");

                                if(random == 1){
                                    bulbasaur2.hp = bulbasaur2.hp - random2;
                                    System.out.println("The enemy's pokemon now has " + bulbasaur2.hp + " hp\n");
                                    if(bulbasaur2.hp <= 0)
                                    break; 
                                    else{
                                        System.out.println("The enemy's pokemon used tackle.");
                                        System.out.println("You lost " + random3 + "hp");
                                        charmander1.hp = charmander1.hp - random3;
                            
                                        if(charmander1.hp > 0 )
                                            System.out.println("You now have " + charmander1.hp + " hp");  
                                    }
                                }
                                else if(random == 2){
                                    squirtle2.hp = squirtle2.hp - random2;
                                    System.out.println("The enemy's pokemon now has " + squirtle2.hp + " hp\n");
                                    if(squirtle2.hp <= 0)
                                    break;
                                    else{
                                        System.out.println("The enemy's " + pick + " used tackle.");
                                        System.out.println("You lost " + random3 + "hp");
                                        charmander1.hp = charmander1.hp - random3;
                            
                                        if(charmander1.hp > 0 )
                                            System.out.println("You now have " + charmander1.hp + " hp");  
                                    }
                                }
                                else if(random == 3){
                                    charmander2.hp = charmander2.hp - random2;
                                    System.out.println("The enemy's pokemon now has " + charmander2.hp + " hp\n");
                                    if(charmander2.hp <= 0)
                                    break;
                                    else{
                                        System.out.println("The enemy's pokemon used tackle.");
                                        System.out.println("You lost " + random3 + "hp");
                                        charmander1.hp = charmander1.hp - random3;
                            
                                        if(charmander1.hp > 0 )
                                            System.out.println("You now have " + charmander1.hp + " hp");  
                                    }
                                }
                                break;
                            





                            
                        }

                    

                }
                
            
                


                if(bulbasaur2.hp <= 0)
                    break; 
                if(squirtle2.hp <= 0)
                    break; 
                if(charmander2.hp <= 0)
                    break; 
                    
            }
            while(charmander1.hp > 0 || bulbasaur2.hp < 0 || squirtle2.hp < 0 || charmander2.hp < 0);   

            if(charmander1.hp <= 0){
            System.out.println("\nCharmander no longer can battle");
            System.out.println("Better luck next time!");
            }
            else
            System.out.println("Congrats you won!");
            break;
            













    }

    

   }
}

class Bulbasaur{
    int hp = 10; 
    int attack = 2;    
}

class Squirtle{
    int hp = 10; 
    int attack = 2; 
}

class Charmander{
    int hp = 10; 
    int attack = 2; 
}

class Rivalpick{
    int hp;
    int attack;
}


