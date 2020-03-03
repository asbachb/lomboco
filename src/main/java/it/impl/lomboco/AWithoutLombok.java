package it.impl.lomboco;

public class AWithoutLombok {

    private final boolean bool;
    
    public AWithoutLombok(boolean bool) {
        this.bool = bool;
    }
    
    public boolean isBool() {
        return bool;
    }
}
