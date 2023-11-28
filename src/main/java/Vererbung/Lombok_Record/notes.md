# lombok 
Lombok ist eine Lib, die neue Tags einbringt wie z.B @Value
@Builder 
## Beispiel:

``` java
package Vererbung.Lombok_Record;


import lombok.Builder;
import lombok.Value;
import lombok.With;

@Value
@Builder
class Course {
    @With String name;
    String code;
}

```
