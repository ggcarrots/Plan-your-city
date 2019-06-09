package model;

class Need {

    private String name;
    private int number;
    private boolean alreadyHave;

    public Need(String name, int number, boolean alreadyHave) {
        this.name = name;
        this.number = number;
        this.alreadyHave = alreadyHave;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isAlreadyHave() {
        return alreadyHave;
    }

    public void setAlreadyHave(boolean alreadyHave) {
        this.alreadyHave = alreadyHave;
    }
}
