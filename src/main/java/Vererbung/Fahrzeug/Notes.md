# Setter methode 
### Beispiel 
Der Setter definiert Werte
``` java
    public static void main(String[] args) {
    Auto  auto01 = new Auto();
    auto01.setPS(2500);
    auto01.setTüren(5);
    auto01.setBaujahr(2022);
    auto01.setHersteller("Königsegg");
    auto01.setModell("Gemera");
    Auto.Fahrzeugausgabe(auto01.getHersteller(), auto01.getModell(), auto01.getBaujahr(), auto01.getTüren(), auto01.getPS());
    }
```
# Getter methode
Der Getter beantragt so gesagt die werte der vorhin der Setter definiert hat
### Beispiel

``` java
   public int getPS() {
        return this.PS;
    }

    public int getTüren() {
        return this.Türen;

    }
```
# extends class
Das extends element sammelt sogesagt alle Variablen von einer anderen class und importiert sie
### Beispiel

``` java 
public class Auto extends Fahrzeuge
```