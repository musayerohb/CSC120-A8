import java.util.ArrayList;

public class AudreyIII implements Contract {
    private int size;
    private String name;
    private int health;
    private ArrayList<String> canEat;
    private boolean isFlying;
    private boolean isWalking;
    private boolean isHolding;


    /**
     * Constructs an Audrey III
     * @param name = the name of our alien plant  
     * @param size = current size of our plant 
     * @param isFlying = Checks if Audrey is flying 
     * @param isWalking = Check if Audrey is walking 
     * @param isHolding = Checks if Audrey is holding something 
     * @param health = health of Audrey 
     */
    public AudreyIII() {
        this.name = "Audrey Three";
        this.size = 0;
        this.isFlying = false;
        this.isWalking = false;
        this.isHolding = false;
        this.health = 10;
        this.canEat = new ArrayList<String>();
            this.canEat.add("Fruit");
            this.canEat.add("Fertilizer");
            this.canEat.add("Candy");
            this.canEat.add("Vegetable");
            this.canEat.add("Human");
            this.canEat.add("Building");
        System.out.println("Audrey Three has been planted. Make them grow to unlock more functions! ");
    }
    
    /**
     * Increases Audrey III's size.
     * @return Audrey III's current size, which has been increased by 1.
     */
    public Number grow() {
        if (this.health == 0) {
            System.out.println("Use rest first to replenish health, then Audrey Three can grow.");
            return this.size;
        }
        else {
            System.out.println("Audrey is now size " + this.size++ + ".");
            return this.size;
        }
    }

    /**
     * Decreases Audrey's III's size.
     * @return Audrey III's current size, which has decreased by 1.
     */
    public Number shrink() {
        System.out.println("Audrey is now size " + this.size-- + ".");
        return this.size;
    }


   /**
    *Allows Audrey III to grab an item after determining if Audrey can grab it based on their size.
    @param item (str) The item being prompted for Audrey III to grab.
    @throws RuntimeException When Audrey III is too small to pick up any objects.
    @throws RuntimeException When Audrey III is too small of a size to pick up an object.
    */
    public void grab(String item) {
        if (this.size == 0) {
            throw new RuntimeException("...Seeds can't grab anything. Audrey Three is too small to do this yet.");
        }
        else if (this.size < 10) {
            throw new RuntimeException("Audrey Three is still too small. It's size has to be bigger than 10 to do this!");
        }
        else if (this.isHolding == true) {
            System.out.println("Audrey Three is already hold something. They have to drop it first before theyz can grab something else!");
        }
        else {
            System.out.println("Gimmie!");
            System.out.println("**Audrey III is holding " + item + ".**");
            System.out.println("Mine now.");
            this.isHolding = true;
        }
    }

    //Additional Method to find out if one is holding the item
    /**
     * Allows Audrey to drop the object they're holding by checking if they're holding the item that's being requested to be dropped.
     * @param item (str) The item being dropped.
     * @return The item being dropped.
     */
    public String drop(String item) {
        //Have to check if Audrey Three is holding something before it can drop it? How do I do that if the grab method is void?
        System.out.println("Okay I'm bored with this.");
        System.out.println("Audrey III has dropped " + item + ".");
        this.isHolding = false;
        return item;
    }

    /**
     * Allows Audrey III to examine the item they're currently holding.
     * @param item (str) The item being checked.
     */
    public void examine(String item) {
        if (this.isHolding = false) {
            System.out.println("**Confused look** I cant eat my hand. You need to give me something first...");
        }
        else {
            if (canEat.contains(item)) {
                this.use(item);
            }
            else {
                System.out.println("**Confused look** This ain't food! I can only eat " + this.getCanEatList());
                this.drop(item);
            }
        }

    }
    
    /**
     * Allows Audrey III to eat whatever they're holding.
     * @param item (str) The item Audrey III is about to eat.
     */
    public void use(String item) {
        if (this.isHolding = false) {
            System.out.println("**Confused look** I cant eat my hand. I need to grab something fist !");
        }
        else if (item == "Vegetable") {
            this.undo();
        }
        else if (canEat.contains(item)) {
            System.out.println("Food!");
            System.out.println("Audrey III has eaten " + item + ".");
            this.grow();
            this.isHolding = false;
        }
    }

    /**
     * Allows Audrey III to walk in a direction. The user can choose to have Audrey III move either North, South, East, or West.
     * @param direction (str) The direction Audrey III is flying; can either be North, South, East, or West.
     * @return True for the boolean isWalking.
     */
    public boolean walk(String direction) {
        if (direction == "North" || direction == "South" || direction == "East" || direction == "West" || direction == "north" || direction == "south" || direction == "east" || direction == "west") {
            if (this.isFlying == true) {
                System.out.println(this.name + " has moved 10 steps " + direction + ".");
            }
            else {
                System.out.println(this.name + " has moved 5 steps " + direction + ".");
            }
        }
        else {
            System.out.println("Uh...I can't walk there. (Invalid direction, enter in North, South, East, or West. Not case sensitive.)");
        }
        return this.isWalking = true; 
    }
    
    /**
     * Allows Audrey III to fly upwards and forwards, based on the values of y and x, respectively.
     * @param x (int) The value corresponding with how far Audrey III flies forwards, in feet.
     * @param y (int) The value corresponding with how far Audrey III flies upwards, in feet.
     * @return True for the boolean isFlying.
     */
    public boolean fly(int x, int y) {
        if (this.isFlying == false) {
            System.out.println("Audrey III flies " + y + " feet into the air and " + x + " feet forwards. Their walking speed is now doubled!");
            System.out.println("Audrey III has flown " + x + " feet.");
        }
        else {
            System.out.println("Audrey III is flying at " + y + " feet now.");
            System.out.print("Walking speed has already been doubled. Use the walk function now.");
        }
        return this.isFlying = true;
    }

    /**
     * Allows Audrey III to rest, calling the grow function and causing Audrey III to gain health.
     */
    public void rest() {
        this.health++;
        this.grow();
        System.out.println("Much better!");
    }
    
    /**
     * Causes Audrey III to shrink and lose health if they eat vegetables. Is called when the item parameter of the use method is "vegetable".
     */
    public void undo() {
        System.out.println("Blegh! Gross!");
        if (this.health == 1) {
            this.health--;
            this.size = 0;
            this.isFlying = false;
            this.isWalking = false;
            System.out.println(this.name + " has died and turned into a seed again. Use rest to increase their health first, and then they can grow again.");
        }
        this.shrink();
        this.health--;
    }

    //Updating canEat list

    /**
     * Getter for the CanEat list
     * @return canEat as a list of strings.
     */
    public String getCanEatList() {
        return canEat.toString();
    }

    /**
     * Prints the list of strings of canEat.
     */
    public void showOptions() {
        System.out.println(this.getCanEatList());
    }



    public static void main(String[] args) {

        System.out.println("You've won this weird little seed at a fair! It can walk and talk, but if you want it to grow bigger, feed it these!");
        System.out.println(" ");
        AudreyIII plant = new AudreyIII();
        while (plant.size < 10) {
          plant.grow();  
        };
        // plant.grab("Vegetable");
        // plant.grow();

        // plant.examine("Vegetable");
        // plant.grab("Fruit");
        // plant.use("Fruit");
        // plant.grab("Dog");
        // plant.examine("Dog");

        // plant.walk("North");
        // plant.walk("uhh");

        // plant.fly(5, 4);
        // plant.fly(6, 7);

        plant.shrink();

        plant.rest();
        plant.rest();
        plant.rest();
        System.out.println(plant.health);

        plant.undo();
        System.out.println(plant.health);
        
        

    }




}
