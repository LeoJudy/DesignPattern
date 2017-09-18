package design_pattern.builder_pattern;

public class Person {
    private String head;
    private String body;
    private String leftHand;
    private String rightHand;
    private String leftLeg;
    private String rightLeg;

    public void setBody(String body) {
        this.body = body;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setLeftHand(String leftHand) {
        this.leftHand = leftHand;
    }

    public void setLeftLeg(String leftLeg) {
        this.leftLeg = leftLeg;
    }

    public void setRightHand(String rightHand) {
        this.rightHand = rightHand;
    }

    public void setRightLeg(String rightLeg) {
        this.rightLeg = rightLeg;
    }


    @Override
    public String toString() {
        return "Person[" + head + ", " + body + ", " + leftHand + ", " + rightHand + ", " + leftLeg + ", " + rightLeg + "]";
    }
}
