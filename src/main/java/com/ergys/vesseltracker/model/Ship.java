package  com.ergys.vesseltracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Setter
@Getter
@Entity
@Table(name = "ships")
public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "imo_number", unique = true)
    private String imoNumber;

    @Column(name = "built_date")
    private String builtDate;

    @Column(name = "type")
    private String type;

    @Column(name = "flag")
    private String flag;

    @Column(name = "status")
    private String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Objects.equals(id, ship.id) && Objects.equals(name, ship.name) && Objects.equals(imoNumber, ship.imoNumber) && Objects.equals(builtDate, ship.builtDate) && Objects.equals(type, ship.type) && Objects.equals(flag, ship.flag) && Objects.equals(status, ship.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, imoNumber, builtDate, type, flag, status);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imoNumber='" + imoNumber + '\'' +
                ", builtDate='" + builtDate + '\'' +
                ", type='" + type + '\'' +
                ", flag='" + flag + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
