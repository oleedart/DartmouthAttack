package object;

import main.ImageLoader;

import java.io.IOException;

public class OBJ_Chest extends SuperObject{
    public OBJ_Chest() {
        name = "Chest";

        try {
            image = new ImageLoader().loadImage("/objects/chest.png");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
