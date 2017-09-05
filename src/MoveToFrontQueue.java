
public class MoveToFrontQueue {
	LinkedList<Character> list; 
	
	MoveToFrontQueue(Node node){
		list = new LinkedList(node);
	}
	
	private boolean isPreviouslyPreset(char input ){
			boolean returnValue = false;
		if(list.find(input)!=null){
			returnValue = true;
			
		}
		return returnValue;
	}
	public void addItem(char input){
		if(isPreviouslyPreset(input)){
			//remove and add
			list.remove(input);
			list.addItem(input);
		}
		else{
			//add
			list.addItem(input);
		}
		
	
	}
	
	public void printAll(){
		list.printAll();
	}
	
}
