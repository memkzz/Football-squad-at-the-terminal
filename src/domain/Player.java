package domain;

public class Player {
    private String name;
    private int age;
    private String height;
    private PrimaryPosition primaryPosition;
    private SpecificPosition specificPosition;
    private Foot foot;
    private float marketValue;
    private Status status;
    private String endOfContract;
    private String nacionality;


    public Player(String name, int age, String height, PrimaryPosition primaryPosition, SpecificPosition specificPosition, Foot foot, float marketValue, Status status, String endOfContract, String nacionality) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.primaryPosition = primaryPosition;
        this.specificPosition = specificPosition;
        this.foot = foot;
        this.marketValue = marketValue;
        this.status = status;
        this.endOfContract = endOfContract;
        this.nacionality = nacionality;

    }

    public void print(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Height: "+this.height);
        System.out.println("Position: "+this.primaryPosition+" As a "+specificPosition);
        System.out.println("Dominant Foot: "+this.height);
        System.out.println("Market Value: "+this.marketValue);
        System.out.println("Status: "+this.status);
        System.out.println("End of Contract: "+this.endOfContract);
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public PrimaryPosition getPrimaryPosition() {
        return primaryPosition;
    }

    public void setPrimaryPosition(PrimaryPosition primaryPosition) {
        this.primaryPosition = primaryPosition;
    }

    public SpecificPosition getSpecificPosition() {
        return specificPosition;
    }

    public void setSpecificPosition(SpecificPosition specificPosition) {
        this.specificPosition = specificPosition;
    }

    public Foot getFoot() {
        return foot;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }

    public float getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(float marketValue) {
        this.marketValue = marketValue;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getEndOfContract() {
        return endOfContract;
    }

    public void setEndOfContract(String endOfContract) {
        this.endOfContract = endOfContract;
    }
}
