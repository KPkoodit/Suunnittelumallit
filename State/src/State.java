
abstract class State {
	int lepaa() {
		return 0;}
	int kaytaHeikkoIsku() {
		return 0;}
	int kaytaVahvaIsku() {
		return 0;}
	int getLevel() {
		return 0;}
	State evolvaus() {
		return null;}
	void changeState(State s) {
	}
}
