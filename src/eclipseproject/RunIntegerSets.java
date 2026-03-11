package eclipseproject;

import java.util.ArrayList;

public class RunIntegerSets {
	ArrayList<Integer> list = new ArrayList<>();
	public void New(int value) {
	list.add(value);
	}
	
    public void Show() {
    	list.forEach(nums->{System.out.print(nums+" "); }
    	);
	}

    public void Select(int number) {
    	 if(list.contains(number)) {
    		 System.out.println("\n List contains "+number);
    	 }
    }
	
    public void Delete(int number) {
    	list.remove(Integer.valueOf(number));
		System.out.println("Number deleted from list:"+ number+"\n");
		
    }
	
    public static void main(String[] args) {

        
        RunIntegerSets r = new RunIntegerSets();
        r.New(12);
        r.New(32);
        r.New(58);
        r.Show();
        r.Select(12);
        r.Delete(12);
        r.Show();
   
        
    }
}