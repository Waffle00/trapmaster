import java.awt.image.BufferedImage;

public final class DoorTile extends Tile_tm{

    private boolean isOpen;

    public DoorTile(Tile_tm[] neighbors, BufferedImage texture, int[] treasureDist, int[] entranceDist) {
        super(neighbors, texture, treasureDist, entranceDist);
        isOpen = false;
    }

    public DoorTile(Tile_tm[] neighbors, BufferedImage texture, int[] treasureDist, int[] entranceDist, boolean isOpen) {
        super(neighbors, texture, treasureDist, entranceDist);
        this.isOpen = isOpen;
    }

    public boolean isOpen(){
        return isOpen;
    }

    public void open(){
        isOpen = true;
    }

    public void close(){
        isOpen = false;
    }
}
