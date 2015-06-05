package arrays;

//this is a hash-entry class which contains key and value of Item type which can be of any type like
//String or Integer 
class HashEntry  {

	private String key;
	private String Value;
	HashEntry next;
	
	//default constructor
	public HashEntry(){
		
	}
	
	//overloaded constructor for storing key and values while creating an object in the entry array
	public HashEntry(String key,String value) {
		this.key=key;
		this.Value=value;
		this.next=null;
	}
	
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	public HashEntry getNext() {
		return next;
	}
	public void setNext(HashEntry next) {
		this.next = next;
	}
}
