import java.util.ArrayList;
import java.util.List;

import practicePrincy.AlbumsNotFoundException;

public class ListDemo {

    public List<Album> searchAlbums(List<Album> albumList, int priceUpperLimit) throws AlbumsNotFoundException {
        List<Album> retrievedAlbums = new ArrayList<>();

        for (Album album : albumList) {
            if (album.price < priceUpperLimit) {
                retrievedAlbums.add(album);
            }
        }

        if (retrievedAlbums.isEmpty()) {
            throw new AlbumsNotFoundException("Albums not found within the price range");
        }

        return retrievedAlbums;
    }

}
