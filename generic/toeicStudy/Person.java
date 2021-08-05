package generic.toeicStudy;

//¿œπ›¿Œ
public class Person {
    private String name;
    private int level;
    
    //getter, setter
    public String getName() {
    	return name;
    }
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	//constructor
	public Person(String name, int level){
        this.name = name;
        this.level = level;
    }
}
