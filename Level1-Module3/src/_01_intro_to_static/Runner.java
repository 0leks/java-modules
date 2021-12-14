package _01_intro_to_static;

public class Runner {
	public static void main(String[] args) {
		Tree t1 = new Tree(50, 50);
		Tree t2 = new Tree(30, 70);
		Tree t3 = new Tree(100, 100);
		
		Fish f = new Fish(50, 50);
		Fish f2 = new Fish(70, 40);
		Fish f3 = new Fish(35, 40);
		Dog d = new Dog(50, 50);
		Cat c = new Cat(50, 50);
		
		World.addEntity(f, 350, 200);
		World.addEntity(f2, 70, 300);
		World.addEntity(f3, 380, 550);
		World.addEntity(t1, 250, 350);
		World.addEntity(t2, 230, 60);
		World.addEntity(t3, 550, 200);
		World.addEntity(d, 260, 280);
		World.addEntity(c, 600, 400);
		
		
		World.show();
	}
}
