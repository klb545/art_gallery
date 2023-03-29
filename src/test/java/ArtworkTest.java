import org.example.Artwork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artwork = new Artwork("Boat", "Leo", 1000.00 );
    }
    @Test
    public void hasTitle(){
            assertThat(artwork.getTitle()).isEqualTo("Boat");
    }
    @Test
    public void setTitle(){
        artwork.setTitle("Car");
        assertThat(artwork.getTitle()).isEqualTo("Car");
    }
    @Test
    public void hasArtist(){
        assertThat(artwork.getArtist()).isEqualTo("Leo");
    }
    @Test
    public void testSetArtist(){
        artwork.setArtist("Tharahan");
        assertThat(artwork.getArtist()).isEqualTo("Tharahan");
    }
    @Test
    public void hasPrice(){
        assertThat(artwork.getPrice()).isEqualTo(1000);
    }
    @Test
    public void setPrice(){
        artwork.setPrice(2000);
        assertThat(artwork.getPrice()).isEqualTo(2000);
    }


}
