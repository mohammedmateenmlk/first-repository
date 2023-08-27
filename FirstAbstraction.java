package Abstraction;

public abstract class FirstAbstraction {
abstract void SwitchOn();
abstract void SwitchOff();

}
class Test extends FirstAbstraction{
	@Override
	void SwitchOn() {
		System.out.println("Tv - on");
	}
	@Override
	void SwitchOff() {
		System.out.println("Tv -off");
	}
}