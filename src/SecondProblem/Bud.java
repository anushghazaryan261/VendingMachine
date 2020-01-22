package SecondProblem;

public class Bud {
    private boolean isOpen;

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bud bud = (Bud) o;

        return isOpen == bud.isOpen;

    }

    @Override
    public int hashCode() {
        return (isOpen ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Bud{" +
                "isOpen=" + isOpen +
                '}';
    }
}
