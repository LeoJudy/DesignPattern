package design_pattern.builder_pattern;

public class PersonBuilder {
    private static final String DEFAULT_HEAD = "默认头盔";
    private static final String DEFAULT_BODY = "默认胸甲";
    private static final String DEFAULT_LEFT_HAND = "默认左手装备";
    private static final String DEFAULT_RIGHT_HAND = "默认右手装备";
    private static final String DEFAULT_LEFT_LEG = "默认左腿装备";
    private static final String DEFAULT_RIGHT_LEG = "默认右腿装备";

    private String head = DEFAULT_HEAD;
    private String body = DEFAULT_BODY;
    private String leftHand = DEFAULT_LEFT_HAND;
    private String rightHand = DEFAULT_RIGHT_HAND;
    private String leftLeg = DEFAULT_LEFT_LEG;
    private String rightLeg = DEFAULT_RIGHT_LEG;

    public PersonBuilder setRightHand(String rightHand) {
        this.rightHand = rightHand;
        return this;
    }

    public PersonBuilder setRightLeg(String rightLeg) {
        this.rightLeg = rightLeg;
        return this;
    }

    public PersonBuilder setLeftLeg(String leftLeg) {
        this.leftLeg = leftLeg;
        return this;
    }

    public PersonBuilder setLeftHand(String leftHand) {
        this.leftHand = leftHand;
        return this;
    }

    public PersonBuilder setHead(String head) {
        this.head = head;
        return this;
    }

    public PersonBuilder setBody(String body) {
        this.body = body;
        return this;
    }
    
    Person build(){
        Person person = new Person();
        person.setBody(body);
        person.setHead(head);
        person.setLeftHand(leftHand);
        person.setRightHand(rightHand);
        person.setLeftLeg(leftLeg);
        person.setRightLeg(rightLeg);
        return person;
    }
}
