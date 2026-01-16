
public class LineTest {
	public static void main(String[] args) {
		LineList lines = new LineList();

        lines.add("Alpha");
        lines.add("Bravo");
        lines.add("Charlie");
        lines.add("Delta");

        System.out.println("Initial list:");
        printList(lines);

        System.out.println("\nSize: " + lines.size());

        System.out.println("\nItem at index 2: " + lines.get(2));

        System.out.println("\nRemoving index 1: " + lines.remove(1));
        printList(lines);

        System.out.println("\nMoving index 2 to index 0");
        lines.move(2, 0);
        printList(lines);

        System.out.println("\nSwapping index 0 and 1");
        lines.swap(0, 1);
        printList(lines);

        System.out.println("\nShuffling list");
        lines.shuffle();
        printList(lines);
    }


    private static void printList(LineList lines) {
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(i + ": " + lines.get(i));
        }
    }
}
