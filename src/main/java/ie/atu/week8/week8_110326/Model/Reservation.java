package ie.atu.week8.week8_110326.Model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reservation {
    private long ReservationID;
    @NotBlank(message = "equipmentTag is required")
    private String equipmentTag;
    @NotBlank(message = "email is required")
    @Email(message = "must be valid email")
    private String StudentEmail;
    @NotBlank(message = "Must be valid date")
    private LocalDate reservationDate;
    @Min(value = 0, message = "Start Hour must be 0 or greater")
    @Max(value = 0, message = "Start Hour must be 23 or less")
    @NotNull(message = "Start hour is required")
    private int startHour;
    @Min(value = 1, message = " Duration must be 1 or greater")
    @Max(value = 24, message = "Duration Hour must be 24 or less")
    @NotNull(message = "Duration hour is required")
    private int durationHour;
}
