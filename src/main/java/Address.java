import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Address {
    String city;
    int postalCode;
    String street;


}
