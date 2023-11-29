# Exceptions
Verwendung: nur selten(Sparsam benutzen), da es sehr aufwendig für Java ist und es den code Schwieriger lesbar macht.

## Stream
Der Stream ist eine gut und einfache möglichkeit um elemente in eine liste einzutragen und die dann z.b zu Sotieren oder zu summieren etc...
``` java
List<Integer> verarbeiteteZahlen = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());
```