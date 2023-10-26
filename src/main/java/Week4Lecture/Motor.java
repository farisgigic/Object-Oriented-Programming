package Week4Lecture;

class Component {
    private String id;
    private String producer;
    private String description;

    public Component(String id, String producer, String description)
    {
        this.id = id;
        this.producer = producer;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }

    public String getDescription() {
        return description;
    }

}


class Motor extends Component{
    private String motorType ;
    public Motor(String motorType, String id, String producer, String description)
    {
        super(id,producer,description);
        this.motorType = motorType;
    }

    public String getMotorType() {
        return motorType;
    }
}
