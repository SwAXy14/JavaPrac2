import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.DiffBuilder;
import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.Diffable;
import org.apache.commons.lang3.builder.ToStringStyle;

@Builder
public class Person implements Diffable<Person> {
    @Getter @Setter String name;
    @Getter @Setter String dateOfBirth;
    @Getter @Setter Address billingAddress;
    @Getter @Setter Address mailAddress;

    @Override
    public DiffResult<Person> diff(Person obj) {
        return new DiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("name", this.name, obj.name)
                .append("dateOfBirth", this.dateOfBirth, obj.dateOfBirth)
                .append("billingAddress", this.billingAddress, obj.billingAddress)
                .append("mailAddress", this.mailAddress, obj.mailAddress)
                .build();
    }
}
