package object;

import main.ImageLoader;

import java.io.IOException;

public class OBJ_Door extends SuperObject {
    public OBJ_Door() {
        name = "Door";

        try {
            image = new ImageLoader().loadImage("/objects/door.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        collision = true;

    }
}
