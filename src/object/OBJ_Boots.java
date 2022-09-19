package object;

import main.ImageLoader;

import java.io.IOException;

public class OBJ_Boots extends SuperObject {
    public OBJ_Boots() {
        name = "Boots";

        try {
            image = new ImageLoader().loadImage("/objects/boots.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        collision = true;

    }
}
