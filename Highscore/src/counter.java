class Counter {
	int currentVal;

	public Counter(int initVal) {
		currentVal = initVal;
	}

	/**
	 * Effect: Increasesthecurrentvalueofcounterby1
	 */
	public int inc() {
		currentVal = currentVal + 1;
		return currentVal;
	}

	/**
	 * Effect: Decreasesthecurrentvalueofcounterby1
	 */
	public int dec() {
		currentVal = currentVal - 1;
		return currentVal;
	}

	/**
	 * @returnthecurrentvalueofthecounter
	 */
	public int getCurrentVal() {
		return currentVal;
	}
	
	public int clear() {
		currentVal = 0;
		return currentVal;
	}
	
}