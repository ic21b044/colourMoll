package at.sml.colour.dto;

public class colour {

    String Colour;
    String Comp;

    public colour(String colour, String comp) {
        Colour = colour;
        Comp = comp;
    }

    public String getComp() {
        return Comp;
    }

    public void setComp(String comp) {
        Comp = comp;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }
}
