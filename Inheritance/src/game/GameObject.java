package game;

// abstract classes exist to be extended, they cannot be instantiated
public abstract class GameObject {

    // this method has to be implemented in all subclasses, but we don't want to provide a default implementation here
    public abstract void draw();


    public static void main(String[] args) {
        // GameObject obj = new GameObject();

        Player player = new Player();
        // player.draw();
        player.someMethod();

        GameObject menu = new Menu();
        // menu.draw();
            
        GameObject[] gameObjects = new GameObject[2];
        gameObjects[0] = player;
        gameObjects[1] = menu;

        for (GameObject obj : gameObjects) {
            obj.draw();
        }
        
    }

}
