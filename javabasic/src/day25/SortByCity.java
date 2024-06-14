package day25;

import java.util.Comparator;

class SortByCity implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return p1.getCity().compareTo(p2.getCity());

    }

}



