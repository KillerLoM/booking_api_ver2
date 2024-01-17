package meu.booking_rebuild_ver2.model.Admin;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import meu.booking_rebuild_ver2.model.Status;
import meu.booking_rebuild_ver2.model.User;

import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "routes_time")
public class RoutesTimeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "id_time")
    private TimeModel idTime;
    @ManyToOne
    @JoinColumn(name = "id_route")
    private RoutesModel idRoutes;

    @ManyToOne
    @JoinColumn(name = "status" )
    private Status status;
    @ManyToOne
    @JoinColumn(name = "id_user_config" )
    @JsonIgnore
    private User idUserConfig;
    @JsonIgnore
    private ZonedDateTime createdAt;
    @JsonIgnore
    private ZonedDateTime updatedAt = ZonedDateTime.now();
}
