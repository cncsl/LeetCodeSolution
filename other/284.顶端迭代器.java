/*
 * @lc app=leetcode.cn id=284 lang=java
 *
 * [284] 顶端迭代器
 */

// @lc code=start
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	
	private Integer peekElem;
	private Iterator<Integer> iterator;

	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		if (peekElem == null) {
			peekElem = iterator.next();
		}
		return peekElem;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer result;
	    if (peekElem != null) {
			result = peekElem;
			peekElem = null;
		} else {
			result = iterator.next();
		}
		return result;
	}
	
	@Override
	public boolean hasNext() {
	    return iterator.hasNext() || (peekElem != null);
	}
}
// @lc code=end

