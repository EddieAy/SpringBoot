package zera.pojo;

public class StudentWithCar {
    private Integer id;
    private String name;
    private Integer age;
    private Car car;

    public StudentWithCar() {
    }

    @Override
    public String toString() {
        return "StudentWithCar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    public StudentWithCar(Integer id, String name, Integer age, Car car) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
