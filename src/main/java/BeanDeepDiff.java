import org.apache.commons.lang3.builder.Diff;
import org.apache.commons.lang3.builder.DiffResult;
import org.jetbrains.annotations.NotNull;
import java.lang.reflect.Field;
import java.util.*;
import org.apache.commons.lang3.builder.DiffBuilder;

public class BeanDeepDiff {
    public static void main(String[] args) throws IllegalAccessException {
        //region Create objects
        Person p1 = Person.builder()
                .name("John Doe")
                .dateOfBirth("2002-06-14")
                .billingAddress(Address.builder()
                        .city("Butapest")
                        .postalCode(1999)
                        .street("Pék utca 3.")
                        .build())
                .build();
        Person p2 = Person.builder()
                .name("Jane Doe")
                .dateOfBirth("2002-06-14")
                .billingAddress(Address.builder()
                        .city("Butapest")
                        .postalCode(1999)
                        .street("Pék utca 4.")
                        .build())
                .mailAddress(Address.builder()
                        .city("Kukutyinfalva")
                        .postalCode(9111)
                        .street("Bakter utca 9.")
                        .build())
                .build();
        //endregion

        DiffResult diff = p1.diff(p2);

        for(Object d: diff.getDiffs()) {
            Diff difference = (Diff) d;
            System.out.println(difference.getFieldName()
                    + "= FROM[" + difference.getLeft() + "] TO [" + difference.getRight() + "]");
        }
        System.out.println();
    }
}
