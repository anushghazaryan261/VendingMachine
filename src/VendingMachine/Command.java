package VendingMachine;

public class Command {
    private char raw;
    private int column;

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        if(column==1||column==2||column==3)
        this.column = column;
    }

    public char getRaw() {
        return raw;
    }

    public void setRaw(char raw) {
        if(raw=='A'||raw=='B'||raw=='C')
        this.raw = raw;
    }
}
