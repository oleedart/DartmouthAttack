package object;

import main.ImageLoader;

import java.io.IOException;

public class OBJ_Key extends SuperObject {
    public OBJ_Key() {
        name = "Key";

        try {
            image = new ImageLoader().loadImage("/objects/key.png");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
