package main;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class ImageLoader {

    private String path;

    public ImageLoader() {}

    public ImageLoader(String path) {
        this.path = path;
    }

    /*public BufferedImage loadImage(String path, String fileName) throws IOException {
        return ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream(path + fileName)));
    }*/

    public BufferedImage loadImage(String fullPath) throws IOException {
        return ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream(fullPath)));
    }
}
