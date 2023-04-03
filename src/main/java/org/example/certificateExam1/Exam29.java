package org.example.certificateExam1;

interface Printable{
    public void setMargin();
    public void setOrientation();

}
abstract class Paper implements Printable { //Line 7
    public void setMargin() {}
    //Line 9
}

class NewsPaper extends Paper { //Line 12
    public void setMargin() {}

    @Override
    public void setOrientation() {

    }
    //Line 14
}
