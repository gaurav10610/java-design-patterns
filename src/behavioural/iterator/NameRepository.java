package behavioural.iterator;

public class NameRepository implements Container {

	public String names[];

	public NameRepository(String[] names) {
		this.names = names;
	}

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {

		private int index;

		private NameIterator() {
			index = 0;
		}

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}

	}
}
