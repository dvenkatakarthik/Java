package problems;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tries2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Trie trie = new Trie();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String command = sc.next();
			if (command.equals("add")) {
				String name = sc.next();
				trie.add(name);
			} else if (command.equals("find")) {
				String partial = sc.next();
				System.out.println(trie.count(partial));
			}
		}

		sc.close();
	}
}

class Trie {
	Map<Character, Trie> l = new HashMap<Character, Trie>();
	int count;

	void add(String s) {
		count++;

		if (!s.isEmpty()) {
			char first = s.charAt(0);
			if (!l.containsKey(first)) {
				l.put(first, new Trie());
			}

			l.get(first).add(s.substring(1));
		}
	}

	int count(String s) {
		if (s.isEmpty()) {
			return count;
		}

		char first = s.charAt(0);
		return l.containsKey(first) ? l.get(first).count(s.substring(1)) : 0;
	}
}