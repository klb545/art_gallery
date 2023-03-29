import org.example.Artist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Katie");
    }
    @Test
    public void hasName(){
        assertThat(artist.getName()).isEqualTo("Katie");
    }
    @Test
    public void testSetName(){
        artist.setName("Tharahan");
        assertThat(artist.getName()).isEqualTo("Tharahan");
    }
}
