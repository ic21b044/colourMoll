package at.sml.colour.service;

import at.sml.colour.dto.colour;
import org.springframework.stereotype.Service;

@Service
public class colourService {

    colour clr = new colour("red", "green");
    colour clr2 = new colour("green", "red");
    colour clr3 = new colour("orange", "blue");
    colour clr4 = new colour("blue", "orange");
    colour clr5 = new colour("yellow", "purple");
    colour clr6 = new colour("purple", "yellow");

    public String getColour(String colour)
    {
        if(colour.equals("red")) {
            return clr.getColour();
        }
        else if (colour.equals("green")) {
            return clr2.getColour();
        }
        else if (colour.equals("orange")) {
            return clr3.getColour();
        }
        else if (colour.equals("blue")) {
            return clr4.getColour();
        }
        else if (colour.equals("yellow")) {
            return clr5.getColour();
        }
        else if (colour.equals("purple")) {
            return clr6.getColour();
        }
        else {
            return "error please use right colour";
        }
    }

    public String getComColour(String colour) {

        if(colour.equals("red")) {
            return clr.getComp();
        }
        else if (colour.equals("green")) {
            return clr2.getComp();
        }
        else if (colour.equals("orange")) {
            return clr3.getComp();
        }
        else if (colour.equals("blue")) {
            return clr4.getComp();
        }
        else if (colour.equals("yellow")) {
            return clr5.getComp();
        }
        else if (colour.equals("purple")) {
            return clr6.getComp();
        }
        else {
            return "error please use right colour";
        }

    }



}
