import java.util.Stack;

public class TowerOfHanoi {

	public static void main(String args[]) {
		int towerLen = 3;
		Tower[] towers = new Tower[towerLen];
		for (int i = 0; i < towers.length; i++)
			towers[i] = new Tower(i);

		for (int i = towerLen - 1; i >= 0; i--)
			towers[0].add(i);

		towers[0].moveDisks(towerLen, towers[2], towers[1]);

	}

	public static class Tower {
		Stack<Integer> disks= new Stack<Integer>();
		int index;

		public Tower(int i) { 
			index = 1;
		}

		public int index() {
			return index;
		}

		public void add(int d) {
			if (!disks.isEmpty() && disks.peek() <= d)
				System.out.println("Error placing disk " + d);
			else
				disks.push(d);
		}

		public void moveTopTo(Tower t) {
			int top = disks.pop();
			t.add(top);
			System.out.println("Move disk " + top + " from " + index() + " to " + t.index());
		}

		public void moveDisks(int n, Tower destination, Tower buffer) {
			if (n <= 0)
				return;

			moveDisks(n - 1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n - 1, destination, this);
		}
	}

}
