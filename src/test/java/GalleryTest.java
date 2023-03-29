import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.example.Artwork;
import org.example.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class GalleryTest {

    Gallery gallery;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("National Art Gallery");
        Artwork boat = new Artwork("Boat", "Leo", 1000);
        Artwork car = new Artwork("Car", "Katie", 500);
        gallery.addArtwork(boat);
        gallery.addArtwork(car);
    }

    @Test
    public void hasName(){
    assertThat(gallery.getName()).isEqualTo("National Art Gallery");
    }
    @Test
    public void setName(){
    gallery.setName("Van Gogh Art Gallery");
    assertThat(gallery.getName()).isEqualTo("Van Gogh Art Gallery");
    }
    @Test
    public void hasTill(){
    assertThat(gallery.getTill()).isEqualTo(0);
    }
    @Test
    public void canAddArtworkToGallery(){
    Artwork ship = new Artwork("Ship", "Dave", 200 );
    gallery.addArtwork(ship);
    assertThat(gallery.getStock().size()).isEqualTo(3);
    }






}