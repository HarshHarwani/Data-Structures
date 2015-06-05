package arrays;

//this is a hash-entry class which contains key and value of Item type which can be of any type like
//String or Integer 
class HashEntry<Item> {

	private Item key;
	private Item Value;
	HashEntry<Item> next;
	
	//default constructor
	public HashEntry(){
		
	}
	
	//overloaded constructor for storing key and values while creating an object in the entry array
	public HashEntry(Item key,Item value) {
		this.key=key;
		this.Value=value;
		this.next=null;
	}
	
	
	public Item getKey() {
		return key;
	}
	public void setKey(Item key) {
		this.key = key;
	}
	public Item getValue() {
		return Value;
	}
	public void setValue(Item value) {
		Value = value;
	}
	public HashEntry<Item> getNext() {
		return next;
	}
	public void setNext(HashEntry<Item> next) {
		this.next = next;
	}
}
