# implements
Das implements element implementiert Werte.
###Beispiel
``` java
public class MusicPlayer implements Playable

```

# Main methode 
### In der Main methode werden beide Controller angesprochen 
``` java 
public static void main(String[] args) {
        MediaController media = new MediaController();
        MusicPlayer music = new MusicPlayer();
        media.playMedia(music);
        VideoPlayer video = new VideoPlayer();
        media.playMedia(video);
    }
```