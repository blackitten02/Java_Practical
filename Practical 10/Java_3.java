class Insects{
	void dirty(){
		System.out.println("Insects are being dirty");
	}
}

class Bees extends Insects{
	void buzz(){
		System.out.println("Bees are buzzing");
	}
}

class QueenBee extends Bees{
	void lead(){
		System.out.println("Queen bee is always the leading bee.");
	}
}

class Java_3{
	public static void main(String[] args){
		QueenBee h = new QueenBee();
		h.dirty();
		h.buzz();
		h.lead();
	}
}