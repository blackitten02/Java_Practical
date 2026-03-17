//Demonstrating the single inheritance

class Insects{
	void dirty(){
		System.out.println("Insects are being dirty");
	}
}

class Bees extends Insects{
	void buzz(){
	System.out.println("bees are buzzing");	
	}
}

class Java_1{
	public static void main(String[] args){
		Bees b = new Bees();
		b.dirty();
		b.buzz();
	}
}
