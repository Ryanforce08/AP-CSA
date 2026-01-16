import java.util.ArrayList;
public class LineList {
	public ArrayList<String> list;
	
	public LineList() {
		this.list = new ArrayList<String>();
	}
	
	public int size() {
		return this.list.size();
	}
	
	public String get(int k) {
		return this.list.get(k);
	}
	
	public void add(String line) {
		this.list.add(line);
	}
	
	public String remove(int k) {
		return this.list.remove(k);
	}
	
	public void move(int index, int new_index) {
		String temp = this.get(index);
		this.list.add(new_index, temp);
	}
	
	public void swap(int index1, int index2) {
		String foo = this.get(index1);
		String bar = this.get(index2);
		this.list.set(index2, foo);
		this.list.set(index1, bar);
	}
	
	public void shuffle() {
		int n = this.size();
		for(int i = 0; n >= 2; n--) {
			int rand_index = (int)(Math.random() * n);
			this.swap(rand_index, n-1);
		}
	}
	
	
}
