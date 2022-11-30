public class Bus {

    private int finalStop;
    private int currentStop;
    private boolean reversed;

    public Bus(int i) {
        finalStop = i;
        currentStop = 1;
        reversed = false;
    }

    public int getCurrentStop() {
        return currentStop;
    }

    public void move()
    {
        if (currentStop == 1) {
            reversed = false;
        }
        if (currentStop == finalStop) {
            reversed = true;
        }
        if (reversed) {
            currentStop--;
        } else {
            currentStop++;
        }
    }
}
