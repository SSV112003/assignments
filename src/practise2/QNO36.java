package practise2;

class Tank {
	private boolean isReleased;

	public void fillTank() {
		System.out.println("Tank is filled.");
		isReleased = false;
	}

	public void emptyTank() {
		System.out.println("Tank is emptied.");
	}

	public void releaseTank() {
		System.out.println("Tank is released.");
		isReleased = true;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!isReleased) {
			System.out.println("Error: Tank was not released before cleanup!");
		} else {
			System.out.println("Tank finalized properly.");
		}
		super.finalize();
	}
}

public class QNO36 {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		t1.fillTank();
		t1.emptyTank();
		t1.releaseTank();

		Tank t2 = new Tank();
		t2.fillTank();

		t1 = null;
		t2 = null;

		System.gc();
	}
}

