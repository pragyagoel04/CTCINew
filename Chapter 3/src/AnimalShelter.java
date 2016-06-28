import java.util.LinkedList;

public class AnimalShelter {
	public static void main(String[] args) {
		AnimalQueue animals=new AnimalQueue();
		animals.enqueue(new Cat("Neena"));
		animals.enqueue(new Cat("Teena"));
		animals.enqueue(new Cat("Doremon"));
		animals.enqueue(new Dog("Rocky"));
		animals.enqueue(new Dog("Browny"));
		animals.enqueue(new Dog("Dexter"));
		animals.enqueue(new Dog("Moti"));
		animals.enqueue(new Cat("Sherlock"));
		animals.enqueue(new Cat("Snowy"));
		
		System.out.println(animals.dequeueAny().name());	
		System.out.println(animals.dequeueAny().name());	
		System.out.println(animals.dequeueAny().name());
		
		System.out.println("lllllllllll");

		animals.enqueue(new Dog("Shiro"));
		animals.enqueue(new Cat("Doremon"));
		
		while (animals.size() != 0) {
			System.out.println(animals.dequeueAny().name());	
		}
	}
	
	public static class AnimalQueue{
		LinkedList<Dog> dogs=new LinkedList<Dog>();
		LinkedList<Cat> cats=new LinkedList<Cat>();
		private int order = 0;
		
		public void enqueue(Animal a) {
			a.setOrder(order);
			order++;
			if (a instanceof Dog) {
				dogs.addLast((Dog) a);
			} else if (a instanceof Cat) {
				cats.addLast((Cat)a);
			}
		}
		
		public Animal dequeueAny() {
			if (dogs.size() == 0) {
				return dequeueCats();
			} else if (cats.size() == 0) {
				return dequeueDogs();
			}
			Dog dog = dogs.peek();
			Cat cat = cats.peek();
			if (dog.isOlderThan(cat)) {
				return dogs.poll();
			} else {
				return cats.poll();
			}
		}
		
		public Animal peek() {
			if (dogs.size() == 0) {
				return cats.peek();
			} else if (cats.size() == 0) {
				return dogs.peek();
			}
			Dog dog = dogs.peek();
			Cat cat = cats.peek();
			if (dog.isOlderThan(cat)) {
				return dog;
			} else {
				return cat;
			}
		}
		
		public int size() {
			return dogs.size() + cats.size();
		}
		
		public Dog dequeueDogs() {
			return dogs.poll();
		}
		
		public Dog peekDogs() {
			return dogs.peek();
		}
		
		public Cat dequeueCats() {
			return cats.poll();
		}
		
		public Cat peekCats() {
			return cats.peek();
		}
		
	}
	
	
	
}
