package Animal;

public class Farm {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal sheep = new Sheep();
		Animal cow = new Cow();
		Animal chicken = new Chicken();
		
		Animal[] masyvas = {cat, cat, cat, dog, dog, sheep, cow, cow, cow, chicken, chicken};
		
		int catSk = 0;
		int dogSk = 0;
		int cowSk = 0;
		int sheepSk = 0;
		int chickenSk = 0;
		
		for(int i = 0; i < masyvas.length; i++){			
			if(masyvas[i] instanceof Cat) {
				catSk++;
			} else if (masyvas[i] instanceof Dog) {
				dogSk++;
			} else if (masyvas[i] instanceof Cow) {
				cowSk++;
			} else if (masyvas[i] instanceof Sheep) {
				sheepSk++;
			} else if (masyvas[i] instanceof Chicken) {
				chickenSk++;
			}			
		}
		System.out.println("Cats: " + catSk + " " + cat.toString());
		System.out.println("Dogs: " + dogSk +  " " + dog.toString());
		System.out.println("Cows: " + cowSk + " " + cow.toString());
		System.out.println("Sheep: " + sheepSk + " " + sheep.toString());
		System.out.println("Chicken: " + chickenSk + " " + chicken.toString());
	}

	}

